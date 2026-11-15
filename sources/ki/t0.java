package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class t0 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ w0 d;

    public t0(w0 w0Var, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.d = w0Var;
                this.c = new float[3];
                break;
            default:
                this.d = w0Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                w0 w0Var = this.d;
                if (w0Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        w0Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                w0 w0Var2 = this.d;
                if (w0Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        w0Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
    public final void onAccuracyChanged(Sensor sensor, int i7) {
        int i10 = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.d;
                kg.j1 j1Var = w0Var.m;
                if (j1Var != null) {
                    org.telegram.messenger.g0.r(j1Var);
                    w0Var.m = null;
                }
                if (!w0Var.l && w0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j3 = w0Var.c;
                    if (currentTimeMillis >= j3) {
                        c();
                        break;
                    } else {
                        kg.j1 j1Var2 = new kg.j1(this, 5);
                        w0Var.m = j1Var2;
                        org.telegram.messenger.g0.i3(j1Var2, j3 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                w0 w0Var2 = this.d;
                kg.j1 j1Var3 = w0Var2.o;
                if (j1Var3 != null) {
                    org.telegram.messenger.g0.r(j1Var3);
                    w0Var2.o = null;
                }
                if (!w0Var2.l && w0Var2.k != null) {
                    float[] fArr = this.c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j10 = w0Var2.e;
                    if (currentTimeMillis2 >= j10) {
                        c();
                        break;
                    } else {
                        kg.j1 j1Var4 = new kg.j1(this, 6);
                        w0Var2.o = j1Var4;
                        org.telegram.messenger.g0.i3(j1Var4, j10 - currentTimeMillis2);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i7) {
    }

    private final void b(Sensor sensor, int i7) {
    }
}
