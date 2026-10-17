package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class c6 extends FrameLayout implements SensorEventListener {
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final a6 H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public long R;
    public final org.telegram.ui.Cells.k7 S;
    public float T;
    public float U;
    public final b6 a;
    public final o5 b;
    public boolean c;
    public boolean d;
    public Runnable e;
    public boolean f;
    public boolean h;
    public final ai.w1 n;
    public final ai.w1 r;
    public final m.s3 s;
    public final float[] v;
    public final float[] w;
    public final SensorManager x;
    public final Sensor y;

    public c6(Context context, int i10, int i11) {
        super(context);
        this.c = true;
        this.s = new m.s3();
        this.v = new float[8];
        this.w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new a6();
        this.I = -0.22f;
        this.J = -0.28f;
        this.M = 1.0f;
        this.S = new org.telegram.ui.Cells.k7(this, 29);
        setClipChildren(false);
        setClipToPadding(false);
        w7.b6.b(this, 0.02f, 1.2f);
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.o(context.getApplicationContext(), i10, i11, 1));
        b6 b6Var = new b6(context, this, i10, i11);
        this.a = b6Var;
        addView(b6Var, w7.z5.a(-1.0f, -24.0f, -24.0f, -24.0f, -24.0f, -1, 17));
        o5 o5Var = new o5(i10, i11, context, true);
        this.b = o5Var;
        addView(o5Var, w7.z5.d(-1.0f, -1));
        ai.w1 w1Var = new ai.w1(context, 12);
        this.n = w1Var;
        ai.w1 w1Var2 = new ai.w1(context, 12);
        this.r = w1Var2;
        addView(w1Var2, w7.z5.e(-1, -1, 17));
        addView(w1Var, w7.z5.e(-1, -1, 17));
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.y = defaultSensor;
        this.E = (defaultSensor == null || defaultSensor.getType() == 4) ? false : true;
    }

    public static float b(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a(float f7, float f10) {
        float f11 = f7 + this.T;
        float f12 = f10 + this.U;
        this.a.f0.Q = new float[]{f11, f12};
        e();
        double cos = Math.cos(Math.toRadians(f12)) * Math.cos(Math.toRadians(f11));
        if (this.c) {
            this.b.b(f11, f12);
            this.b.setVisibility(cos >= 0.0d ? 0 : 4);
        }
        this.n.setVisibility(cos >= 0.0d ? 0 : 4);
        this.r.setVisibility(cos >= 0.0d ? 4 : 0);
        postInvalidateOnAnimation();
    }

    public final void c(float f7, float f10, float f11, float f12) {
        y5 y5Var = this.a.f0;
        float[] fArr = y5Var.N;
        if (fArr[0] == f7 && fArr[1] == f10 && fArr[2] == f11 && fArr[3] == f12) {
            return;
        }
        y5Var.N = new float[]{f7, f10, f11, f12};
    }

    public final void d() {
        this.c = true;
        this.a.setAlpha(0.003921569f);
        a(this.K, this.N);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Runnable runnable = this.e;
        if (runnable != null) {
            this.e = null;
            post(runnable);
        }
    }

    public final void e() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        this.s.c(width, height, this.K, this.N, false, this.v);
        this.s.c(width, height, this.K, this.N, true, this.w);
        this.n.a(this.v);
        this.r.a(this.w);
    }

    public final void f() {
        SensorManager sensorManager;
        b6 b6Var = this.a;
        if (b6Var == null || (sensorManager = this.x) == null) {
            return;
        }
        if (!isShown() || getWindowVisibility() != 0) {
            this.d = true;
        }
        boolean z10 = this.f && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        b6Var.setPaused(!z10);
        org.telegram.ui.Cells.k7 k7Var = this.S;
        removeCallbacks(k7Var);
        if (!z10) {
            sensorManager.unregisterListener(this);
            return;
        }
        if (this.d) {
            this.d = false;
            d();
        }
        this.R = 0L;
        Sensor sensor = this.y;
        if (sensor != null) {
            sensorManager.registerListener(this, sensor, 1);
        }
        postOnAnimation(k7Var);
    }

    public FrameLayout getBackFace() {
        return (FrameLayout) this.r.d;
    }

    public float getCardRotationX() {
        return this.K;
    }

    public float getCardRotationY() {
        return this.N;
    }

    public FrameLayout getFrontFace() {
        return (FrameLayout) this.n.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
        this.R = 0L;
        a6 a6Var = this.H;
        a6Var.a = false;
        a6Var.h = 0L;
        a6Var.i = 0L;
        a6Var.j = 0L;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f = false;
        f();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            e();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.round(size / 1.64f), TLObject.FLAG_30));
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.E) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.F;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            SensorManager.getOrientation(fArr2, this.G);
            this.I = b((float) Math.sin(r0[2]), -0.82f, 0.82f);
            this.J = b(-((float) Math.sin(r0[1])), -0.82f, 0.82f);
        } else {
            if (this.R != 0) {
                float f7 = (sensorEvent.timestamp - r4) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.I = b(org.telegram.ui.Cells.t0.z(sensorEvent.values[1], f7, -0.75f, this.I), -0.82f, 0.82f);
                    this.J = b(com.google.android.gms.internal.cast.a6.t(sensorEvent.values[0], f7, -0.75f, this.J), -0.82f, 0.82f);
                }
            }
            this.R = sensorEvent.timestamp;
        }
        this.H.a(((-this.J) / 0.82f) * 15.0f, (this.I / 0.82f) * 15.0f, sensorEvent.timestamp);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        e();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        f();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        f();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        f();
    }

    public void setAdditionalTilt(float f7) {
        float f10 = this.L;
        if (f10 == f7) {
            return;
        }
        float f11 = (f7 - f10) + this.K;
        this.K = f11;
        this.L = f7;
        a(f11, this.N);
    }

    public void setCardIcon(int i10) {
        this.b.setCardIcon(i10);
        this.a.f0.T = i10;
    }

    public void setDiamondAlpha(float f7) {
        y5 y5Var = this.a.f0;
        y5Var.getClass();
        y5Var.O = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingAlpha(float f7) {
        y5 y5Var = this.a.f0;
        y5Var.getClass();
        y5Var.P = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.b.setEngravingBitmap(bitmap);
        this.a.f0.R = bitmap;
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        this.e = runnable;
        if (runnable != null) {
            invalidate();
        }
    }

    public void setStickerStyle(float[] fArr) {
        y5 y5Var = this.a.f0;
        y5Var.getClass();
        boolean z10 = fArr.length != y5Var.X.length;
        for (int i10 = 0; i10 < 6; i10++) {
            if (fArr[i10] != y5Var.X[i10]) {
                z10 = true;
            }
        }
        if (!z10) {
            for (int i11 = 10; i11 < fArr.length; i11++) {
                if (fArr[i11] != y5Var.X[i11]) {
                    z10 = true;
                }
            }
        }
        float[] f7 = z10 ? k7.f(fArr) : (float[]) y5Var.Y.clone();
        System.arraycopy(fArr, 6, f7, 24, 4);
        y5Var.X = fArr;
        y5Var.Y = f7;
        this.b.setStickerStyle(fArr);
    }

    public void setUseGyroscope(float f7) {
        if (this.M == f7) {
            return;
        }
        this.M = f7;
        float f10 = this.P * f7;
        y5 y5Var = this.a.f0;
        float f11 = f10 + y5Var.i + this.L;
        this.K = f11;
        float f12 = (this.Q * f7) + y5Var.d;
        this.N = f12;
        a(f11, f12);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
