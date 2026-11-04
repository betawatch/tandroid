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
import org.telegram.messenger.hs;
import org.telegram.ui.Components.b40;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g6 implements SensorEventListener {
    public static g6 H;
    public float E;
    public float F;
    public final SensorManager a;
    public final Sensor b;
    public final WindowManager c;
    public boolean r;
    public boolean s;
    public float w;
    public float x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f = new float[9];
    public final float[] h = new float[9];
    public final float[] n = new float[3];
    public int y = -1;
    public final b40 G = new b40(this, 1);

    public g6(Context context) {
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
        this.d.removeCallbacks(this.G);
        this.F = 0.0f;
        this.E = 0.0f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i3;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.c.getDefaultDisplay().getRotation();
        if (this.y != rotation) {
            this.s = false;
            this.y = rotation;
        }
        int i10 = this.y;
        int i11 = hs.N1;
        if (i10 == 1) {
            i3 = 129;
            i11 = 2;
        } else {
            i3 = hs.O1;
            if (i10 != 2) {
                if (i10 == 3) {
                    i11 = 130;
                    i3 = 1;
                } else {
                    i3 = 2;
                    i11 = 1;
                }
            }
        }
        float[] fArr3 = this.h;
        SensorManager.remapCoordinateSystem(fArr2, i11, i3, fArr3);
        float[] fArr4 = this.n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (Float.isNaN(fArr4[1]) || Float.isNaN(fArr4[2])) {
            return;
        }
        if (!this.s) {
            this.w = fArr4[1];
            this.x = fArr4[2];
            this.s = true;
        }
        float max = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[2] - this.x, 6.283185307179586d)) / 0.45f));
        float max2 = Math.max(-1.0f, Math.min(1.0f, ((float) Math.IEEEremainder(fArr4[1] - this.w, 6.283185307179586d)) / 0.45f));
        float f10 = this.E;
        this.E = com.google.android.recaptcha.internal.a.y(max, f10, 0.12f, f10);
        float f11 = this.F;
        this.F = com.google.android.recaptcha.internal.a.y(max2, f11, 0.12f, f11);
        Iterator it = this.e.keySet().iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
