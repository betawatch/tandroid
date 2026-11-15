package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class z61 implements SensorEventListener {
    public final float[] a = new float[3];
    public final float[] b = new float[3];
    public int c;
    public final WindowManager d;
    public final SensorManager e;
    public final Sensor f;
    public boolean h;
    public y61 n;

    public z61(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i7, int i10) {
        float f10 = i7;
        float L = org.telegram.messenger.g0.L(16.0f) * 2;
        float f11 = (f10 + L) / f10;
        float f12 = i10;
        return Math.max(f11, (L + f12) / f12);
    }

    public final void b(org.telegram.ui.h61 h61Var) {
        this.n = h61Var;
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        y61 y61Var;
        float f10;
        int rotation = this.d.getDefaultDisplay().getRotation();
        float[] fArr = sensorEvent.values;
        float f11 = fArr[0] / 9.80665f;
        float f12 = fArr[1] / 9.80665f;
        float f13 = fArr[2] / 9.80665f;
        float f14 = f13 * f13;
        float atan2 = (float) ((Math.atan2(f11, Math.sqrt((f12 * f12) + f14)) / 3.141592653589793d) * 2.0d);
        float atan22 = (float) ((Math.atan2(f12, Math.sqrt((f11 * f11) + f14)) / 3.141592653589793d) * 2.0d);
        if (rotation != 1) {
            if (rotation == 2) {
                float f15 = -atan22;
                atan22 = -atan2;
                atan2 = f15;
            } else if (rotation != 3) {
                atan2 = atan22;
                atan22 = atan2;
            } else {
                atan2 = -atan2;
            }
        }
        int i7 = this.c;
        float[] fArr2 = this.a;
        fArr2[i7] = atan2;
        float[] fArr3 = this.b;
        fArr3[i7] = atan22;
        this.c = (i7 + 1) % fArr2.length;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i10 = 0; i10 < fArr2.length; i10++) {
            f16 += fArr2[i10];
            f17 += fArr3[i10];
        }
        float length = f16 / fArr2.length;
        float length2 = f17 / fArr2.length;
        if (length <= 1.0f) {
            f10 = length < -1.0f ? -2.0f : 2.0f;
            int round = Math.round(org.telegram.messenger.g0.N(16.0f) * length2);
            int round2 = Math.round(org.telegram.messenger.g0.N(16.0f) * length);
            float C = a8.p0.C(-length2, 0.45f, 1.0f, -1.0f);
            float C2 = a8.p0.C(-length, 0.45f, 1.0f, -1.0f);
            float sqrt = (float) Math.sqrt((C2 * C2) + (C * C));
            float f18 = C / sqrt;
            float f19 = C2 / sqrt;
            Math.atan2((f18 * (-1.0f)) - (f19 * 0.0f), (f19 * (-1.0f)) + (f18 * 0.0f));
            y61Var = this.n;
            if (y61Var == null) {
                y61Var.g(round, round2);
                return;
            }
            return;
        }
        length = f10 - length;
        int round3 = Math.round(org.telegram.messenger.g0.N(16.0f) * length2);
        int round22 = Math.round(org.telegram.messenger.g0.N(16.0f) * length);
        float C3 = a8.p0.C(-length2, 0.45f, 1.0f, -1.0f);
        float C22 = a8.p0.C(-length, 0.45f, 1.0f, -1.0f);
        float sqrt2 = (float) Math.sqrt((C22 * C22) + (C3 * C3));
        float f182 = C3 / sqrt2;
        float f192 = C22 / sqrt2;
        Math.atan2((f182 * (-1.0f)) - (f192 * 0.0f), (f192 * (-1.0f)) + (f182 * 0.0f));
        y61Var = this.n;
        if (y61Var == null) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
