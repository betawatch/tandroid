package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import di.nb;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class x0 implements SensorEventListener {
    public final /* synthetic */ int a;
    public long b;
    public float[] c;
    public final /* synthetic */ a1 d;

    public x0(a1 a1Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = a1Var;
                this.c = new float[3];
                break;
            default:
                this.d = a1Var;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                a1 a1Var = this.d;
                if (a1Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        a1Var.k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.c;
                a1 a1Var2 = this.d;
                if (a1Var2.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        a1Var2.k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
                a1 a1Var = this.d;
                nb nbVar = a1Var.m;
                if (nbVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar);
                    a1Var.m = null;
                }
                if (!a1Var.l && a1Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j3 = a1Var.c;
                    if (currentTimeMillis >= j3) {
                        c();
                        break;
                    } else {
                        nb nbVar2 = new nb(this, 13);
                        a1Var.m = nbVar2;
                        AndroidUtilities.runOnUIThread(nbVar2, j3 - currentTimeMillis);
                        break;
                    }
                }
                break;
            default:
                a1 a1Var2 = this.d;
                nb nbVar3 = a1Var2.o;
                if (nbVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar3);
                    a1Var2.o = null;
                }
                if (!a1Var2.l && a1Var2.k != null) {
                    float[] fArr = this.c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j10 = a1Var2.e;
                    if (currentTimeMillis2 >= j10) {
                        c();
                        break;
                    } else {
                        nb nbVar4 = new nb(this, 14);
                        a1Var2.o = nbVar4;
                        AndroidUtilities.runOnUIThread(nbVar4, j10 - currentTimeMillis2);
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
