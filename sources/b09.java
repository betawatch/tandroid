// default package

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b09 implements SensorEventListener {
    public final /* synthetic */ g09 a;

    public b09(g09 g09Var) {
        this.a = g09Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        g09 g09Var = this.a;
        g09Var.H6 = f;
        float f2 = fArr[1];
        g09Var.I6 = f2;
        float f3 = fArr[2];
        if (g09Var.L6) {
            return;
        }
        g09Var.J6 = f;
        g09Var.K6 = f2;
        g09Var.L6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
