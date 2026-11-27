// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class a09 implements SensorEventListener {
    public final /* synthetic */ f09 a;

    public a09(f09 f09Var) {
        this.a = f09Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        f09 f09Var = this.a;
        f09Var.H6 = f;
        float f2 = fArr[1];
        f09Var.I6 = f2;
        float f3 = fArr[2];
        if (f09Var.L6) {
            return;
        }
        f09Var.J6 = f;
        f09Var.K6 = f2;
        f09Var.L6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
