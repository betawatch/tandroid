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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.f40;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class h6 implements SensorEventListener {
    public static h6 G;
    public float D;
    public float E;
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
    public final f40 F = new f40(this, 1);

    public h6(Context context) {
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
        this.D = 0.0f;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.c.getDefaultDisplay().getRotation();
        if (this.y != rotation) {
            this.s = false;
            this.y = rotation;
        }
        int i10 = this.y;
        int i11 = qs.N1;
        if (i10 == 1) {
            i7 = 129;
            i11 = 2;
        } else {
            i7 = qs.O1;
            if (i10 != 2) {
                if (i10 == 3) {
                    i11 = 130;
                    i7 = 1;
                } else {
                    i7 = 2;
                    i11 = 1;
                }
            }
        }
        float[] fArr3 = this.h;
        SensorManager.remapCoordinateSystem(fArr2, i11, i7, fArr3);
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
        float f10 = this.D;
        this.D = com.google.android.recaptcha.internal.a.z(max, f10, 0.12f, f10);
        float f11 = this.E;
        this.E = com.google.android.recaptcha.internal.a.z(max2, f11, 0.12f, f11);
        Iterator it = this.e.keySet().iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
