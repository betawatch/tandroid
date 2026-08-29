package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.db1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c81 implements SensorEventListener {
    public final float[] a = new float[3];
    public final float[] b = new float[3];
    public int c;
    public final WindowManager d;
    public final SensorManager e;
    public final Sensor f;
    public boolean h;
    public b81 n;

    public c81(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i10, int i11) {
        float f9 = i10;
        float dp = AndroidUtilities.dp(16.0f) * 2;
        float f10 = (f9 + dp) / f9;
        float f11 = i11;
        return Math.max(f10, (dp + f11) / f11);
    }

    public final void b(db1 db1Var) {
        this.n = db1Var;
    }

    public final void c(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            Sensor sensor = this.f;
            if (sensor == null) {
                return;
            }
            SensorManager sensorManager = this.e;
            if (z10) {
                sensorManager.registerListener(this, sensor, 1);
            } else {
                sensorManager.unregisterListener(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        b81 b81Var;
        float f9;
        int rotation = this.d.getDefaultDisplay().getRotation();
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0] / 9.80665f;
        float f11 = fArr[1] / 9.80665f;
        float f12 = fArr[2] / 9.80665f;
        float f13 = f12 * f12;
        float atan2 = (float) ((Math.atan2(f10, Math.sqrt((f11 * f11) + f13)) / 3.141592653589793d) * 2.0d);
        float atan22 = (float) ((Math.atan2(f11, Math.sqrt((f10 * f10) + f13)) / 3.141592653589793d) * 2.0d);
        if (rotation != 1) {
            if (rotation == 2) {
                float f14 = -atan22;
                atan22 = -atan2;
                atan2 = f14;
            } else if (rotation != 3) {
                atan2 = atan22;
                atan22 = atan2;
            } else {
                atan2 = -atan2;
            }
        }
        int i10 = this.c;
        float[] fArr2 = this.a;
        fArr2[i10] = atan2;
        float[] fArr3 = this.b;
        fArr3[i10] = atan22;
        this.c = (i10 + 1) % fArr2.length;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i11 = 0; i11 < fArr2.length; i11++) {
            f15 += fArr2[i11];
            f16 += fArr3[i11];
        }
        float length = f15 / fArr2.length;
        float length2 = f16 / fArr2.length;
        if (length <= 1.0f) {
            f9 = length < -1.0f ? -2.0f : 2.0f;
            int round = Math.round(AndroidUtilities.dpf2(16.0f) * length2);
            int round2 = Math.round(AndroidUtilities.dpf2(16.0f) * length);
            float max = Math.max(-1.0f, Math.min(1.0f, (-length2) / 0.45f));
            float max2 = Math.max(-1.0f, Math.min(1.0f, (-length) / 0.45f));
            float sqrt = (float) Math.sqrt((max2 * max2) + (max * max));
            float f17 = max / sqrt;
            float f18 = max2 / sqrt;
            Math.atan2((f17 * (-1.0f)) - (f18 * 0.0f), (f18 * (-1.0f)) + (f17 * 0.0f));
            b81Var = this.n;
            if (b81Var == null) {
                b81Var.e(round, round2);
                return;
            }
            return;
        }
        length = f9 - length;
        int round3 = Math.round(AndroidUtilities.dpf2(16.0f) * length2);
        int round22 = Math.round(AndroidUtilities.dpf2(16.0f) * length);
        float max3 = Math.max(-1.0f, Math.min(1.0f, (-length2) / 0.45f));
        float max22 = Math.max(-1.0f, Math.min(1.0f, (-length) / 0.45f));
        float sqrt2 = (float) Math.sqrt((max22 * max22) + (max3 * max3));
        float f172 = max3 / sqrt2;
        float f182 = max22 / sqrt2;
        Math.atan2((f172 * (-1.0f)) - (f182 * 0.0f), (f182 * (-1.0f)) + (f172 * 0.0f));
        b81Var = this.n;
        if (b81Var == null) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
