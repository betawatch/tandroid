package ai;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class g1 implements SensorEventListener {
    public final /* synthetic */ l1 a;

    public g1(l1 l1Var) {
        this.a = l1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        l1 l1Var = this.a;
        l1Var.H6 = f10;
        float f11 = fArr[1];
        l1Var.I6 = f11;
        float f12 = fArr[2];
        if (l1Var.L6) {
            return;
        }
        l1Var.J6 = f10;
        l1Var.K6 = f11;
        l1Var.L6 = true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
