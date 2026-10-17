package org.telegram.ui.Components.Crop;

import a1.g;
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
import com.google.android.gms.internal.cast.a6;
import i0.b;
import m1.j;
import mg.a;
import mg.n;
import mg.o;
import mg.p;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public class CropAreaView extends ViewGroup {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public float K;
    public float L;
    public float M;
    public long N;
    public Paint O;
    public Paint P;
    public Paint Q;
    public Paint R;
    public Paint S;
    public Paint T;
    public AccelerateDecelerateInterpolator U;
    public float V;
    public float W;
    public int a;
    public boolean a0;
    public float b;
    public float b0;
    public float c;
    public ObjectAnimator c0;
    public RectF d;
    public a d0;
    public RectF e;
    public boolean e0;
    public RectF f;
    public boolean f0;
    public Bitmap g0;
    public RectF h;
    public Paint h0;
    public String i0;
    public StaticLayout j0;
    public AnimatorSet k0;
    public RectF l0;
    public TextPaint m0;
    public RectF n;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public RectF r;
    public int r0;
    public RectF s;
    public int s0;
    public int t0;
    public RectF v;
    public float w;
    public RectF x;
    public RectF y;

    public static void b(RectF rectF, float f7) {
        float height = rectF.height();
        rectF.right = rectF.left + (f7 * height);
        rectF.bottom = rectF.top + height;
    }

    public static void c(RectF rectF, float f7) {
        float width = rectF.width();
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + (width / f7);
    }

    private float getGridProgress() {
        return this.b0;
    }

    private void setCropBottom(float f7) {
        this.x.bottom = f7;
        invalidate();
    }

    private void setCropLeft(float f7) {
        this.x.left = f7;
        invalidate();
    }

    private void setCropRight(float f7) {
        this.x.right = f7;
        invalidate();
    }

    private void setCropTop(float f7) {
        this.x.top = f7;
        invalidate();
    }

    private void setGridProgress(float f7) {
        this.b0 = f7;
        invalidate();
    }

    public final void a(RectF rectF, float f7) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = this.V;
        float f15 = !this.a0 ? AndroidUtilities.statusBarHeight : 0;
        float measuredHeight = ((getMeasuredHeight() - this.G) - this.H) - f15;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f16 = f14 * 2.0f;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - f16;
        float measuredWidth2 = getMeasuredWidth() - f16;
        float f17 = measuredHeight - f16;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f18 = (measuredHeight / 2.0f) + f15 + this.H;
        if (Math.abs(1.0f - f7) < 1.0E-4d) {
            float f19 = min / 2.0f;
            f13 = measuredWidth3 - f19;
            f12 = f18 - f19;
            f10 = measuredWidth3 + f19;
            f11 = f18 + f19;
        } else {
            if (f7 - measuredWidth <= 1.0E-4d) {
                float f20 = f17 * f7;
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
            float f26 = (measuredWidth2 / f7) / 2.0f;
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
        this.f0 = z11;
        float f7 = z10 ? i11 / i10 : i10 / i11;
        if (!z11) {
            f7 = 1.0f;
            this.w = 1.0f;
        }
        setActualRect(f7);
    }

    public final void f(boolean z10, boolean z11) {
        this.J = z10;
        if (!z10) {
            this.L = 1.0f;
            return;
        }
        this.L = z11 ? 0.0f : 1.0f;
        this.N = SystemClock.elapsedRealtime();
        invalidate();
    }

    public final void g(int i10, boolean z10) {
        ObjectAnimator objectAnimator = this.c0;
        if (objectAnimator != null && (!z10 || this.t0 != i10)) {
            objectAnimator.cancel();
            this.c0 = null;
        }
        int i11 = this.t0;
        if (i11 == i10) {
            return;
        }
        this.s0 = i11;
        this.t0 = i10;
        int i12 = 1;
        float f7 = i10 == 1 ? 0.0f : 1.0f;
        if (!z10) {
            this.b0 = f7;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.b0, f7);
        this.c0 = ofFloat;
        ofFloat.setDuration(200L);
        this.c0.addListener(new m.a(this, i12));
        if (i10 == 1) {
            this.c0.setStartDelay(200L);
        }
        this.c0.start();
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
        return this.U;
    }

    public float getLockAspectRatio() {
        return this.w;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.l0;
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
        if (this.i0 == null) {
            this.j0 = null;
            return;
        }
        if (this.m0 == null) {
            TextPaint textPaint = new TextPaint();
            this.m0 = textPaint;
            textPaint.setColor(b.o(-1, 120));
            this.m0.setTextSize(AndroidUtilities.dp(13.0f));
            this.m0.setTextAlign(Paint.Align.CENTER);
        }
        this.j0 = new StaticLayout(this.i0, this.m0, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void j() {
        int dp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.x;
        float f7 = rectF2.left;
        float f10 = dp;
        float f11 = rectF2.top;
        rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
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

    /* JADX WARN: Removed duplicated region for block: B:72:0x03b2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        CropAreaView cropAreaView;
        float f7;
        int i10;
        int i11;
        int i12;
        Paint paint;
        int i13;
        int i14;
        Paint paint2;
        Paint paint3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Paint paint4 = this.T;
        boolean z10 = this.a0;
        float f10 = this.V;
        Paint paint5 = this.S;
        Paint paint6 = this.Q;
        Paint paint7 = this.P;
        Paint paint8 = this.R;
        Paint paint9 = this.O;
        if (this.f0) {
            int dp = AndroidUtilities.dp(2.0f / this.o0);
            int dp2 = AndroidUtilities.dp(16.0f / this.o0);
            int dp3 = AndroidUtilities.dp(3.0f / this.o0);
            RectF rectF = this.x;
            float f11 = rectF.left;
            int i21 = ((int) f11) - dp;
            float f12 = rectF.top;
            int i22 = ((int) f12) - dp;
            int i23 = dp * 2;
            int i24 = ((int) (rectF.right - f11)) + i23;
            int i25 = i23 + ((int) (rectF.bottom - f12));
            canvas.save();
            canvas.translate(this.p0, this.q0);
            float f13 = this.o0;
            float f14 = (i24 / 2) + i21;
            float f15 = (i25 / 2) + i22;
            canvas.scale(f13, f13, f14, f15);
            canvas.rotate(this.n0, f14, f15);
            if (this.I) {
                int i26 = (-getWidth()) * 4;
                int i27 = (-getHeight()) * 4;
                int width = getWidth() * 4;
                int height = getHeight() * 4;
                float f16 = this.K;
                if (f16 >= 0.0f) {
                    paint9.setAlpha((int) (f16 * 255.0f));
                } else {
                    paint9.setAlpha((int) (255.0f - (this.L * 127.0f)));
                }
                float f17 = i26;
                float f18 = width;
                i11 = dp2;
                i10 = dp;
                i12 = i21;
                canvas.drawRect(f17, i27, f18, 0.0f, paint9);
                canvas.drawRect(f17, 0.0f, 0.0f, getHeight(), paint9);
                canvas.drawRect(getWidth(), 0.0f, f18, getHeight(), paint9);
                canvas.drawRect(f17, getHeight(), f18, height, paint9);
                float f19 = i22 + i10;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f19, paint9);
                float f20 = (i22 + i25) - i10;
                canvas.drawRect(0.0f, f19, i12 + i10, f20, paint9);
                canvas.drawRect((i12 + i24) - i10, f19, getWidth(), f20, paint9);
                canvas.drawRect(0.0f, f20, getWidth(), getHeight(), paint9);
            } else {
                i10 = dp;
                i11 = dp2;
                i12 = i21;
            }
            if (!this.J) {
                return;
            }
            int i28 = dp3 - i10;
            int i29 = dp3 * 2;
            int i30 = i24 - i29;
            int i31 = i25 - i29;
            int i32 = this.t0;
            if (i32 == 1 && this.b0 > 0.0f) {
                i32 = this.s0;
            }
            float f21 = this.M;
            if (f21 >= 0.0f) {
                paint7.setAlpha((int) (this.b0 * 26.0f * f21));
                paint6.setAlpha((int) (this.b0 * 178.0f * this.M));
                paint5.setAlpha((int) (this.M * 178.0f));
                paint8.setAlpha((int) (this.M * 255.0f));
            } else {
                paint7.setAlpha((int) (this.b0 * 26.0f * this.L));
                paint6.setAlpha((int) (this.b0 * 178.0f * this.L));
                paint5.setAlpha((int) (this.L * 178.0f));
                paint8.setAlpha((int) (this.L * 255.0f));
            }
            int i33 = i12 + i28;
            float f22 = i33;
            int i34 = i32;
            float f23 = i22 + i28;
            int i35 = i12 + i24;
            float f24 = i35 - i28;
            Paint paint10 = paint6;
            canvas.drawRect(f22, f23, f24, r4 + i10, paint5);
            float f25 = i33 + i10;
            int i36 = i25 + i22;
            float f26 = i36 - i28;
            canvas.drawRect(f22, f23, f25, f26, paint5);
            canvas.drawRect(f22, r12 - i10, f24, f26, paint5);
            canvas.drawRect(r8 - i10, f23, f24, f26, paint5);
            int i37 = 0;
            while (true) {
                int i38 = 3;
                if (i37 >= 3) {
                    break;
                }
                int i39 = 2;
                if (i34 == 2) {
                    int i40 = 1;
                    int i41 = 4;
                    while (i40 < i41) {
                        if (i37 == i39 && i40 == i38) {
                            i16 = i39;
                            i18 = i40;
                            i15 = i41;
                            paint3 = paint8;
                            i17 = i35;
                            i20 = i36;
                            i19 = i38;
                        } else {
                            int i42 = i12 + dp3;
                            int i43 = i30 / 3;
                            float C = (i43 * i37) + g.C(i43, i38, i40, i42);
                            paint3 = paint8;
                            int i44 = i22 + dp3;
                            int i45 = i40;
                            float f27 = i44;
                            float f28 = i44 + i31;
                            i15 = i41;
                            i16 = i39;
                            i17 = i35;
                            i18 = i45;
                            i19 = 3;
                            i20 = i36;
                            canvas.drawLine(C, f27, C, f28, paint7);
                            canvas.drawLine(C, f27, C, f28, paint10);
                            int i46 = i31 / 3;
                            float f29 = i42;
                            float C2 = (i46 * i37) + g.C(i46, 3, i18, i44);
                            float f30 = i42 + i30;
                            canvas.drawLine(f29, C2, f30, C2, paint7);
                            canvas.drawLine(f29, C2, f30, C2, paint10);
                        }
                        i40 = i18 + 1;
                        i38 = i19;
                        i36 = i20;
                        i35 = i17;
                        i41 = i15;
                        paint8 = paint3;
                        i39 = i16;
                    }
                    paint = paint8;
                    i13 = i35;
                    i14 = i36;
                } else {
                    paint = paint8;
                    i13 = i35;
                    i14 = i36;
                    if (i34 == 3 && i37 > 0) {
                        int i47 = i12 + dp3;
                        float C3 = g.C(i30, 3, i37, i47);
                        int i48 = i22 + dp3;
                        float f31 = i48;
                        float f32 = i48 + i31;
                        canvas.drawLine(C3, f31, C3, f32, paint7);
                        canvas.drawLine(C3, f31, C3, f32, paint10);
                        float f33 = i47;
                        float C4 = g.C(i31, 3, i37, i48);
                        float f34 = i47 + i30;
                        canvas.drawLine(f33, C4, f34, C4, paint7);
                        paint2 = paint10;
                        canvas.drawLine(f33, C4, f34, C4, paint2);
                        i37++;
                        paint10 = paint2;
                        i36 = i14;
                        i35 = i13;
                        paint8 = paint;
                    }
                }
                paint2 = paint10;
                i37++;
                paint10 = paint2;
                i36 = i14;
                i35 = i13;
                paint8 = paint;
            }
            Paint paint11 = paint8;
            int i49 = i35;
            int i50 = i36;
            float f35 = i12;
            float f36 = i22;
            float f37 = i12 + i11;
            float f38 = i22 + dp3;
            canvas.drawRect(f35, f36, f37, f38, paint11);
            float f39 = i12 + dp3;
            float f40 = i22 + i11;
            canvas.drawRect(f35, f36, f39, f40, paint11);
            float f41 = i49 - i11;
            float f42 = i49;
            canvas.drawRect(f41, f36, f42, f38, paint11);
            float f43 = i49 - dp3;
            canvas.drawRect(f43, f36, f42, f40, paint11);
            float f44 = i50 - dp3;
            float f45 = i50;
            canvas.drawRect(f35, f44, f37, f45, paint11);
            float f46 = i50 - i11;
            canvas.drawRect(f35, f46, f39, f45, paint11);
            canvas.drawRect(f41, f44, f42, f45, paint11);
            canvas.drawRect(f43, f46, f42, f45, paint11);
            canvas.restore();
            cropAreaView = this;
        } else {
            float f47 = f10 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f47;
            cropAreaView = this;
            float measuredHeight = (((getMeasuredHeight() - cropAreaView.G) - (!z10 ? AndroidUtilities.statusBarHeight : 0)) - cropAreaView.H) - f47;
            cropAreaView.a = (int) Math.min(measuredWidth, measuredHeight);
            Bitmap bitmap = cropAreaView.g0;
            if (bitmap == null || bitmap.getWidth() != cropAreaView.a) {
                Bitmap bitmap2 = cropAreaView.g0;
                boolean z11 = bitmap2 != null;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    cropAreaView.g0 = null;
                }
                try {
                    int i51 = cropAreaView.a;
                    cropAreaView.g0 = Bitmap.createBitmap(i51, i51, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(cropAreaView.g0);
                    float f48 = cropAreaView.a;
                    f7 = 2.0f;
                    try {
                        canvas2.drawRect(0.0f, 0.0f, f48, f48, paint9);
                        try {
                            int i52 = cropAreaView.a;
                            canvas2.drawCircle(i52 / 2, i52 / 2, i52 / 2, cropAreaView.h0);
                            canvas2.setBitmap(null);
                            if (!z11) {
                                cropAreaView.L = 0.0f;
                                cropAreaView.N = SystemClock.elapsedRealtime();
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        paint9 = paint9;
                    }
                } catch (Throwable unused3) {
                }
                if (cropAreaView.g0 != null) {
                    paint4.setAlpha((int) (cropAreaView.L * 255.0f));
                    paint9.setAlpha((int) (cropAreaView.L * 127.0f));
                    float f49 = cropAreaView.a;
                    cropAreaView.b = a6.z(measuredWidth, f49, f7, f10);
                    float z12 = a6.z(measuredHeight, f49, f7, f10) + (z10 ? 0 : AndroidUtilities.statusBarHeight);
                    cropAreaView.c = z12;
                    float f50 = z12 + f49;
                    canvas.drawRect(0.0f, 0.0f, cropAreaView.getWidth(), (int) cropAreaView.c, paint9);
                    float f51 = (int) f50;
                    canvas.drawRect(0.0f, (int) cropAreaView.c, (int) cropAreaView.b, f51, paint9);
                    canvas.drawRect((int) (r0 + f49), (int) cropAreaView.c, cropAreaView.getWidth(), f51, paint9);
                    canvas.drawRect(0.0f, f51, cropAreaView.getWidth(), cropAreaView.getHeight(), paint9);
                    canvas.drawBitmap(cropAreaView.g0, (int) cropAreaView.b, (int) cropAreaView.c, paint4);
                    if (cropAreaView.getMeasuredHeight() > cropAreaView.getMeasuredWidth() && cropAreaView.j0 != null) {
                        canvas.save();
                        canvas.translate(cropAreaView.getMeasuredWidth() / f7, f50 + AndroidUtilities.dp(16.0f));
                        cropAreaView.j0.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            f7 = 2.0f;
            if (cropAreaView.g0 != null) {
            }
        }
        if (cropAreaView.L < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - cropAreaView.N;
            if (j10 > 17) {
                j10 = 17;
            }
            cropAreaView.N = elapsedRealtime;
            float f52 = (j10 / 180.0f) + cropAreaView.L;
            cropAreaView.L = f52;
            if (f52 > 1.0f) {
                cropAreaView.L = 1.0f;
            }
            cropAreaView.invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e0) {
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
        float f7 = this.V;
        RectF rectF = this.y;
        int x10 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y3 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float f10 = !this.a0 ? AndroidUtilities.statusBarHeight : 0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.e0 = false;
                h(false);
                if (this.r0 != 1) {
                    this.r0 = 1;
                    a aVar = this.d0;
                    if (aVar != null) {
                        p pVar = (p) aVar;
                        CropAreaView cropAreaView = pVar.a;
                        cropAreaView.g(1, true);
                        pVar.d(cropAreaView.getTargetRectToFill());
                    }
                }
                return false;
            }
            if (actionMasked == 2 && this.r0 != 1) {
                rectF.set(this.x);
                float f11 = x10 - this.E;
                float f12 = y3 - this.F;
                this.E = x10;
                this.F = y3;
                boolean z10 = Math.abs(f11) > Math.abs(f12);
                switch (j.c(this.r0)) {
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
                if (rectF.left < f7) {
                    float f18 = this.w;
                    if (f18 > 0.0f) {
                        rectF.bottom = a6.z(rectF.right, f7, f18, rectF.top);
                    }
                    rectF.left = f7;
                } else if (rectF.right > getWidth() - f7) {
                    rectF.right = getWidth() - f7;
                    if (this.w > 0.0f) {
                        rectF.bottom = (rectF.width() / this.w) + rectF.top;
                    }
                }
                float f19 = f10 + this.H + f7;
                float f20 = this.G + f7;
                if (rectF.top < f19) {
                    float f21 = this.w;
                    if (f21 > 0.0f) {
                        rectF.right = a6.x(rectF.bottom, f19, f21, rectF.left);
                    }
                    rectF.top = f19;
                } else if (rectF.bottom > getHeight() - f20) {
                    rectF.bottom = getHeight() - f20;
                    if (this.w > 0.0f) {
                        rectF.right = (rectF.height() * this.w) + rectF.left;
                    }
                }
                float width3 = rectF.width();
                float f22 = this.W;
                if (width3 < f22) {
                    rectF.right = rectF.left + f22;
                }
                float height3 = rectF.height();
                float f23 = this.W;
                if (height3 < f23) {
                    rectF.bottom = rectF.top + f23;
                }
                float f24 = this.w;
                if (f24 > 0.0f) {
                    if (f24 < 1.0f) {
                        float width4 = rectF.width();
                        float f25 = this.W;
                        if (width4 <= f25) {
                            rectF.right = rectF.left + f25;
                            rectF.bottom = (rectF.width() / this.w) + rectF.top;
                        }
                    } else {
                        float height4 = rectF.height();
                        float f26 = this.W;
                        if (height4 <= f26) {
                            rectF.bottom = rectF.top + f26;
                            rectF.right = (rectF.height() * this.w) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.d0;
                if (aVar2 != null) {
                    p pVar2 = (p) aVar2;
                    CropAreaView cropAreaView2 = pVar2.a;
                    cropAreaView2.g(3, false);
                    RectF rectF2 = pVar2.f;
                    float centerX = rectF2.centerX() - cropAreaView2.getCropCenterX();
                    float centerY = rectF2.centerY() - cropAreaView2.getCropCenterY();
                    n nVar = pVar2.L;
                    if (nVar != null) {
                        n.f(nVar, centerX, centerY);
                    }
                    pVar2.r(false);
                    rectF2.set(cropAreaView2.x);
                    pVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        }
        if (!this.f0) {
            this.r0 = 1;
            return false;
        }
        float f27 = x10;
        float f28 = y3;
        if (this.d.contains(f27, f28)) {
            this.r0 = 2;
        } else if (this.e.contains(f27, f28)) {
            this.r0 = 3;
        } else if (this.f.contains(f27, f28)) {
            this.r0 = 4;
        } else if (this.h.contains(f27, f28)) {
            this.r0 = 5;
        } else if (this.r.contains(f27, f28)) {
            this.r0 = 7;
        } else if (this.n.contains(f27, f28)) {
            this.r0 = 6;
        } else if (this.v.contains(f27, f28)) {
            this.r0 = 9;
        } else {
            if (!this.s.contains(f27, f28)) {
                this.r0 = 1;
                return false;
            }
            this.r0 = 8;
        }
        this.E = x10;
        this.F = y3;
        g(3, false);
        this.e0 = true;
        h(true);
        a aVar3 = this.d0;
        if (aVar3 != null) {
            p pVar3 = (p) aVar3;
            pVar3.a.d(pVar3.f);
            pVar3.n = 0.0f;
            o oVar = pVar3.M;
            if (oVar != null) {
                oVar.R(false);
                return true;
            }
        }
        return true;
    }

    public void setActualRect(float f7) {
        a(this.x, f7);
        j();
        invalidate();
    }

    public void setBottomPadding(float f7) {
        this.G = f7;
    }

    public void setDimAlpha(float f7) {
        this.K = f7;
    }

    public void setDimVisibility(boolean z10) {
        this.I = z10;
    }

    public void setFrameAlpha(float f7) {
        this.M = f7;
    }

    public void setFreeform(boolean z10) {
        this.f0 = z10;
    }

    public void setIsVideo(boolean z10) {
        this.W = AndroidUtilities.dp(z10 ? 64.0f : 32.0f);
    }

    public void setListener(a aVar) {
        this.d0 = aVar;
    }

    public void setLockedAspectRatio(float f7) {
        this.w = f7;
    }

    public void setSubtitle(String str) {
        this.i0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f7) {
        this.H = f7;
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
