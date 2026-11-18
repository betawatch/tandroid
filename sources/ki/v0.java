package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class v0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public float[] d;
    public final /* synthetic */ w0 e;

    public v0(w0 w0Var) {
        this.e = w0Var;
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        w0 w0Var = this.e;
        if (w0Var.k == null) {
            return;
        }
        this.a = System.currentTimeMillis();
        if (this.c == null) {
            this.c = new float[9];
        }
        if (this.d == null) {
            this.d = new float[4];
        }
        float[] fArr = this.b;
        if (fArr.length > 4) {
            System.arraycopy(fArr, 0, this.d, 0, 4);
            SensorManager.getRotationMatrixFromVector(this.c, this.d);
        } else {
            SensorManager.getRotationMatrixFromVector(this.c, fArr);
        }
        SensorManager.getOrientation(this.c, new float[3]);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("absolute", false);
            jSONObject.put("alpha", -r2[0]);
            jSONObject.put("beta", -r2[1]);
            jSONObject.put("gamma", r2[2]);
            w0Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        w0 w0Var = this.e;
        kg.j0 j0Var = w0Var.s;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            w0Var.s = null;
        }
        if (w0Var.l || w0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        long j3 = w0Var.j;
        if (currentTimeMillis < j3) {
            kg.j0 j0Var2 = new kg.j0(this, 12);
            w0Var.s = j0Var2;
            org.telegram.messenger.g0.h3(j0Var2, j3 - currentTimeMillis);
        } else {
            if (sensorEvent.sensor.getType() == 15) {
                this.b = sensorEvent.values;
            }
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
