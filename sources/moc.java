// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class moc extends FrameLayout implements SensorEventListener {
    public static final Object o0 = new Object();
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final voc H;
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
    public ioc b;
    public boolean b0;
    public int c;
    public ValueAnimator c0;
    public eu8 d;
    public float d0;
    public final kb2 e;
    public float e0;
    public final bdb f;
    public float f0;
    public float g0;
    public final a91 h;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public final zka l0;
    public float m0;
    public final loc n;
    public float n0;
    public final bdb r;
    public final ovb s;
    public final float[] w;
    public final SensorManager x;
    public final Sensor y;

    public moc(Context context, int i, int i2) {
        super(context);
        this.s = new ovb();
        this.w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new voc();
        this.J = -0.22f;
        this.K = -0.28f;
        this.Q = -1;
        this.f0 = 1.0f;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.l0 = new zka((Object) this, (byte) 16);
        this.c = i;
        boolean z = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(gm.L(4800.0f));
        rve.b(this, 0.02f, 1.2f);
        kb2 kb2Var = new kb2(this, context);
        this.e = kb2Var;
        addView(kb2Var, qoe.e(-1, -1, 17));
        bdb bdbVar = new bdb(context);
        this.f = bdbVar;
        bdbVar.setPadding(2, 2, 2, 2);
        bdbVar.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        kb2Var.addView(bdbVar, layoutParams);
        a91 a91Var = new a91(this, context);
        this.h = a91Var;
        bdbVar.addView(a91Var, qoe.e(-1, -1, 17));
        loc locVar = new loc(this, context);
        this.n = locVar;
        bdbVar.addView(locVar, qoe.e(-1, -1, 17));
        bdb bdbVar2 = new bdb((byte) 6, context, this);
        this.r = bdbVar2;
        bdbVar2.setClipChildren(false);
        bdbVar2.setClipToPadding(false);
        bdbVar2.setLayerType(2, null);
        bdbVar2.setPivotX(0.0f);
        bdbVar2.setPivotY(0.0f);
        bdbVar.addView(bdbVar2, qoe.e(nm7.G5, nm7.i3, 51));
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.y = defaultSensor;
        byte b = 1;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z = true;
        }
        this.E = z;
        joc jocVar = new joc(this, b);
        if (ioc.j0 && ioc.p0.get(Integer.valueOf(i)) != null) {
            this.b = new ioc(context.getApplicationContext(), i, i2, jocVar);
        } else {
            kb2Var.setVisibility(4);
            ioc.l0.postRunnable(new an1(this, context, i, i2, jocVar));
        }
    }

    public static float c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
            this.c0 = null;
        }
        float f = this.O;
        float f2 = this.P;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.c0 = ofFloat;
        ofFloat.setDuration(600L);
        b10.n(1.2f, this.c0);
        this.c0.addUpdateListener(new dz1(this, f, f2, (byte) 8));
        this.c0.addListener(new koc(this, (byte) 0));
        this.c0.start();
    }

    public final void b(float f, float f2) {
        float[] fArr;
        this.d0 = f;
        this.g0 = f2;
        float f3 = f + this.m0;
        float f4 = f2 + this.n0;
        boolean z = Math.cos(Math.toRadians((double) f4)) * Math.cos(Math.toRadians((double) f3)) < 0.0d;
        boolean z2 = this.a;
        loc locVar = this.n;
        if (z2 != z) {
            this.a = z;
            this.r.invalidate();
            locVar.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.h0 == f3 && this.i0 == f4 && this.j0 == width && this.k0 == height) {
            return;
        }
        this.h0 = f3;
        this.i0 = f4;
        this.j0 = width;
        this.k0 = height;
        if (width > 0 && height > 0) {
            this.s.a(width, height, f3, f4, z, this.w);
            ioc iocVar = this.b;
            if (iocVar != null) {
                float[] fArr2 = iocVar.n;
                float[] fArr3 = iocVar.m;
                float[] fArr4 = iocVar.k;
                float[] fArr5 = iocVar.l;
                int[] iArr = iocVar.o;
                iocVar.r = z;
                float[] fArr6 = iocVar.i;
                if (z) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                    fArr4 = fArr5;
                }
                ovb ovbVar = this.s;
                ovbVar.getClass();
                int i = 0;
                while (i < fArr6.length / 2) {
                    int i2 = i << 1;
                    float f5 = (fArr6[i2 + 1] * (-1.212122f)) + 0.618561f;
                    float f6 = ((fArr6[i2] * 2.0f) - 1.0f) * 1.0f;
                    float b = ovbVar.b(-0.0125f, f5, f6, width, height, fArr, i2);
                    float[] fArr7 = fArr;
                    float[] fArr8 = fArr4;
                    fArr3[i] = (b + ovbVar.b(0.0125f, f5, f6, width, height, fArr8, i2)) * 0.5f;
                    i++;
                    ovbVar = ovbVar;
                    fArr4 = fArr8;
                    fArr6 = fArr6;
                    iArr = iArr;
                    fArr = fArr7;
                }
                int[] iArr2 = iArr;
                iocVar.q = width / 336.0f;
                int i3 = 0;
                while (i3 < 76) {
                    int i4 = i3 + 1;
                    fArr2[i3] = (fArr3[i3] + fArr3[i4 % 76]) * 0.5f;
                    iArr2[i3] = i3;
                    i3 = i4;
                }
                for (int i5 = 1; i5 < 76; i5++) {
                    int i6 = iArr2[i5];
                    int i7 = i5 - 1;
                    while (i7 >= 0) {
                        int i8 = iArr2[i7];
                        if (fArr2[i8] < fArr2[i6]) {
                            iArr2[i7 + 1] = i8;
                            i7--;
                        }
                    }
                    iArr2[i7 + 1] = i6;
                }
            }
            kb2 kb2Var = this.e;
            int width2 = kb2Var.getWidth();
            int height2 = kb2Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) kb2Var.b;
                fArr9[0] = 0.0f;
                fArr9[1] = 0.0f;
                float f7 = width2;
                fArr9[2] = f7;
                fArr9[3] = 0.0f;
                fArr9[4] = f7;
                float f8 = height2;
                fArr9[5] = f8;
                fArr9[6] = 0.0f;
                fArr9[7] = f8;
                kb2Var.c = ((Matrix) kb2Var.d).setPolyToPoly(fArr9, 0, this.w, 0, 4);
                kb2Var.invalidate();
            }
        }
        ioc iocVar2 = this.b;
        if (iocVar2 != null) {
            iocVar2.k(f3, f4);
        }
        this.h.invalidate();
        locVar.invalidate();
    }

    public final void d(int i, MotionEvent motionEvent) {
        this.Q = motionEvent.getPointerId(i);
        this.R = motionEvent.getX(i);
        this.S = motionEvent.getY(i);
        this.T = this.O;
        this.U = this.P;
    }

    public final void e() {
        SensorManager sensorManager = this.x;
        if (sensorManager != null) {
            boolean z = this.a0 && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
            if (this.b0 != z) {
                this.b0 = z;
                zka zkaVar = this.l0;
                removeCallbacks(zkaVar);
                if (!z) {
                    sensorManager.unregisterListener(this);
                    return;
                }
                this.W = 0L;
                Sensor sensor = this.y;
                if (sensor != null) {
                    sensorManager.registerListener(this, sensor, 1);
                }
                postOnAnimation(zkaVar);
            }
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
        voc vocVar = this.H;
        vocVar.a = false;
        vocVar.h = 0L;
        vocVar.i = 0L;
        vocVar.j = 0L;
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
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
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
                float f = (sensorEvent.timestamp - r4) * 1.0E-9f;
                if (f > 0.0f && f < 0.1f) {
                    this.J = c(aq1.v(sensorEvent.values[1], f, -0.75f, this.J), -0.82f, 0.82f);
                    this.K = c(b10.w(sensorEvent.values[0], f, -0.75f, this.K), -0.82f, 0.82f);
                }
            }
            this.W = sensorEvent.timestamp;
        }
        float f2 = ((-this.K) / 0.82f) * 15.0f;
        float f3 = (this.J / 0.82f) * 15.0f;
        long j = sensorEvent.timestamp;
        voc vocVar = this.H;
        vocVar.getClass();
        if (Float.isNaN(f2) || Float.isInfinite(f2) || Float.isNaN(f3) || Float.isInfinite(f3)) {
            return;
        }
        vocVar.b = f2;
        vocVar.c = f3;
        vocVar.i = j;
        if (!vocVar.a) {
            vocVar.a = true;
            vocVar.d = f2;
            vocVar.e = f3;
            vocVar.f = f2;
            vocVar.g = f3;
            vocVar.h = j;
            return;
        }
        float f4 = f2 - vocVar.f;
        float f5 = f3 - vocVar.g;
        if ((f5 * f5) + (f4 * f4) > 1.265625f) {
            vocVar.f = f2;
            vocVar.g = f3;
            vocVar.h = j;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        bdb bdbVar = this.r;
        bdbVar.setScaleX(i / gm.L(336.0f));
        bdbVar.setScaleY(i2 / gm.L(205.0f));
        b(this.d0, this.g0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        Object[] objArr = 0;
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
            postDelayed(new joc(this, objArr == true ? 1 : 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (findPointerIndex >= 0) {
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                float abs = Math.abs(x - this.R);
                float f = this.I;
                if (abs > f || Math.abs(y - this.S) > f) {
                    this.V = true;
                    setPressed(false);
                }
                if (this.V) {
                    float f2 = this.U;
                    this.P = c(kt6.B(x, this.R, 0.03f, f2), f2 - 32.0f, f2 + 32.0f);
                    float f3 = this.T;
                    this.O = c(kt6.B(y, this.S, 0.03f, f3), f3 - 22.0f, f3 + 22.0f);
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
                for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                    if (i != motionEvent.getActionIndex()) {
                        d(i, motionEvent);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        e();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        e();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        e();
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f) {
        float f2 = this.e0;
        if (f2 == f) {
            return;
        }
        float f3 = (this.d0 + f) - f2;
        this.e0 = f;
        b(f3, this.g0);
    }

    public void setCardIcon(int i) {
        loc locVar = this.n;
        moc mocVar = locVar.b;
        mocVar.c = i;
        ioc iocVar = mocVar.b;
        if (iocVar != null) {
            iocVar.j(i);
        }
        locVar.invalidate();
    }

    public void setHasCardNumber(boolean z) {
        loc locVar = this.n;
        locVar.a = z;
        locVar.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        a91 a91Var = this.h;
        a91Var.b = fArr;
        this.e.invalidate();
        a91Var.invalidate();
        this.n.invalidate();
    }

    public void setUseGyroscope(float f) {
        if (this.f0 == f) {
            return;
        }
        this.f0 = f;
        b((this.M * f) + this.O + this.e0, (this.N * f) + this.P);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
