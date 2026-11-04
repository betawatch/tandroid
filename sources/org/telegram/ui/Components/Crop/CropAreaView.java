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
import o1.g;
import org.telegram.messenger.g0;
import org.telegram.ui.i81;
import pg.a;
import pg.k;
import pg.l;
import pg.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
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
    public a e0;
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

    public static void b(RectF rectF, float f10) {
        float height = rectF.height();
        rectF.right = rectF.left + (f10 * height);
        rectF.bottom = rectF.top + height;
    }

    public static void c(RectF rectF, float f10) {
        float width = rectF.width();
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + (width / f10);
    }

    private float getGridProgress() {
        return this.c0;
    }

    private void setCropBottom(float f10) {
        this.y.bottom = f10;
        invalidate();
    }

    private void setCropLeft(float f10) {
        this.y.left = f10;
        invalidate();
    }

    private void setCropRight(float f10) {
        this.y.right = f10;
        invalidate();
    }

    private void setCropTop(float f10) {
        this.y.top = f10;
        invalidate();
    }

    private void setGridProgress(float f10) {
        this.c0 = f10;
        invalidate();
    }

    public final void a(RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.W;
        float f16 = !this.b0 ? g0.m : 0;
        float measuredHeight = ((getMeasuredHeight() - this.H) - this.I) - f16;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f17 = f15 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f17;
        float measuredWidth2 = getMeasuredWidth() - f17;
        float f18 = measuredHeight - f17;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f19 = (measuredHeight / 2.0f) + f16 + this.I;
        if (Math.abs(1.0f - f10) < 1.0E-4d) {
            float f20 = min / 2.0f;
            f14 = measuredWidth3 - f20;
            f13 = f19 - f20;
            f11 = measuredWidth3 + f20;
            f12 = f19 + f20;
        } else {
            if (f10 - measuredWidth <= 1.0E-4d) {
                float f21 = f18 * f10;
                if (f21 <= measuredWidth2) {
                    float f22 = f21 / 2.0f;
                    f14 = measuredWidth3 - f22;
                    float f23 = f18 / 2.0f;
                    float f24 = f19 - f23;
                    f11 = measuredWidth3 + f22;
                    f12 = f19 + f23;
                    f13 = f24;
                }
            }
            float f25 = measuredWidth2 / 2.0f;
            float f26 = measuredWidth3 - f25;
            float f27 = (measuredWidth2 / f10) / 2.0f;
            float f28 = f19 - f27;
            f11 = measuredWidth3 + f25;
            f12 = f19 + f27;
            f13 = f28;
            f14 = f26;
        }
        rectF.set(f14, f13, f11, f12);
    }

    public final void d(RectF rectF) {
        rectF.set(this.y);
    }

    public final void e(int i3, int i10, boolean z10, boolean z11) {
        this.g0 = z11;
        float f10 = z10 ? i10 / i3 : i3 / i10;
        if (!z11) {
            f10 = 1.0f;
            this.x = 1.0f;
        }
        setActualRect(f10);
    }

    public final void f(boolean z10, boolean z11) {
        this.K = z10;
        if (!z10) {
            this.M = 1.0f;
            return;
        }
        this.M = z11 ? 0.0f : 1.0f;
        this.O = SystemClock.elapsedRealtime();
        invalidate();
    }

    public final void g(int i3, boolean z10) {
        ObjectAnimator objectAnimator = this.d0;
        if (objectAnimator != null && (!z10 || this.u0 != i3)) {
            objectAnimator.cancel();
            this.d0 = null;
        }
        int i10 = this.u0;
        if (i10 == i3) {
            return;
        }
        this.t0 = i10;
        this.u0 = i3;
        float f10 = i3 == 1 ? 0.0f : 1.0f;
        if (!z10) {
            this.c0 = f10;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.c0, f10);
        this.d0 = ofFloat;
        ofFloat.setDuration(200L);
        this.d0.addListener(new i81(this, 14));
        if (i3 == 1) {
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

    public final void h(boolean z10) {
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility | 4 : systemUiVisibility & (-5));
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
            textPaint.setColor(i0.a.o(-1, 120));
            this.n0.setTextSize(g0.L(13.0f));
            this.n0.setTextAlign(Paint.Align.CENTER);
        }
        this.k0 = new StaticLayout(this.j0, this.n0, getMeasuredWidth() - g0.L(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void j() {
        int L = g0.L(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.y;
        float f10 = rectF2.left;
        float f11 = L;
        float f12 = rectF2.top;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        RectF rectF3 = this.e;
        float f13 = rectF2.right;
        float f14 = rectF2.top;
        rectF3.set(f13 - f11, f14 - f11, f13 + f11, f14 + f11);
        RectF rectF4 = this.f;
        float f15 = rectF2.left;
        float f16 = rectF2.bottom;
        rectF4.set(f15 - f11, f16 - f11, f15 + f11, f16 + f11);
        RectF rectF5 = this.h;
        float f17 = rectF2.right;
        float f18 = rectF2.bottom;
        rectF5.set(f17 - f11, f18 - f11, f17 + f11, f18 + f11);
        RectF rectF6 = this.n;
        float f19 = rectF2.left + f11;
        float f20 = rectF2.top;
        rectF6.set(f19, f20 - f11, rectF2.right - f11, f20 + f11);
        RectF rectF7 = this.r;
        float f21 = rectF2.left;
        rectF7.set(f21 - f11, rectF2.top + f11, f21 + f11, rectF2.bottom - f11);
        RectF rectF8 = this.w;
        float f22 = rectF2.right;
        rectF8.set(f22 - f11, rectF2.top + f11, f22 + f11, rectF2.bottom - f11);
        RectF rectF9 = this.s;
        float f23 = rectF2.left + f11;
        float f24 = rectF2.bottom;
        rectF9.set(f23, f24 - f11, rectF2.right - f11, f24 + f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x037b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        int i3;
        int i10;
        int i11;
        Paint paint;
        Paint paint2;
        int i12;
        int i13;
        int i14;
        Paint paint3;
        Paint paint4 = this.U;
        boolean z10 = this.b0;
        float f11 = this.W;
        Paint paint5 = this.T;
        Paint paint6 = this.R;
        Paint paint7 = this.Q;
        Paint paint8 = this.S;
        Paint paint9 = this.P;
        if (this.g0) {
            int L = g0.L(2.0f / this.p0);
            int L2 = g0.L(16.0f / this.p0);
            int L3 = g0.L(3.0f / this.p0);
            RectF rectF = this.y;
            float f12 = rectF.left;
            int i15 = ((int) f12) - L;
            float f13 = rectF.top;
            int i16 = ((int) f13) - L;
            int i17 = L * 2;
            int i18 = ((int) (rectF.right - f12)) + i17;
            int i19 = i17 + ((int) (rectF.bottom - f13));
            canvas.save();
            canvas.translate(this.q0, this.r0);
            float f14 = this.p0;
            float f15 = (i18 / 2) + i15;
            float f16 = (i19 / 2) + i16;
            canvas.scale(f14, f14, f15, f16);
            canvas.rotate(this.o0, f15, f16);
            if (this.J) {
                int i20 = (-getWidth()) * 4;
                int i21 = (-getHeight()) * 4;
                int width = getWidth() * 4;
                int height = getHeight() * 4;
                float f17 = this.L;
                if (f17 >= 0.0f) {
                    paint9.setAlpha((int) (f17 * 255.0f));
                } else {
                    paint9.setAlpha((int) (255.0f - (this.M * 127.0f)));
                }
                float f18 = i20;
                float f19 = width;
                i10 = L2;
                i3 = L;
                i11 = i15;
                canvas.drawRect(f18, i21, f19, 0.0f, paint9);
                canvas.drawRect(f18, 0.0f, 0.0f, getHeight(), paint9);
                canvas.drawRect(getWidth(), 0.0f, f19, getHeight(), paint9);
                canvas.drawRect(f18, getHeight(), f19, height, paint9);
                float f20 = i16 + i3;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f20, paint9);
                float f21 = (i16 + i19) - i3;
                canvas.drawRect(0.0f, f20, i11 + i3, f21, paint9);
                canvas.drawRect((i11 + i18) - i3, f20, getWidth(), f21, paint9);
                canvas.drawRect(0.0f, f21, getWidth(), getHeight(), paint9);
            } else {
                i3 = L;
                i10 = L2;
                i11 = i15;
            }
            if (!this.K) {
                return;
            }
            int i22 = L3 - i3;
            int i23 = L3 * 2;
            int i24 = i18 - i23;
            int i25 = i19 - i23;
            int i26 = this.u0;
            if (i26 == 1 && this.c0 > 0.0f) {
                i26 = this.t0;
            }
            float f22 = this.N;
            if (f22 >= 0.0f) {
                paint7.setAlpha((int) (this.c0 * 26.0f * f22));
                paint6.setAlpha((int) (this.c0 * 178.0f * this.N));
                paint5.setAlpha((int) (this.N * 178.0f));
                paint8.setAlpha((int) (this.N * 255.0f));
            } else {
                paint7.setAlpha((int) (this.c0 * 26.0f * this.M));
                paint6.setAlpha((int) (this.c0 * 178.0f * this.M));
                paint5.setAlpha((int) (this.M * 178.0f));
                paint8.setAlpha((int) (this.M * 255.0f));
            }
            float f23 = i11 + i22;
            float f24 = i16 + i22;
            int i27 = i11 + i18;
            float f25 = i27 - i22;
            int i28 = i26;
            Paint paint10 = paint6;
            canvas.drawRect(f23, f24, f25, r4 + i3, paint5);
            int i29 = i19 + i16;
            float f26 = i29 - i22;
            canvas.drawRect(f23, f24, r3 + i3, f26, paint5);
            canvas.drawRect(f23, r12 - i3, f25, f26, paint5);
            canvas.drawRect(r14 - i3, f24, f25, f26, paint5);
            int i30 = 0;
            while (true) {
                int i31 = 3;
                if (i30 >= 3) {
                    break;
                }
                int i32 = 2;
                if (i28 == 2) {
                    int i33 = 1;
                    int i34 = 4;
                    while (i33 < i34) {
                        if (i30 == i32 && i33 == i31) {
                            i13 = i32;
                            i12 = i34;
                            paint3 = paint7;
                            i14 = i33;
                        } else {
                            int i35 = i11 + L3;
                            int i36 = i24 / 3;
                            float f27 = (i36 * i30) + ((i36 / 3) * i33) + i35;
                            int i37 = i16 + L3;
                            int i38 = i34;
                            float f28 = i37;
                            float f29 = i37 + i25;
                            i12 = i38;
                            i13 = 2;
                            Paint paint11 = paint7;
                            i14 = i33;
                            canvas.drawLine(f27, f28, f27, f29, paint11);
                            paint3 = paint11;
                            canvas.drawLine(f27, f28, f27, f29, paint10);
                            int i39 = i25 / 3;
                            float f30 = i35;
                            float f31 = (i39 * i30) + ((i39 / 3) * i14) + i37;
                            float f32 = i35 + i24;
                            canvas.drawLine(f30, f31, f32, f31, paint3);
                            canvas.drawLine(f30, f31, f32, f31, paint10);
                        }
                        i33 = i14 + 1;
                        i34 = i12;
                        paint7 = paint3;
                        i32 = i13;
                        i31 = 3;
                    }
                    paint = paint7;
                } else {
                    paint = paint7;
                    if (i28 == 3 && i30 > 0) {
                        int i40 = i11 + L3;
                        float f33 = ((i24 / 3) * i30) + i40;
                        int i41 = i16 + L3;
                        float f34 = i41;
                        float f35 = i41 + i25;
                        canvas.drawLine(f33, f34, f33, f35, paint);
                        canvas.drawLine(f33, f34, f33, f35, paint10);
                        float f36 = i40;
                        float f37 = ((i25 / 3) * i30) + i41;
                        float f38 = i40 + i24;
                        canvas.drawLine(f36, f37, f38, f37, paint);
                        paint2 = paint10;
                        canvas.drawLine(f36, f37, f38, f37, paint2);
                        i30++;
                        paint10 = paint2;
                        paint7 = paint;
                    }
                }
                paint2 = paint10;
                i30++;
                paint10 = paint2;
                paint7 = paint;
            }
            float f39 = i11;
            float f40 = i16;
            float f41 = i11 + i10;
            float f42 = i16 + L3;
            canvas.drawRect(f39, f40, f41, f42, paint8);
            float f43 = i11 + L3;
            float f44 = i16 + i10;
            canvas.drawRect(f39, f40, f43, f44, paint8);
            float f45 = i27 - i10;
            float f46 = i27;
            canvas.drawRect(f45, f40, f46, f42, paint8);
            float f47 = i27 - L3;
            canvas.drawRect(f47, f40, f46, f44, paint8);
            float f48 = i29 - L3;
            float f49 = i29;
            canvas.drawRect(f39, f48, f41, f49, paint8);
            float f50 = i29 - i10;
            canvas.drawRect(f39, f50, f43, f49, paint8);
            canvas.drawRect(f45, f48, f46, f49, paint8);
            canvas.drawRect(f47, f50, f46, f49, paint8);
            canvas.restore();
        } else {
            float f51 = f11 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f51;
            float measuredHeight = (((getMeasuredHeight() - this.H) - (!z10 ? g0.m : 0)) - this.I) - f51;
            this.a = (int) Math.min(measuredWidth, measuredHeight);
            Bitmap bitmap = this.h0;
            if (bitmap == null || bitmap.getWidth() != this.a) {
                Bitmap bitmap2 = this.h0;
                boolean z11 = bitmap2 != null;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.h0 = null;
                }
                try {
                    int i42 = this.a;
                    this.h0 = Bitmap.createBitmap(i42, i42, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.h0);
                    float f52 = this.a;
                    f10 = 2.0f;
                    try {
                        canvas2.drawRect(0.0f, 0.0f, f52, f52, paint9);
                        try {
                            int i43 = this.a;
                            canvas2.drawCircle(i43 / 2, i43 / 2, i43 / 2, this.i0);
                            canvas2.setBitmap(null);
                            if (!z11) {
                                this.M = 0.0f;
                                this.O = SystemClock.elapsedRealtime();
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        paint9 = paint9;
                    }
                } catch (Throwable unused3) {
                }
                if (this.h0 != null) {
                    paint4.setAlpha((int) (this.M * 255.0f));
                    paint9.setAlpha((int) (this.M * 127.0f));
                    float f53 = this.a;
                    this.b = com.google.android.recaptcha.internal.a.z(measuredWidth, f53, f10, f11);
                    float z12 = com.google.android.recaptcha.internal.a.z(measuredHeight, f53, f10, f11) + (z10 ? 0 : g0.m);
                    this.c = z12;
                    float f54 = z12 + f53;
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (int) this.c, paint9);
                    float f55 = (int) f54;
                    canvas.drawRect(0.0f, (int) this.c, (int) this.b, f55, paint9);
                    canvas.drawRect((int) (r1 + f53), (int) this.c, getWidth(), f55, paint9);
                    canvas.drawRect(0.0f, f55, getWidth(), getHeight(), paint9);
                    canvas.drawBitmap(this.h0, (int) this.b, (int) this.c, paint4);
                    if (getMeasuredHeight() > getMeasuredWidth() && this.k0 != null) {
                        canvas.save();
                        canvas.translate(getMeasuredWidth() / f10, f54 + g0.L(16.0f));
                        this.k0.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            f10 = 2.0f;
            if (this.h0 != null) {
            }
        }
        if (this.M < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.O;
            if (j10 > 17) {
                j10 = 17;
            }
            this.O = elapsedRealtime;
            float f56 = (j10 / 180.0f) + this.M;
            this.M = f56;
            if (f56 > 1.0f) {
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        i();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10 = this.W;
        RectF rectF = this.E;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y9 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float f11 = !this.b0 ? g0.m : 0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f0 = false;
                h(false);
                if (this.s0 != 1) {
                    this.s0 = 1;
                    a aVar = this.e0;
                    if (aVar != null) {
                        m mVar = (m) aVar;
                        CropAreaView cropAreaView = mVar.a;
                        cropAreaView.g(1, true);
                        mVar.d(cropAreaView.getTargetRectToFill());
                    }
                }
                return false;
            }
            if (actionMasked == 2 && this.s0 != 1) {
                rectF.set(this.y);
                float f12 = x10 - this.F;
                float f13 = y9 - this.G;
                this.F = x10;
                this.G = y9;
                boolean z10 = Math.abs(f12) > Math.abs(f13);
                switch (g.c(this.s0)) {
                    case 1:
                        rectF.left += f12;
                        rectF.top += f13;
                        if (this.x > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z10) {
                                c(rectF, this.x);
                            } else {
                                b(rectF, this.x);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f12;
                        rectF.top += f13;
                        if (this.x > 0.0f) {
                            float height2 = rectF.height();
                            if (z10) {
                                c(rectF, this.x);
                            } else {
                                b(rectF, this.x);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f12;
                        rectF.bottom += f13;
                        if (this.x > 0.0f) {
                            float width2 = rectF.width();
                            if (z10) {
                                c(rectF, this.x);
                            } else {
                                b(rectF, this.x);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f12;
                        rectF.bottom += f13;
                        float f14 = this.x;
                        if (f14 > 0.0f) {
                            if (!z10) {
                                b(rectF, f14);
                                break;
                            } else {
                                c(rectF, f14);
                                break;
                            }
                        }
                        break;
                    case 5:
                        rectF.top += f13;
                        float f15 = this.x;
                        if (f15 > 0.0f) {
                            b(rectF, f15);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f12;
                        float f16 = this.x;
                        if (f16 > 0.0f) {
                            c(rectF, f16);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f13;
                        float f17 = this.x;
                        if (f17 > 0.0f) {
                            b(rectF, f17);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f12;
                        float f18 = this.x;
                        if (f18 > 0.0f) {
                            c(rectF, f18);
                            break;
                        }
                        break;
                }
                if (rectF.left < f10) {
                    float f19 = this.x;
                    if (f19 > 0.0f) {
                        rectF.bottom = com.google.android.recaptcha.internal.a.z(rectF.right, f10, f19, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.x > 0.0f) {
                        rectF.bottom = (rectF.width() / this.x) + rectF.top;
                    }
                }
                float f20 = f11 + this.I + f10;
                float f21 = this.H + f10;
                if (rectF.top < f20) {
                    float f22 = this.x;
                    if (f22 > 0.0f) {
                        rectF.right = com.google.android.recaptcha.internal.a.y(rectF.bottom, f20, f22, rectF.left);
                    }
                    rectF.top = f20;
                } else if (rectF.bottom > getHeight() - f21) {
                    rectF.bottom = getHeight() - f21;
                    if (this.x > 0.0f) {
                        rectF.right = (rectF.height() * this.x) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f23 = this.a0;
                if (width3 < f23) {
                    rectF.right = rectF.left + f23;
                }
                float height3 = rectF.height();
                float f24 = this.a0;
                if (height3 < f24) {
                    rectF.bottom = rectF.top + f24;
                }
                float f25 = this.x;
                if (f25 > 0.0f) {
                    if (f25 < 1.0f) {
                        float width4 = rectF.width();
                        float f26 = this.a0;
                        if (width4 <= f26) {
                            rectF.right = rectF.left + f26;
                            rectF.bottom = (rectF.width() / this.x) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f27 = this.a0;
                        if (height4 <= f27) {
                            rectF.bottom = rectF.top + f27;
                            rectF.right = (rectF.height() * this.x) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.e0;
                if (aVar2 != null) {
                    m mVar2 = (m) aVar2;
                    CropAreaView cropAreaView2 = mVar2.a;
                    cropAreaView2.g(3, false);
                    RectF rectF2 = mVar2.f;
                    float centerX = rectF2.centerX() - cropAreaView2.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView2.getCropCenterY();
                    k kVar = mVar2.M;
                    if (kVar != null) {
                        k.f(kVar, centerX, centerY);
                    }
                    mVar2.r(false);
                    rectF2.set(cropAreaView2.y);
                    mVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        }
        if (!this.g0) {
            this.s0 = 1;
            return false;
        }
        float f28 = x10;
        float f29 = y9;
        if (this.d.contains(f28, f29)) {
            this.s0 = 2;
        } else if (this.e.contains(f28, f29)) {
            this.s0 = 3;
        } else if (this.f.contains(f28, f29)) {
            this.s0 = 4;
        } else if (this.h.contains(f28, f29)) {
            this.s0 = 5;
        } else if (this.r.contains(f28, f29)) {
            this.s0 = 7;
        } else if (this.n.contains(f28, f29)) {
            this.s0 = 6;
        } else if (this.w.contains(f28, f29)) {
            this.s0 = 9;
        } else {
            if (!this.s.contains(f28, f29)) {
                this.s0 = 1;
                return false;
            }
            this.s0 = 8;
        }
        this.F = x10;
        this.G = y9;
        g(3, false);
        this.f0 = true;
        h(true);
        a aVar3 = this.e0;
        if (aVar3 != null) {
            m mVar3 = (m) aVar3;
            mVar3.a.d(mVar3.f);
            mVar3.n = 0.0f;
            l lVar = mVar3.N;
            if (lVar != null) {
                lVar.Q(false);
                return true;
            }
        }
        return true;
    }

    public void setActualRect(float f10) {
        a(this.y, f10);
        j();
        invalidate();
    }

    public void setBottomPadding(float f10) {
        this.H = f10;
    }

    public void setDimAlpha(float f10) {
        this.L = f10;
    }

    public void setDimVisibility(boolean z10) {
        this.J = z10;
    }

    public void setFrameAlpha(float f10) {
        this.N = f10;
    }

    public void setFreeform(boolean z10) {
        this.g0 = z10;
    }

    public void setIsVideo(boolean z10) {
        this.a0 = g0.L(z10 ? 64.0f : 32.0f);
    }

    public void setListener(a aVar) {
        this.e0 = aVar;
    }

    public void setLockedAspectRatio(float f10) {
        this.x = f10;
    }

    public void setSubtitle(String str) {
        this.j0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f10) {
        this.I = f10;
    }

    public void setActualRect(RectF rectF) {
        this.y.set(rectF);
        j();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
    }
}
