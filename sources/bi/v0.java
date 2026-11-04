package bi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v0 implements SensorEventListener {
    public final /* synthetic */ a1 a;

    public v0(a1 a1Var) {
        this.a = a1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        a1 a1Var = this.a;
        a1Var.I6 = f10;
        float f11 = fArr[1];
        a1Var.J6 = f11;
        float f12 = fArr[2];
        if (a1Var.M6) {
            return;
        }
        a1Var.K6 = f10;
        a1Var.L6 = f11;
        a1Var.M6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
