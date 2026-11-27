// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lnb implements SensorEventListener {
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
            aob.h = 1.0f;
        } else {
            ceil = ((float) Math.ceil((Math.log(f) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            aob.h = ceil;
        }
        if (ceil > aob.q) {
            if (aob.k) {
                aob.k = false;
                hl.r(aob.m);
            }
            if (aob.j) {
                return;
            }
            aob.j = true;
            hl.d3(aob.l, Math.abs(aob.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        MediaController z = MediaController.z();
        if (z.J) {
            if (z.I()) {
                return;
            }
            r47 r47Var = z.v0;
            if (r47Var != null && (r47.Q4(r47Var.k) || z.v0.g4())) {
                return;
            }
        }
        if (aob.j) {
            aob.j = false;
            hl.r(aob.l);
        }
        if (aob.k) {
            return;
        }
        aob.k = true;
        hl.d3(aob.m, Math.abs(aob.i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
