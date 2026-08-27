package nh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class u0 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ x0 d;

    public u0(x0 x0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = x0Var;
                this.c = new float[3];
                break;
            default:
                this.d = x0Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                x0 x0Var = this.d;
                if (x0Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        x0Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                x0 x0Var2 = this.d;
                if (x0Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        x0Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
                x0 x0Var = this.d;
                f0 f0Var = x0Var.m;
                if (f0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(f0Var);
                    x0Var.m = null;
                }
                if (!x0Var.l && x0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j10 = x0Var.c;
                    if (currentTimeMillis >= j10) {
                        c();
                        break;
                    } else {
                        f0 f0Var2 = new f0(this, 2);
                        x0Var.m = f0Var2;
                        AndroidUtilities.runOnUIThread(f0Var2, j10 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                x0 x0Var2 = this.d;
                f0 f0Var3 = x0Var2.o;
                if (f0Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f0Var3);
                    x0Var2.o = null;
                }
                if (!x0Var2.l && x0Var2.k != null) {
                    float[] fArr = this.c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j11 = x0Var2.e;
                    if (currentTimeMillis2 >= j11) {
                        c();
                        break;
                    } else {
                        f0 f0Var4 = new f0(this, 3);
                        x0Var2.o = f0Var4;
                        AndroidUtilities.runOnUIThread(f0Var4, j11 - currentTimeMillis2);
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
