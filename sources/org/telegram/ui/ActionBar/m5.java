package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m5 implements SensorEventListener {
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f9 = sensorEvent.values[0];
        if (f9 <= 0.0f) {
            f9 = 0.1f;
        }
        if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
            return;
        }
        if (f9 > 500.0f) {
            g6.h = 1.0f;
        } else {
            g6.h = ((float) Math.ceil((Math.log(f9) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (g6.h > g6.q) {
            if (g6.k) {
                g6.k = false;
                AndroidUtilities.cancelRunOnUIThread(g6.m);
            }
            if (g6.j) {
                return;
            }
            g6.j = true;
            AndroidUtilities.runOnUIThread(g6.l, Math.abs(g6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        if (MediaController.getInstance().isRecordingOrListeningByProximity()) {
            return;
        }
        if (g6.j) {
            g6.j = false;
            AndroidUtilities.cancelRunOnUIThread(g6.l);
        }
        if (g6.k) {
            return;
        }
        g6.k = true;
        AndroidUtilities.runOnUIThread(g6.m, Math.abs(g6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
