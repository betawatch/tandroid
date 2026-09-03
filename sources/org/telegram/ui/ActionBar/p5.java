package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p5 implements SensorEventListener {
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
            return;
        }
        if (f10 > 500.0f) {
            j6.h = 1.0f;
        } else {
            j6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (j6.h > j6.q) {
            if (j6.k) {
                j6.k = false;
                AndroidUtilities.cancelRunOnUIThread(j6.m);
            }
            if (j6.j) {
                return;
            }
            j6.j = true;
            AndroidUtilities.runOnUIThread(j6.l, Math.abs(j6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        if (MediaController.getInstance().isRecordingOrListeningByProximity()) {
            return;
        }
        if (j6.j) {
            j6.j = false;
            AndroidUtilities.cancelRunOnUIThread(j6.l);
        }
        if (j6.k) {
            return;
        }
        j6.k = true;
        AndroidUtilities.runOnUIThread(j6.m, Math.abs(j6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
