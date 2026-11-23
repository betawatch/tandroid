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
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.x01;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class s6 extends FrameLayout implements SensorEventListener {
    public static final Object o0 = new Object();
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final z6 H;
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
    public p6 b;
    public boolean b0;
    public int c;
    public ValueAnimator c0;
    public q3 d;
    public float d0;
    public final org.telegram.ui.Cells.x0 e;
    public float e0;
    public final x01 f;
    public float f0;
    public float g0;
    public final hi.l5 h;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public final ik l0;
    public float m0;
    public final r6 n;
    public float n0;
    public final x01 r;
    public final ga.d s;
    public final float[] w;
    public final SensorManager x;
    public final Sensor y;

    public s6(Context context, int i7, int i10) {
        super(context);
        this.s = new ga.d(4);
        this.w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new z6();
        this.J = -0.22f;
        this.K = -0.28f;
        this.Q = -1;
        this.f0 = 1.0f;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.l0 = new ik(this, 28);
        this.c = i7;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(org.telegram.messenger.g0.L(4800.0f));
        c8.ra.b(this, 0.02f, 1.2f);
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(this, context);
        this.e = x0Var;
        addView(x0Var, c8.ma.e(-1, -1, 17));
        x01 x01Var = new x01(context, 4);
        this.f = x01Var;
        x01Var.setPadding(2, 2, 2, 2);
        x01Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        x0Var.addView(x01Var, layoutParams);
        hi.l5 l5Var = new hi.l5(this, context);
        this.h = l5Var;
        x01Var.addView(l5Var, c8.ma.e(-1, -1, 17));
        r6 r6Var = new r6(this, context);
        this.n = r6Var;
        x01Var.addView(r6Var, c8.ma.e(-1, -1, 17));
        x01 x01Var2 = new x01(3, context, this);
        this.r = x01Var2;
        x01Var2.setClipChildren(false);
        x01Var2.setClipToPadding(false);
        x01Var2.setLayerType(2, null);
        x01Var2.setPivotX(0.0f);
        x01Var2.setPivotY(0.0f);
        x01Var.addView(x01Var2, c8.ma.e(ls.H5, ls.j3, 51));
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
        q6 q6Var = new q6(this, 1);
        if (p6.j0 && p6.p0.get(Integer.valueOf(i7)) != null) {
            this.b = new p6(context.getApplicationContext(), i7, i10, q6Var);
        } else {
            x0Var.setVisibility(4);
            p6.l0.postRunnable(new jg.o1(this, context, i7, i10, q6Var));
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
        org.telegram.ui.Cells.c0.q(1.2f, this.c0);
        this.c0.addUpdateListener(new hi.i9(this, f10, f11, 6));
        this.c0.addListener(new k71(this, 9));
        this.c0.start();
    }

    public final void b(float f10, float f11) {
        this.d0 = f10;
        this.g0 = f11;
        float f12 = f10 + this.m0;
        float f13 = f11 + this.n0;
        boolean z10 = Math.cos(Math.toRadians((double) f13)) * Math.cos(Math.toRadians((double) f12)) < 0.0d;
        boolean z11 = this.a;
        r6 r6Var = this.n;
        if (z11 != z10) {
            this.a = z10;
            this.r.invalidate();
            r6Var.invalidate();
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
            p6 p6Var = this.b;
            if (p6Var != null) {
                float[] fArr = p6Var.n;
                float[] fArr2 = p6Var.m;
                float[] fArr3 = p6Var.k;
                float[] fArr4 = p6Var.l;
                int[] iArr = p6Var.o;
                p6Var.r = z10;
                float[] fArr5 = p6Var.i;
                float[] fArr6 = z10 ? fArr4 : fArr3;
                if (!z10) {
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
                p6Var.q = width / 336.0f;
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
            org.telegram.ui.Cells.x0 x0Var = this.e;
            int width2 = x0Var.getWidth();
            int height2 = x0Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) x0Var.b;
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
                x0Var.c = ((Matrix) x0Var.d).setPolyToPoly(fArr9, 0, this.w, 0, 4);
                x0Var.invalidate();
            }
        }
        p6 p6Var2 = this.b;
        if (p6Var2 != null) {
            p6Var2.k(f12, f13);
        }
        this.h.invalidate();
        r6Var.invalidate();
    }

    public final void d(int i7, MotionEvent motionEvent) {
        this.Q = motionEvent.getPointerId(i7);
        this.R = motionEvent.getX(i7);
        this.S = motionEvent.getY(i7);
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
            ik ikVar = this.l0;
            removeCallbacks(ikVar);
            if (!z10) {
                sensorManager.unregisterListener(this);
                return;
            }
            this.W = 0L;
            Sensor sensor = this.y;
            if (sensor != null) {
                sensorManager.registerListener(this, sensor, 1);
            }
            postOnAnimation(ikVar);
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
        z6 z6Var = this.H;
        z6Var.a = false;
        z6Var.h = 0L;
        z6Var.i = 0L;
        z6Var.j = 0L;
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
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
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
                    this.J = c(org.telegram.ui.Cells.c0.z(sensorEvent.values[1], f10, -0.75f, this.J), -0.82f, 0.82f);
                    this.K = c(com.google.android.gms.internal.vision.e2.x(sensorEvent.values[0], f10, -0.75f, this.K), -0.82f, 0.82f);
                }
            }
            this.W = sensorEvent.timestamp;
        }
        float f11 = ((-this.K) / 0.82f) * 15.0f;
        float f12 = (this.J / 0.82f) * 15.0f;
        long j3 = sensorEvent.timestamp;
        z6 z6Var = this.H;
        z6Var.getClass();
        if (Float.isNaN(f11) || Float.isInfinite(f11) || Float.isNaN(f12) || Float.isInfinite(f12)) {
            return;
        }
        z6Var.b = f11;
        z6Var.c = f12;
        z6Var.i = j3;
        if (!z6Var.a) {
            z6Var.a = true;
            z6Var.d = f11;
            z6Var.e = f12;
            z6Var.f = f11;
            z6Var.g = f12;
            z6Var.h = j3;
            return;
        }
        float f13 = f11 - z6Var.f;
        float f14 = f12 - z6Var.g;
        if ((f14 * f14) + (f13 * f13) > 1.265625f) {
            z6Var.f = f11;
            z6Var.g = f12;
            z6Var.h = j3;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        x01 x01Var = this.r;
        x01Var.setScaleX(i7 / org.telegram.messenger.g0.L(336.0f));
        x01Var.setScaleY(i10 / org.telegram.messenger.g0.L(205.0f));
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
            postDelayed(new q6(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (findPointerIndex >= 0) {
                float x10 = motionEvent.getX(findPointerIndex);
                float y10 = motionEvent.getY(findPointerIndex);
                float abs = Math.abs(x10 - this.R);
                float f10 = this.I;
                if (abs > f10 || Math.abs(y10 - this.S) > f10) {
                    this.V = true;
                    setPressed(false);
                }
                if (this.V) {
                    float f11 = this.U;
                    this.P = c(com.google.android.gms.internal.vision.e2.t(x10, this.R, 0.03f, f11), f11 - 32.0f, f11 + 32.0f);
                    float f12 = this.T;
                    this.O = c(com.google.android.gms.internal.vision.e2.t(y10, this.S, 0.03f, f12), f12 - 22.0f, f12 + 22.0f);
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
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
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
        float f11 = this.e0;
        if (f11 == f10) {
            return;
        }
        float f12 = (this.d0 + f10) - f11;
        this.e0 = f10;
        b(f12, this.g0);
    }

    public void setCardIcon(int i7) {
        r6 r6Var = this.n;
        s6 s6Var = r6Var.b;
        s6Var.c = i7;
        p6 p6Var = s6Var.b;
        if (p6Var != null) {
            p6Var.j(i7);
        }
        r6Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        r6 r6Var = this.n;
        r6Var.a = z10;
        r6Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        hi.l5 l5Var = this.h;
        l5Var.b = fArr;
        this.e.invalidate();
        l5Var.invalidate();
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
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
