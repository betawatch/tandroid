package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r5 implements SensorEventListener {
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
            n6.h = 1.0f;
        } else {
            n6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (n6.h > n6.q) {
            if (n6.k) {
                n6.k = false;
                org.telegram.messenger.g0.r(n6.m);
            }
            if (n6.j) {
                return;
            }
            n6.j = true;
            org.telegram.messenger.g0.h3(n6.l, Math.abs(n6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        MediaController B = MediaController.B();
        if (B.J) {
            if (B.J()) {
                return;
            }
            fj fjVar = B.v0;
            if (fjVar != null && (fj.R4(fjVar.k) || B.v0.h4())) {
                return;
            }
        }
        if (n6.j) {
            n6.j = false;
            org.telegram.messenger.g0.r(n6.l);
        }
        if (n6.k) {
            return;
        }
        n6.k = true;
        org.telegram.messenger.g0.h3(n6.m, Math.abs(n6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
