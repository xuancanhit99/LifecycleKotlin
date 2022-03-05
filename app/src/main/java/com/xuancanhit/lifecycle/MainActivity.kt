package com.xuancanhit.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

const val NCREATE = "Activity CREATED"
const val NSTART = "Activity STARTED"
const val NRESUME = "Activity RESUME"
const val NPAUSE = "Activity PAUSED"
const val NSTOP = "Activity STOPPED"
const val NRESTART = "Activity RESTARTED"
const val NDESTROY = "Activity DESTROYED"
const val duration = Toast.LENGTH_SHORT


class MainActivity : AppCompatActivity() {

    private fun toastShow(NStr: String, gra: Int) {
        val toast = Toast.makeText(applicationContext, NStr, duration)
        toast.setGravity(gra, 0, 0)
        toast.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val toast = Toast.makeText(applicationContext, NCREATE, duration)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        toastShow(NSTART, Gravity.LEFT)
    }

    override fun onResume() {
        super.onResume()
        toastShow(NRESUME, Gravity.TOP)
    }

    override fun onPause() {
        super.onPause()
        toastShow(NPAUSE, Gravity.RIGHT)
    }

    override fun onStop() {
        super.onStop()
        toastShow(NSTOP, Gravity.CENTER)
    }

    override fun onRestart() {
        super.onRestart()
        toastShow(NRESTART, Gravity.FILL_HORIZONTAL)
    }

    override fun onDestroy() {
        super.onDestroy()
        toastShow(NDESTROY, Gravity.FILL)
    }



}