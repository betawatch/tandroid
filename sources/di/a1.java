package di;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import bi.wc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a1 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ d1 d;

    public a1(d1 d1Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = d1Var;
                this.c = new float[3];
                break;
            default:
                this.d = d1Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.d;
                if (d1Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        d1Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                d1 d1Var2 = this.d;
                if (d1Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        d1Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
                d1 d1Var = this.d;
                wc wcVar = d1Var.m;
                if (wcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(wcVar);
                    d1Var.m = null;
                }
                if (!d1Var.l && d1Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j3 = d1Var.c;
                    if (currentTimeMillis >= j3) {
                        c();
                        break;
                    } else {
                        wc wcVar2 = new wc(this, 15);
                        d1Var.m = wcVar2;
                        AndroidUtilities.runOnUIThread(wcVar2, j3 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                d1 d1Var2 = this.d;
                wc wcVar3 = d1Var2.o;
                if (wcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(wcVar3);
                    d1Var2.o = null;
                }
                if (!d1Var2.l && d1Var2.k != null) {
                    float[] fArr = this.c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j10 = d1Var2.e;
                    if (currentTimeMillis2 >= j10) {
                        c();
                        break;
                    } else {
                        wc wcVar4 = new wc(this, 16);
                        d1Var2.o = wcVar4;
                        AndroidUtilities.runOnUIThread(wcVar4, j10 - currentTimeMillis2);
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
