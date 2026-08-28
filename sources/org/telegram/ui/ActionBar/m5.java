package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m5 implements SensorEventListener {
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
            f6.h = 1.0f;
        } else {
            f6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (f6.h > f6.q) {
            if (f6.k) {
                f6.k = false;
                AndroidUtilities.cancelRunOnUIThread(f6.m);
            }
            if (f6.j) {
                return;
            }
            f6.j = true;
            AndroidUtilities.runOnUIThread(f6.l, Math.abs(f6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        if (MediaController.getInstance().isRecordingOrListeningByProximity()) {
            return;
        }
        if (f6.j) {
            f6.j = false;
            AndroidUtilities.cancelRunOnUIThread(f6.l);
        }
        if (f6.k) {
            return;
        }
        f6.k = true;
        AndroidUtilities.runOnUIThread(f6.m, Math.abs(f6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i9) {
    }
}
