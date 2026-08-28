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
import org.telegram.ui.te1;
import tf.a;
import tf.l;
import tf.m;
import tf.n;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        return this.U;
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
        this.U = f10;
        invalidate();
    }

    public final void a(RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.R;
        float f16 = !this.T ? AndroidUtilities.statusBarHeight : 0;
        float measuredHeight = ((getMeasuredHeight() - this.C) - this.D) - f16;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f17 = f15 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f17;
        float measuredWidth2 = getMeasuredWidth() - f17;
        float f18 = measuredHeight - f17;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f19 = (measuredHeight / 2.0f) + f16 + this.D;
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

    public final void e(int i9, int i10, boolean z10, boolean z11) {
        this.b0 = z11;
        float f10 = z10 ? i10 / i9 : i9 / i10;
        if (!z11) {
            f10 = 1.0f;
            this.w = 1.0f;
        }
        setActualRect(f10);
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

    public final void g(int i9, boolean z10) {
        ObjectAnimator objectAnimator = this.V;
        if (objectAnimator != null && (!z10 || this.p0 != i9)) {
            objectAnimator.cancel();
            this.V = null;
        }
        int i10 = this.p0;
        if (i10 == i9) {
            return;
        }
        this.o0 = i10;
        this.p0 = i9;
        float f10 = i9 == 1 ? 0.0f : 1.0f;
        if (!z10) {
            this.U = f10;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.U, f10);
        this.V = ofFloat;
        ofFloat.setDuration(200L);
        this.V.addListener(new te1(this, 8));
        if (i9 == 1) {
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
        int i9;
        int i10;
        int i11;
        Paint paint;
        Paint paint2;
        int i12;
        Paint paint3;
        Paint paint4 = this.P;
        boolean z10 = this.T;
        float f11 = this.R;
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
            float f12 = rectF.left;
            int i13 = ((int) f12) - dp;
            float f13 = rectF.top;
            int i14 = ((int) f13) - dp;
            int i15 = dp * 2;
            int i16 = ((int) (rectF.right - f12)) + i15;
            int i17 = i15 + ((int) (rectF.bottom - f13));
            canvas.save();
            canvas.translate(this.l0, this.m0);
            float f14 = this.k0;
            float f15 = (i16 / 2) + i13;
            float f16 = (i17 / 2) + i14;
            canvas.scale(f14, f14, f15, f16);
            canvas.rotate(this.j0, f15, f16);
            if (this.E) {
                int i18 = (-getWidth()) * 4;
                int i19 = (-getHeight()) * 4;
                int width = getWidth() * 4;
                int height = getHeight() * 4;
                float f17 = this.G;
                if (f17 >= 0.0f) {
                    paint9.setAlpha((int) (f17 * 255.0f));
                } else {
                    paint9.setAlpha((int) (255.0f - (this.H * 127.0f)));
                }
                float f18 = i18;
                float f19 = width;
                i9 = dp;
                i10 = dp2;
                i11 = i13;
                canvas.drawRect(f18, i19, f19, 0.0f, paint9);
                canvas.drawRect(f18, 0.0f, 0.0f, getHeight(), paint9);
                canvas.drawRect(getWidth(), 0.0f, f19, getHeight(), paint9);
                canvas.drawRect(f18, getHeight(), f19, height, paint9);
                float f20 = i14 + i9;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f20, paint9);
                float f21 = (i14 + i17) - i9;
                canvas.drawRect(0.0f, f20, i11 + i9, f21, paint9);
                canvas.drawRect((i11 + i16) - i9, f20, getWidth(), f21, paint9);
                canvas.drawRect(0.0f, f21, getWidth(), getHeight(), paint9);
            } else {
                i9 = dp;
                i10 = dp2;
                i11 = i13;
            }
            if (!this.F) {
                return;
            }
            int i20 = dp3 - i9;
            int i21 = dp3 * 2;
            int i22 = i16 - i21;
            int i23 = i17 - i21;
            int i24 = this.p0;
            if (i24 == 1 && this.U > 0.0f) {
                i24 = this.o0;
            }
            float f22 = this.I;
            if (f22 >= 0.0f) {
                paint7.setAlpha((int) (this.U * 26.0f * f22));
                paint6.setAlpha((int) (this.U * 178.0f * this.I));
                paint5.setAlpha((int) (this.I * 178.0f));
                paint8.setAlpha((int) (this.I * 255.0f));
            } else {
                paint7.setAlpha((int) (this.U * 26.0f * this.H));
                paint6.setAlpha((int) (this.U * 178.0f * this.H));
                paint5.setAlpha((int) (this.H * 178.0f));
                paint8.setAlpha((int) (this.H * 255.0f));
            }
            float f23 = i11 + i20;
            float f24 = i14 + i20;
            int i25 = i11 + i16;
            float f25 = i25 - i20;
            int i26 = i24;
            Paint paint10 = paint6;
            canvas.drawRect(f23, f24, f25, r4 + i9, paint5);
            int i27 = i17 + i14;
            float f26 = i27 - i20;
            canvas.drawRect(f23, f24, r3 + i9, f26, paint5);
            canvas.drawRect(f23, r12 - i9, f25, f26, paint5);
            canvas.drawRect(r14 - i9, f24, f25, f26, paint5);
            int i28 = 0;
            while (true) {
                int i29 = 3;
                if (i28 >= 3) {
                    break;
                }
                int i30 = 2;
                if (i26 == 2) {
                    int i31 = 1;
                    while (i31 < 4) {
                        if (i28 == i30 && i31 == i29) {
                            paint3 = paint7;
                            i12 = i31;
                        } else {
                            int i32 = i11 + dp3;
                            int i33 = i22 / 3;
                            float f27 = (i33 * i28) + ((i33 / 3) * i31) + i32;
                            int i34 = i14 + dp3;
                            float f28 = i34;
                            float f29 = i34 + i23;
                            Paint paint11 = paint7;
                            i12 = i31;
                            canvas.drawLine(f27, f28, f27, f29, paint11);
                            paint3 = paint11;
                            canvas.drawLine(f27, f28, f27, f29, paint10);
                            int i35 = i23 / 3;
                            float f30 = i32;
                            float f31 = (i35 * i28) + ((i35 / 3) * i12) + i34;
                            float f32 = i32 + i22;
                            canvas.drawLine(f30, f31, f32, f31, paint3);
                            canvas.drawLine(f30, f31, f32, f31, paint10);
                        }
                        i31 = i12 + 1;
                        paint7 = paint3;
                        i30 = 2;
                        i29 = 3;
                    }
                    paint = paint7;
                } else {
                    paint = paint7;
                    if (i26 == 3 && i28 > 0) {
                        int i36 = i11 + dp3;
                        float f33 = ((i22 / 3) * i28) + i36;
                        int i37 = i14 + dp3;
                        float f34 = i37;
                        float f35 = i37 + i23;
                        canvas.drawLine(f33, f34, f33, f35, paint);
                        canvas.drawLine(f33, f34, f33, f35, paint10);
                        float f36 = i36;
                        float f37 = ((i23 / 3) * i28) + i37;
                        float f38 = i36 + i22;
                        canvas.drawLine(f36, f37, f38, f37, paint);
                        paint2 = paint10;
                        canvas.drawLine(f36, f37, f38, f37, paint2);
                        i28++;
                        paint10 = paint2;
                        paint7 = paint;
                    }
                }
                paint2 = paint10;
                i28++;
                paint10 = paint2;
                paint7 = paint;
            }
            float f39 = i11;
            float f40 = i14;
            float f41 = i11 + i10;
            float f42 = i14 + dp3;
            canvas.drawRect(f39, f40, f41, f42, paint8);
            float f43 = i11 + dp3;
            float f44 = i14 + i10;
            canvas.drawRect(f39, f40, f43, f44, paint8);
            float f45 = i25 - i10;
            float f46 = i25;
            canvas.drawRect(f45, f40, f46, f42, paint8);
            float f47 = i25 - dp3;
            canvas.drawRect(f47, f40, f46, f44, paint8);
            float f48 = i27 - dp3;
            float f49 = i27;
            canvas.drawRect(f39, f48, f41, f49, paint8);
            float f50 = i27 - i10;
            canvas.drawRect(f39, f50, f43, f49, paint8);
            canvas.drawRect(f45, f48, f46, f49, paint8);
            canvas.drawRect(f47, f50, f46, f49, paint8);
            canvas.restore();
        } else {
            float f51 = f11 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f51;
            float measuredHeight = (((getMeasuredHeight() - this.C) - (!z10 ? AndroidUtilities.statusBarHeight : 0)) - this.D) - f51;
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
                    int i38 = this.a;
                    this.c0 = Bitmap.createBitmap(i38, i38, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.c0);
                    float f52 = this.a;
                    f10 = 2.0f;
                    try {
                        canvas2.drawRect(0.0f, 0.0f, f52, f52, paint9);
                        try {
                            int i39 = this.a;
                            canvas2.drawCircle(i39 / 2, i39 / 2, i39 / 2, this.d0);
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
                    f10 = 2.0f;
                }
            } else {
                f10 = 2.0f;
            }
            if (this.c0 != null) {
                paint4.setAlpha((int) (this.H * 255.0f));
                paint9.setAlpha((int) (this.H * 127.0f));
                float f53 = this.a;
                this.b = c.A(measuredWidth, f53, f10, f11);
                float A = c.A(measuredHeight, f53, f10, f11) + (!z10 ? AndroidUtilities.statusBarHeight : 0);
                this.c = A;
                float f54 = A + f53;
                canvas.drawRect(0.0f, 0.0f, getWidth(), (int) this.c, paint9);
                float f55 = (int) f54;
                canvas.drawRect(0.0f, (int) this.c, (int) this.b, f55, paint9);
                canvas.drawRect((int) (r1 + f53), (int) this.c, getWidth(), f55, paint9);
                canvas.drawRect(0.0f, f55, getWidth(), getHeight(), paint9);
                canvas.drawBitmap(this.c0, (int) this.b, (int) this.c, paint4);
                if (getMeasuredHeight() > getMeasuredWidth() && this.f0 != null) {
                    canvas.save();
                    canvas.translate(getMeasuredWidth() / f10, f54 + AndroidUtilities.dp(16.0f));
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
            float f56 = (j10 / 180.0f) + this.H;
            this.H = f56;
            if (f56 > 1.0f) {
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        i();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10 = this.R;
        RectF rectF = this.y;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y10 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float f11 = !this.T ? AndroidUtilities.statusBarHeight : 0;
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
                float f12 = x10 - this.A;
                float f13 = y10 - this.B;
                this.A = x10;
                this.B = y10;
                boolean z10 = Math.abs(f12) > Math.abs(f13);
                switch (j.b(this.n0)) {
                    case 1:
                        rectF.left += f12;
                        rectF.top += f13;
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
                        rectF.right += f12;
                        rectF.top += f13;
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
                        rectF.left += f12;
                        rectF.bottom += f13;
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
                        rectF.right += f12;
                        rectF.bottom += f13;
                        float f14 = this.w;
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
                        rectF.bottom = c.A(rectF.right, f10, f19, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.w > 0.0f) {
                        rectF.bottom = (rectF.width() / this.w) + rectF.top;
                    }
                }
                float f20 = f11 + this.D + f10;
                float f21 = this.C + f10;
                if (rectF.top < f20) {
                    float f22 = this.w;
                    if (f22 > 0.0f) {
                        rectF.right = c.z(rectF.bottom, f20, f22, rectF.left);
                    }
                    rectF.top = f20;
                } else if (rectF.bottom > getHeight() - f21) {
                    rectF.bottom = getHeight() - f21;
                    if (this.w > 0.0f) {
                        rectF.right = (rectF.height() * this.w) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f23 = this.S;
                if (width3 < f23) {
                    rectF.right = rectF.left + f23;
                }
                float height3 = rectF.height();
                float f24 = this.S;
                if (height3 < f24) {
                    rectF.bottom = rectF.top + f24;
                }
                float f25 = this.w;
                if (f25 > 0.0f) {
                    if (f25 < 1.0f) {
                        float width4 = rectF.width();
                        float f26 = this.S;
                        if (width4 <= f26) {
                            rectF.right = rectF.left + f26;
                            rectF.bottom = (rectF.width() / this.w) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f27 = this.S;
                        if (height4 <= f27) {
                            rectF.bottom = rectF.top + f27;
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
        float f28 = x10;
        float f29 = y10;
        if (this.d.contains(f28, f29)) {
            this.n0 = 2;
        } else if (this.e.contains(f28, f29)) {
            this.n0 = 3;
        } else if (this.f.contains(f28, f29)) {
            this.n0 = 4;
        } else if (this.h.contains(f28, f29)) {
            this.n0 = 5;
        } else if (this.r.contains(f28, f29)) {
            this.n0 = 7;
        } else if (this.n.contains(f28, f29)) {
            this.n0 = 6;
        } else if (this.v.contains(f28, f29)) {
            this.n0 = 9;
        } else {
            if (!this.s.contains(f28, f29)) {
                this.n0 = 1;
                return false;
            }
            this.n0 = 8;
        }
        this.A = x10;
        this.B = y10;
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
                mVar.C(false);
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
        this.C = f10;
    }

    public void setDimAlpha(float f10) {
        this.G = f10;
    }

    public void setDimVisibility(boolean z10) {
        this.E = z10;
    }

    public void setFrameAlpha(float f10) {
        this.I = f10;
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

    public void setLockedAspectRatio(float f10) {
        this.w = f10;
    }

    public void setSubtitle(String str) {
        this.e0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f10) {
        this.D = f10;
    }

    public void setActualRect(RectF rectF) {
        this.x.set(rectF);
        j();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
    }
}
