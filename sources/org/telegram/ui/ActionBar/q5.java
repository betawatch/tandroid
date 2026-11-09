package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q5 implements SensorEventListener {
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (org.telegram.messenger.t0.x || !org.telegram.messenger.t0.w) {
            return;
        }
        if (f10 > 500.0f) {
            l6.h = 1.0f;
        } else {
            l6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (l6.h > l6.q) {
            if (l6.k) {
                l6.k = false;
                org.telegram.messenger.g0.r(l6.m);
            }
            if (l6.j) {
                return;
            }
            l6.j = true;
            org.telegram.messenger.g0.i3(l6.l, Math.abs(l6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        MediaController B = MediaController.B();
        if (B.I) {
            if (B.J()) {
                return;
            }
            ij ijVar = B.u0;
            if (ijVar != null && (ij.R4(ijVar.k) || B.u0.h4())) {
                return;
            }
        }
        if (l6.j) {
            l6.j = false;
            org.telegram.messenger.g0.r(l6.l);
        }
        if (l6.k) {
            return;
        }
        l6.k = true;
        org.telegram.messenger.g0.i3(l6.m, Math.abs(l6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
