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
import e2.c;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import ph.j2;
import yf.a;
import yf.l;
import yf.m;
import yf.n;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class CropAreaView extends ViewGroup {
    public int B;
    public int C;
    public float D;
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public long K;
    public Paint L;
    public Paint M;
    public Paint N;
    public Paint O;
    public Paint P;
    public Paint Q;
    public AccelerateDecelerateInterpolator R;
    public float S;
    public float T;
    public boolean U;
    public float V;
    public ObjectAnimator W;
    public int a;
    public a a0;
    public float b;
    public boolean b0;
    public float c;
    public boolean c0;
    public RectF d;
    public Bitmap d0;
    public RectF e;
    public Paint e0;
    public RectF f;
    public String f0;
    public StaticLayout g0;
    public RectF h;
    public AnimatorSet h0;
    public RectF i0;
    public TextPaint j0;
    public float k0;
    public float l0;
    public float m0;
    public RectF n;
    public float n0;
    public int o0;
    public int p0;
    public int q0;
    public RectF r;
    public RectF s;
    public RectF v;
    public float w;
    public RectF x;
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
        return this.V;
    }

    private void setCropBottom(float f10) {
        this.x.bottom = f10;
        invalidate();
    }

    private void setCropLeft(float f10) {
        this.x.left = f10;
        invalidate();
    }

    private void setCropRight(float f10) {
        this.x.right = f10;
        invalidate();
    }

    private void setCropTop(float f10) {
        this.x.top = f10;
        invalidate();
    }

    private void setGridProgress(float f10) {
        this.V = f10;
        invalidate();
    }

    public final void a(RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.S;
        float f16 = !this.U ? AndroidUtilities.statusBarHeight : 0;
        float measuredHeight = ((getMeasuredHeight() - this.D) - this.E) - f16;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f17 = f15 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f17;
        float measuredWidth2 = getMeasuredWidth() - f17;
        float f18 = measuredHeight - f17;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f19 = (measuredHeight / 2.0f) + f16 + this.E;
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
        rectF.set(this.x);
    }

    public final void e(int i10, int i11, boolean z4, boolean z10) {
        this.c0 = z10;
        float f10 = z4 ? i11 / i10 : i10 / i11;
        if (!z10) {
            f10 = 1.0f;
            this.w = 1.0f;
        }
        setActualRect(f10);
    }

    public final void f(boolean z4, boolean z10) {
        this.G = z4;
        if (!z4) {
            this.I = 1.0f;
            return;
        }
        this.I = z10 ? 0.0f : 1.0f;
        this.K = SystemClock.elapsedRealtime();
        invalidate();
    }

    public final void g(int i10, boolean z4) {
        ObjectAnimator objectAnimator = this.W;
        if (objectAnimator != null && (!z4 || this.q0 != i10)) {
            objectAnimator.cancel();
            this.W = null;
        }
        int i11 = this.q0;
        if (i11 == i10) {
            return;
        }
        this.p0 = i11;
        this.q0 = i10;
        float f10 = i10 == 1 ? 0.0f : 1.0f;
        if (!z4) {
            this.V = f10;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.V, f10);
        this.W = ofFloat;
        ofFloat.setDuration(200L);
        this.W.addListener(new j2(this, 13));
        if (i10 == 1) {
            this.W.setStartDelay(200L);
        }
        this.W.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.x;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.x.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.x;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.x;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.x;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.x.left;
    }

    public float getCropRight() {
        return this.x.right;
    }

    public float getCropTop() {
        return this.x.top;
    }

    public float getCropWidth() {
        RectF rectF = this.x;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.R;
    }

    public float getLockAspectRatio() {
        return this.w;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.i0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z4) {
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.f0 == null) {
            this.g0 = null;
            return;
        }
        if (this.j0 == null) {
            TextPaint textPaint = new TextPaint();
            this.j0 = textPaint;
            textPaint.setColor(i0.a.k(-1, 120));
            this.j0.setTextSize(AndroidUtilities.dp(13.0f));
            this.j0.setTextAlign(Paint.Align.CENTER);
        }
        this.g0 = new StaticLayout(this.f0, this.j0, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void j() {
        int dp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.x;
        float f10 = rectF2.left;
        float f11 = dp;
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
        RectF rectF8 = this.v;
        float f22 = rectF2.right;
        rectF8.set(f22 - f11, rectF2.top + f11, f22 + f11, rectF2.bottom - f11);
        RectF rectF9 = this.s;
        float f23 = rectF2.left + f11;
        float f24 = rectF2.bottom;
        rectF9.set(f23, f24 - f11, rectF2.right - f11, f24 + f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        int i12;
        Paint paint;
        Paint paint2;
        int i13;
        Paint paint3;
        Paint paint4 = this.Q;
        boolean z4 = this.U;
        float f11 = this.S;
        Paint paint5 = this.P;
        Paint paint6 = this.N;
        Paint paint7 = this.M;
        Paint paint8 = this.O;
        Paint paint9 = this.L;
        if (this.c0) {
            int dp = AndroidUtilities.dp(2.0f / this.l0);
            int dp2 = AndroidUtilities.dp(16.0f / this.l0);
            int dp3 = AndroidUtilities.dp(3.0f / this.l0);
            RectF rectF = this.x;
            float f12 = rectF.left;
            int i14 = ((int) f12) - dp;
            float f13 = rectF.top;
            int i15 = ((int) f13) - dp;
            int i16 = dp * 2;
            int i17 = ((int) (rectF.right - f12)) + i16;
            int i18 = i16 + ((int) (rectF.bottom - f13));
            canvas.save();
            canvas.translate(this.m0, this.n0);
            float f14 = this.l0;
            float f15 = (i17 / 2) + i14;
            float f16 = (i18 / 2) + i15;
            canvas.scale(f14, f14, f15, f16);
            canvas.rotate(this.k0, f15, f16);
            if (this.F) {
                int i19 = (-getWidth()) * 4;
                int i20 = (-getHeight()) * 4;
                int width = getWidth() * 4;
                int height = getHeight() * 4;
                float f17 = this.H;
                if (f17 >= 0.0f) {
                    paint9.setAlpha((int) (f17 * 255.0f));
                } else {
                    paint9.setAlpha((int) (255.0f - (this.I * 127.0f)));
                }
                float f18 = i19;
                float f19 = width;
                i10 = dp;
                i11 = dp2;
                i12 = i14;
                canvas.drawRect(f18, i20, f19, 0.0f, paint9);
                canvas.drawRect(f18, 0.0f, 0.0f, getHeight(), paint9);
                canvas.drawRect(getWidth(), 0.0f, f19, getHeight(), paint9);
                canvas.drawRect(f18, getHeight(), f19, height, paint9);
                float f20 = i15 + i10;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f20, paint9);
                float f21 = (i15 + i18) - i10;
                canvas.drawRect(0.0f, f20, i12 + i10, f21, paint9);
                canvas.drawRect((i12 + i17) - i10, f20, getWidth(), f21, paint9);
                canvas.drawRect(0.0f, f21, getWidth(), getHeight(), paint9);
            } else {
                i10 = dp;
                i11 = dp2;
                i12 = i14;
            }
            if (!this.G) {
                return;
            }
            int i21 = dp3 - i10;
            int i22 = dp3 * 2;
            int i23 = i17 - i22;
            int i24 = i18 - i22;
            int i25 = this.q0;
            if (i25 == 1 && this.V > 0.0f) {
                i25 = this.p0;
            }
            float f22 = this.J;
            if (f22 >= 0.0f) {
                paint7.setAlpha((int) (this.V * 26.0f * f22));
                paint6.setAlpha((int) (this.V * 178.0f * this.J));
                paint5.setAlpha((int) (this.J * 178.0f));
                paint8.setAlpha((int) (this.J * 255.0f));
            } else {
                paint7.setAlpha((int) (this.V * 26.0f * this.I));
                paint6.setAlpha((int) (this.V * 178.0f * this.I));
                paint5.setAlpha((int) (this.I * 178.0f));
                paint8.setAlpha((int) (this.I * 255.0f));
            }
            float f23 = i12 + i21;
            float f24 = i15 + i21;
            int i26 = i12 + i17;
            float f25 = i26 - i21;
            int i27 = i25;
            Paint paint10 = paint6;
            canvas.drawRect(f23, f24, f25, r4 + i10, paint5);
            int i28 = i18 + i15;
            float f26 = i28 - i21;
            canvas.drawRect(f23, f24, r3 + i10, f26, paint5);
            canvas.drawRect(f23, r12 - i10, f25, f26, paint5);
            canvas.drawRect(r14 - i10, f24, f25, f26, paint5);
            int i29 = 0;
            while (true) {
                int i30 = 3;
                if (i29 >= 3) {
                    break;
                }
                int i31 = 2;
                if (i27 == 2) {
                    int i32 = 1;
                    while (i32 < 4) {
                        if (i29 == i31 && i32 == i30) {
                            paint3 = paint7;
                            i13 = i32;
                        } else {
                            int i33 = i12 + dp3;
                            int i34 = i23 / 3;
                            float f27 = (i34 * i29) + ((i34 / 3) * i32) + i33;
                            int i35 = i15 + dp3;
                            float f28 = i35;
                            float f29 = i35 + i24;
                            Paint paint11 = paint7;
                            i13 = i32;
                            canvas.drawLine(f27, f28, f27, f29, paint11);
                            paint3 = paint11;
                            canvas.drawLine(f27, f28, f27, f29, paint10);
                            int i36 = i24 / 3;
                            float f30 = i33;
                            float f31 = (i36 * i29) + ((i36 / 3) * i13) + i35;
                            float f32 = i33 + i23;
                            canvas.drawLine(f30, f31, f32, f31, paint3);
                            canvas.drawLine(f30, f31, f32, f31, paint10);
                        }
                        i32 = i13 + 1;
                        paint7 = paint3;
                        i31 = 2;
                        i30 = 3;
                    }
                    paint = paint7;
                } else {
                    paint = paint7;
                    if (i27 == 3 && i29 > 0) {
                        int i37 = i12 + dp3;
                        float f33 = ((i23 / 3) * i29) + i37;
                        int i38 = i15 + dp3;
                        float f34 = i38;
                        float f35 = i38 + i24;
                        canvas.drawLine(f33, f34, f33, f35, paint);
                        canvas.drawLine(f33, f34, f33, f35, paint10);
                        float f36 = i37;
                        float f37 = ((i24 / 3) * i29) + i38;
                        float f38 = i37 + i23;
                        canvas.drawLine(f36, f37, f38, f37, paint);
                        paint2 = paint10;
                        canvas.drawLine(f36, f37, f38, f37, paint2);
                        i29++;
                        paint10 = paint2;
                        paint7 = paint;
                    }
                }
                paint2 = paint10;
                i29++;
                paint10 = paint2;
                paint7 = paint;
            }
            float f39 = i12;
            float f40 = i15;
            float f41 = i12 + i11;
            float f42 = i15 + dp3;
            canvas.drawRect(f39, f40, f41, f42, paint8);
            float f43 = i12 + dp3;
            float f44 = i15 + i11;
            canvas.drawRect(f39, f40, f43, f44, paint8);
            float f45 = i26 - i11;
            float f46 = i26;
            canvas.drawRect(f45, f40, f46, f42, paint8);
            float f47 = i26 - dp3;
            canvas.drawRect(f47, f40, f46, f44, paint8);
            float f48 = i28 - dp3;
            float f49 = i28;
            canvas.drawRect(f39, f48, f41, f49, paint8);
            float f50 = i28 - i11;
            canvas.drawRect(f39, f50, f43, f49, paint8);
            canvas.drawRect(f45, f48, f46, f49, paint8);
            canvas.drawRect(f47, f50, f46, f49, paint8);
            canvas.restore();
        } else {
            float f51 = f11 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f51;
            float measuredHeight = (((getMeasuredHeight() - this.D) - (!z4 ? AndroidUtilities.statusBarHeight : 0)) - this.E) - f51;
            this.a = (int) Math.min(measuredWidth, measuredHeight);
            Bitmap bitmap = this.d0;
            if (bitmap == null || bitmap.getWidth() != this.a) {
                Bitmap bitmap2 = this.d0;
                boolean z10 = bitmap2 != null;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.d0 = null;
                }
                try {
                    int i39 = this.a;
                    this.d0 = Bitmap.createBitmap(i39, i39, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.d0);
                    float f52 = this.a;
                    f10 = 2.0f;
                    try {
                        canvas2.drawRect(0.0f, 0.0f, f52, f52, paint9);
                        try {
                            int i40 = this.a;
                            canvas2.drawCircle(i40 / 2, i40 / 2, i40 / 2, this.e0);
                            canvas2.setBitmap(null);
                            if (!z10) {
                                this.I = 0.0f;
                                this.K = SystemClock.elapsedRealtime();
                            }
                        } catch (Throwable unused) {
                            if (this.d0 != null) {
                            }
                            if (this.I >= 1.0f) {
                            }
                        }
                    } catch (Throwable unused2) {
                        paint9 = paint9;
                    }
                } catch (Throwable unused3) {
                    f10 = 2.0f;
                }
            } else {
                f10 = 2.0f;
            }
            if (this.d0 != null) {
                paint4.setAlpha((int) (this.I * 255.0f));
                paint9.setAlpha((int) (this.I * 127.0f));
                float f53 = this.a;
                this.b = c.x(measuredWidth, f53, f10, f11);
                float x10 = c.x(measuredHeight, f53, f10, f11) + (!z4 ? AndroidUtilities.statusBarHeight : 0);
                this.c = x10;
                float f54 = x10 + f53;
                canvas.drawRect(0.0f, 0.0f, getWidth(), (int) this.c, paint9);
                float f55 = (int) f54;
                canvas.drawRect(0.0f, (int) this.c, (int) this.b, f55, paint9);
                canvas.drawRect((int) (r1 + f53), (int) this.c, getWidth(), f55, paint9);
                canvas.drawRect(0.0f, f55, getWidth(), getHeight(), paint9);
                canvas.drawBitmap(this.d0, (int) this.b, (int) this.c, paint4);
                if (getMeasuredHeight() > getMeasuredWidth() && this.g0 != null) {
                    canvas.save();
                    canvas.translate(getMeasuredWidth() / f10, f54 + AndroidUtilities.dp(16.0f));
                    this.g0.draw(canvas);
                    canvas.restore();
                }
            }
        }
        if (this.I >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.K;
            if (j10 > 17) {
                j10 = 17;
            }
            this.K = elapsedRealtime;
            float f56 = (j10 / 180.0f) + this.I;
            this.I = f56;
            if (f56 > 1.0f) {
                this.I = 1.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10 = this.S;
        RectF rectF = this.y;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y10 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float f11 = !this.U ? AndroidUtilities.statusBarHeight : 0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.b0 = false;
                h(false);
                if (this.o0 != 1) {
                    this.o0 = 1;
                    a aVar = this.a0;
                    if (aVar != null) {
                        n nVar = (n) aVar;
                        CropAreaView cropAreaView = nVar.a;
                        cropAreaView.g(1, true);
                        nVar.d(cropAreaView.getTargetRectToFill());
                    }
                }
                return false;
            }
            if (actionMasked == 2 && this.o0 != 1) {
                rectF.set(this.x);
                float f12 = x10 - this.B;
                float f13 = y10 - this.C;
                this.B = x10;
                this.C = y10;
                boolean z4 = Math.abs(f12) > Math.abs(f13);
                switch (j.b(this.o0)) {
                    case 1:
                        rectF.left += f12;
                        rectF.top += f13;
                        if (this.w > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z4) {
                                c(rectF, this.w);
                            } else {
                                b(rectF, this.w);
                            }
                            rectF.left -= rectF.width() - width;
                            rectF.top -= rectF.width() - height;
                            break;
                        }
                        break;
                    case 2:
                        rectF.right += f12;
                        rectF.top += f13;
                        if (this.w > 0.0f) {
                            float height2 = rectF.height();
                            if (z4) {
                                c(rectF, this.w);
                            } else {
                                b(rectF, this.w);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f12;
                        rectF.bottom += f13;
                        if (this.w > 0.0f) {
                            float width2 = rectF.width();
                            if (z4) {
                                c(rectF, this.w);
                            } else {
                                b(rectF, this.w);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f12;
                        rectF.bottom += f13;
                        float f14 = this.w;
                        if (f14 > 0.0f) {
                            if (!z4) {
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
                        float f15 = this.w;
                        if (f15 > 0.0f) {
                            b(rectF, f15);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f12;
                        float f16 = this.w;
                        if (f16 > 0.0f) {
                            c(rectF, f16);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f13;
                        float f17 = this.w;
                        if (f17 > 0.0f) {
                            b(rectF, f17);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f12;
                        float f18 = this.w;
                        if (f18 > 0.0f) {
                            c(rectF, f18);
                            break;
                        }
                        break;
                }
                if (rectF.left < f10) {
                    float f19 = this.w;
                    if (f19 > 0.0f) {
                        rectF.bottom = c.x(rectF.right, f10, f19, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.w > 0.0f) {
                        rectF.bottom = (rectF.width() / this.w) + rectF.top;
                    }
                }
                float f20 = f11 + this.E + f10;
                float f21 = this.D + f10;
                if (rectF.top < f20) {
                    float f22 = this.w;
                    if (f22 > 0.0f) {
                        rectF.right = c.w(rectF.bottom, f20, f22, rectF.left);
                    }
                    rectF.top = f20;
                } else if (rectF.bottom > getHeight() - f21) {
                    rectF.bottom = getHeight() - f21;
                    if (this.w > 0.0f) {
                        rectF.right = (rectF.height() * this.w) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f23 = this.T;
                if (width3 < f23) {
                    rectF.right = rectF.left + f23;
                }
                float height3 = rectF.height();
                float f24 = this.T;
                if (height3 < f24) {
                    rectF.bottom = rectF.top + f24;
                }
                float f25 = this.w;
                if (f25 > 0.0f) {
                    if (f25 < 1.0f) {
                        float width4 = rectF.width();
                        float f26 = this.T;
                        if (width4 <= f26) {
                            rectF.right = rectF.left + f26;
                            rectF.bottom = (rectF.width() / this.w) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f27 = this.T;
                        if (height4 <= f27) {
                            rectF.bottom = rectF.top + f27;
                            rectF.right = (rectF.height() * this.w) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.a0;
                if (aVar2 != null) {
                    n nVar2 = (n) aVar2;
                    CropAreaView cropAreaView2 = nVar2.a;
                    cropAreaView2.g(3, false);
                    RectF rectF2 = nVar2.f;
                    float centerX = rectF2.centerX() - cropAreaView2.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView2.getCropCenterY();
                    l lVar = nVar2.I;
                    if (lVar != null) {
                        l.f(lVar, centerX, centerY);
                    }
                    nVar2.r(false);
                    rectF2.set(cropAreaView2.x);
                    nVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        }
        if (!this.c0) {
            this.o0 = 1;
            return false;
        }
        float f28 = x10;
        float f29 = y10;
        if (this.d.contains(f28, f29)) {
            this.o0 = 2;
        } else if (this.e.contains(f28, f29)) {
            this.o0 = 3;
        } else if (this.f.contains(f28, f29)) {
            this.o0 = 4;
        } else if (this.h.contains(f28, f29)) {
            this.o0 = 5;
        } else if (this.r.contains(f28, f29)) {
            this.o0 = 7;
        } else if (this.n.contains(f28, f29)) {
            this.o0 = 6;
        } else if (this.v.contains(f28, f29)) {
            this.o0 = 9;
        } else {
            if (!this.s.contains(f28, f29)) {
                this.o0 = 1;
                return false;
            }
            this.o0 = 8;
        }
        this.B = x10;
        this.C = y10;
        g(3, false);
        this.b0 = true;
        h(true);
        a aVar3 = this.a0;
        if (aVar3 != null) {
            n nVar3 = (n) aVar3;
            nVar3.a.d(nVar3.f);
            nVar3.n = 0.0f;
            m mVar = nVar3.J;
            if (mVar != null) {
                mVar.b0(false);
                return true;
            }
        }
        return true;
    }

    public void setActualRect(float f10) {
        a(this.x, f10);
        j();
        invalidate();
    }

    public void setBottomPadding(float f10) {
        this.D = f10;
    }

    public void setDimAlpha(float f10) {
        this.H = f10;
    }

    public void setDimVisibility(boolean z4) {
        this.F = z4;
    }

    public void setFrameAlpha(float f10) {
        this.J = f10;
    }

    public void setFreeform(boolean z4) {
        this.c0 = z4;
    }

    public void setIsVideo(boolean z4) {
        this.T = AndroidUtilities.dp(z4 ? 64.0f : 32.0f);
    }

    public void setListener(a aVar) {
        this.a0 = aVar;
    }

    public void setLockedAspectRatio(float f10) {
        this.w = f10;
    }

    public void setSubtitle(String str) {
        this.f0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f10) {
        this.E = f10;
    }

    public void setActualRect(RectF rectF) {
        this.x.set(rectF);
        j();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
    }
}
