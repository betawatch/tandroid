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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ye0 extends View {
    public float D;
    public ValueAnimator E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.p6 L;
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

    public ye0(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.a = -1;
        this.b = 0;
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.J = -1;
        this.L = p6Var;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.F = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.G = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        boolean z10 = (this.n ? Math.max(this.e, this.f) : this.b) > 3;
        int i10 = z10 ? 2 : 0;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
        this.M = z10;
    }

    public final void b(int i10) {
        if (this.n) {
            this.J = i10;
            return;
        }
        if (!this.h) {
            this.d = this.a;
        } else {
            if (this.c == i10) {
                return;
            }
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f7 = this.d;
            float f10 = this.D;
            this.d = (this.c * f10) + ((1.0f - f10) * f7);
        }
        if (i10 != this.a) {
            this.c = i10;
            this.h = true;
            this.D = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new we0(this, 1));
            this.E.addListener(new xe0(this, 0));
            this.E.setInterpolator(gr.f);
            this.E.setDuration(220L);
            this.E.start();
        }
    }

    public final void c(int i10, int i11, boolean z10) {
        int i12 = this.a;
        if (i12 < 0 || i11 == 0 || this.b == 0) {
            z10 = false;
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a = i10;
            this.b = i11;
            invalidate();
        } else if (this.b == i11 && (Math.abs(i12 - i10) <= 2 || this.h || this.n)) {
            b(i10);
        } else {
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                this.J = 0;
                valueAnimator2.cancel();
            }
            int L = org.telegram.messenger.i0.L(8.0f);
            int i13 = L * 2;
            this.w = (getMeasuredHeight() - i13) / Math.min(this.b, 3);
            this.x = (getMeasuredHeight() - i13) / Math.min(i11, 3);
            float f7 = (this.a - 1) * this.w;
            this.r = f7;
            if (f7 < 0.0f) {
                this.r = 0.0f;
            } else {
                float e = i0.a.e(this.b, 1, r4, L) - f7;
                int measuredHeight = getMeasuredHeight() - L;
                int i14 = this.w;
                if (e < measuredHeight - i14) {
                    this.r = i0.a.e(this.b, 1, i14, L) - ((getMeasuredHeight() - L) - this.w);
                }
            }
            float f10 = (i10 - 1) * this.x;
            this.s = f10;
            if (f10 < 0.0f) {
                this.s = 0.0f;
            } else {
                int i15 = i11 - 1;
                float f11 = ((r4 * i15) + L) - f10;
                int measuredHeight2 = getMeasuredHeight() - L;
                int i16 = this.x;
                if (f11 < measuredHeight2 - i16) {
                    this.s = ((i15 * i16) + L) - ((getMeasuredHeight() - L) - this.x);
                }
            }
            this.d = this.a;
            this.c = i10;
            this.a = i10;
            this.e = this.b;
            this.f = i11;
            this.b = i11;
            this.n = true;
            this.h = true;
            this.D = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new we0(this, 0));
            this.E.addListener(new xe0(this, 1));
            this.E.setInterpolator(gr.f);
            this.E.setDuration(220L);
            this.E.start();
        }
        a();
    }

    public final void d() {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Se, this.L);
        this.K = w02;
        this.H.setColor(i0.b.o(w02, (int) ((Color.alpha(w02) / 255.0f) * 112.0f)));
        this.I.setColor(this.K);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f7;
        RectF rectF;
        float f10;
        super.onDraw(canvas);
        if (this.a < 0 || this.b == 0) {
            return;
        }
        int L = org.telegram.messenger.i0.L(8.0f);
        float f11 = 1.0f;
        if (this.n) {
            float f12 = this.w;
            float f13 = this.D;
            measuredHeight = (this.x * f13) + ((1.0f - f13) * f12);
        } else if (this.b == 0) {
            return;
        } else {
            measuredHeight = (getMeasuredHeight() - (L * 2)) / Math.min(this.b, 3);
        }
        if (measuredHeight == 0.0f) {
            return;
        }
        float N = org.telegram.messenger.i0.N(0.7f);
        if (this.n) {
            float f14 = this.r;
            float f15 = this.D;
            f7 = (this.s * f15) + ((1.0f - f15) * f14);
        } else {
            if (this.h) {
                float f16 = (this.d - 1.0f) * measuredHeight;
                float f17 = this.D;
                f7 = ((this.c - 1) * measuredHeight * f17) + ((1.0f - f17) * f16);
            } else {
                f7 = (this.a - 1) * measuredHeight;
            }
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else {
                float f18 = L;
                if ((((this.b - 1) * measuredHeight) + f18) - f7 < (getMeasuredHeight() - L) - measuredHeight) {
                    f7 = (((this.b - 1) * measuredHeight) + f18) - ((getMeasuredHeight() - L) - measuredHeight);
                }
            }
        }
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float f19 = L;
        int max = Math.max(0, (int) (((f19 + f7) / measuredHeight) - 1.0f));
        int min = Math.min(max + 6, this.n ? Math.max(this.e, this.f) : this.b);
        while (true) {
            rectF = this.y;
            if (max >= min) {
                break;
            }
            float f20 = ((max * measuredHeight) + f19) - f7;
            float f21 = f20 + measuredHeight;
            if (f21 < 0.0f || f20 > getMeasuredHeight()) {
                f10 = f11;
            } else {
                rectF.set(0.0f, f20 + N, getMeasuredWidth(), f21 - N);
                boolean z10 = this.n;
                Paint paint = this.H;
                f10 = f11;
                if (z10 && max >= this.f) {
                    paint.setColor(i0.b.o(this.K, (int) ((f10 - this.D) * (Color.alpha(r4) / 255.0f) * 76.0f)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    paint.setColor(i0.b.o(this.K, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                } else if (!z10 || max < this.e) {
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                } else {
                    paint.setColor(i0.b.o(this.K, (int) ((Color.alpha(r4) / 255.0f) * 76.0f * this.D)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    paint.setColor(i0.b.o(this.K, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                }
            }
            max++;
            f11 = f10;
        }
        float f22 = f11;
        boolean z11 = this.h;
        Paint paint2 = this.I;
        if (z11) {
            float f23 = this.d;
            float f24 = this.D;
            float f25 = ((((this.c * f24) + ((f22 - f24) * f23)) * measuredHeight) + f19) - f7;
            rectF.set(0.0f, f25 + N, getMeasuredWidth(), (f25 + measuredHeight) - N);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        } else {
            float f26 = ((this.a * measuredHeight) + f19) - f7;
            rectF.set(0.0f, f26 + N, getMeasuredWidth(), (f26 + measuredHeight) - N);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        }
        if (this.M) {
            float measuredWidth2 = getMeasuredWidth();
            float L2 = org.telegram.messenger.i0.L(6.0f);
            Paint paint3 = this.F;
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, L2, paint3);
            canvas.drawRect(0.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
            canvas.translate(0.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f), this.G);
        }
    }
}
