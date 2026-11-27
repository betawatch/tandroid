package org.telegram.ui.Components.Crop;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class CropAreaView extends ViewGroup {
    public RectF E;
    public int F;
    public int G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public float L;
    public float M;
    public float N;
    public long O;
    public Paint P;
    public Paint Q;
    public Paint R;
    public Paint S;
    public Paint T;
    public Paint U;
    public AccelerateDecelerateInterpolator V;
    public float W;
    public int a;
    public float a0;
    public float b;
    public boolean b0;
    public float c;
    public float c0;
    public RectF d;
    public ObjectAnimator d0;
    public RectF e;
    public g33 e0;
    public RectF f;
    public boolean f0;
    public boolean g0;
    public RectF h;
    public Bitmap h0;
    public Paint i0;
    public String j0;
    public StaticLayout k0;
    public AnimatorSet l0;
    public RectF m0;
    public RectF n;
    public TextPaint n0;
    public float o0;
    public float p0;
    public float q0;
    public RectF r;
    public float r0;
    public RectF s;
    public int s0;
    public int t0;
    public int u0;
    public RectF w;
    public float x;
    public RectF y;

    public static void b(RectF rectF, float f) {
        float height = rectF.height();
        rectF.right = rectF.left + (f * height);
        rectF.bottom = rectF.top + height;
    }

    public static void c(RectF rectF, float f) {
        float width = rectF.width();
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + (width / f);
    }

    private float getGridProgress() {
        return this.c0;
    }

    private void setCropBottom(float f) {
        this.y.bottom = f;
        invalidate();
    }

    private void setCropLeft(float f) {
        this.y.left = f;
        invalidate();
    }

    private void setCropRight(float f) {
        this.y.right = f;
        invalidate();
    }

    private void setCropTop(float f) {
        this.y.top = f;
        invalidate();
    }

    private void setGridProgress(float f) {
        this.c0 = f;
        invalidate();
    }

    public final void a(RectF rectF, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = this.W;
        float f7 = !this.b0 ? hl.m : 0;
        float measuredHeight = ((getMeasuredHeight() - this.H) - this.I) - f7;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f8 = f6 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f8;
        float measuredWidth2 = getMeasuredWidth() - f8;
        float f9 = measuredHeight - f8;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f10 = (measuredHeight / 2.0f) + f7 + this.I;
        if (Math.abs(1.0f - f) < 1.0E-4d) {
            float f11 = min / 2.0f;
            f5 = measuredWidth3 - f11;
            f2 = f10 - f11;
            f3 = measuredWidth3 + f11;
            f4 = f10 + f11;
        } else {
            if (f - measuredWidth <= 1.0E-4d) {
                float f12 = f9 * f;
                if (f12 <= measuredWidth2) {
                    float f13 = f12 / 2.0f;
                    float f14 = measuredWidth3 - f13;
                    float f15 = f9 / 2.0f;
                    float f16 = f10 - f15;
                    f3 = measuredWidth3 + f13;
                    f4 = f10 + f15;
                    f5 = f14;
                    f2 = f16;
                }
            }
            float f17 = measuredWidth2 / 2.0f;
            float f18 = measuredWidth3 - f17;
            float f19 = (measuredWidth2 / f) / 2.0f;
            f2 = f10 - f19;
            f3 = measuredWidth3 + f17;
            f4 = f10 + f19;
            f5 = f18;
        }
        rectF.set(f5, f2, f3, f4);
    }

    public final void d(RectF rectF) {
        rectF.set(this.y);
    }

    public final void e(int i, int i2, boolean z, boolean z2) {
        this.g0 = z2;
        float f = z ? i2 / i : i / i2;
        if (!z2) {
            f = 1.0f;
            this.x = 1.0f;
        }
        setActualRect(f);
    }

    public final void f(boolean z, boolean z2) {
        this.K = z;
        if (!z) {
            this.M = 1.0f;
            return;
        }
        this.M = z2 ? 0.0f : 1.0f;
        this.O = SystemClock.elapsedRealtime();
        invalidate();
    }

    public final void g(int i, boolean z) {
        ObjectAnimator objectAnimator = this.d0;
        if (objectAnimator != null && (!z || this.u0 != i)) {
            objectAnimator.cancel();
            this.d0 = null;
        }
        int i2 = this.u0;
        if (i2 == i) {
            return;
        }
        this.t0 = i2;
        this.u0 = i;
        float f = i == 1 ? 0.0f : 1.0f;
        if (!z) {
            this.c0 = f;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.c0, f);
        this.d0 = ofFloat;
        ofFloat.setDuration(200L);
        this.d0.addListener(new cn2(this, (byte) 2));
        if (i == 1) {
            this.d0.setStartDelay(200L);
        }
        this.d0.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.y;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.y.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.y;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.y;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.y;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.y.left;
    }

    public float getCropRight() {
        return this.y.right;
    }

    public float getCropTop() {
        return this.y.top;
    }

    public float getCropWidth() {
        RectF rectF = this.y;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.V;
    }

    public float getLockAspectRatio() {
        return this.x;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.m0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z) {
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.j0 == null) {
            this.k0 = null;
            return;
        }
        if (this.n0 == null) {
            TextPaint textPaint = new TextPaint();
            this.n0 = textPaint;
            textPaint.setColor(vm2.o(-1, jn7.E1));
            this.n0.setTextSize(hl.L(13.0f));
            this.n0.setTextAlign(Paint.Align.CENTER);
        }
        this.k0 = new StaticLayout(this.j0, this.n0, getMeasuredWidth() - hl.L(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void j() {
        int L = hl.L(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.y;
        float f = rectF2.left;
        float f2 = L;
        float f3 = rectF2.top;
        rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
        RectF rectF3 = this.e;
        float f4 = rectF2.right;
        float f5 = rectF2.top;
        rectF3.set(f4 - f2, f5 - f2, f4 + f2, f5 + f2);
        RectF rectF4 = this.f;
        float f6 = rectF2.left;
        float f7 = rectF2.bottom;
        rectF4.set(f6 - f2, f7 - f2, f6 + f2, f7 + f2);
        RectF rectF5 = this.h;
        float f8 = rectF2.right;
        float f9 = rectF2.bottom;
        rectF5.set(f8 - f2, f9 - f2, f8 + f2, f9 + f2);
        RectF rectF6 = this.n;
        float f10 = rectF2.left + f2;
        float f11 = rectF2.top;
        rectF6.set(f10, f11 - f2, rectF2.right - f2, f11 + f2);
        RectF rectF7 = this.r;
        float f12 = rectF2.left;
        rectF7.set(f12 - f2, rectF2.top + f2, f12 + f2, rectF2.bottom - f2);
        RectF rectF8 = this.w;
        float f13 = rectF2.right;
        rectF8.set(f13 - f2, rectF2.top + f2, f13 + f2, rectF2.bottom - f2);
        RectF rectF9 = this.s;
        float f14 = rectF2.left + f2;
        float f15 = rectF2.bottom;
        rectF9.set(f14, f15 - f2, rectF2.right - f2, f15 + f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0387  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        Paint paint;
        Paint paint2;
        int i3;
        Paint paint3;
        int i4;
        Paint paint4;
        Paint paint5;
        int i5;
        int i6;
        Paint paint6;
        Paint paint7 = this.U;
        boolean z = this.b0;
        float f2 = this.W;
        Paint paint8 = this.Q;
        Paint paint9 = this.T;
        Paint paint10 = this.R;
        Paint paint11 = this.S;
        Paint paint12 = this.P;
        if (this.g0) {
            int L = hl.L(2.0f / this.p0);
            int L2 = hl.L(16.0f / this.p0);
            int L3 = hl.L(3.0f / this.p0);
            RectF rectF = this.y;
            float f3 = rectF.left;
            int i7 = ((int) f3) - L;
            float f4 = rectF.top;
            int i8 = ((int) f4) - L;
            int i9 = 2;
            int i10 = L << 1;
            int i11 = ((int) (rectF.right - f3)) + i10;
            int i12 = i10 + ((int) (rectF.bottom - f4));
            canvas.save();
            canvas.translate(this.q0, this.r0);
            float f5 = this.p0;
            float f6 = (i11 / 2) + i7;
            float f7 = (i12 / 2) + i8;
            canvas.scale(f5, f5, f6, f7);
            canvas.rotate(this.o0, f6, f7);
            if (this.J) {
                int i13 = (-getWidth()) << 2;
                int i14 = (-getHeight()) << 2;
                int width = getWidth() << 2;
                int height = getHeight() << 2;
                float f8 = this.L;
                if (f8 >= 0.0f) {
                    paint12.setAlpha((int) (f8 * 255.0f));
                } else {
                    paint12.setAlpha((int) (255.0f - (this.M * 127.0f)));
                }
                float f9 = i13;
                float f10 = width;
                i = L;
                i2 = i7;
                canvas.drawRect(f9, i14, f10, 0.0f, paint12);
                canvas.drawRect(f9, 0.0f, 0.0f, getHeight(), paint12);
                canvas.drawRect(getWidth(), 0.0f, f10, getHeight(), paint12);
                canvas.drawRect(f9, getHeight(), f10, height, paint12);
                float f11 = i8 + i;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f11, paint12);
                float f12 = (i8 + i12) - i;
                canvas.drawRect(0.0f, f11, i2 + i, f12, paint12);
                canvas.drawRect((i2 + i11) - i, f11, getWidth(), f12, paint12);
                canvas.drawRect(0.0f, f12, getWidth(), getHeight(), paint12);
            } else {
                i = L;
                i2 = i7;
            }
            if (!this.K) {
                return;
            }
            int i15 = L3 - i;
            int i16 = L3 << 1;
            int i17 = i11 - i16;
            int i18 = i12 - i16;
            int i19 = this.u0;
            if (i19 == 1 && this.c0 > 0.0f) {
                i19 = this.t0;
            }
            float f13 = this.N;
            float f14 = this.c0 * 26.0f;
            if (f13 >= 0.0f) {
                paint8.setAlpha((int) (f14 * f13));
                paint10.setAlpha((int) (this.c0 * 178.0f * this.N));
                paint9.setAlpha((int) (this.N * 178.0f));
                paint11.setAlpha((int) (this.N * 255.0f));
            } else {
                paint8.setAlpha((int) (f14 * this.M));
                paint10.setAlpha((int) (this.c0 * 178.0f * this.M));
                paint9.setAlpha((int) (this.M * 178.0f));
                paint11.setAlpha((int) (this.M * 255.0f));
            }
            float f15 = i2 + i15;
            float f16 = i8 + i15;
            int i20 = i2 + i11;
            Paint paint13 = paint8;
            float f17 = i20 - i15;
            int i21 = i19;
            canvas.drawRect(f15, f16, f17, r4 + i, paint9);
            int i22 = i12 + i8;
            float f18 = i22 - i15;
            canvas.drawRect(f15, f16, r3 + i, f18, paint9);
            canvas.drawRect(f15, r13 - i, f17, f18, paint9);
            canvas.drawRect(r8 - i, f16, f17, f18, paint9);
            int i23 = 0;
            while (true) {
                int i24 = 3;
                if (i23 >= 3) {
                    break;
                }
                int i25 = i9;
                if (i21 == i25) {
                    int i26 = 1;
                    while (i26 < 4) {
                        if (i23 == i25 && i26 == i24) {
                            i4 = i26;
                            paint4 = paint10;
                            paint5 = paint11;
                            paint6 = paint13;
                            i5 = i24;
                            i6 = i25;
                        } else {
                            int i27 = i2 + L3;
                            int i28 = i17 / 3;
                            float f19 = (i28 * i23) + ((i28 / 3) * i26) + i27;
                            int i29 = i8 + L3;
                            i4 = i26;
                            float f20 = i29;
                            float f21 = i29 + i18;
                            paint4 = paint10;
                            paint5 = paint11;
                            Paint paint14 = paint13;
                            i5 = 3;
                            i6 = i25;
                            canvas.drawLine(f19, f20, f19, f21, paint14);
                            paint6 = paint14;
                            canvas.drawLine(f19, f20, f19, f21, paint4);
                            int i30 = i18 / 3;
                            float f22 = i27;
                            float f23 = (i30 * i23) + ((i30 / 3) * i4) + i29;
                            float f24 = i27 + i17;
                            canvas.drawLine(f22, f23, f24, f23, paint6);
                            canvas.drawLine(f22, f23, f24, f23, paint4);
                        }
                        i26 = i4 + 1;
                        i24 = i5;
                        paint10 = paint4;
                        paint11 = paint5;
                        i25 = i6;
                        paint13 = paint6;
                    }
                    paint = paint11;
                    paint2 = paint13;
                    i3 = i25;
                    paint3 = paint10;
                } else {
                    Paint paint15 = paint10;
                    paint = paint11;
                    paint2 = paint13;
                    i3 = i25;
                    if (i21 != 3 || i23 <= 0) {
                        paint3 = paint15;
                    } else {
                        int i31 = i2 + L3;
                        float f25 = ((i17 / 3) * i23) + i31;
                        int i32 = i8 + L3;
                        float f26 = i32;
                        float f27 = i32 + i18;
                        canvas.drawLine(f25, f26, f25, f27, paint2);
                        canvas.drawLine(f25, f26, f25, f27, paint15);
                        float f28 = i31;
                        float f29 = ((i18 / 3) * i23) + i32;
                        float f30 = i31 + i17;
                        canvas.drawLine(f28, f29, f30, f29, paint2);
                        paint3 = paint15;
                        canvas.drawLine(f28, f29, f30, f29, paint3);
                    }
                }
                i23++;
                paint10 = paint3;
                paint11 = paint;
                i9 = i3;
                paint13 = paint2;
            }
            Paint paint16 = paint11;
            float f31 = i2;
            float f32 = i8;
            float f33 = i2 + L2;
            float f34 = i8 + L3;
            canvas.drawRect(f31, f32, f33, f34, paint16);
            float f35 = i2 + L3;
            float f36 = i8 + L2;
            canvas.drawRect(f31, f32, f35, f36, paint16);
            float f37 = i20 - L2;
            float f38 = i20;
            canvas.drawRect(f37, f32, f38, f34, paint16);
            float f39 = i20 - L3;
            canvas.drawRect(f39, f32, f38, f36, paint16);
            float f40 = i22 - L3;
            float f41 = i22;
            canvas.drawRect(f31, f40, f33, f41, paint16);
            float f42 = i22 - L2;
            canvas.drawRect(f31, f42, f35, f41, paint16);
            canvas.drawRect(f37, f40, f38, f41, paint16);
            canvas.drawRect(f39, f42, f38, f41, paint16);
            canvas.restore();
        } else {
            boolean z2 = true;
            float f43 = f2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f43;
            float measuredHeight = (((getMeasuredHeight() - this.H) - (!z ? hl.m : 0)) - this.I) - f43;
            this.a = (int) Math.min(measuredWidth, measuredHeight);
            Bitmap bitmap = this.h0;
            if (bitmap == null || bitmap.getWidth() != this.a) {
                Bitmap bitmap2 = this.h0;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.h0 = null;
                } else {
                    z2 = false;
                }
                try {
                    int i33 = this.a;
                    this.h0 = Bitmap.createBitmap(i33, i33, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.h0);
                    float f44 = this.a;
                    f = 2.0f;
                    try {
                        canvas2.drawRect(0.0f, 0.0f, f44, f44, paint12);
                        try {
                            int i34 = this.a;
                            canvas2.drawCircle(i34 / 2, i34 / 2, i34 / 2, this.i0);
                            canvas2.setBitmap(null);
                            if (!z2) {
                                this.M = 0.0f;
                                this.O = SystemClock.elapsedRealtime();
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        paint12 = paint12;
                    }
                } catch (Throwable unused3) {
                }
                if (this.h0 != null) {
                    paint7.setAlpha((int) (this.M * 255.0f));
                    paint12.setAlpha((int) (this.M * 127.0f));
                    float f45 = this.a;
                    this.b = bp1.z(measuredWidth, f45, f, f2);
                    float z3 = bp1.z(measuredHeight, f45, f, f2) + (z ? 0 : hl.m);
                    this.c = z3;
                    float f46 = z3 + f45;
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (int) this.c, paint12);
                    float f47 = (int) f46;
                    canvas.drawRect(0.0f, (int) this.c, (int) this.b, f47, paint12);
                    canvas.drawRect((int) (r1 + f45), (int) this.c, getWidth(), f47, paint12);
                    canvas.drawRect(0.0f, f47, getWidth(), getHeight(), paint12);
                    canvas.drawBitmap(this.h0, (int) this.b, (int) this.c, paint7);
                    if (getMeasuredHeight() > getMeasuredWidth() && this.k0 != null) {
                        canvas.save();
                        canvas.translate(getMeasuredWidth() / f, f46 + hl.L(16.0f));
                        this.k0.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            f = 2.0f;
            if (this.h0 != null) {
            }
        }
        if (this.M < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.O;
            if (j > 17) {
                j = 17;
            }
            this.O = elapsedRealtime;
            float f48 = (j / 180.0f) + this.M;
            this.M = f48;
            if (f48 > 1.0f) {
                this.M = 1.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f = this.W;
        RectF rectF = this.E;
        int x = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float f2 = !this.b0 ? hl.m : 0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f0 = false;
                h(false);
                if (this.s0 != 1) {
                    this.s0 = 1;
                    g33 g33Var = this.e0;
                    if (g33Var != null) {
                        b43 b43Var = (b43) g33Var;
                        CropAreaView cropAreaView = b43Var.a;
                        cropAreaView.g(1, true);
                        b43Var.c(cropAreaView.getTargetRectToFill());
                    }
                }
                return false;
            }
            if (actionMasked == 2 && this.s0 != 1) {
                rectF.set(this.y);
                float f3 = x - this.F;
                float f4 = y - this.G;
                this.F = x;
                this.G = y;
                boolean z = Math.abs(f3) > Math.abs(f4);
                switch (ik8.F(this.s0)) {
                    case 1:
                        rectF.left += f3;
                        rectF.top += f4;
                        if (this.x > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            float f5 = this.x;
                            if (z) {
                                c(rectF, f5);
                            } else {
                                b(rectF, f5);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f3;
                        rectF.top += f4;
                        if (this.x > 0.0f) {
                            float height2 = rectF.height();
                            float f6 = this.x;
                            if (z) {
                                c(rectF, f6);
                            } else {
                                b(rectF, f6);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f3;
                        rectF.bottom += f4;
                        if (this.x > 0.0f) {
                            float width2 = rectF.width();
                            float f7 = this.x;
                            if (z) {
                                c(rectF, f7);
                            } else {
                                b(rectF, f7);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f3;
                        rectF.bottom += f4;
                        float f8 = this.x;
                        if (f8 > 0.0f) {
                            if (!z) {
                                b(rectF, f8);
                                break;
                            } else {
                                c(rectF, f8);
                                break;
                            }
                        }
                        break;
                    case 5:
                        rectF.top += f4;
                        float f9 = this.x;
                        if (f9 > 0.0f) {
                            b(rectF, f9);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f3;
                        float f10 = this.x;
                        if (f10 > 0.0f) {
                            c(rectF, f10);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f4;
                        float f11 = this.x;
                        if (f11 > 0.0f) {
                            b(rectF, f11);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f3;
                        float f12 = this.x;
                        if (f12 > 0.0f) {
                            c(rectF, f12);
                            break;
                        }
                        break;
                }
                if (rectF.left < f) {
                    float f13 = this.x;
                    if (f13 > 0.0f) {
                        rectF.bottom = bp1.z(rectF.right, f, f13, rectF.top);
                    }
                    rectF.left = f;
                } else if (rectF.right > getWidth() - f) {
                    rectF.right = getWidth() - f;
                    if (this.x > 0.0f) {
                        rectF.bottom = (rectF.width() / this.x) + rectF.top;
                    }
                }
                float f14 = f2 + this.I + f;
                float f15 = this.H + f;
                if (rectF.top < f14) {
                    float f16 = this.x;
                    if (f16 > 0.0f) {
                        rectF.right = qd4.A(rectF.bottom, f14, f16, rectF.left);
                    }
                    rectF.top = f14;
                } else if (rectF.bottom > getHeight() - f15) {
                    rectF.bottom = getHeight() - f15;
                    if (this.x > 0.0f) {
                        rectF.right = (rectF.height() * this.x) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f17 = this.a0;
                if (width3 < f17) {
                    rectF.right = rectF.left + f17;
                }
                float height3 = rectF.height();
                float f18 = this.a0;
                if (height3 < f18) {
                    rectF.bottom = rectF.top + f18;
                }
                float f19 = this.x;
                if (f19 > 0.0f) {
                    if (f19 < 1.0f) {
                        float width4 = rectF.width();
                        float f20 = this.a0;
                        if (width4 <= f20) {
                            rectF.right = rectF.left + f20;
                            rectF.bottom = (rectF.width() / this.x) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f21 = this.a0;
                        if (height4 <= f21) {
                            rectF.bottom = rectF.top + f21;
                            rectF.right = (rectF.height() * this.x) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                g33 g33Var2 = this.e0;
                if (g33Var2 != null) {
                    b43 b43Var2 = (b43) g33Var2;
                    CropAreaView cropAreaView2 = b43Var2.a;
                    cropAreaView2.g(3, false);
                    RectF rectF2 = b43Var2.f;
                    float centerX = rectF2.centerX() - cropAreaView2.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView2.getCropCenterY();
                    z33 z33Var = b43Var2.M;
                    if (z33Var != null) {
                        z33Var.g(centerX, centerY);
                    }
                    b43Var2.r(false);
                    rectF2.set(cropAreaView2.y);
                    b43Var2.d(true, false, false, false);
                    return true;
                }
            }
            return false;
        }
        if (!this.g0) {
            this.s0 = 1;
            return false;
        }
        float f22 = x;
        float f23 = y;
        if (this.d.contains(f22, f23)) {
            this.s0 = 2;
        } else if (this.e.contains(f22, f23)) {
            this.s0 = 3;
        } else if (this.f.contains(f22, f23)) {
            this.s0 = 4;
        } else if (this.h.contains(f22, f23)) {
            this.s0 = 5;
        } else if (this.r.contains(f22, f23)) {
            this.s0 = 7;
        } else if (this.n.contains(f22, f23)) {
            this.s0 = 6;
        } else if (this.w.contains(f22, f23)) {
            this.s0 = 9;
        } else {
            if (!this.s.contains(f22, f23)) {
                this.s0 = 1;
                return false;
            }
            this.s0 = 8;
        }
        this.F = x;
        this.G = y;
        g(3, false);
        this.f0 = true;
        h(true);
        g33 g33Var3 = this.e0;
        if (g33Var3 != null) {
            b43 b43Var3 = (b43) g33Var3;
            b43Var3.a.d(b43Var3.f);
            b43Var3.n = 0.0f;
            a43 a43Var = b43Var3.N;
            if (a43Var != null) {
                a43Var.F0(false);
                return true;
            }
        }
        return true;
    }

    public void setActualRect(float f) {
        a(this.y, f);
        j();
        invalidate();
    }

    public void setBottomPadding(float f) {
        this.H = f;
    }

    public void setDimAlpha(float f) {
        this.L = f;
    }

    public void setDimVisibility(boolean z) {
        this.J = z;
    }

    public void setFrameAlpha(float f) {
        this.N = f;
    }

    public void setFreeform(boolean z) {
        this.g0 = z;
    }

    public void setIsVideo(boolean z) {
        this.a0 = hl.L(z ? 64.0f : 32.0f);
    }

    public void setListener(g33 g33Var) {
        this.e0 = g33Var;
    }

    public void setLockedAspectRatio(float f) {
        this.x = f;
    }

    public void setSubtitle(String str) {
        this.j0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f) {
        this.I = f;
    }

    public void setActualRect(RectF rectF) {
        this.y.set(rectF);
        j();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
