package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.jj;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z5 implements SensorEventListener {
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f7 = sensorEvent.values[0];
        if (f7 <= 0.0f) {
            f7 = 0.1f;
        }
        if (org.telegram.messenger.w0.x || !org.telegram.messenger.w0.w) {
            return;
        }
        if (f7 > 500.0f) {
            t6.h = 1.0f;
        } else {
            t6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (t6.h > t6.q) {
            if (t6.k) {
                t6.k = false;
                org.telegram.messenger.i0.r(t6.m);
            }
            if (t6.j) {
                return;
            }
            t6.j = true;
            org.telegram.messenger.i0.h3(t6.l, Math.abs(t6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        MediaController B = MediaController.B();
        if (B.I) {
            if (B.J()) {
                return;
            }
            jj jjVar = B.u0;
            if (jjVar != null && (jj.R4(jjVar.k) || B.u0.h4())) {
                return;
            }
        }
        if (t6.j) {
            t6.j = false;
            org.telegram.messenger.i0.r(t6.l);
        }
        if (t6.k) {
            return;
        }
        t6.k = true;
        org.telegram.messenger.i0.h3(t6.m, Math.abs(t6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
