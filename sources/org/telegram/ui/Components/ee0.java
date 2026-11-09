package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ee0 extends View {
    public float D;
    public ValueAnimator E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.g6 L;
    public boolean M;
    public int a;
    public int b;
    public int c;
    public float d;
    public int e;
    public int f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;
    public int w;
    public int x;
    public final RectF y;

    public ee0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.a = -1;
        this.b = 0;
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.J = -1;
        this.L = g6Var;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.F = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.G = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        boolean z9 = (this.n ? Math.max(this.e, this.f) : this.b) > 3;
        int i7 = z9 ? 2 : 0;
        if (getLayerType() != i7) {
            setLayerType(i7, null);
            invalidate();
        }
        this.M = z9;
    }

    public final void b(int i7) {
        if (this.n) {
            this.J = i7;
            return;
        }
        if (!this.h) {
            this.d = this.a;
        } else {
            if (this.c == i7) {
                return;
            }
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.d;
            float f11 = this.D;
            this.d = (this.c * f11) + ((1.0f - f11) * f10);
        }
        if (i7 != this.a) {
            this.c = i7;
            this.h = true;
            this.D = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new ce0(this, 1));
            this.E.addListener(new de0(this, 0));
            this.E.setInterpolator(xq.f);
            this.E.setDuration(220L);
            this.E.start();
        }
    }

    public final void c(int i7, int i10, boolean z9) {
        int i11 = this.a;
        if (i11 < 0 || i10 == 0 || this.b == 0) {
            z9 = false;
        }
        if (!z9) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a = i7;
            this.b = i10;
            invalidate();
        } else if (this.b == i10 && (Math.abs(i11 - i7) <= 2 || this.h || this.n)) {
            b(i7);
        } else {
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                this.J = 0;
                valueAnimator2.cancel();
            }
            int L = org.telegram.messenger.g0.L(8.0f);
            int i12 = L * 2;
            this.w = (getMeasuredHeight() - i12) / Math.min(this.b, 3);
            this.x = (getMeasuredHeight() - i12) / Math.min(i10, 3);
            float f10 = (this.a - 1) * this.w;
            this.r = f10;
            if (f10 < 0.0f) {
                this.r = 0.0f;
            } else {
                float e10 = com.google.android.recaptcha.internal.a.e(this.b, 1, r4, L) - f10;
                int measuredHeight = getMeasuredHeight() - L;
                int i13 = this.w;
                if (e10 < measuredHeight - i13) {
                    this.r = com.google.android.recaptcha.internal.a.e(this.b, 1, i13, L) - ((getMeasuredHeight() - L) - this.w);
                }
            }
            float f11 = (i7 - 1) * this.x;
            this.s = f11;
            if (f11 < 0.0f) {
                this.s = 0.0f;
            } else {
                int i14 = i10 - 1;
                float f12 = ((r4 * i14) + L) - f11;
                int measuredHeight2 = getMeasuredHeight() - L;
                int i15 = this.x;
                if (f12 < measuredHeight2 - i15) {
                    this.s = ((i14 * i15) + L) - ((getMeasuredHeight() - L) - this.x);
                }
            }
            this.d = this.a;
            this.c = i7;
            this.a = i7;
            this.e = this.b;
            this.f = i10;
            this.b = i10;
            this.n = true;
            this.h = true;
            this.D = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new ce0(this, 0));
            this.E.addListener(new de0(this, 1));
            this.E.setInterpolator(xq.f);
            this.E.setDuration(220L);
            this.E.start();
        }
        a();
    }

    public final void d() {
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Se, this.L);
        this.K = w02;
        this.H.setColor(i0.a.o(w02, (int) ((Color.alpha(w02) / 255.0f) * 112.0f)));
        this.I.setColor(this.K);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f10;
        RectF rectF;
        float f11;
        super.onDraw(canvas);
        if (this.a < 0 || this.b == 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(8.0f);
        float f12 = 1.0f;
        if (this.n) {
            float f13 = this.w;
            float f14 = this.D;
            measuredHeight = (this.x * f14) + ((1.0f - f14) * f13);
        } else if (this.b == 0) {
            return;
        } else {
            measuredHeight = (getMeasuredHeight() - (L * 2)) / Math.min(this.b, 3);
        }
        if (measuredHeight == 0.0f) {
            return;
        }
        float N = org.telegram.messenger.g0.N(0.7f);
        if (this.n) {
            float f15 = this.r;
            float f16 = this.D;
            f10 = (this.s * f16) + ((1.0f - f16) * f15);
        } else {
            if (this.h) {
                float f17 = (this.d - 1.0f) * measuredHeight;
                float f18 = this.D;
                f10 = ((this.c - 1) * measuredHeight * f18) + ((1.0f - f18) * f17);
            } else {
                f10 = (this.a - 1) * measuredHeight;
            }
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else {
                float f19 = L;
                if ((((this.b - 1) * measuredHeight) + f19) - f10 < (getMeasuredHeight() - L) - measuredHeight) {
                    f10 = (((this.b - 1) * measuredHeight) + f19) - ((getMeasuredHeight() - L) - measuredHeight);
                }
            }
        }
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float f20 = L;
        int max = Math.max(0, (int) (((f20 + f10) / measuredHeight) - 1.0f));
        int min = Math.min(max + 6, this.n ? Math.max(this.e, this.f) : this.b);
        while (true) {
            rectF = this.y;
            if (max >= min) {
                break;
            }
            float f21 = ((max * measuredHeight) + f20) - f10;
            float f22 = f21 + measuredHeight;
            if (f22 < 0.0f || f21 > getMeasuredHeight()) {
                f11 = f12;
            } else {
                rectF.set(0.0f, f21 + N, getMeasuredWidth(), f22 - N);
                boolean z9 = this.n;
                Paint paint = this.H;
                f11 = f12;
                if (z9 && max >= this.f) {
                    paint.setColor(i0.a.o(this.K, (int) ((f11 - this.D) * (Color.alpha(r4) / 255.0f) * 76.0f)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    paint.setColor(i0.a.o(this.K, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                } else if (!z9 || max < this.e) {
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                } else {
                    paint.setColor(i0.a.o(this.K, (int) ((Color.alpha(r4) / 255.0f) * 76.0f * this.D)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    paint.setColor(i0.a.o(this.K, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                }
            }
            max++;
            f12 = f11;
        }
        float f23 = f12;
        boolean z10 = this.h;
        Paint paint2 = this.I;
        if (z10) {
            float f24 = this.d;
            float f25 = this.D;
            float f26 = ((((this.c * f25) + ((f23 - f25) * f24)) * measuredHeight) + f20) - f10;
            rectF.set(0.0f, f26 + N, getMeasuredWidth(), (f26 + measuredHeight) - N);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        } else {
            float f27 = ((this.a * measuredHeight) + f20) - f10;
            rectF.set(0.0f, f27 + N, getMeasuredWidth(), (f27 + measuredHeight) - N);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        }
        if (this.M) {
            float measuredWidth2 = getMeasuredWidth();
            float L2 = org.telegram.messenger.g0.L(6.0f);
            Paint paint3 = this.F;
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, L2, paint3);
            canvas.drawRect(0.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
            canvas.translate(0.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f), this.G);
        }
    }
}
