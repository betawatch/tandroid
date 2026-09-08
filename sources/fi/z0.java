package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import di.nb;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class z0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public float[] d;
    public final /* synthetic */ a1 e;

    public z0(a1 a1Var) {
        this.e = a1Var;
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        a1 a1Var = this.e;
        if (a1Var.k == null) {
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
            a1Var.k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.e;
        nb nbVar = a1Var.s;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            a1Var.s = null;
        }
        if (a1Var.l || a1Var.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        long j3 = a1Var.j;
        if (currentTimeMillis < j3) {
            nb nbVar2 = new nb(this, 16);
            a1Var.s = nbVar2;
            AndroidUtilities.runOnUIThread(nbVar2, j3 - currentTimeMillis);
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
