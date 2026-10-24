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
import ei.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.t00;
import org.telegram.ui.ve1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class s5 extends FrameLayout implements SensorEventListener {
    public static final Object n0 = new Object();
    public final float[] E;
    public final float[] F;
    public final z5 G;
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
    public p5 b;
    public ValueAnimator b0;
    public int c;
    public float c0;
    public u2 d;
    public float d0;
    public final t00 e;
    public float e0;
    public final ci.l1 f;
    public float f0;
    public float g0;
    public final ei.g6 h;
    public float h0;
    public int i0;
    public int j0;
    public final m4 k0;
    public float l0;
    public float m0;
    public final r5 n;
    public final ah.x r;
    public final m.s3 s;
    public final float[] v;
    public final SensorManager w;
    public final Sensor x;
    public final boolean y;

    public s5(Context context, int i10, int i11) {
        super(context);
        this.s = new m.s3();
        this.v = new float[8];
        this.E = new float[9];
        this.F = new float[3];
        this.G = new z5();
        this.I = -0.22f;
        this.J = -0.28f;
        this.P = -1;
        this.e0 = 1.0f;
        this.g0 = Float.NaN;
        this.h0 = Float.NaN;
        this.k0 = new m4(this, 1);
        this.c = i10;
        boolean z10 = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(AndroidUtilities.dp(4800.0f));
        w7.b6.b(this, 0.02f, 1.2f);
        t00 t00Var = new t00(this, context);
        this.e = t00Var;
        addView(t00Var, w7.z5.e(-1, -1, 17));
        ci.l1 l1Var = new ci.l1(context, 1);
        this.f = l1Var;
        l1Var.setPadding(2, 2, 2, 2);
        l1Var.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        t00Var.addView(l1Var, layoutParams);
        ei.g6 g6Var = new ei.g6(this, context);
        this.h = g6Var;
        l1Var.addView(g6Var, w7.z5.e(-1, -1, 17));
        r5 r5Var = new r5(this, context);
        this.n = r5Var;
        l1Var.addView(r5Var, w7.z5.e(-1, -1, 17));
        ah.x xVar = new ah.x(this, context, 28);
        this.r = xVar;
        xVar.setClipChildren(false);
        xVar.setClipToPadding(false);
        xVar.setLayerType(2, null);
        xVar.setPivotX(0.0f);
        xVar.setPivotY(0.0f);
        l1Var.addView(xVar, w7.z5.e(336, 205, 51));
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.w = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.x = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z10 = true;
        }
        this.y = z10;
        q5 q5Var = new q5(this, 1);
        if (p5.j0 && p5.p0.get(Integer.valueOf(i10)) != null) {
            this.b = new p5(context.getApplicationContext(), i10, i11, q5Var);
        } else {
            t00Var.setVisibility(4);
            p5.l0.postRunnable(new gi.m4(this, context, i10, i11, q5Var));
        }
    }

    public static float c(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.b0.cancel();
            this.b0 = null;
        }
        float f7 = this.N;
        float f10 = this.O;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b0 = ofFloat;
        ofFloat.setDuration(600L);
        sl.l(1.2f, this.b0);
        this.b0.addUpdateListener(new ja(this, f7, f10, 6));
        this.b0.addListener(new ve1(this, 7));
        this.b0.start();
    }

    public final void b(float f7, float f10) {
        this.c0 = f7;
        this.f0 = f10;
        float f11 = f7 + this.l0;
        float f12 = f10 + this.m0;
        boolean z10 = Math.cos(Math.toRadians((double) f12)) * Math.cos(Math.toRadians((double) f11)) < 0.0d;
        boolean z11 = this.a;
        r5 r5Var = this.n;
        if (z11 != z10) {
            this.a = z10;
            this.r.invalidate();
            r5Var.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.g0 == f11 && this.h0 == f12 && this.i0 == width && this.j0 == height) {
            return;
        }
        this.g0 = f11;
        this.h0 = f12;
        this.i0 = width;
        this.j0 = height;
        if (width > 0 && height > 0) {
            this.s.c(width, height, f11, f12, z10, this.v);
            p5 p5Var = this.b;
            if (p5Var != null) {
                float[] fArr = p5Var.n;
                float[] fArr2 = p5Var.m;
                float[] fArr3 = p5Var.k;
                float[] fArr4 = p5Var.l;
                int[] iArr = p5Var.o;
                p5Var.r = z10;
                float[] fArr5 = p5Var.i;
                float[] fArr6 = z10 ? fArr4 : fArr3;
                if (!z10) {
                    fArr3 = fArr4;
                }
                m.s3 s3Var = this.s;
                s3Var.getClass();
                int i10 = 0;
                while (i10 < fArr5.length / 2) {
                    int i11 = i10 * 2;
                    float f13 = (fArr5[i11 + 1] * (-1.212122f)) + 0.618561f;
                    float f14 = ((fArr5[i11] * 2.0f) - 1.0f) * 1.0f;
                    float d = s3Var.d(-0.0125f, f13, f14, width, height, fArr6, i11);
                    float[] fArr7 = fArr6;
                    float[] fArr8 = fArr3;
                    fArr2[i10] = (d + s3Var.d(0.0125f, f13, f14, width, height, fArr8, i11)) * 0.5f;
                    i10++;
                    s3Var = s3Var;
                    fArr3 = fArr8;
                    fArr5 = fArr5;
                    iArr = iArr;
                    fArr6 = fArr7;
                }
                int[] iArr2 = iArr;
                p5Var.q = width / 336.0f;
                int i12 = 0;
                while (i12 < 76) {
                    int i13 = i12 + 1;
                    fArr[i12] = (fArr2[i12] + fArr2[i13 % 76]) * 0.5f;
                    iArr2[i12] = i12;
                    i12 = i13;
                }
                for (int i14 = 1; i14 < 76; i14++) {
                    int i15 = iArr2[i14];
                    int i16 = i14 - 1;
                    while (i16 >= 0) {
                        int i17 = iArr2[i16];
                        if (fArr[i17] < fArr[i15]) {
                            iArr2[i16 + 1] = i17;
                            i16--;
                        }
                    }
                    iArr2[i16 + 1] = i15;
                }
            }
            t00 t00Var = this.e;
            int width2 = t00Var.getWidth();
            int height2 = t00Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) t00Var.d;
                fArr9[0] = 0.0f;
                fArr9[1] = 0.0f;
                float f15 = width2;
                fArr9[2] = f15;
                fArr9[3] = 0.0f;
                fArr9[4] = f15;
                float f16 = height2;
                fArr9[5] = f16;
                fArr9[6] = 0.0f;
                fArr9[7] = f16;
                t00Var.b = ((Matrix) t00Var.c).setPolyToPoly(fArr9, 0, this.v, 0, 4);
                t00Var.invalidate();
            }
        }
        p5 p5Var2 = this.b;
        if (p5Var2 != null) {
            p5Var2.k(f11, f12);
        }
        this.h.invalidate();
        r5Var.invalidate();
    }

    public final void d(int i10, MotionEvent motionEvent) {
        this.P = motionEvent.getPointerId(i10);
        this.Q = motionEvent.getX(i10);
        this.R = motionEvent.getY(i10);
        this.S = this.N;
        this.T = this.O;
    }

    public final void e() {
        SensorManager sensorManager = this.w;
        if (sensorManager != null) {
            boolean z10 = this.W && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
            if (this.a0 == z10) {
                return;
            }
            this.a0 = z10;
            m4 m4Var = this.k0;
            removeCallbacks(m4Var);
            if (!z10) {
                sensorManager.unregisterListener(this);
                return;
            }
            this.V = 0L;
            Sensor sensor = this.x;
            if (sensor != null) {
                sensorManager.registerListener(this, sensor, 1);
            }
            postOnAnimation(m4Var);
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
        z5 z5Var = this.G;
        z5Var.a = false;
        z5Var.h = 0L;
        z5Var.i = 0L;
        z5Var.j = 0L;
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
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.round(size / 1.64f), TLObject.FLAG_30));
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.y) {
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
                float f7 = (sensorEvent.timestamp - r4) * 1.0E-9f;
                if (f7 > 0.0f && f7 < 0.1f) {
                    this.I = c(org.telegram.ui.Cells.b1.x(sensorEvent.values[1], f7, -0.75f, this.I), -0.82f, 0.82f);
                    this.J = c(com.google.android.gms.internal.play_billing.k3.t(sensorEvent.values[0], f7, -0.75f, this.J), -0.82f, 0.82f);
                }
            }
            this.V = sensorEvent.timestamp;
        }
        float f10 = ((-this.J) / 0.82f) * 15.0f;
        float f11 = (this.I / 0.82f) * 15.0f;
        long j10 = sensorEvent.timestamp;
        z5 z5Var = this.G;
        z5Var.getClass();
        if (Float.isNaN(f10) || Float.isInfinite(f10) || Float.isNaN(f11) || Float.isInfinite(f11)) {
            return;
        }
        z5Var.b = f10;
        z5Var.c = f11;
        z5Var.i = j10;
        if (!z5Var.a) {
            z5Var.a = true;
            z5Var.d = f10;
            z5Var.e = f11;
            z5Var.f = f10;
            z5Var.g = f11;
            z5Var.h = j10;
            return;
        }
        float f12 = f10 - z5Var.f;
        float f13 = f11 - z5Var.g;
        if ((f13 * f13) + (f12 * f12) > 1.265625f) {
            z5Var.f = f10;
            z5Var.g = f11;
            z5Var.h = j10;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ah.x xVar = this.r;
        xVar.setScaleX(i10 / AndroidUtilities.dp(336.0f));
        xVar.setScaleY(i11 / AndroidUtilities.dp(205.0f));
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
            postDelayed(new q5(this, 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.P);
            if (findPointerIndex >= 0) {
                float x10 = motionEvent.getX(findPointerIndex);
                float y3 = motionEvent.getY(findPointerIndex);
                float abs = Math.abs(x10 - this.Q);
                float f7 = this.H;
                if (abs > f7 || Math.abs(y3 - this.R) > f7) {
                    this.U = true;
                    setPressed(false);
                }
                if (this.U) {
                    float f10 = this.T;
                    this.O = c(com.google.android.gms.internal.play_billing.k3.D(x10, this.Q, 0.03f, f10), f10 - 32.0f, f10 + 32.0f);
                    float f11 = this.S;
                    this.N = c(com.google.android.gms.internal.play_billing.k3.D(y3, this.R, 0.03f, f11), f11 - 22.0f, f11 + 22.0f);
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
                for (int i10 = 0; i10 < motionEvent.getPointerCount(); i10++) {
                    if (i10 != motionEvent.getActionIndex()) {
                        d(i10, motionEvent);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        e();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        e();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        e();
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f7) {
        float f10 = this.d0;
        if (f10 == f7) {
            return;
        }
        float f11 = (this.c0 + f7) - f10;
        this.d0 = f7;
        b(f11, this.f0);
    }

    public void setCardIcon(int i10) {
        r5 r5Var = this.n;
        s5 s5Var = r5Var.b;
        s5Var.c = i10;
        p5 p5Var = s5Var.b;
        if (p5Var != null) {
            p5Var.j(i10);
        }
        r5Var.invalidate();
    }

    public void setHasCardNumber(boolean z10) {
        r5 r5Var = this.n;
        r5Var.a = z10;
        r5Var.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        ei.g6 g6Var = this.h;
        g6Var.b = fArr;
        this.e.invalidate();
        g6Var.invalidate();
        this.n.invalidate();
    }

    public void setUseGyroscope(float f7) {
        if (this.e0 == f7) {
            return;
        }
        this.e0 = f7;
        b((this.L * f7) + this.N + this.d0, (this.M * f7) + this.O);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
