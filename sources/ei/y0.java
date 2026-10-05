package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import ci.qc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class y0 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ b1 d;

    public y0(b1 b1Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = b1Var;
                this.c = new float[3];
                break;
            default:
                this.d = b1Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                b1 b1Var = this.d;
                if (b1Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        b1Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                b1 b1Var2 = this.d;
                if (b1Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        b1Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
                    } catch (Exception unused2) {
                    }
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[2] = 0.0f;
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        int i11 = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                b1 b1Var = this.d;
                qc qcVar = b1Var.m;
                if (qcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar);
                    b1Var.m = null;
                }
                if (!b1Var.l && b1Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j3 = b1Var.c;
                    if (currentTimeMillis >= j3) {
                        c();
                        break;
                    } else {
                        qc qcVar2 = new qc(this, 9);
                        b1Var.m = qcVar2;
                        AndroidUtilities.runOnUIThread(qcVar2, j3 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                b1 b1Var2 = this.d;
                qc qcVar3 = b1Var2.o;
                if (qcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar3);
                    b1Var2.o = null;
                }
                if (!b1Var2.l && b1Var2.k != null) {
                    float[] fArr = this.c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j10 = b1Var2.e;
                    if (currentTimeMillis2 >= j10) {
                        c();
                        break;
                    } else {
                        qc qcVar4 = new qc(this, 10);
                        b1Var2.o = qcVar4;
                        AndroidUtilities.runOnUIThread(qcVar4, j10 - currentTimeMillis2);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i10) {
    }

    private final void b(Sensor sensor, int i10) {
    }
}
