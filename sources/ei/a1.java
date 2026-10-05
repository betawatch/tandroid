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
public final class a1 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public float[] d;
    public final /* synthetic */ b1 e;

    public a1(b1 b1Var) {
        this.e = b1Var;
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        b1 b1Var = this.e;
        if (b1Var.k == null) {
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
            b1Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        b1 b1Var = this.e;
        qc qcVar = b1Var.s;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            b1Var.s = null;
        }
        if (b1Var.l || b1Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        long j3 = b1Var.j;
        if (currentTimeMillis < j3) {
            qc qcVar2 = new qc(this, 12);
            b1Var.s = qcVar2;
            AndroidUtilities.runOnUIThread(qcVar2, j3 - currentTimeMillis);
        } else {
            if (sensorEvent.sensor.getType() == 15) {
                this.b = sensorEvent.values;
            }
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
