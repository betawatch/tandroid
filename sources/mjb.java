// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mjb implements SensorEventListener {
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
            bkb.h = 1.0f;
        } else {
            ceil = ((float) Math.ceil((Math.log(f) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            bkb.h = ceil;
        }
        if (ceil > bkb.q) {
            if (bkb.k) {
                bkb.k = false;
                gl.r(bkb.m);
            }
            if (bkb.j) {
                return;
            }
            bkb.j = true;
            gl.d3(bkb.l, Math.abs(bkb.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        MediaController w = MediaController.w();
        if (w.J) {
            if (w.E()) {
                return;
            }
            k27 k27Var = w.v0;
            if (k27Var != null && (k27.Q4(k27Var.k) || w.v0.g4())) {
                return;
            }
        }
        if (bkb.j) {
            bkb.j = false;
            gl.r(bkb.l);
        }
        if (bkb.k) {
            return;
        }
        bkb.k = true;
        gl.d3(bkb.m, Math.abs(bkb.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
