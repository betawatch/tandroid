package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gj;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o5 implements SensorEventListener {
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
            j6.h = 1.0f;
        } else {
            j6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (j6.h > j6.q) {
            if (j6.k) {
                j6.k = false;
                org.telegram.messenger.g0.r(j6.m);
            }
            if (j6.j) {
                return;
            }
            j6.j = true;
            org.telegram.messenger.g0.i3(j6.l, Math.abs(j6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
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
        if (j6.j) {
            j6.j = false;
            org.telegram.messenger.g0.r(j6.l);
        }
        if (j6.k) {
            return;
        }
        j6.k = true;
        org.telegram.messenger.g0.i3(j6.m, Math.abs(j6.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
