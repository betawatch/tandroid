// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class olb implements SensorEventListener {
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float ceil;
        float f = sensorEvent.values[0];
        if (f <= 0.0f) {
            f = 0.1f;
        }
        if (a.x || !a.w) {
            return;
        }
        if (f > 500.0f) {
            ceil = 1.0f;
            cmb.h = 1.0f;
        } else {
            ceil = ((float) Math.ceil((Math.log(f) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            cmb.h = ceil;
        }
        if (ceil > cmb.q) {
            if (cmb.k) {
                cmb.k = false;
                gm.r(cmb.m);
            }
            if (cmb.j) {
                return;
            }
            cmb.j = true;
            gm.d3(cmb.l, Math.abs(cmb.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        MediaController w = MediaController.w();
        if (w.J) {
            if (w.E()) {
                return;
            }
            k47 k47Var = w.v0;
            if (k47Var != null && (k47.Q4(k47Var.k) || w.v0.g4())) {
                return;
            }
        }
        if (cmb.j) {
            cmb.j = false;
            gm.r(cmb.l);
        }
        if (cmb.k) {
            return;
        }
        cmb.k = true;
        gm.d3(cmb.m, Math.abs(cmb.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
