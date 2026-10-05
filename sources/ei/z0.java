package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.qc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class z0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final /* synthetic */ b1 d;

    public z0(b1 b1Var) {
        this.d = b1Var;
    }

    public final void a() {
        if (this.b == null || this.c == null) {
            return;
        }
        b1 b1Var = this.d;
        if (b1Var.k == null) {
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
                b1Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        b1 b1Var = this.d;
        qc qcVar = b1Var.q;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            b1Var.q = null;
        }
        if (b1Var.l || b1Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        if (sensorEvent.sensor.getType() == 1) {
            this.b = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.c = sensorEvent.values;
        }
        long j3 = b1Var.h;
        if (currentTimeMillis >= j3) {
            a();
            return;
        }
        qc qcVar2 = new qc(this, 11);
        b1Var.q = qcVar2;
        AndroidUtilities.runOnUIThread(qcVar2, j3 - currentTimeMillis);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
