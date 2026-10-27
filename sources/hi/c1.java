package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import fi.ua;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c1 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ f1 d;

    public c1(f1 f1Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = f1Var;
                this.c = new float[3];
                break;
            default:
                this.d = f1Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.d;
                if (f1Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        f1Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                f1 f1Var2 = this.d;
                if (f1Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        f1Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
                f1 f1Var = this.d;
                ua uaVar = f1Var.m;
                if (uaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar);
                    f1Var.m = null;
                }
                if (!f1Var.l && f1Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j10 = f1Var.c;
                    if (currentTimeMillis >= j10) {
                        c();
                        break;
                    } else {
                        ua uaVar2 = new ua(this, 10);
                        f1Var.m = uaVar2;
                        AndroidUtilities.runOnUIThread(uaVar2, j10 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                f1 f1Var2 = this.d;
                ua uaVar3 = f1Var2.o;
                if (uaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar3);
                    f1Var2.o = null;
                }
                if (!f1Var2.l && f1Var2.k != null) {
                    float[] fArr = this.c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j11 = f1Var2.e;
                    if (currentTimeMillis2 >= j11) {
                        c();
                        break;
                    } else {
                        ua uaVar4 = new ua(this, 11);
                        f1Var2.o = uaVar4;
                        AndroidUtilities.runOnUIThread(uaVar4, j11 - currentTimeMillis2);
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
