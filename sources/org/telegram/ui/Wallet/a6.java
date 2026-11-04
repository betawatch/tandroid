package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import b8.mf;
import b8.pf;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.lt;
import org.telegram.ui.i81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a6 extends FrameLayout implements SensorEventListener {
    public static final Object o0 = new Object();
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final h6 H;
    public final int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public long W;
    public boolean a;
    public boolean a0;
    public x5 b;
    public boolean b0;
    public int c;
    public ValueAnimator c0;
    public j3 d;
    public float d0;
    public final org.telegram.ui.Cells.v0 e;
    public float e0;
    public final ei.k1 f;
    public float f0;
    public float g0;
    public final gi.n5 h;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public final lt l0;
    public float m0;
    public final z5 n;
    public float n0;
    public final kw0 r;
    public final fa.f s;
    public final float[] w;
    public final SensorManager x;
    public final Sensor y;

    public a6(Context context, int i3, int i10) {
        super(context);
        this.s = new fa.f(4);
        this.w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new h6();
        this.J = -0.22f;
        this.K = -0.28f;
        this.Q = -1;
        this.f0 = 1.0f;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.l0 = new lt(this, 20);
        this.c = i3;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.g0.L(4800.0f));
        pf.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, context);
        this.e = v0Var;
        addView(v0Var, mf.e(-1, -1, 17));
        ei.k1 k1Var = new ei.k1(context, 1);
        this.f = k1Var;
        k1Var.setPadding(2, 2, 2, 2);
        k1Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        v0Var.addView(k1Var, layoutParams);
        gi.n5 n5Var = new gi.n5(this, context);
        this.h = n5Var;
        k1Var.addView(n5Var, mf.e(-1, -1, 17));
        z5 z5Var = new z5(this, context);
        this.n = z5Var;
        k1Var.addView(z5Var, mf.e(-1, -1, 17));
        kw0 kw0Var = new kw0(5, context, this);
        this.r = kw0Var;
        kw0Var.setClipChildren(false);
        kw0Var.setClipToPadding(false);
        kw0Var.setLayerType(2, null);
        kw0Var.setPivotX(0.0f);
        kw0Var.setPivotY(0.0f);
        k1Var.addView(kw0Var, mf.e(hs.H5, hs.j3, 51));
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.E = z10;
        y5 y5Var = new y5(this, 1);
        if (x5.j0 && x5.p0.get(Integer.valueOf(i3)) != null) {
            this.b = new x5(context.getApplicationContext(), i3, i10, y5Var);
        } else {
            v0Var.setVisibility(4);
            x5.l0.postRunnable(new ii.j4(this, context, i3, i10, y5Var));
        }
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
            this.c0 = null;
        }
        float f10 = this.O;
        float f11 = this.P;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.c0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.messenger.camera.q.i(1.2f, this.c0);
        this.c0.addUpdateListener(new gi.l9(this, f10, f11, 5));
        this.c0.addListener(new i81(this, 8));
        this.c0.start();
    }

    public final void b(float f10, float f11) {
        this.d0 = f10;
        this.g0 = f11;
        float f12 = f10 + this.m0;
        float f13 = f11 + this.n0;
        boolean z10 = Math.cos(Math.toRadians((double) f13)) * Math.cos(Math.toRadians((double) f12)) < 0.0d;
        boolean z11 = this.a;
        z5 z5Var = this.n;
        if (z11 != z10) {
            this.a = z10;
            this.r.invalidate();
            z5Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.h0 == f12 && this.i0 == f13 && this.j0 == width && this.k0 == height) {
            return;
        }
        this.h0 = f12;
        this.i0 = f13;
        this.j0 = width;
        this.k0 = height;
        if (width > 0 && height > 0) {
            this.s.f(width, height, f12, f13, z10, this.w);
            x5 x5Var = this.b;
            if (x5Var != null) {
                float[] fArr = x5Var.n;
                float[] fArr2 = x5Var.m;
                float[] fArr3 = x5Var.k;
                float[] fArr4 = x5Var.l;
                int[] iArr = x5Var.o;
                x5Var.r = z10;
                float[] fArr5 = x5Var.i;
                float[] fArr6 = z10 ? fArr4 : fArr3;
                if (!z10) {
                    fArr3 = fArr4;
                }
                fa.f fVar = this.s;
                fVar.getClass();
                int i3 = 0;
                while (i3 < fArr5.length / 2) {
                    int i10 = i3 * 2;
                    float f14 = (fArr5[i10 + 1] * (-1.212122f)) + 0.618561f;
                    float f15 = ((fArr5[i10] * 2.0f) - 1.0f) * 1.0f;
                    float g7 = fVar.g(-0.0125f, f14, f15, width, height, fArr6, i10);
                    float[] fArr7 = fArr6;
                    float[] fArr8 = fArr3;
                    fArr2[i3] = (g7 + fVar.g(0.0125f, f14, f15, width, height, fArr8, i10)) * 0.5f;
                    i3++;
                    fVar = fVar;
                    fArr3 = fArr8;
                    fArr5 = fArr5;
                    iArr = iArr;
                    fArr6 = fArr7;
                }
                int[] iArr2 = iArr;
                x5Var.q = width / 336.0f;
                int i11 = 0;
                while (i11 < 76) {
                    int i12 = i11 + 1;
                    fArr[i11] = (fArr2[i11] + fArr2[i12 % 76]) * 0.5f;
                    iArr2[i11] = i11;
                    i11 = i12;
                }
                for (int i13 = 1; i13 < 76; i13++) {
                    int i14 = iArr2[i13];
                    int i15 = i13 - 1;
                    while (i15 >= 0) {
                        int i16 = iArr2[i15];
                        if (fArr[i16] < fArr[i14]) {
                            iArr2[i15 + 1] = i16;
                            i15--;
                        }
                    }
                    iArr2[i15 + 1] = i14;
                }
            }
            org.telegram.ui.Cells.v0 v0Var = this.e;
            int width2 = v0Var.getWidth();
            int height2 = v0Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) v0Var.b;
                fArr9[0] = 0.0f;
                fArr9[1] = 0.0f;
                float f16 = width2;
                fArr9[2] = f16;
                fArr9[3] = 0.0f;
                fArr9[4] = f16;
                float f17 = height2;
                fArr9[5] = f17;
                fArr9[6] = 0.0f;
                fArr9[7] = f17;
                v0Var.c = ((Matrix) v0Var.d).setPolyToPoly(fArr9, 0, this.w, 0, 4);
                v0Var.invalidate();
            }
        }
        x5 x5Var2 = this.b;
        if (x5Var2 != null) {
            x5Var2.k(f12, f13);
        }
        this.h.invalidate();
        z5Var.invalidate();
    }

    public final void d(int i3, MotionEvent motionEvent) {
        this.Q = motionEvent.getPointerId(i3);
        this.R = motionEvent.getX(i3);
        this.S = motionEvent.getY(i3);
        this.T = this.O;
        this.U = this.P;
    }

    public final void e() {
        SensorManager sensorManager = this.x;
        if (sensorManager != null) {
            boolean z10 = this.a0 && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
            if (this.b0 == z10) {
                return;
            }
            this.b0 = z10;
            lt ltVar = this.l0;
            removeCallbacks(ltVar);
            if (!z10) {
                sensorManager.unregisterListener(this);
                return;
            }
            this.W = 0L;
            Sensor sensor = this.y;
            if (sensor != null) {
                sensorManager.registerListener(this, sensor, 1);
            }
            postOnAnimation(ltVar);
        }
    }

    public float getCardRotationX() {
        return this.d0;
    }

    public float getCardRotationY() {
        return this.g0;
    }

    public FrameLayout getFrontFace() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a0 = true;
        this.W = 0L;
        h6 h6Var = this.H;
        h6Var.a = false;
        h6Var.h = 0L;
        h6Var.i = 0L;
        h6Var.j = 0L;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.a0 = false;
        e();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
            this.c0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.round(size / 1.64f), TLObject.FLAG_30));
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.E) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.F;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.G;
            SensorManager.getOrientation(fArr2, fArr3);
            if (Float.isNaN(fArr3[1]) || Float.isNaN(fArr3[2])) {
                return;
            }
            this.J = c((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
            this.K = c(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
        } else {
            if (this.W != 0) {
                float f10 = (sensorEvent.timestamp - r4) * 1.0E-9f;
                if (f10 > 0.0f && f10 < 0.1f) {
                    this.J = c(org.telegram.ui.Cells.f1.A(sensorEvent.values[1], f10, -0.75f, this.J), -0.82f, 0.82f);
                    this.K = c(com.google.android.recaptcha.internal.a.v(sensorEvent.values[0], f10, -0.75f, this.K), -0.82f, 0.82f);
                }
            }
            this.W = sensorEvent.timestamp;
        }
        float f11 = ((-this.K) / 0.82f) * 15.0f;
        float f12 = (this.J / 0.82f) * 15.0f;
        long j10 = sensorEvent.timestamp;
        h6 h6Var = this.H;
        h6Var.getClass();
        if (Float.isNaN(f11) || Float.isInfinite(f11) || Float.isNaN(f12) || Float.isInfinite(f12)) {
            return;
        }
        h6Var.b = f11;
        h6Var.c = f12;
        h6Var.i = j10;
        if (!h6Var.a) {
            h6Var.a = true;
            h6Var.d = f11;
            h6Var.e = f12;
            h6Var.f = f11;
            h6Var.g = f12;
            h6Var.h = j10;
            return;
        }
        float f13 = f11 - h6Var.f;
        float f14 = f12 - h6Var.g;
        if ((f14 * f14) + (f13 * f13) > 1.265625f) {
            h6Var.f = f11;
            h6Var.g = f12;
            h6Var.h = j10;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        kw0 kw0Var = this.r;
        kw0Var.setScaleX(i3 / org.telegram.messenger.g0.L(336.0f));
        kw0Var.setScaleY(i10 / org.telegram.messenger.g0.L(205.0f));
        b(this.d0, this.g0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c0.cancel();
                this.c0 = null;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            d(0, motionEvent);
            this.V = false;
            setPressed(true);
            return true;
        }
        if (actionMasked == 1) {
            this.Q = -1;
            getParent().requestDisallowInterceptTouchEvent(false);
            setPressed(false);
            if (this.V) {
                a();
                return true;
            }
            postDelayed(new y5(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (findPointerIndex >= 0) {
                float x10 = motionEvent.getX(findPointerIndex);
                float y9 = motionEvent.getY(findPointerIndex);
                float abs = Math.abs(x10 - this.R);
                float f10 = this.I;
                if (abs > f10 || Math.abs(y9 - this.S) > f10) {
                    this.V = true;
                    setPressed(false);
                }
                if (this.V) {
                    float f11 = this.U;
                    this.P = c(a1.g.D(x10, this.R, 0.03f, f11), f11 - 32.0f, f11 + 32.0f);
                    float f12 = this.T;
                    this.O = c(a1.g.D(y9, this.S, 0.03f, f12), f12 - 22.0f, f12 + 22.0f);
                }
            }
        } else if (actionMasked == 3) {
            this.Q = -1;
            getParent().requestDisallowInterceptTouchEvent(false);
            setPressed(false);
            if (this.V) {
                a();
                return true;
            }
        } else {
            if (actionMasked == 5) {
                d(motionEvent.getActionIndex(), motionEvent);
                this.V = true;
                setPressed(false);
                return true;
            }
            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.Q) {
                for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                    if (i3 != motionEvent.getActionIndex()) {
                        d(i3, motionEvent);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i3) {
        super.onVisibilityChanged(view, i3);
        e();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        e();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        e();
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f10) {
        float f11 = this.e0;
        if (f11 == f10) {
            return;
        }
        float f12 = (this.d0 + f10) - f11;
        this.e0 = f10;
        b(f12, this.g0);
    }

    public void setCardIcon(int i3) {
        z5 z5Var = this.n;
        a6 a6Var = z5Var.b;
        a6Var.c = i3;
        x5 x5Var = a6Var.b;
        if (x5Var != null) {
            x5Var.j(i3);
        }
        z5Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        z5 z5Var = this.n;
        z5Var.a = z10;
        z5Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        gi.n5 n5Var = this.h;
        n5Var.b = fArr;
        this.e.invalidate();
        n5Var.invalidate();
        this.n.invalidate();
    }

    public void setUseGyroscope(float f10) {
        if (this.f0 == f10) {
            return;
        }
        this.f0 = f10;
        b((this.M * f10) + this.O + this.e0, (this.N * f10) + this.P);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
