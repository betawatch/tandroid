package ci;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u0 implements SensorEventListener {
    public final /* synthetic */ z0 a;

    public u0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        z0 z0Var = this.a;
        z0Var.I6 = f10;
        float f11 = fArr[1];
        z0Var.J6 = f11;
        float f12 = fArr[2];
        if (z0Var.M6) {
            return;
        }
        z0Var.K6 = f10;
        z0Var.L6 = f11;
        z0Var.M6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
