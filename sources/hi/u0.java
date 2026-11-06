package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import fi.h9;
import org.json.JSONObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class u0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public float[] d;
    public final /* synthetic */ v0 e;

    public u0(v0 v0Var) {
        this.e = v0Var;
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        v0 v0Var = this.e;
        if (v0Var.k == null) {
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
            v0Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.e;
        h9 h9Var = v0Var.s;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            v0Var.s = null;
        }
        if (v0Var.l || v0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        long j3 = v0Var.j;
        if (currentTimeMillis < j3) {
            h9 h9Var2 = new h9(this, 17);
            v0Var.s = h9Var2;
            org.telegram.messenger.g0.i3(h9Var2, j3 - currentTimeMillis);
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
