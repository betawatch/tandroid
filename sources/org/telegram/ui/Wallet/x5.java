package org.telegram.ui.Wallet;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.ui.Components.g60;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x5 implements SensorEventListener {
    public static x5 G;
    public float E;
    public final SensorManager a;
    public final Sensor b;
    public final WindowManager c;
    public boolean r;
    public boolean s;
    public float v;
    public float w;
    public float y;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f = new float[9];
    public final float[] h = new float[9];
    public final float[] n = new float[3];
    public int x = -1;
    public final g60 F = new g60(this, 1);

    public x5(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        this.c = (WindowManager) context.getSystemService("window");
        Sensor defaultSensor = sensorManager == null ? null : sensorManager.getDefaultSensor(15);
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.b = defaultSensor;
    }

    public final void a() {
        if (this.r) {
            this.a.unregisterListener(this);
        }
        this.s = false;
        this.r = false;
        this.d.removeCallbacks(this.F);
        this.E = 0.0f;
        this.y = 0.0f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.c.getDefaultDisplay().getRotation();
        if (this.x != rotation) {
            this.s = false;
            this.x = rotation;
        }
        int i11 = this.x;
        int i12 = 129;
        if (i11 == 1) {
            i10 = 129;
            i12 = 2;
        } else {
            i10 = 130;
            if (i11 != 2) {
                if (i11 == 3) {
                    i12 = 130;
                    i10 = 1;
                } else {
                    i10 = 2;
                    i12 = 1;
                }
            }
        }
        float[] fArr3 = this.h;
        SensorManager.remapCoordinateSystem(fArr2, i12, i10, fArr3);
        float[] fArr4 = this.n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (Float.isNaN(fArr4[1]) || Float.isNaN(fArr4[2])) {
            return;
        }
        if (!this.s) {
            this.v = fArr4[1];
            this.w = fArr4[2];
            this.s = true;
        }
        float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.w, 6.283185307179586d)) / 0.45f));
        float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.v, 6.283185307179586d)) / 0.45f));
        float f7 = this.y;
        this.y = c3.h0.z(max, f7, 0.12f, f7);
        float f10 = this.E;
        this.E = c3.h0.z(max2, f10, 0.12f, f10);
        Iterator it = this.e.keySet().iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
