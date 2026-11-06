package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import fi.h9;
import org.json.JSONObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class s0 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ v0 d;

    public s0(v0 v0Var, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.d = v0Var;
                this.c = new float[3];
                break;
            default:
                this.d = v0Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.d;
                if (v0Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        v0Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                v0 v0Var2 = this.d;
                if (v0Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        v0Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
                v0 v0Var = this.d;
                h9 h9Var = v0Var.m;
                if (h9Var != null) {
                    org.telegram.messenger.g0.r(h9Var);
                    v0Var.m = null;
                }
                if (!v0Var.l && v0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j3 = v0Var.c;
                    if (currentTimeMillis >= j3) {
                        c();
                        break;
                    } else {
                        h9 h9Var2 = new h9(this, 14);
                        v0Var.m = h9Var2;
                        org.telegram.messenger.g0.i3(h9Var2, j3 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                v0 v0Var2 = this.d;
                h9 h9Var3 = v0Var2.o;
                if (h9Var3 != null) {
                    org.telegram.messenger.g0.r(h9Var3);
                    v0Var2.o = null;
                }
                if (!v0Var2.l && v0Var2.k != null) {
                    float[] fArr = this.c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j10 = v0Var2.e;
                    if (currentTimeMillis2 >= j10) {
                        c();
                        break;
                    } else {
                        h9 h9Var4 = new h9(this, 15);
                        v0Var2.o = h9Var4;
                        org.telegram.messenger.g0.i3(h9Var4, j10 - currentTimeMillis2);
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
