package ci;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
