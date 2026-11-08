package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import fi.h9;
import org.json.JSONObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class t0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final /* synthetic */ v0 d;

    public t0(v0 v0Var) {
        this.d = v0Var;
    }

    public final void a() {
        if (this.b == null || this.c == null) {
            return;
        }
        v0 v0Var = this.d;
        if (v0Var.k == null) {
            return;
        }
        this.a = System.currentTimeMillis();
        float[] fArr = new float[9];
        if (SensorManager.getRotationMatrix(fArr, new float[9], this.b, this.c)) {
            SensorManager.getOrientation(fArr, new float[3]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("absolute", true);
                jSONObject.put("alpha", -r2[0]);
                jSONObject.put("beta", -r2[1]);
                jSONObject.put("gamma", r2[2]);
                v0Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.d;
        h9 h9Var = v0Var.q;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            v0Var.q = null;
        }
        if (v0Var.l || v0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        if (sensorEvent.sensor.getType() == 1) {
            this.b = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.c = sensorEvent.values;
        }
        long j3 = v0Var.h;
        if (currentTimeMillis >= j3) {
            a();
            return;
        }
        h9 h9Var2 = new h9(this, 16);
        v0Var.q = h9Var2;
        org.telegram.messenger.g0.i3(h9Var2, j3 - currentTimeMillis);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
