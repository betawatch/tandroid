package ai;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o1 implements SensorEventListener {
    public final /* synthetic */ t1 a;

    public o1(t1 t1Var) {
        this.a = t1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        t1 t1Var = this.a;
        t1Var.I6 = f7;
        float f10 = fArr[1];
        t1Var.J6 = f10;
        float f11 = fArr[2];
        if (t1Var.M6) {
            return;
        }
        t1Var.K6 = f7;
        t1Var.L6 = f10;
        t1Var.M6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
