package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class u0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final /* synthetic */ w0 d;

    public u0(w0 w0Var) {
        this.d = w0Var;
    }

    public final void a() {
        if (this.b == null || this.c == null) {
            return;
        }
        w0 w0Var = this.d;
        if (w0Var.k == null) {
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
                w0Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        w0 w0Var = this.d;
        kg.j1 j1Var = w0Var.q;
        if (j1Var != null) {
            org.telegram.messenger.g0.r(j1Var);
            w0Var.q = null;
        }
        if (w0Var.l || w0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        if (sensorEvent.sensor.getType() == 1) {
            this.b = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.c = sensorEvent.values;
        }
        long j3 = w0Var.h;
        if (currentTimeMillis >= j3) {
            a();
            return;
        }
        kg.j1 j1Var2 = new kg.j1(this, 7);
        w0Var.q = j1Var2;
        org.telegram.messenger.g0.i3(j1Var2, j3 - currentTimeMillis);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
