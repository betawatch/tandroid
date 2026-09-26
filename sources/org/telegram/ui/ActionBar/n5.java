package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class n5 implements SensorEventListener {
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
            h6.h = 1.0f;
        } else {
            h6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (h6.h > h6.q) {
            if (h6.k) {
                h6.k = false;
                AndroidUtilities.cancelRunOnUIThread(h6.m);
            }
            if (h6.j) {
                return;
            }
            h6.j = true;
            AndroidUtilities.runOnUIThread(h6.l, Math.abs(h6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        if (MediaController.getInstance().isRecordingOrListeningByProximity()) {
            return;
        }
        if (h6.j) {
            h6.j = false;
            AndroidUtilities.cancelRunOnUIThread(h6.l);
        }
        if (h6.k) {
            return;
        }
        h6.k = true;
        AndroidUtilities.runOnUIThread(h6.m, Math.abs(h6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
