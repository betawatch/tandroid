// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mr0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final /* synthetic */ or0 d;

    public mr0(or0 or0Var) {
        this.d = or0Var;
    }

    public final void a() {
        if (this.b == null || this.c == null) {
            return;
        }
        or0 or0Var = this.d;
        if (or0Var.k != null) {
            this.a = System.currentTimeMillis();
            float[] fArr = new float[9];
            if (SensorManager.getRotationMatrix(fArr, new float[9], this.b, this.c)) {
                SensorManager.getOrientation(fArr, new float[3]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", true);
                    jSONObject.put("alpha", -r7[0]);
                    jSONObject.put("beta", -r7[1]);
                    jSONObject.put("gamma", r7[2]);
                    or0Var.k.c("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        or0 or0Var = this.d;
        oz ozVar = or0Var.q;
        if (ozVar != null) {
            gl.r(ozVar);
            or0Var.q = null;
        }
        if (or0Var.l || or0Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        if (sensorEvent.sensor.getType() == 1) {
            this.b = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.c = sensorEvent.values;
        }
        long j = or0Var.h;
        if (currentTimeMillis >= j) {
            a();
            return;
        }
        oz ozVar2 = new oz(this, (byte) 25);
        or0Var.q = ozVar2;
        gl.e3(ozVar2, j - currentTimeMillis);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
