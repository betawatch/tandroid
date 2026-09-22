package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class p5 implements SensorEventListener {
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f7 = sensorEvent.values[0];
        if (f7 <= 0.0f) {
            f7 = 0.1f;
        }
        if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
            return;
        }
        if (f7 > 500.0f) {
            i6.h = 1.0f;
        } else {
            i6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (i6.h > i6.q) {
            if (i6.k) {
                i6.k = false;
                AndroidUtilities.cancelRunOnUIThread(i6.m);
            }
            if (i6.j) {
                return;
            }
            i6.j = true;
            AndroidUtilities.runOnUIThread(i6.l, Math.abs(i6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        if (MediaController.getInstance().isRecordingOrListeningByProximity()) {
            return;
        }
        if (i6.j) {
            i6.j = false;
            AndroidUtilities.cancelRunOnUIThread(i6.l);
        }
        if (i6.k) {
            return;
        }
        i6.k = true;
        AndroidUtilities.runOnUIThread(i6.m, Math.abs(i6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
