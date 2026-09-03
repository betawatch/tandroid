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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bg0 extends View {
    public ValueAnimator B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.ActionBar.f6 I;
    public boolean J;
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

    public bg0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.a = -1;
        this.b = 0;
        this.x = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = -1;
        this.I = f6Var;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.C = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.D = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        boolean z4 = (this.n ? Math.max(this.e, this.f) : this.b) > 3;
        int i10 = z4 ? 2 : 0;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
        this.J = z4;
    }

    public final void b(int i10) {
        if (this.n) {
            this.G = i10;
            return;
        }
        if (!this.h) {
            this.d = this.a;
        } else {
            if (this.c == i10) {
                return;
            }
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.d;
            float f11 = this.y;
            this.d = (this.c * f11) + ((1.0f - f11) * f10);
        }
        if (i10 != this.a) {
            this.c = i10;
            this.h = true;
            this.y = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new zf0(this, 1));
            this.B.addListener(new ag0(this, 0));
            this.B.setInterpolator(mr.f);
            this.B.setDuration(220L);
            this.B.start();
        }
    }

    public final void c(int i10, int i11, boolean z4) {
        int i12 = this.a;
        if (i12 < 0 || i11 == 0 || this.b == 0) {
            z4 = false;
        }
        if (!z4) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a = i10;
            this.b = i11;
            invalidate();
        } else if (this.b == i11 && (Math.abs(i12 - i10) <= 2 || this.h || this.n)) {
            b(i10);
        } else {
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null) {
                this.G = 0;
                valueAnimator2.cancel();
            }
            int dp = AndroidUtilities.dp(8.0f);
            int i13 = dp * 2;
            this.v = (getMeasuredHeight() - i13) / Math.min(this.b, 3);
            this.w = (getMeasuredHeight() - i13) / Math.min(i11, 3);
            float f10 = (this.a - 1) * this.v;
            this.r = f10;
            if (f10 < 0.0f) {
                this.r = 0.0f;
            } else {
                float e = e2.c.e(this.b, 1, r4, dp) - f10;
                int measuredHeight = getMeasuredHeight() - dp;
                int i14 = this.v;
                if (e < measuredHeight - i14) {
                    this.r = e2.c.e(this.b, 1, i14, dp) - ((getMeasuredHeight() - dp) - this.v);
                }
            }
            float f11 = (i10 - 1) * this.w;
            this.s = f11;
            if (f11 < 0.0f) {
                this.s = 0.0f;
            } else {
                int i15 = i11 - 1;
                float f12 = ((r4 * i15) + dp) - f11;
                int measuredHeight2 = getMeasuredHeight() - dp;
                int i16 = this.w;
                if (f12 < measuredHeight2 - i16) {
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
            this.B = ofFloat;
            ofFloat.addUpdateListener(new zf0(this, 0));
            this.B.addListener(new ag0(this, 1));
            this.B.setInterpolator(mr.f);
            this.B.setDuration(220L);
            this.B.start();
        }
        a();
    }

    public final void d() {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ee, this.I);
        this.H = v02;
        this.E.setColor(i0.a.k(v02, (int) ((Color.alpha(v02) / 255.0f) * 112.0f)));
        this.F.setColor(this.H);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f10;
        RectF rectF;
        super.onDraw(canvas);
        if (this.a < 0 || this.b == 0) {
            return;
        }
        int dp = AndroidUtilities.dp(8.0f);
        if (this.n) {
            float f11 = this.v;
            float f12 = this.y;
            measuredHeight = (this.w * f12) + ((1.0f - f12) * f11);
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
            float f13 = this.r;
            float f14 = this.y;
            f10 = (this.s * f14) + ((1.0f - f14) * f13);
        } else {
            if (this.h) {
                float f15 = (this.d - 1.0f) * measuredHeight;
                float f16 = this.y;
                f10 = ((this.c - 1) * measuredHeight * f16) + ((1.0f - f16) * f15);
            } else {
                f10 = (this.a - 1) * measuredHeight;
            }
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else {
                float f17 = dp;
                if ((((this.b - 1) * measuredHeight) + f17) - f10 < (getMeasuredHeight() - dp) - measuredHeight) {
                    f10 = (((this.b - 1) * measuredHeight) + f17) - ((getMeasuredHeight() - dp) - measuredHeight);
                }
            }
        }
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float f18 = dp;
        int max = Math.max(0, (int) (((f18 + f10) / measuredHeight) - 1.0f));
        int min = Math.min(max + 6, this.n ? Math.max(this.e, this.f) : this.b);
        while (true) {
            rectF = this.x;
            if (max >= min) {
                break;
            }
            float f19 = ((max * measuredHeight) + f18) - f10;
            float f20 = f19 + measuredHeight;
            if (f20 >= 0.0f && f19 <= getMeasuredHeight()) {
                rectF.set(0.0f, f19 + dpf2, getMeasuredWidth(), f20 - dpf2);
                boolean z4 = this.n;
                Paint paint = this.E;
                if (z4 && max >= this.f) {
                    paint.setColor(i0.a.k(this.H, (int) ((1.0f - this.y) * (Color.alpha(r4) / 255.0f) * 76.0f)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    paint.setColor(i0.a.k(this.H, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                } else if (!z4 || max < this.e) {
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                } else {
                    paint.setColor(i0.a.k(this.H, (int) ((Color.alpha(r4) / 255.0f) * 76.0f * this.y)));
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                    paint.setColor(i0.a.k(this.H, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                }
            }
            max++;
        }
        boolean z10 = this.h;
        Paint paint2 = this.F;
        if (z10) {
            float f21 = this.d;
            float f22 = this.y;
            float f23 = ((((this.c * f22) + ((1.0f - f22) * f21)) * measuredHeight) + f18) - f10;
            rectF.set(0.0f, f23 + dpf2, getMeasuredWidth(), (f23 + measuredHeight) - dpf2);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        } else {
            float f24 = ((this.a * measuredHeight) + f18) - f10;
            rectF.set(0.0f, f24 + dpf2, getMeasuredWidth(), (f24 + measuredHeight) - dpf2);
            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
        }
        if (this.J) {
            float measuredWidth2 = getMeasuredWidth();
            float dp2 = AndroidUtilities.dp(6.0f);
            Paint paint3 = this.C;
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, dp2, paint3);
            canvas.drawRect(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
            canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(6.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(6.0f), this.D);
        }
    }
}
