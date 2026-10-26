package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f6 implements SensorEventListener {
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
            y6.h = 1.0f;
        } else {
            y6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (y6.h > y6.q) {
            if (y6.k) {
                y6.k = false;
                AndroidUtilities.cancelRunOnUIThread(y6.m);
            }
            if (y6.j) {
                return;
            }
            y6.j = true;
            AndroidUtilities.runOnUIThread(y6.l, Math.abs(y6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        if (MediaController.getInstance().isRecordingOrListeningByProximity()) {
            return;
        }
        if (y6.j) {
            y6.j = false;
            AndroidUtilities.cancelRunOnUIThread(y6.l);
        }
        if (y6.k) {
            return;
        }
        y6.k = true;
        AndroidUtilities.runOnUIThread(y6.m, Math.abs(y6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
