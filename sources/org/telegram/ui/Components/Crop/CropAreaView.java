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
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;
import wf.a;
import wf.l;
import wf.m;
import wf.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class CropAreaView extends ViewGroup {
    public int A;
    public int B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public long J;
    public Paint K;
    public Paint L;
    public Paint M;
    public Paint N;
    public Paint O;
    public Paint P;
    public AccelerateDecelerateInterpolator Q;
    public float R;
    public float S;
    public boolean T;
    public float U;
    public ObjectAnimator V;
    public a W;
    public int a;
    public boolean a0;
    public float b;
    public boolean b0;
    public float c;
    public Bitmap c0;
    public RectF d;
    public Paint d0;
    public RectF e;
    public String e0;
    public RectF f;
    public StaticLayout f0;
    public AnimatorSet g0;
    public RectF h;
    public RectF h0;
    public TextPaint i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public RectF n;
    public int n0;
    public int o0;
    public int p0;
    public RectF r;
    public RectF s;
    public RectF v;
    public float w;
    public RectF x;
    public RectF y;

    public static void b(RectF rectF, float f9) {
        float height = rectF.height();
        rectF.right = rectF.left + (f9 * height);
        rectF.bottom = rectF.top + height;
    }

    public static void c(RectF rectF, float f9) {
        float width = rectF.width();
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + (width / f9);
    }

    private float getGridProgress() {
        return this.U;
    }

    private void setCropBottom(float f9) {
        this.x.bottom = f9;
        invalidate();
    }

    private void setCropLeft(float f9) {
        this.x.left = f9;
        invalidate();
    }

    private void setCropRight(float f9) {
        this.x.right = f9;
        invalidate();
    }

    private void setCropTop(float f9) {
        this.x.top = f9;
        invalidate();
    }

    private void setGridProgress(float f9) {
        this.U = f9;
        invalidate();
    }

    public final void a(RectF rectF, float f9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = this.R;
        float f15 = !this.T ? AndroidUtilities.statusBarHeight : 0;
        float measuredHeight = ((getMeasuredHeight() - this.C) - this.D) - f15;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f16 = f14 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f16;
        float measuredWidth2 = getMeasuredWidth() - f16;
        float f17 = measuredHeight - f16;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f18 = (measuredHeight / 2.0f) + f15 + this.D;
        if (Math.abs(1.0f - f9) < 1.0E-4d) {
            float f19 = min / 2.0f;
            f13 = measuredWidth3 - f19;
            f12 = f18 - f19;
            f10 = measuredWidth3 + f19;
            f11 = f18 + f19;
        } else {
            if (f9 - measuredWidth <= 1.0E-4d) {
                float f20 = f17 * f9;
                if (f20 <= measuredWidth2) {
                    float f21 = f20 / 2.0f;
                    f13 = measuredWidth3 - f21;
                    float f22 = f17 / 2.0f;
                    float f23 = f18 - f22;
                    f10 = measuredWidth3 + f21;
                    f11 = f18 + f22;
                    f12 = f23;
                }
            }
            float f24 = measuredWidth2 / 2.0f;
            float f25 = measuredWidth3 - f24;
            float f26 = (measuredWidth2 / f9) / 2.0f;
            float f27 = f18 - f26;
            f10 = measuredWidth3 + f24;
            f11 = f18 + f26;
            f12 = f27;
            f13 = f25;
        }
        rectF.set(f13, f12, f10, f11);
    }

    public final void d(RectF rectF) {
        rectF.set(this.x);
    }

    public final void e(int i10, int i11, boolean z10, boolean z11) {
        this.b0 = z11;
        float f9 = z10 ? i11 / i10 : i10 / i11;
        if (!z11) {
            f9 = 1.0f;
            this.w = 1.0f;
        }
        setActualRect(f9);
    }

    public final void f(boolean z10, boolean z11) {
        this.F = z10;
        if (!z10) {
            this.H = 1.0f;
            return;
        }
        this.H = z11 ? 0.0f : 1.0f;
        this.J = SystemClock.elapsedRealtime();
        invalidate();
    }

    public final void g(int i10, boolean z10) {
        ObjectAnimator objectAnimator = this.V;
        if (objectAnimator != null && (!z10 || this.p0 != i10)) {
            objectAnimator.cancel();
            this.V = null;
        }
        int i11 = this.p0;
        if (i11 == i10) {
            return;
        }
        this.o0 = i11;
        this.p0 = i10;
        float f9 = i10 == 1 ? 0.0f : 1.0f;
        if (!z10) {
            this.U = f9;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.U, f9);
        this.V = ofFloat;
        ofFloat.setDuration(200L);
        this.V.addListener(new cc1(this, 13));
        if (i10 == 1) {
            this.V.setStartDelay(200L);
        }
        this.V.start();
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
        return this.Q;
    }

    public float getLockAspectRatio() {
        return this.w;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.h0;
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
        if (this.e0 == null) {
            this.f0 = null;
            return;
        }
        if (this.i0 == null) {
            TextPaint textPaint = new TextPaint();
            this.i0 = textPaint;
            textPaint.setColor(i0.a.k(-1, 120));
            this.i0.setTextSize(AndroidUtilities.dp(13.0f));
            this.i0.setTextAlign(Paint.Align.CENTER);
        }
        this.f0 = new StaticLayout(this.e0, this.i0, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void j() {
        int dp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.x;
        float f9 = rectF2.left;
        float f10 = dp;
        float f11 = rectF2.top;
        rectF.set(f9 - f10, f11 - f10, f9 + f10, f11 + f10);
        RectF rectF3 = this.e;
        float f12 = rectF2.right;
        float f13 = rectF2.top;
        rectF3.set(f12 - f10, f13 - f10, f12 + f10, f13 + f10);
        RectF rectF4 = this.f;
        float f14 = rectF2.left;
        float f15 = rectF2.bottom;
        rectF4.set(f14 - f10, f15 - f10, f14 + f10, f15 + f10);
        RectF rectF5 = this.h;
        float f16 = rectF2.right;
        float f17 = rectF2.bottom;
        rectF5.set(f16 - f10, f17 - f10, f16 + f10, f17 + f10);
        RectF rectF6 = this.n;
        float f18 = rectF2.left + f10;
        float f19 = rectF2.top;
        rectF6.set(f18, f19 - f10, rectF2.right - f10, f19 + f10);
        RectF rectF7 = this.r;
        float f20 = rectF2.left;
        rectF7.set(f20 - f10, rectF2.top + f10, f20 + f10, rectF2.bottom - f10);
        RectF rectF8 = this.v;
        float f21 = rectF2.right;
        rectF8.set(f21 - f10, rectF2.top + f10, f21 + f10, rectF2.bottom - f10);
        RectF rectF9 = this.s;
        float f22 = rectF2.left + f10;
        float f23 = rectF2.bottom;
        rectF9.set(f22, f23 - f10, rectF2.right - f10, f23 + f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f9;
        int i10;
        int i11;
        int i12;
        Paint paint;
        Paint paint2;
        int i13;
        Paint paint3;
        Paint paint4 = this.P;
        boolean z10 = this.T;
        float f10 = this.R;
        Paint paint5 = this.O;
        Paint paint6 = this.M;
        Paint paint7 = this.L;
        Paint paint8 = this.N;
        Paint paint9 = this.K;
        if (this.b0) {
            int dp = AndroidUtilities.dp(2.0f / this.k0);
            int dp2 = AndroidUtilities.dp(16.0f / this.k0);
            int dp3 = AndroidUtilities.dp(3.0f / this.k0);
            RectF rectF = this.x;
            float f11 = rectF.left;
            int i14 = ((int) f11) - dp;
            float f12 = rectF.top;
            int i15 = ((int) f12) - dp;
            int i16 = dp * 2;
            int i17 = ((int) (rectF.right - f11)) + i16;
            int i18 = i16 + ((int) (rectF.bottom - f12));
            canvas.save();
            canvas.translate(this.l0, this.m0);
            float f13 = this.k0;
            float f14 = (i17 / 2) + i14;
            float f15 = (i18 / 2) + i15;
            canvas.scale(f13, f13, f14, f15);
            canvas.rotate(this.j0, f14, f15);
            if (this.E) {
                int i19 = (-getWidth()) * 4;
                int i20 = (-getHeight()) * 4;
                int width = getWidth() * 4;
                int height = getHeight() * 4;
                float f16 = this.G;
                if (f16 >= 0.0f) {
                    paint9.setAlpha((int) (f16 * 255.0f));
                } else {
                    paint9.setAlpha((int) (255.0f - (this.H * 127.0f)));
                }
                float f17 = i19;
                float f18 = width;
                i10 = dp;
                i11 = dp2;
                i12 = i14;
                canvas.drawRect(f17, i20, f18, 0.0f, paint9);
                canvas.drawRect(f17, 0.0f, 0.0f, getHeight(), paint9);
                canvas.drawRect(getWidth(), 0.0f, f18, getHeight(), paint9);
                canvas.drawRect(f17, getHeight(), f18, height, paint9);
                float f19 = i15 + i10;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f19, paint9);
                float f20 = (i15 + i18) - i10;
                canvas.drawRect(0.0f, f19, i12 + i10, f20, paint9);
                canvas.drawRect((i12 + i17) - i10, f19, getWidth(), f20, paint9);
                canvas.drawRect(0.0f, f20, getWidth(), getHeight(), paint9);
            } else {
                i10 = dp;
                i11 = dp2;
                i12 = i14;
            }
            if (!this.F) {
                return;
            }
            int i21 = dp3 - i10;
            int i22 = dp3 * 2;
            int i23 = i17 - i22;
            int i24 = i18 - i22;
            int i25 = this.p0;
            if (i25 == 1 && this.U > 0.0f) {
                i25 = this.o0;
            }
            float f21 = this.I;
            if (f21 >= 0.0f) {
                paint7.setAlpha((int) (this.U * 26.0f * f21));
                paint6.setAlpha((int) (this.U * 178.0f * this.I));
                paint5.setAlpha((int) (this.I * 178.0f));
                paint8.setAlpha((int) (this.I * 255.0f));
            } else {
                paint7.setAlpha((int) (this.U * 26.0f * this.H));
                paint6.setAlpha((int) (this.U * 178.0f * this.H));
                paint5.setAlpha((int) (this.H * 178.0f));
                paint8.setAlpha((int) (this.H * 255.0f));
            }
            float f22 = i12 + i21;
            float f23 = i15 + i21;
            int i26 = i12 + i17;
            float f24 = i26 - i21;
            int i27 = i25;
            Paint paint10 = paint6;
            canvas.drawRect(f22, f23, f24, r4 + i10, paint5);
            int i28 = i18 + i15;
            float f25 = i28 - i21;
            canvas.drawRect(f22, f23, r3 + i10, f25, paint5);
            canvas.drawRect(f22, r12 - i10, f24, f25, paint5);
            canvas.drawRect(r14 - i10, f23, f24, f25, paint5);
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
                            float f26 = (i34 * i29) + ((i34 / 3) * i32) + i33;
                            int i35 = i15 + dp3;
                            float f27 = i35;
                            float f28 = i35 + i24;
                            Paint paint11 = paint7;
                            i13 = i32;
                            canvas.drawLine(f26, f27, f26, f28, paint11);
                            paint3 = paint11;
                            canvas.drawLine(f26, f27, f26, f28, paint10);
                            int i36 = i24 / 3;
                            float f29 = i33;
                            float f30 = (i36 * i29) + ((i36 / 3) * i13) + i35;
                            float f31 = i33 + i23;
                            canvas.drawLine(f29, f30, f31, f30, paint3);
                            canvas.drawLine(f29, f30, f31, f30, paint10);
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
                        float f32 = ((i23 / 3) * i29) + i37;
                        int i38 = i15 + dp3;
                        float f33 = i38;
                        float f34 = i38 + i24;
                        canvas.drawLine(f32, f33, f32, f34, paint);
                        canvas.drawLine(f32, f33, f32, f34, paint10);
                        float f35 = i37;
                        float f36 = ((i24 / 3) * i29) + i38;
                        float f37 = i37 + i23;
                        canvas.drawLine(f35, f36, f37, f36, paint);
                        paint2 = paint10;
                        canvas.drawLine(f35, f36, f37, f36, paint2);
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
            float f38 = i12;
            float f39 = i15;
            float f40 = i12 + i11;
            float f41 = i15 + dp3;
            canvas.drawRect(f38, f39, f40, f41, paint8);
            float f42 = i12 + dp3;
            float f43 = i15 + i11;
            canvas.drawRect(f38, f39, f42, f43, paint8);
            float f44 = i26 - i11;
            float f45 = i26;
            canvas.drawRect(f44, f39, f45, f41, paint8);
            float f46 = i26 - dp3;
            canvas.drawRect(f46, f39, f45, f43, paint8);
            float f47 = i28 - dp3;
            float f48 = i28;
            canvas.drawRect(f38, f47, f40, f48, paint8);
            float f49 = i28 - i11;
            canvas.drawRect(f38, f49, f42, f48, paint8);
            canvas.drawRect(f44, f47, f45, f48, paint8);
            canvas.drawRect(f46, f49, f45, f48, paint8);
            canvas.restore();
        } else {
            float f50 = f10 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f50;
            float measuredHeight = (((getMeasuredHeight() - this.C) - (!z10 ? AndroidUtilities.statusBarHeight : 0)) - this.D) - f50;
            this.a = (int) Math.min(measuredWidth, measuredHeight);
            Bitmap bitmap = this.c0;
            if (bitmap == null || bitmap.getWidth() != this.a) {
                Bitmap bitmap2 = this.c0;
                boolean z11 = bitmap2 != null;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.c0 = null;
                }
                try {
                    int i39 = this.a;
                    this.c0 = Bitmap.createBitmap(i39, i39, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.c0);
                    float f51 = this.a;
                    f9 = 2.0f;
                    try {
                        canvas2.drawRect(0.0f, 0.0f, f51, f51, paint9);
                        try {
                            int i40 = this.a;
                            canvas2.drawCircle(i40 / 2, i40 / 2, i40 / 2, this.d0);
                            canvas2.setBitmap(null);
                            if (!z11) {
                                this.H = 0.0f;
                                this.J = SystemClock.elapsedRealtime();
                            }
                        } catch (Throwable unused) {
                            if (this.c0 != null) {
                            }
                            if (this.H >= 1.0f) {
                            }
                        }
                    } catch (Throwable unused2) {
                        paint9 = paint9;
                    }
                } catch (Throwable unused3) {
                    f9 = 2.0f;
                }
            } else {
                f9 = 2.0f;
            }
            if (this.c0 != null) {
                paint4.setAlpha((int) (this.H * 255.0f));
                paint9.setAlpha((int) (this.H * 127.0f));
                float f52 = this.a;
                this.b = com.google.android.recaptcha.internal.a.A(measuredWidth, f52, f9, f10);
                float A = com.google.android.recaptcha.internal.a.A(measuredHeight, f52, f9, f10) + (!z10 ? AndroidUtilities.statusBarHeight : 0);
                this.c = A;
                float f53 = A + f52;
                canvas.drawRect(0.0f, 0.0f, getWidth(), (int) this.c, paint9);
                float f54 = (int) f53;
                canvas.drawRect(0.0f, (int) this.c, (int) this.b, f54, paint9);
                canvas.drawRect((int) (r1 + f52), (int) this.c, getWidth(), f54, paint9);
                canvas.drawRect(0.0f, f54, getWidth(), getHeight(), paint9);
                canvas.drawBitmap(this.c0, (int) this.b, (int) this.c, paint4);
                if (getMeasuredHeight() > getMeasuredWidth() && this.f0 != null) {
                    canvas.save();
                    canvas.translate(getMeasuredWidth() / f9, f53 + AndroidUtilities.dp(16.0f));
                    this.f0.draw(canvas);
                    canvas.restore();
                }
            }
        }
        if (this.H >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.J;
            if (j10 > 17) {
                j10 = 17;
            }
            this.J = elapsedRealtime;
            float f55 = (j10 / 180.0f) + this.H;
            this.H = f55;
            if (f55 > 1.0f) {
                this.H = 1.0f;
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a0) {
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
        float f9 = this.R;
        RectF rectF = this.y;
        int x4 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y8 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float f10 = !this.T ? AndroidUtilities.statusBarHeight : 0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.a0 = false;
                h(false);
                if (this.n0 != 1) {
                    this.n0 = 1;
                    a aVar = this.W;
                    if (aVar != null) {
                        n nVar = (n) aVar;
                        CropAreaView cropAreaView = nVar.a;
                        cropAreaView.g(1, true);
                        nVar.d(cropAreaView.getTargetRectToFill());
                    }
                }
                return false;
            }
            if (actionMasked == 2 && this.n0 != 1) {
                rectF.set(this.x);
                float f11 = x4 - this.A;
                float f12 = y8 - this.B;
                this.A = x4;
                this.B = y8;
                boolean z10 = Math.abs(f11) > Math.abs(f12);
                switch (j.b(this.n0)) {
                    case 1:
                        rectF.left += f11;
                        rectF.top += f12;
                        if (this.w > 0.0f) {
                            float width = rectF.width();
                            float height = rectF.height();
                            if (z10) {
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
                        rectF.right += f11;
                        rectF.top += f12;
                        if (this.w > 0.0f) {
                            float height2 = rectF.height();
                            if (z10) {
                                c(rectF, this.w);
                            } else {
                                b(rectF, this.w);
                            }
                            rectF.top -= rectF.width() - height2;
                            break;
                        }
                        break;
                    case 3:
                        rectF.left += f11;
                        rectF.bottom += f12;
                        if (this.w > 0.0f) {
                            float width2 = rectF.width();
                            if (z10) {
                                c(rectF, this.w);
                            } else {
                                b(rectF, this.w);
                            }
                            rectF.left -= rectF.width() - width2;
                            break;
                        }
                        break;
                    case 4:
                        rectF.right += f11;
                        rectF.bottom += f12;
                        float f13 = this.w;
                        if (f13 > 0.0f) {
                            if (!z10) {
                                b(rectF, f13);
                                break;
                            } else {
                                c(rectF, f13);
                                break;
                            }
                        }
                        break;
                    case 5:
                        rectF.top += f12;
                        float f14 = this.w;
                        if (f14 > 0.0f) {
                            b(rectF, f14);
                            break;
                        }
                        break;
                    case 6:
                        rectF.left += f11;
                        float f15 = this.w;
                        if (f15 > 0.0f) {
                            c(rectF, f15);
                            break;
                        }
                        break;
                    case 7:
                        rectF.bottom += f12;
                        float f16 = this.w;
                        if (f16 > 0.0f) {
                            b(rectF, f16);
                            break;
                        }
                        break;
                    case 8:
                        rectF.right += f11;
                        float f17 = this.w;
                        if (f17 > 0.0f) {
                            c(rectF, f17);
                            break;
                        }
                        break;
                }
                if (rectF.left < f9) {
                    float f18 = this.w;
                    if (f18 > 0.0f) {
                        rectF.bottom = com.google.android.recaptcha.internal.a.A(rectF.right, f9, f18, rectF.top);
                    }
                    rectF.left = f9;
                } else if (rectF.right > getWidth() - f9) {
                    rectF.right = getWidth() - f9;
                    if (this.w > 0.0f) {
                        rectF.bottom = (rectF.width() / this.w) + rectF.top;
                    }
                }
                float f19 = f10 + this.D + f9;
                float f20 = this.C + f9;
                if (rectF.top < f19) {
                    float f21 = this.w;
                    if (f21 > 0.0f) {
                        rectF.right = com.google.android.recaptcha.internal.a.z(rectF.bottom, f19, f21, rectF.left);
                    }
                    rectF.top = f19;
                } else if (rectF.bottom > getHeight() - f20) {
                    rectF.bottom = getHeight() - f20;
                    if (this.w > 0.0f) {
                        rectF.right = (rectF.height() * this.w) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f22 = this.S;
                if (width3 < f22) {
                    rectF.right = rectF.left + f22;
                }
                float height3 = rectF.height();
                float f23 = this.S;
                if (height3 < f23) {
                    rectF.bottom = rectF.top + f23;
                }
                float f24 = this.w;
                if (f24 > 0.0f) {
                    if (f24 < 1.0f) {
                        float width4 = rectF.width();
                        float f25 = this.S;
                        if (width4 <= f25) {
                            rectF.right = rectF.left + f25;
                            rectF.bottom = (rectF.width() / this.w) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f26 = this.S;
                        if (height4 <= f26) {
                            rectF.bottom = rectF.top + f26;
                            rectF.right = (rectF.height() * this.w) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.W;
                if (aVar2 != null) {
                    n nVar2 = (n) aVar2;
                    CropAreaView cropAreaView2 = nVar2.a;
                    cropAreaView2.g(3, false);
                    RectF rectF2 = nVar2.f;
                    float centerX = rectF2.centerX() - cropAreaView2.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView2.getCropCenterY();
                    l lVar = nVar2.H;
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
        if (!this.b0) {
            this.n0 = 1;
            return false;
        }
        float f27 = x4;
        float f28 = y8;
        if (this.d.contains(f27, f28)) {
            this.n0 = 2;
        } else if (this.e.contains(f27, f28)) {
            this.n0 = 3;
        } else if (this.f.contains(f27, f28)) {
            this.n0 = 4;
        } else if (this.h.contains(f27, f28)) {
            this.n0 = 5;
        } else if (this.r.contains(f27, f28)) {
            this.n0 = 7;
        } else if (this.n.contains(f27, f28)) {
            this.n0 = 6;
        } else if (this.v.contains(f27, f28)) {
            this.n0 = 9;
        } else {
            if (!this.s.contains(f27, f28)) {
                this.n0 = 1;
                return false;
            }
            this.n0 = 8;
        }
        this.A = x4;
        this.B = y8;
        g(3, false);
        this.a0 = true;
        h(true);
        a aVar3 = this.W;
        if (aVar3 != null) {
            n nVar3 = (n) aVar3;
            nVar3.a.d(nVar3.f);
            nVar3.n = 0.0f;
            m mVar = nVar3.I;
            if (mVar != null) {
                mVar.P(false);
                return true;
            }
        }
        return true;
    }

    public void setActualRect(float f9) {
        a(this.x, f9);
        j();
        invalidate();
    }

    public void setBottomPadding(float f9) {
        this.C = f9;
    }

    public void setDimAlpha(float f9) {
        this.G = f9;
    }

    public void setDimVisibility(boolean z10) {
        this.E = z10;
    }

    public void setFrameAlpha(float f9) {
        this.I = f9;
    }

    public void setFreeform(boolean z10) {
        this.b0 = z10;
    }

    public void setIsVideo(boolean z10) {
        this.S = AndroidUtilities.dp(z10 ? 64.0f : 32.0f);
    }

    public void setListener(a aVar) {
        this.W = aVar;
    }

    public void setLockedAspectRatio(float f9) {
        this.w = f9;
    }

    public void setSubtitle(String str) {
        this.e0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f9) {
        this.D = f9;
    }

    public void setActualRect(RectF rectF) {
        this.x.set(rectF);
        j();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
