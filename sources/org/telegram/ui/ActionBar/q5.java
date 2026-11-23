package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gj;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
            m6.h = 1.0f;
        } else {
            m6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (m6.h > m6.q) {
            if (m6.k) {
                m6.k = false;
                org.telegram.messenger.g0.r(m6.m);
            }
            if (m6.j) {
                return;
            }
            m6.j = true;
            org.telegram.messenger.g0.h3(m6.l, Math.abs(m6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        MediaController B = MediaController.B();
        if (B.J) {
            if (B.J()) {
                return;
            }
            gj gjVar = B.v0;
            if (gjVar != null && (gj.R4(gjVar.k) || B.v0.h4())) {
                return;
            }
        }
        if (m6.j) {
            m6.j = false;
            org.telegram.messenger.g0.r(m6.l);
        }
        if (m6.k) {
            return;
        }
        m6.k = true;
        org.telegram.messenger.g0.h3(m6.m, Math.abs(m6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
