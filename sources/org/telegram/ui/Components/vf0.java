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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vf0 extends View {
    public ValueAnimator E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.f6 L;
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
    public int v;
    public int w;
    public final RectF x;
    public float y;

    public vf0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.a = -1;
        this.b = 0;
        this.x = new RectF();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.J = -1;
        this.L = f6Var;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.F = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.G = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
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
            float f10 = this.y;
            this.d = (this.c * f10) + ((1.0f - f10) * f7);
        }
        if (i10 != this.a) {
            this.c = i10;
            this.h = true;
            this.y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new tf0(this, 1));
            this.E.addListener(new uf0(this, 0));
            this.E.setInterpolator(pr.f);
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
            int dp = AndroidUtilities.dp(8.0f);
            int i13 = dp * 2;
            this.v = (getMeasuredHeight() - i13) / Math.min(this.b, 3);
            this.w = (getMeasuredHeight() - i13) / Math.min(i11, 3);
            float f7 = (this.a - 1) * this.v;
            this.r = f7;
            if (f7 < 0.0f) {
                this.r = 0.0f;
            } else {
                float w10 = com.google.android.gms.internal.vision.e2.w(this.b, 1, r4, dp) - f7;
                int measuredHeight = getMeasuredHeight() - dp;
                int i14 = this.v;
                if (w10 < measuredHeight - i14) {
                    this.r = com.google.android.gms.internal.vision.e2.w(this.b, 1, i14, dp) - ((getMeasuredHeight() - dp) - this.v);
                }
            }
            float f10 = (i10 - 1) * this.w;
            this.s = f10;
            if (f10 < 0.0f) {
                this.s = 0.0f;
            } else {
                int i15 = i11 - 1;
                float f11 = ((r4 * i15) + dp) - f10;
                int measuredHeight2 = getMeasuredHeight() - dp;
                int i16 = this.w;
                if (f11 < measuredHeight2 - i16) {
                    this.s = ((i15 * i16) + dp) - ((getMeasuredHeight() - dp) - this.w);
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
            this.y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new tf0(this, 0));
            this.E.addListener(new uf0(this, 1));
            this.E.setInterpolator(pr.f);
            this.E.setDuration(220L);
            this.E.start();
        }
        a();
    }

    public final void d() {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ee, this.L);
        this.K = v02;
        this.H.setColor(i0.a.k(v02, (int) ((Color.alpha(v02) / 255.0f) * 112.0f)));
        this.I.setColor(this.K);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f7;
        RectF rectF;
        super.onDraw(canvas);
        if (this.a < 0 || this.b == 0) {
            return;
        }
        int dp = AndroidUtilities.dp(8.0f);
        if (this.n) {
            float f10 = this.v;
            float f11 = this.y;
            measuredHeight = (this.w * f11) + ((1.0f - f11) * f10);
        } else if (this.b == 0) {
            return;
        } else {
            measuredHeight = (getMeasuredHeight() - (dp * 2)) / Math.min(this.b, 3);
        }
        if (measuredHeight == 0.0f) {
            return;
        }
        float dpf2 = AndroidUtilities.dpf2(0.7f);
        if (this.n) {
            float f12 = this.r;
            float f13 = this.y;
            f7 = (this.s * f13) + ((1.0f - f13) * f12);
        } else {
            if (this.h) {
                float f14 = (this.d - 1.0f) * measuredHeight;
                float f15 = this.y;
                f7 = ((this.c - 1) * measuredHeight * f15) + ((1.0f - f15) * f14);
            } else {
                f7 = (this.a - 1) * measuredHeight;
            }
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else {
                float f16 = dp;
                if ((((this.b - 1) * measuredHeight) + f16) - f7 < (getMeasuredHeight() - dp) - measuredHeight) {
                    f7 = (((this.b - 1) * measuredHeight) + f16) - ((getMeasuredHeight() - dp) - measuredHeight);
                }
            }
        }
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float f17 = dp;
        int max = Math.max(0, (int) (((f17 + f7) / measuredHeight) - 1.0f));
        int min = Math.min(max + 6, this.n ? Math.max(this.e, this.f) : this.b);
        while (true) {
            rectF = this.x;
            if (max >= min) {
                break;
            }
            float f18 = ((max * measuredHeight) + f17) - f7;
            float f19 = f18 + measuredHeight;
            if (f19 >= 0.0f && f18 <= getMeasuredHeight()) {
                rectF.set(0.0f, f18 + dpf2, getMeasuredWidth(), f19 - dpf2);
                boolean z10 = this.n;
                Paint paint = this.H;
                if (z10 && max >= this.f) {
                    paint.setColor(i0.a.k(this.K, (int) ((1.0f - this.y) * (Color.alpha(r4) / 255.0f) * 76.0f)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    paint.setColor(i0.a.k(this.K, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                } else if (!z10 || max < this.e) {
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                } else {
                    paint.setColor(i0.a.k(this.K, (int) ((Color.alpha(r4) / 255.0f) * 76.0f * this.y)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    paint.setColor(i0.a.k(this.K, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                }
            }
            max++;
        }
        boolean z11 = this.h;
        Paint paint2 = this.I;
        if (z11) {
            float f20 = this.d;
            float f21 = this.y;
            float f22 = ((((this.c * f21) + ((1.0f - f21) * f20)) * measuredHeight) + f17) - f7;
            rectF.set(0.0f, f22 + dpf2, getMeasuredWidth(), (f22 + measuredHeight) - dpf2);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        } else {
            float f23 = ((this.a * measuredHeight) + f17) - f7;
            rectF.set(0.0f, f23 + dpf2, getMeasuredWidth(), (f23 + measuredHeight) - dpf2);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        }
        if (this.M) {
            float measuredWidth2 = getMeasuredWidth();
            float dp2 = AndroidUtilities.dp(6.0f);
            Paint paint3 = this.F;
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, dp2, paint3);
            canvas.drawRect(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
            canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), this.G);
        }
    }
}
