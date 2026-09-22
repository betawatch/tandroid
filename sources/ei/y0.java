package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.uc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class y0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final /* synthetic */ a1 d;

    public y0(a1 a1Var) {
        this.d = a1Var;
    }

    public final void a() {
        if (this.b == null || this.c == null) {
            return;
        }
        a1 a1Var = this.d;
        if (a1Var.k == null) {
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
                a1Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.d;
        uc ucVar = a1Var.q;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            a1Var.q = null;
        }
        if (a1Var.l || a1Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        if (sensorEvent.sensor.getType() == 1) {
            this.b = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.c = sensorEvent.values;
        }
        long j3 = a1Var.h;
        if (currentTimeMillis >= j3) {
            a();
            return;
        }
        uc ucVar2 = new uc(this, 11);
        a1Var.q = ucVar2;
        AndroidUtilities.runOnUIThread(ucVar2, j3 - currentTimeMillis);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
