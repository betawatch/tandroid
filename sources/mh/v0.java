package mh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v0 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ y0 d;

    public v0(y0 y0Var, int i9) {
        this.a = i9;
        switch (i9) {
            case 1:
                this.d = y0Var;
                this.c = new float[3];
                break;
            default:
                this.d = y0Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                y0 y0Var = this.d;
                if (y0Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        y0Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                y0 y0Var2 = this.d;
                if (y0Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        y0Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
    public final void onAccuracyChanged(Sensor sensor, int i9) {
        int i10 = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                y0 y0Var = this.d;
                kh.f1 f1Var = y0Var.m;
                if (f1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var);
                    y0Var.m = null;
                }
                if (!y0Var.l && y0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j10 = y0Var.c;
                    if (currentTimeMillis >= j10) {
                        c();
                        break;
                    } else {
                        kh.f1 f1Var2 = new kh.f1(this, 25);
                        y0Var.m = f1Var2;
                        AndroidUtilities.runOnUIThread(f1Var2, j10 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                y0 y0Var2 = this.d;
                kh.f1 f1Var3 = y0Var2.o;
                if (f1Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var3);
                    y0Var2.o = null;
                }
                if (!y0Var2.l && y0Var2.k != null) {
                    float[] fArr = this.c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j11 = y0Var2.e;
                    if (currentTimeMillis2 >= j11) {
                        c();
                        break;
                    } else {
                        kh.f1 f1Var4 = new kh.f1(this, 26);
                        y0Var2.o = f1Var4;
                        AndroidUtilities.runOnUIThread(f1Var4, j11 - currentTimeMillis2);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i9) {
    }

    private final void b(Sensor sensor, int i9) {
    }
}
