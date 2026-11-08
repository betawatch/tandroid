package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p5 implements SensorEventListener {
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
            k6.h = 1.0f;
        } else {
            k6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (k6.h > k6.q) {
            if (k6.k) {
                k6.k = false;
                org.telegram.messenger.g0.r(k6.m);
            }
            if (k6.j) {
                return;
            }
            k6.j = true;
            org.telegram.messenger.g0.i3(k6.l, Math.abs(k6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        MediaController B = MediaController.B();
        if (B.I) {
            if (B.J()) {
                return;
            }
            ij ijVar = B.u0;
            if (ijVar != null && (ij.S4(ijVar.k) || B.u0.i4())) {
                return;
            }
        }
        if (k6.j) {
            k6.j = false;
            org.telegram.messenger.g0.r(k6.l);
        }
        if (k6.k) {
            return;
        }
        k6.k = true;
        org.telegram.messenger.g0.i3(k6.m, Math.abs(k6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
