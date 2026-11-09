package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import java.util.Arrays;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class q4 extends View implements org.telegram.ui.Components.pf0 {
    public final GradientDrawable[] D;
    public final boolean[] E;
    public final float[] F;
    public float G;
    public float[] H;
    public long I;
    public float J;
    public int K;
    public float L;
    public int M;
    public float N;
    public int O;
    public org.telegram.ui.Components.tf0 P;
    public final TextPaint Q;
    public float R;
    public int S;
    public String T;
    public final RectF a;
    public int b;
    public final Rect c;
    public final Rect d;
    public final RectF e;
    public final GradientDrawable f;
    public final GradientDrawable h;
    public final float[] n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Path x;
    public final RectF y;

    public q4(Context context) {
        super(context);
        this.a = new RectF();
        int i7 = 1;
        this.b = 1;
        this.c = new Rect();
        this.d = new Rect();
        this.e = new RectF();
        this.n = new float[]{0.0f, 1.0f};
        this.x = new Path();
        this.y = new RectF();
        this.D = new GradientDrawable[2];
        this.E = new boolean[2];
        this.F = new float[2];
        this.G = 0.0f;
        this.H = null;
        this.K = -1;
        this.O = 1;
        this.S = -1;
        Paint paint = new Paint(1);
        this.s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.w = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        int i10 = 0;
        while (i10 < 2) {
            this.D[i10] = new GradientDrawable(i10 == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.D[i10].setShape(0);
            i10++;
        }
        Paint paint3 = new Paint(1);
        this.r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.j);
        ofFloat.addUpdateListener(new a3(this, i7));
        ofFloat.addListener(new m.a(this, 15));
        TextPaint textPaint = new TextPaint(1);
        this.Q = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
    }

    private String getCurrentTitle() {
        if (this.S != this.P.getCurrentItem()) {
            this.T = ((String) this.P.getAdapter().d(this.P.getCurrentItem())).toString();
            this.S = this.P.getCurrentItem();
        }
        return this.T;
    }

    @Override // org.telegram.ui.Components.pf0
    public final void a() {
        Arrays.fill(this.E, false);
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.pf0
    public final void b(boolean z9) {
        this.E[!z9 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.pf0
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.tf0 getProfileGalleryView() {
        return this.P;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ee  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float[] fArr;
        float f10;
        float[] fArr2;
        Paint paint;
        float f11;
        float f12;
        int i7;
        boolean z9;
        float f13;
        float[] fArr3;
        Paint paint2;
        Paint paint3;
        int i10;
        float f14;
        float f15;
        int i11 = 0;
        while (true) {
            fArr = this.F;
            f10 = 0.0f;
            if (i11 >= 2) {
                break;
            }
            float f16 = fArr[i11];
            if (f16 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.D;
                gradientDrawableArr[i11].setAlpha((int) (f16 * 255.0f));
                gradientDrawableArr[i11].draw(canvas);
            }
            i11++;
        }
        this.f.draw(canvas);
        Rect rect = this.c;
        Paint paint4 = this.r;
        canvas.drawRect(rect, paint4);
        int realCount = this.P.getRealCount();
        this.M = this.P.getRealPosition();
        float[] fArr4 = this.H;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.H = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.I;
        if (j3 < 0 || j3 > 20) {
            j3 = 17;
        }
        this.I = elapsedRealtime;
        float f17 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            paint = paint4;
            f11 = 180.0f;
            f12 = 8.0f;
            i7 = 20;
            z9 = false;
        } else {
            int i12 = this.b;
            if (i12 == 0) {
                this.G = 0.0f;
                this.b = 3;
            } else if (i12 == 1) {
                this.G = 0.0f;
                this.b = 2;
            }
            int i13 = this.b;
            f11 = 180.0f;
            Paint paint5 = this.w;
            f12 = 8.0f;
            Paint paint6 = this.s;
            if (i13 == 2) {
                paint6.setAlpha((int) (this.G * 85.0f));
                paint5.setAlpha((int) (this.G * 255.0f));
            }
            int y10 = org.telegram.messenger.camera.q.y((realCount - 1) * 2, getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f), realCount);
            int L = org.telegram.messenger.g0.L(8.0f);
            int i14 = 0;
            z9 = false;
            while (i14 < realCount) {
                int L2 = (y10 * i14) + org.telegram.messenger.g0.L((i14 * 2) + 5);
                int i15 = this.K;
                float f18 = f10;
                RectF rectF = this.e;
                if (i14 != i15 || Math.abs(this.J - f17) <= 1.0E-4f) {
                    fArr3 = fArr;
                    paint2 = paint4;
                    paint3 = paint5;
                    float f19 = f17;
                    i10 = 85;
                    if (i14 == this.M) {
                        if (this.P.I()) {
                            float currentItemProgress = this.P.getCurrentItemProgress();
                            this.L = currentItemProgress;
                            if ((currentItemProgress > f18 || !this.P.J()) && this.N <= f18) {
                                f15 = currentItemProgress;
                            } else {
                                float f20 = this.N;
                                int i16 = this.O;
                                f15 = currentItemProgress;
                                float f21 = ((i16 * j3) / 500.0f) + f20;
                                this.N = f21;
                                if (f21 > f19) {
                                    this.N = f19;
                                    this.O = i16 * (-1);
                                } else if (f21 <= f18) {
                                    this.N = f18;
                                    this.O = i16 * (-1);
                                }
                            }
                            rectF.set(L2, L, L2 + y10, org.telegram.messenger.g0.L(2.0f) + L);
                            paint6.setAlpha((int) (((this.N * 48.0f) + 85.0f) * this.G));
                            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint6);
                            f14 = f15;
                        } else {
                            this.L = f19;
                        }
                    }
                    f14 = 1.0f;
                    float f22 = L2;
                    rectF.set(f22, L, (y10 * f14) + f22, org.telegram.messenger.g0.L(2.0f) + L);
                    if (i14 != this.M) {
                        this.H[i14] = 0.75f;
                    } else if (this.b == 3) {
                        paint6.setAlpha((int) (org.telegram.messenger.g0.W1(org.telegram.ui.Components.xq.j.getInterpolation(this.H[i14]), i10, org.telegram.messenger.qs.e4) * this.G));
                    }
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), i14 != this.M ? paint3 : paint6);
                    i14++;
                    fArr = fArr3;
                    paint5 = paint3;
                    paint4 = paint2;
                    f10 = 0.0f;
                    f17 = 1.0f;
                } else {
                    float f23 = this.J;
                    canvas.save();
                    float f24 = f17;
                    float f25 = L2;
                    fArr3 = fArr;
                    float f26 = L;
                    paint3 = paint5;
                    float f27 = L2 + y10;
                    paint2 = paint4;
                    canvas.clipRect((y10 * f23) + f25, f26, f27, org.telegram.messenger.g0.L(2.0f) + L);
                    rectF.set(f25, f26, f27, org.telegram.messenger.g0.L(2.0f) + L);
                    paint6.setAlpha((int) (this.G * 85.0f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f24), org.telegram.messenger.g0.L(f24), paint6);
                    canvas.restore();
                    f14 = f23;
                }
                i10 = 80;
                z9 = true;
                float f222 = L2;
                rectF.set(f222, L, (y10 * f14) + f222, org.telegram.messenger.g0.L(2.0f) + L);
                if (i14 != this.M) {
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), i14 != this.M ? paint3 : paint6);
                i14++;
                fArr = fArr3;
                paint5 = paint3;
                paint4 = paint2;
                f10 = 0.0f;
                f17 = 1.0f;
            }
            fArr2 = fArr;
            paint = paint4;
            int i17 = this.b;
            if (i17 == 2) {
                float f28 = this.G;
                if (f28 < 1.0f) {
                    float f29 = (j3 / 180.0f) + f28;
                    this.G = f29;
                    if (f29 > 1.0f) {
                        this.G = 1.0f;
                    }
                    i7 = 20;
                    z9 = true;
                } else {
                    this.b = 3;
                }
            } else if (i17 == 3) {
                int i18 = 0;
                while (true) {
                    float[] fArr6 = this.H;
                    if (i18 >= fArr6.length) {
                        break;
                    }
                    if (i18 != this.M) {
                        float f30 = fArr6[i18];
                        if (f30 > 0.0f) {
                            float f31 = f30 - (j3 / 500.0f);
                            fArr6[i18] = f31;
                            if (f31 <= 0.0f) {
                                fArr6[i18] = 0.0f;
                                if (i18 == this.K) {
                                    this.K = -1;
                                }
                            }
                            z9 = true;
                            i18++;
                        }
                    }
                    if (i18 == this.K) {
                        this.K = -1;
                    }
                    i18++;
                }
            }
            i7 = 20;
        }
        if (realCount > i7 || this.R != 0.0f) {
            String currentTitle = getCurrentTitle();
            TextPaint textPaint = this.Q;
            float measureText = textPaint.measureText(currentTitle);
            float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(f12);
            RectF rectF2 = this.a;
            rectF2.right = measuredWidth;
            rectF2.left = measuredWidth - (org.telegram.messenger.g0.N(16.0f) + measureText);
            float L3 = org.telegram.messenger.g0.L(f12);
            rectF2.top = L3;
            rectF2.bottom = L3 + org.telegram.messenger.g0.L(26.0f);
            float N = org.telegram.messenger.g0.N(12.0f);
            canvas.save();
            boolean z10 = realCount > 20;
            if (z10) {
                float f32 = this.R;
                if (f32 != 1.0f) {
                    this.R = (j3 / 150.0f) + f32;
                    f13 = this.R;
                    if (f13 < 1.0f) {
                        this.R = 1.0f;
                    } else if (f13 <= 0.0f) {
                        this.R = 0.0f;
                    } else {
                        invalidate();
                    }
                    float f33 = this.R;
                    canvas.scale(f33, f33, rectF2.centerX(), rectF2.centerY());
                    canvas.drawRoundRect(rectF2, N, N, paint);
                    canvas.drawText(getCurrentTitle(), rectF2.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF2.top, textPaint);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f34 = this.R;
                if (f34 != 0.0f) {
                    this.R = f34 - (j3 / 150.0f);
                }
            }
            f13 = this.R;
            if (f13 < 1.0f) {
            }
            float f332 = this.R;
            canvas.scale(f332, f332, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, N, N, paint);
            canvas.drawText(getCurrentTitle(), rectF2.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF2.top, textPaint);
            canvas.restore();
        }
        for (int i19 = 0; i19 < 2; i19++) {
            if (this.E[i19]) {
                float f35 = fArr2[i19];
                if (f35 < 1.0f) {
                    float f36 = (j3 / f11) + f35;
                    fArr2[i19] = f36;
                    if (f36 > 1.0f) {
                        fArr2[i19] = 1.0f;
                    }
                    z9 = true;
                }
            } else {
                float f37 = fArr2[i19];
                if (f37 > 0.0f) {
                    float f38 = f37 - (j3 / f11);
                    fArr2[i19] = f38;
                    if (f38 < 0.0f) {
                        fArr2[i19] = 0.0f;
                    }
                    z9 = true;
                }
            }
        }
        if (z9) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Path path = this.x;
        path.reset();
        float measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.y;
        rectF.set(0.0f, 0.0f, measuredHeight, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        Rect rect = this.c;
        rect.set(0, 0, i7, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i10 - (org.telegram.messenger.g0.L(72.0f) * 0.5f)), i7, i10);
        this.f.setBounds(0, rect.bottom, i7, org.telegram.messenger.g0.L(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i10 - org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(24.0f), i7, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.D;
        int i13 = i7 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i7 - i13, 0, i7, i10);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.tf0 tf0Var) {
        this.P = tf0Var;
    }

    public void c() {
    }
}
