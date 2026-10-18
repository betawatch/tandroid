package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f6 extends FrameLayout implements SensorEventListener {
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final d6 H;
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
    public final e6 a;
    public final p5 b;
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

    public f6(Context context, int i10, int i11) {
        super(context);
        this.c = true;
        this.s = new m.s3();
        this.v = new float[8];
        this.w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new d6();
        this.I = -0.22f;
        this.J = -0.28f;
        this.M = 1.0f;
        this.S = new org.telegram.ui.Cells.k7(this, 29);
        setClipChildren(false);
        setClipToPadding(false);
        w7.b6.b(this, 0.02f, 1.2f);
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.o(context.getApplicationContext(), i10, i11, 1));
        e6 e6Var = new e6(context, this, i10, i11);
        this.a = e6Var;
        addView(e6Var, w7.z5.a(-1.0f, -24.0f, -24.0f, -24.0f, -24.0f, -1, 17));
        p5 p5Var = new p5(i10, i11, context, true);
        this.b = p5Var;
        addView(p5Var, w7.z5.d(-1.0f, -1));
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
        this.a.i0.Q = new float[]{f11, f12};
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
        b6 b6Var = this.a.i0;
        float[] fArr = b6Var.N;
        if (fArr[0] == f7 && fArr[1] == f10 && fArr[2] == f11 && fArr[3] == f12) {
            return;
        }
        b6Var.N = new float[]{f7, f10, f11, f12};
    }

    public final void d() {
        this.c = true;
        this.a.i0.Z = false;
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
        e6 e6Var = this.a;
        if (e6Var == null || (sensorManager = this.x) == null) {
            return;
        }
        if (!isShown() || getWindowVisibility() != 0) {
            this.d = true;
            if (!this.c) {
                d();
            }
        }
        boolean z10 = this.f && isShown() && getWindowVisibility() == 0 && hasWindowFocus();
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        e6Var.setPaused(!z10);
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
        d6 d6Var = this.H;
        d6Var.a = false;
        d6Var.h = 0L;
        d6Var.i = 0L;
        d6Var.j = 0L;
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
                    this.I = b(org.telegram.ui.Cells.c1.z(sensorEvent.values[1], f7, -0.75f, this.I), -0.82f, 0.82f);
                    this.J = b(com.google.android.gms.internal.play_billing.k3.t(sensorEvent.values[0], f7, -0.75f, this.J), -0.82f, 0.82f);
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
        this.a.i0.T = i10;
    }

    public void setDiamondAlpha(float f7) {
        b6 b6Var = this.a.i0;
        b6Var.getClass();
        b6Var.O = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingAlpha(float f7) {
        b6 b6Var = this.a.i0;
        b6Var.getClass();
        b6Var.P = Math.max(0.0f, Math.min(1.0f, f7));
    }

    public void setEngravingBitmap(final Bitmap bitmap) {
        this.b.setEngravingBitmap(bitmap);
        b6 b6Var = this.a.i0;
        b6Var.getClass();
        if (bitmap == null) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Callable() { // from class: org.telegram.ui.Wallet.a6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                float f7;
                float f10;
                char c10;
                int i10;
                LruCache lruCache = s5.A;
                int i11 = 256;
                Bitmap createBitmap = Bitmap.createBitmap(256, 1024, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(-1792, 0.0f);
                float f11 = 2048.0f;
                float f12 = 1024.0f;
                char c11 = 3;
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(0.0f, 0.0f, 2048.0f, 1024.0f), new Paint(3));
                int[] iArr = new int[262144];
                createBitmap.getPixels(iArr, 0, 256, 0, 0, 256, 1024);
                createBitmap.recycle();
                float[] fArr = new float[262144];
                int i12 = -1;
                int i13 = -1;
                int i14 = 256;
                int i15 = 1024;
                int i16 = 0;
                while (i16 < 1024) {
                    int i17 = 0;
                    while (i17 < i11) {
                        int i18 = (i16 * 256) + i17;
                        int i19 = iArr[i18] >>> 24;
                        if (i19 != 0) {
                            i14 = Math.min(i14, i17);
                            i15 = Math.min(i15, i16);
                            i12 = Math.max(i12, i17);
                            i13 = i16;
                        }
                        fArr[i18] = i19 / 255.0f;
                        i17++;
                        i11 = 256;
                    }
                    i16++;
                    i11 = 256;
                }
                int i20 = 1;
                int i21 = 1;
                int i22 = 1024;
                int i23 = 256;
                while (true) {
                    if (i23 <= i20 && i22 <= i20) {
                        break;
                    }
                    int i24 = i12;
                    int i25 = i13;
                    float f13 = f11;
                    float f14 = f12;
                    char c12 = c11;
                    i21++;
                    i20 = 1;
                    i23 = Math.max(1, i23 / 2);
                    i22 = Math.max(1, i22 / 2);
                    f11 = f13;
                    f12 = f14;
                    c11 = c12;
                    i13 = i25;
                    i12 = i24;
                }
                ShortBuffer[] shortBufferArr = new ShortBuffer[i21];
                int[] iArr2 = new int[i21];
                int[] iArr3 = new int[i21];
                int i26 = 1024;
                int i27 = 256;
                int i28 = 0;
                while (true) {
                    f7 = f11;
                    f10 = f12;
                    ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(i27 * i26 * 8).order(ByteOrder.nativeOrder()).asShortBuffer();
                    c10 = c11;
                    float sqrt = (float) (1.0d / Math.sqrt(i20 << i28));
                    for (int i29 = 0; i29 < i26; i29++) {
                        int i30 = 0;
                        while (i30 < i27) {
                            int i31 = i30 - 1;
                            int i32 = i29 - 1;
                            float h = s5.h(fArr, i27, i26, i31, i32);
                            int i33 = i13;
                            int i34 = i30 + 1;
                            float h10 = s5.h(fArr, i27, i26, i34, i32);
                            int i35 = i29 + 1;
                            float h11 = s5.h(fArr, i27, i26, i31, i35);
                            float h12 = s5.h(fArr, i27, i26, i34, i35);
                            float f15 = (((h10 + h12) - h) - h11) * 0.5f * sqrt;
                            float f16 = (((h11 + h12) - h) - h10) * 0.5f * sqrt;
                            asShortBuffer.put(s5.l(f15)).put(s5.l(f16)).put(s5.l((f16 * f16) + (f15 * f15))).put(s5.l(((fArr[(i29 * i27) + i30] * 4.0f) + h + h10 + h11 + h12) * 0.125f));
                            i30 = i34;
                            i13 = i33;
                        }
                    }
                    i10 = i13;
                    asShortBuffer.position(0);
                    shortBufferArr[i28] = asShortBuffer;
                    iArr2[i28] = i27;
                    iArr3[i28] = i26;
                    if (i27 == 1 && i26 == 1) {
                        break;
                    }
                    int max = Math.max(1, i27 / 2);
                    int max2 = Math.max(1, i26 / 2);
                    float[] fArr2 = new float[max * max2];
                    for (int i36 = 0; i36 < max2; i36++) {
                        int i37 = 0;
                        while (i37 < max) {
                            int i38 = (i36 * max) + i37;
                            int i39 = i37 * 2;
                            int i40 = i12;
                            int i41 = i36 * 2;
                            int i42 = max;
                            int i43 = i39 + 1;
                            float h13 = s5.h(fArr, i27, i26, i43, i41) + s5.h(fArr, i27, i26, i39, i41);
                            int i44 = i41 + 1;
                            fArr2[i38] = (s5.h(fArr, i27, i26, i43, i44) + s5.h(fArr, i27, i26, i39, i44) + h13) * 0.25f;
                            i37++;
                            i12 = i40;
                            max = i42;
                        }
                    }
                    i28++;
                    i26 = max2;
                    fArr = fArr2;
                    f11 = f7;
                    f12 = f10;
                    c11 = c10;
                    i13 = i10;
                    i27 = max;
                    i20 = 1;
                }
                boolean z10 = i12 >= i14;
                q5 q5Var = new q5(z10, shortBufferArr, iArr2, iArr3);
                if (z10) {
                    float[] fArr3 = q5Var.b;
                    fArr3[0] = (1792 + i14) / f7;
                    fArr3[1] = i15 / f10;
                    fArr3[2] = (i12 + 1793) / f7;
                    fArr3[c10] = (i10 + 1) / f10;
                }
                return q5Var;
            }
        });
        b6Var.R = futureTask;
        Utilities.globalQueue.postRunnable(futureTask);
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        this.e = runnable;
        if (runnable != null) {
            invalidate();
        }
    }

    public void setStickerStyle(float[] fArr) {
        b6 b6Var = this.a.i0;
        b6Var.getClass();
        boolean z10 = fArr.length != b6Var.X.length;
        for (int i10 = 0; i10 < 6; i10++) {
            if (fArr[i10] != b6Var.X[i10]) {
                z10 = true;
            }
        }
        if (!z10) {
            for (int i11 = 10; i11 < fArr.length; i11++) {
                if (fArr[i11] != b6Var.X[i11]) {
                    z10 = true;
                }
            }
        }
        float[] f7 = z10 ? n7.f(fArr) : (float[]) b6Var.Y.clone();
        System.arraycopy(fArr, 6, f7, 24, 4);
        b6Var.X = fArr;
        b6Var.Y = f7;
        this.b.setStickerStyle(fArr);
    }

    public void setUseGyroscope(float f7) {
        if (this.M == f7) {
            return;
        }
        this.M = f7;
        float f10 = this.P * f7;
        b6 b6Var = this.a.i0;
        float f11 = f10 + b6Var.i + this.L;
        this.K = f11;
        float f12 = (this.Q * f7) + b6Var.d;
        this.N = f12;
        a(f11, f12);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
