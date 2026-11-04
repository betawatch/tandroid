package ii;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import gi.f6;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t0 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ w0 d;

    public t0(w0 w0Var, int i3) {
        this.a = i3;
        switch (i3) {
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
    public final void onAccuracyChanged(Sensor sensor, int i3) {
        int i10 = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.d;
                f6 f6Var = w0Var.m;
                if (f6Var != null) {
                    org.telegram.messenger.g0.r(f6Var);
                    w0Var.m = null;
                }
                if (!w0Var.l && w0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j10 = w0Var.c;
                    if (currentTimeMillis >= j10) {
                        c();
                        break;
                    } else {
                        f6 f6Var2 = new f6(this, 17);
                        w0Var.m = f6Var2;
                        org.telegram.messenger.g0.i3(f6Var2, j10 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                w0 w0Var2 = this.d;
                f6 f6Var3 = w0Var2.o;
                if (f6Var3 != null) {
                    org.telegram.messenger.g0.r(f6Var3);
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
                    long j11 = w0Var2.e;
                    if (currentTimeMillis2 >= j11) {
                        c();
                        break;
                    } else {
                        f6 f6Var4 = new f6(this, 18);
                        w0Var2.o = f6Var4;
                        org.telegram.messenger.g0.i3(f6Var4, j11 - currentTimeMillis2);
                        break;
                    }
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i3) {
    }

    private final void b(Sensor sensor, int i3) {
    }
}
