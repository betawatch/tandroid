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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.v41;
import org.telegram.ui.r81;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class c6 extends FrameLayout implements SensorEventListener {
    public static final Object n0 = new Object();
    public final boolean D;
    public final float[] E;
    public final float[] F;
    public final j6 G;
    public final int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public long V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public z5 b;
    public ValueAnimator b0;
    public int c;
    public float c0;
    public l3 d;
    public float d0;
    public final org.telegram.ui.Cells.v0 e;
    public float e0;
    public final v41 f;
    public float f0;
    public float g0;
    public final fi.p5 h;
    public float h0;
    public int i0;
    public int j0;
    public final dt k0;
    public float l0;
    public float m0;
    public final b6 n;
    public final v41 r;
    public final ga.d s;
    public final float[] w;
    public final SensorManager x;
    public final Sensor y;

    public c6(Context context, int i7, int i10) {
        super(context);
        this.s = new ga.d(4);
        this.w = new float[8];
        this.E = new float[9];
        this.F = new float[3];
        this.G = new j6();
        this.I = -0.22f;
        this.J = -0.28f;
        this.P = -1;
        this.e0 = 1.0f;
        this.g0 = Float.NaN;
        this.h0 = Float.NaN;
        this.k0 = new dt(this, 25);
        this.c = i7;
        boolean z9 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.g0.L(4800.0f));
        c8.ka.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, context);
        this.e = v0Var;
        addView(v0Var, c8.ha.e(-1, -1, 17));
        v41 v41Var = new v41(context);
        this.f = v41Var;
        v41Var.setPadding(2, 2, 2, 2);
        v41Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        v0Var.addView(v41Var, layoutParams);
        fi.p5 p5Var = new fi.p5(this, context);
        this.h = p5Var;
        v41Var.addView(p5Var, c8.ha.e(-1, -1, 17));
        b6 b6Var = new b6(this, context);
        this.n = b6Var;
        v41Var.addView(b6Var, c8.ha.e(-1, -1, 17));
        v41 v41Var2 = new v41(3, context, this);
        this.r = v41Var2;
        v41Var2.setClipChildren(false);
        v41Var2.setClipToPadding(false);
        v41Var2.setLayerType(2, null);
        v41Var2.setPivotX(0.0f);
        v41Var2.setPivotY(0.0f);
        v41Var.addView(v41Var2, c8.ha.e(qs.H5, qs.j3, 51));
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z9 = true;
        }
        this.D = z9;
        a6 a6Var = new a6(this, 1);
        if (z5.j0 && z5.p0.get(Integer.valueOf(i7)) != null) {
            this.b = new z5(context.getApplicationContext(), i7, i10, a6Var);
        } else {
            v0Var.setVisibility(4);
            z5.l0.postRunnable(new hi.j4(this, context, i7, i10, a6Var));
        }
    }

    public static float c(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.b0.cancel();
            this.b0 = null;
        }
        float f10 = this.N;
        float f11 = this.O;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.messenger.camera.q.i(1.2f, this.b0);
        this.b0.addUpdateListener(new fi.l9(this, f10, f11, 5));
        this.b0.addListener(new r81(this, 8));
        this.b0.start();
    }

    public final void b(float f10, float f11) {
        this.c0 = f10;
        this.f0 = f11;
        float f12 = f10 + this.l0;
        float f13 = f11 + this.m0;
        boolean z9 = Math.cos(Math.toRadians((double) f13)) * Math.cos(Math.toRadians((double) f12)) < 0.0d;
        boolean z10 = this.a;
        b6 b6Var = this.n;
        if (z10 != z9) {
            this.a = z9;
            this.r.invalidate();
            b6Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.g0 == f12 && this.h0 == f13 && this.i0 == width && this.j0 == height) {
            return;
        }
        this.g0 = f12;
        this.h0 = f13;
        this.i0 = width;
        this.j0 = height;
        if (width > 0 && height > 0) {
            this.s.f(width, height, f12, f13, z9, this.w);
            z5 z5Var = this.b;
            if (z5Var != null) {
                float[] fArr = z5Var.n;
                float[] fArr2 = z5Var.m;
                float[] fArr3 = z5Var.k;
                float[] fArr4 = z5Var.l;
                int[] iArr = z5Var.o;
                z5Var.r = z9;
                float[] fArr5 = z5Var.i;
                float[] fArr6 = z9 ? fArr4 : fArr3;
                if (!z9) {
                    fArr3 = fArr4;
                }
                ga.d dVar = this.s;
                dVar.getClass();
                int i7 = 0;
                while (i7 < fArr5.length / 2) {
                    int i10 = i7 * 2;
                    float f14 = (fArr5[i10 + 1] * (-1.212122f)) + 0.618561f;
                    float f15 = ((fArr5[i10] * 2.0f) - 1.0f) * 1.0f;
                    float g10 = dVar.g(-0.0125f, f14, f15, width, height, fArr6, i10);
                    float[] fArr7 = fArr6;
                    float[] fArr8 = fArr3;
                    fArr2[i7] = (g10 + dVar.g(0.0125f, f14, f15, width, height, fArr8, i10)) * 0.5f;
                    i7++;
                    dVar = dVar;
                    fArr3 = fArr8;
                    fArr5 = fArr5;
                    iArr = iArr;
                    fArr6 = fArr7;
                }
                int[] iArr2 = iArr;
                z5Var.q = width / 336.0f;
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
        z5 z5Var2 = this.b;
        if (z5Var2 != null) {
            z5Var2.k(f12, f13);
        }
        this.h.invalidate();
        b6Var.invalidate();
    }

    public final void d(int i7, MotionEvent motionEvent) {
        this.P = motionEvent.getPointerId(i7);
        this.Q = motionEvent.getX(i7);
        this.R = motionEvent.getY(i7);
        this.S = this.N;
        this.T = this.O;
    }

    public final void e() {
        SensorManager sensorManager = this.x;
        if (sensorManager != null) {
            boolean z9 = this.W && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
            if (this.a0 == z9) {
                return;
            }
            this.a0 = z9;
            dt dtVar = this.k0;
            removeCallbacks(dtVar);
            if (!z9) {
                sensorManager.unregisterListener(this);
                return;
            }
            this.V = 0L;
            Sensor sensor = this.y;
            if (sensor != null) {
                sensorManager.registerListener(this, sensor, 1);
            }
            postOnAnimation(dtVar);
        }
    }

    public float getCardRotationX() {
        return this.c0;
    }

    public float getCardRotationY() {
        return this.f0;
    }

    public FrameLayout getFrontFace() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = true;
        this.V = 0L;
        j6 j6Var = this.G;
        j6Var.a = false;
        j6Var.h = 0L;
        j6Var.i = 0L;
        j6Var.j = 0L;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.W = false;
        e();
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.b0.cancel();
            this.b0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.round(size / 1.64f), TLObject.FLAG_30));
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.D) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.E;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.F;
            SensorManager.getOrientation(fArr2, fArr3);
            if (Float.isNaN(fArr3[1]) || Float.isNaN(fArr3[2])) {
                return;
            }
            this.I = c((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
            this.J = c(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
        } else {
            if (this.V != 0) {
                float f10 = (sensorEvent.timestamp - r4) * 1.0E-9f;
                if (f10 > 0.0f && f10 < 0.1f) {
                    this.I = c(org.telegram.ui.Cells.f1.x(sensorEvent.values[1], f10, -0.75f, this.I), -0.82f, 0.82f);
                    this.J = c(com.google.android.recaptcha.internal.a.x(sensorEvent.values[0], f10, -0.75f, this.J), -0.82f, 0.82f);
                }
            }
            this.V = sensorEvent.timestamp;
        }
        float f11 = ((-this.J) / 0.82f) * 15.0f;
        float f12 = (this.I / 0.82f) * 15.0f;
        long j3 = sensorEvent.timestamp;
        j6 j6Var = this.G;
        j6Var.getClass();
        if (Float.isNaN(f11) || Float.isInfinite(f11) || Float.isNaN(f12) || Float.isInfinite(f12)) {
            return;
        }
        j6Var.b = f11;
        j6Var.c = f12;
        j6Var.i = j3;
        if (!j6Var.a) {
            j6Var.a = true;
            j6Var.d = f11;
            j6Var.e = f12;
            j6Var.f = f11;
            j6Var.g = f12;
            j6Var.h = j3;
            return;
        }
        float f13 = f11 - j6Var.f;
        float f14 = f12 - j6Var.g;
        if ((f14 * f14) + (f13 * f13) > 1.265625f) {
            j6Var.f = f11;
            j6Var.g = f12;
            j6Var.h = j3;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        v41 v41Var = this.r;
        v41Var.setScaleX(i7 / org.telegram.messenger.g0.L(336.0f));
        v41Var.setScaleY(i10 / org.telegram.messenger.g0.L(205.0f));
        b(this.c0, this.f0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.b0.cancel();
                this.b0 = null;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            d(0, motionEvent);
            this.U = false;
            setPressed(true);
            return true;
        }
        if (actionMasked == 1) {
            this.P = -1;
            getParent().requestDisallowInterceptTouchEvent(false);
            setPressed(false);
            if (this.U) {
                a();
                return true;
            }
            postDelayed(new a6(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.P);
            if (findPointerIndex >= 0) {
                float x10 = motionEvent.getX(findPointerIndex);
                float y10 = motionEvent.getY(findPointerIndex);
                float abs = Math.abs(x10 - this.Q);
                float f10 = this.H;
                if (abs > f10 || Math.abs(y10 - this.R) > f10) {
                    this.U = true;
                    setPressed(false);
                }
                if (this.U) {
                    float f11 = this.T;
                    this.O = c(com.google.android.recaptcha.internal.a.v(x10, this.Q, 0.03f, f11), f11 - 32.0f, f11 + 32.0f);
                    float f12 = this.S;
                    this.N = c(com.google.android.recaptcha.internal.a.v(y10, this.R, 0.03f, f12), f12 - 22.0f, f12 + 22.0f);
                }
            }
        } else if (actionMasked == 3) {
            this.P = -1;
            getParent().requestDisallowInterceptTouchEvent(false);
            setPressed(false);
            if (this.U) {
                a();
                return true;
            }
        } else {
            if (actionMasked == 5) {
                d(motionEvent.getActionIndex(), motionEvent);
                this.U = true;
                setPressed(false);
                return true;
            }
            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.P) {
                for (int i7 = 0; i7 < motionEvent.getPointerCount(); i7++) {
                    if (i7 != motionEvent.getActionIndex()) {
                        d(i7, motionEvent);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        e();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        e();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        e();
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f10) {
        float f11 = this.d0;
        if (f11 == f10) {
            return;
        }
        float f12 = (this.c0 + f10) - f11;
        this.d0 = f10;
        b(f12, this.f0);
    }

    public void setCardIcon(int i7) {
        b6 b6Var = this.n;
        c6 c6Var = b6Var.b;
        c6Var.c = i7;
        z5 z5Var = c6Var.b;
        if (z5Var != null) {
            z5Var.j(i7);
        }
        b6Var.invalidate();
    }

    public void setHasCardNumber(boolean z9) {
        b6 b6Var = this.n;
        b6Var.a = z9;
        b6Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        fi.p5 p5Var = this.h;
        p5Var.b = fArr;
        this.e.invalidate();
        p5Var.invalidate();
        this.n.invalidate();
    }

    public void setUseGyroscope(float f10) {
        if (this.e0 == f10) {
            return;
        }
        this.e0 = f10;
        b((this.L * f10) + this.N + this.d0, (this.M * f10) + this.O);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
