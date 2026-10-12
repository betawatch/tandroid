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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class p5 extends FrameLayout implements SensorEventListener {
    public final float[] E;
    public final SensorManager F;
    public final Sensor G;
    public final boolean H;
    public final float[] I;
    public final float[] J;
    public final l5 K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public long U;
    public final m5 V;
    public final o5 a;
    public final c5 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long h;
    public Runnable n;
    public boolean r;
    public boolean s;
    public final n5 v;
    public final n5 w;
    public final m.q3 x;
    public final float[] y;

    public p5(Context context, int i10, int i11) {
        super(context);
        this.c = true;
        this.f = 1L;
        this.x = new m.q3();
        this.y = new float[8];
        this.E = new float[8];
        this.I = new float[9];
        this.J = new float[3];
        this.K = new l5();
        this.L = -0.22f;
        this.M = -0.28f;
        this.P = 1.0f;
        this.V = new m5(this, 0);
        setClipChildren(false);
        setClipToPadding(false);
        w7.c6.b(this, 0.02f, 1.2f);
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.q(context.getApplicationContext(), i10, i11, 1));
        o5 o5Var = new o5(context, this, i10, i11);
        this.a = o5Var;
        addView(o5Var, w7.a6.a(-1.0f, -24.0f, -24.0f, -24.0f, -24.0f, -1, 17));
        c5 c5Var = new c5(i10, i11, context, true);
        this.b = c5Var;
        addView(c5Var, w7.a6.d(-1.0f, -1));
        n5 n5Var = new n5(context);
        this.v = n5Var;
        n5 n5Var2 = new n5(context);
        this.w = n5Var2;
        addView(n5Var2, w7.a6.e(-1, -1, 17));
        addView(n5Var, w7.a6.e(-1, -1, 17));
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.F = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.G = defaultSensor;
        this.H = (defaultSensor == null || defaultSensor.getType() == 4) ? false : true;
    }

    public static float b(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a(float f7, float f10) {
        this.a.f0.P = new float[]{f7, f10};
        e();
        double cos = Math.cos(Math.toRadians(f10)) * Math.cos(Math.toRadians(f7));
        if (this.c) {
            this.b.b(f7, f10);
            this.b.setVisibility(cos >= 0.0d ? 0 : 4);
        }
        this.v.setVisibility(cos >= 0.0d ? 0 : 4);
        this.w.setVisibility(cos >= 0.0d ? 4 : 0);
        postInvalidateOnAnimation();
    }

    public final void c(float f7, float f10, float f11, float f12) {
        j5 j5Var = this.a.f0;
        float[] fArr = j5Var.N;
        if (fArr[0] == f7 && fArr[1] == f10 && fArr[2] == f11 && fArr[3] == f12) {
            return;
        }
        j5Var.N = new float[]{f7, f10, f11, f12};
    }

    public final void d() {
        long j10;
        this.c = true;
        o5 o5Var = this.a;
        j5 j5Var = o5Var.f0;
        synchronized (j5Var) {
            j10 = j5Var.U + 1;
        }
        this.f = j10;
        o5Var.setAlpha(0.003921569f);
        n5 n5Var = this.v;
        n5Var.e = true;
        n5Var.f = true;
        a(this.N, this.Q);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n5 n5Var = this.v;
        this.d = true;
        try {
            n5Var.a(this.a.f0);
            this.d = false;
            n5Var.f = this.c;
            super.dispatchDraw(canvas);
        } catch (Throwable th2) {
            this.d = false;
            throw th2;
        }
    }

    public final void e() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        this.x.c(width, height, this.N, this.Q, false, this.y);
        this.x.c(width, height, this.N, this.Q, true, this.E);
        this.v.b(this.y);
        this.w.b(this.E);
    }

    public final void f() {
        SensorManager sensorManager;
        o5 o5Var = this.a;
        if (o5Var == null || (sensorManager = this.F) == null) {
            return;
        }
        if (!isShown() || getWindowVisibility() != 0) {
            this.e = true;
        }
        boolean z10 = this.r && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        o5Var.setPaused(!z10);
        m5 m5Var = this.V;
        removeCallbacks(m5Var);
        if (!z10) {
            sensorManager.unregisterListener(this);
            return;
        }
        if (this.e) {
            this.e = false;
            d();
        }
        this.U = 0L;
        Sensor sensor = this.G;
        if (sensor != null) {
            sensorManager.registerListener(this, sensor, 1);
        }
        postOnAnimation(m5Var);
    }

    public FrameLayout getBackFace() {
        return this.w.c;
    }

    public float getCardRotationX() {
        return this.N;
    }

    public float getCardRotationY() {
        return this.Q;
    }

    public FrameLayout getFrontFace() {
        return this.v.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
        this.U = 0L;
        l5 l5Var = this.K;
        l5Var.a = false;
        l5Var.h = 0L;
        l5Var.i = 0L;
        l5Var.j = 0L;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.r = false;
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
        if (this.H) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.I;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            SensorManager.getOrientation(fArr2, this.J);
            this.L = b((float) Math.sin(r0[2]), -0.82f, 0.82f);
            this.M = b(-((float) Math.sin(r0[1])), -0.82f, 0.82f);
        } else {
            if (this.U != 0) {
                float f7 = (sensorEvent.timestamp - r4) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.L = b(this.L - ((sensorEvent.values[1] * f7) * (-0.75f)), -0.82f, 0.82f);
                    this.M = b(com.google.android.gms.internal.play_billing.k3.t(sensorEvent.values[0], f7, -0.75f, this.M), -0.82f, 0.82f);
                }
            }
            this.U = sensorEvent.timestamp;
        }
        this.K.a(((-this.M) / 0.82f) * 15.0f, (this.L / 0.82f) * 15.0f, sensorEvent.timestamp);
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
        float f10 = this.O;
        if (f10 == f7) {
            return;
        }
        float f11 = (f7 - f10) + this.N;
        this.N = f11;
        this.O = f7;
        a(f11, this.Q);
    }

    public void setCardIcon(int i10) {
        this.b.setCardIcon(i10);
        this.a.f0.a0 = i10;
    }

    public void setDiamondAlpha(float f7) {
        j5 j5Var = this.a.f0;
        j5Var.getClass();
        j5Var.O = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.b.setEngravingBitmap(bitmap);
        this.a.f0.Y = bitmap;
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        long j10;
        this.n = runnable;
        if (runnable != null) {
            j5 j5Var = this.a.f0;
            synchronized (j5Var) {
                j10 = j5Var.U + 1;
            }
            this.h = j10;
            this.v.e = true;
            invalidate();
        }
    }

    public void setUseGyroscope(float f7) {
        if (this.P == f7) {
            return;
        }
        this.P = f7;
        float f10 = this.S * f7;
        j5 j5Var = this.a.f0;
        float f11 = f10 + j5Var.i + this.O;
        this.N = f11;
        float f12 = (this.T * f7) + j5Var.d;
        this.Q = f12;
        a(f11, f12);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
