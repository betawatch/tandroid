package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class og extends View implements i70 {
    public boolean A;
    public boolean B;
    public Drawable C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final Paint H;
    public float I;
    public float J;
    public final iq[] K;
    public final d6 L;
    public final uc M;
    public boolean N;
    public final u1.a O;
    public boolean P;
    public float Q;
    public final d6 R;
    public final d6 S;
    public final Path T;
    public final Paint U;
    public final n6 V;
    public float W;
    public final org.telegram.ui.ActionBar.c6 a;
    public final d6 a0;
    public int b;
    public Drawable b0;
    public Drawable c;
    public ng.d c0;
    public Drawable d;
    public boolean d0;
    public Drawable e;
    public int e0;
    public final n5 f;
    public ValueAnimator f0;
    public final RectF g0;
    public float h;
    public float n;
    public long r;
    public int s;
    public boolean v;
    public final n6 w;
    public final d6 x;
    public final Paint y;

    public og(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        jr jrVar = jr.h;
        this.x = new d6(this, 0L, 320L, jrVar);
        this.y = new Paint(1);
        this.E = -1;
        this.F = -1;
        this.H = new Paint(1);
        this.K = new iq[1];
        this.L = new d6(this, 0L, 420L, jrVar);
        this.M = new uc(this);
        this.O = new u1.a();
        this.R = new d6(this, 0L, 420L, jrVar);
        this.S = new d6(this, 0L, 500L, jrVar);
        this.T = new Path();
        Paint paint = new Paint(1);
        this.U = paint;
        n6 n6Var = new n6(true, true, true, false);
        this.V = n6Var;
        this.W = 1.0f;
        this.a0 = new d6(this, 0L, 320L, jrVar);
        this.g0 = new RectF();
        this.b = i10;
        this.a = c6Var;
        this.A = z10;
        n6 n6Var2 = new n6(false, false, false, false);
        this.w = n6Var2;
        n6Var2.t(AndroidUtilities.dp(15.0f));
        n6Var2.u(AndroidUtilities.bold());
        n6Var2.r(-1);
        n6Var2.b = 3;
        n6Var2.setCallback(this);
        n6Var2.G = AndroidUtilities.displaySize.x;
        this.c = context.getResources().getDrawable(i10).mutate();
        this.d = context.getResources().getDrawable(i10).mutate();
        this.e = context.getResources().getDrawable(i10).mutate();
        this.f = new n5(AndroidUtilities.dp(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        n6Var.setCallback(this);
        n6Var.r(-1);
        n6Var.t(AndroidUtilities.dp(12.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.b = 17;
    }

    @Override // org.telegram.ui.Components.i70
    public final void a(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.I;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.J;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    @Override // org.telegram.ui.Components.i70
    public final void b(Canvas canvas, float f9) {
        float lerp;
        float lerp2;
        float lerp3;
        float f10;
        float f11;
        int i10 = this.G;
        if (i10 != 0) {
            Paint paint = this.H;
            paint.setColor(i10);
            paint.setAlpha((int) (Color.alpha(this.G) * f9));
            float f12 = this.L.c;
            float f13 = this.x.c;
            if (this.d0) {
                lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f12) - this.I;
                lerp3 = getCircleHeight() * f12;
                lerp2 = ((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (lerp3 / 2.0f);
            } else {
                lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f12) - this.I, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f13);
                lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f13);
                lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f13) * f12;
            }
            float lerp4 = AndroidUtilities.lerp(getCircleWidth(), this.w.d() + AndroidUtilities.dp(this.A ? 20.0f : 22.0f), f13) * f12;
            if (f12 > 0.0f && lerp4 > 0.0f && lerp3 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f14 = lerp3 / 2.0f;
                rectF.set(lerp - lerp4, lerp2 - f14, lerp, f14 + lerp2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                float min = (Math.min(lerp4, lerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            n6 n6Var = this.V;
            float g10 = (1.0f - f13) * n6Var.g();
            if (g10 > 0.0f) {
                float max = Math.max(n6Var.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                if (this.d0) {
                    f10 = lerp - AndroidUtilities.dp(50.0f);
                    f11 = (max / 2.0f) + (lerp2 - (getCircleHeight() / 2.0f));
                } else {
                    float f15 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.I) - f15;
                    float measuredHeight = (getMeasuredHeight() - this.J) - f15;
                    f10 = measuredWidth;
                    f11 = measuredHeight;
                }
                canvas.drawCircle(f10, f11, ((max / 2.0f) + AndroidUtilities.dp(2.0f)) * g10 * this.W, paint);
            }
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.f0 = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 8));
        this.f0.addListener(new org.telegram.ui.bm(this, 11));
        this.f0.setDuration(180L);
        this.f0.setInterpolator(new OvershootInterpolator());
        this.f0.start();
    }

    public boolean d() {
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.B) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        float dp = AndroidUtilities.dp(18.0f);
        RectF rectF = this.g0;
        float f9 = dp / 2.0f;
        float dp2 = (rectF.left + f9) - AndroidUtilities.dp(6.0f);
        float dp3 = (rectF.top + f9) - AndroidUtilities.dp(6.0f);
        canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(2.0f) + f9, org.telegram.ui.ActionBar.g6.Il);
        canvas.drawCircle(dp2, dp3, f9, this.y);
        if (this.C == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.C = mutate;
            int i10 = this.e0;
            this.D = i10;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (this.D != this.e0) {
            Drawable drawable = this.C;
            int i11 = this.e0;
            this.D = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.C.setBounds((int) (dp2 - AndroidUtilities.dp(8.0f)), (int) (dp3 - AndroidUtilities.dp(8.0f)), (int) (dp2 + AndroidUtilities.dp(8.0f)), (int) (dp3 + AndroidUtilities.dp(8.0f)));
        this.C.draw(canvas);
        canvas.restore();
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public final void g(int i10, boolean z10) {
        this.V.q(i10 > 0 ? j7.l1.k(i10, "") : "", z10, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i10 = this.F;
        return i10 >= 0 ? i10 : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getCircleWidth() {
        int i10 = this.E;
        return i10 >= 0 ? i10 : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yd, this.a);
    }

    public final void h(boolean z10) {
        if (this.P == z10 && (!z10 || Math.abs(this.Q - (-3.0f)) < 0.01f)) {
            if (this.N == (Math.abs(0.0f) < 0.01f)) {
                return;
            }
        }
        this.N = Math.abs(0.0f) < 0.01f;
        if (!this.P && z10) {
            this.S.d(0.0f, true);
        }
        d6 d6Var = this.R;
        d6Var.f = (!z10 || d6Var.c < 1.0f) ? 0L : 650L;
        this.P = z10;
        this.Q = z10 ? -3.0f : 1.0f;
        invalidate();
    }

    public final void i(int i10, long j10, boolean z10) {
        if (this.r == j10 && this.s == i10) {
            return;
        }
        this.r = j10;
        this.s = i10;
        n6 n6Var = this.w;
        if (j10 > 0) {
            n6Var.q(jh.ia.V0(false, j7.l1.m(j10 * Math.max(1, this.s), ',', new StringBuilder("⭐️")), this.K), z10, true);
        } else {
            n6Var.q("", z10, true);
        }
        if (z10) {
            invalidate();
        } else {
            this.x.a(this.r > 0);
        }
    }

    public boolean j() {
        return this instanceof yh;
    }

    public final void k() {
        boolean z10 = this.A;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        int v02 = z10 ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yd, c6Var);
        if (v02 != this.e0) {
            this.e0 = v02;
            Drawable drawable = this.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var);
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(v03), Color.green(v03), Color.blue(v03)), mode));
            this.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bf, c6Var), mode));
        }
        boolean z11 = this.A;
        Paint paint = this.y;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yd, c6Var));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(i0.a.k(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        return (int) AndroidUtilities.lerp(this.I + getCircleWidth() + this.I, AndroidUtilities.dp(this.A ? 20.0f : 22.0f) + AndroidUtilities.dp(18.0f) + this.w.d, (this.r > 0 ? 1.0f : 0.0f) * (f() ? 1.0f : 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int v;
        int measuredHeight;
        float f9;
        float f10;
        float lerp;
        float lerp2;
        float lerp3;
        int i10;
        float f11;
        float f12;
        float measuredWidth;
        float measuredHeight2;
        float f13;
        int i11;
        float f14;
        int i12;
        int i13;
        float f15;
        float f16;
        int save = canvas.save();
        if (this.A) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        }
        k();
        float dpf2 = AndroidUtilities.dpf2(3.0f);
        float dpf22 = AndroidUtilities.dpf2(38.0f);
        float dpf23 = AndroidUtilities.dpf2(20.0f);
        n6 n6Var = this.w;
        RectF rectF = this.g0;
        rectF.set((getMeasuredWidth() - AndroidUtilities.lerp(Math.max(dpf22, n6Var.d() + dpf23), dpf22, this.n)) - dpf2, (getMeasuredHeight() - dpf22) - dpf2, getMeasuredWidth() - dpf2, getMeasuredHeight() - dpf2);
        boolean z10 = this.A;
        Paint paint = this.y;
        if (z10) {
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        Drawable drawable = e() ? this.d : this.c;
        if (this.A) {
            v = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
        } else {
            v = org.telegram.ui.b.v(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
            measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= AndroidUtilities.dp(1.0f);
            } else {
                v += AndroidUtilities.dp(2.0f);
            }
        }
        int i14 = v;
        int i15 = measuredHeight;
        float e10 = this.R.e(this.P);
        float e11 = this.L.e(f());
        float e12 = this.x.e(this.r > 0 && !this.v) * (1.0f - this.h);
        float d = this.a0.d(1.0f, false);
        if (e11 < 1.0f) {
            canvas2.save();
            f10 = 2.0f;
            float f17 = 1.0f - d;
            canvas2.translate((-AndroidUtilities.dp(24.0f)) * f17, AndroidUtilities.dp(24.0f) * f17);
            float lerp4 = AndroidUtilities.lerp(0.35f, 1.0f, d);
            float f18 = i14;
            float f19 = i15;
            f9 = e10;
            canvas2.scale(lerp4, lerp4, (drawable.getIntrinsicWidth() / 2.0f) + f18, (drawable.getIntrinsicHeight() / 2.0f) + f19);
            canvas2.rotate(60.0f * f17, (drawable.getIntrinsicWidth() / 2.0f) + f18, (drawable.getIntrinsicHeight() / 2.0f) + f19);
            drawable.setBounds(i14, i15, drawable.getIntrinsicWidth() + i14, drawable.getIntrinsicHeight() + i15);
            drawable.setAlpha((int) ((1.0f - e12) * 255.0f));
            drawable.draw(canvas2);
            canvas2.restore();
        } else {
            f9 = e10;
            f10 = 2.0f;
        }
        if (this.d0) {
            lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f10), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e11) - this.I;
            lerp3 = getCircleHeight() * e11;
            lerp2 = ((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (lerp3 / f10);
        } else {
            lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f10), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e11) - this.I, getMeasuredWidth() - AndroidUtilities.dp(9.0f), e12);
            lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.J) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f10), getMeasuredHeight() - AndroidUtilities.dp(24.0f), e12);
            lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), e12) * e11;
        }
        float f20 = lerp3;
        float f21 = lerp;
        float lerp5 = AndroidUtilities.lerp(getCircleWidth(), n6Var.d() + AndroidUtilities.dp(this.A ? 20.0f : 22.0f), e12);
        float lerp6 = AndroidUtilities.lerp(lerp5, f20, this.n) * e11;
        float f22 = lerp5 - lerp6;
        float f23 = f21 - (lerp6 / f10);
        setPivotX(f23);
        setPivotY(lerp2);
        float lerp7 = AndroidUtilities.lerp(1.0f, 0.79f, this.h);
        if (e11 > 0.0f) {
            canvas2.save();
            Path path = this.T;
            path.rewind();
            f12 = 0.0f;
            float min = Math.min(lerp6, f20) / f10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f24 = f20 / f10;
            float f25 = lerp2 - f24;
            i10 = save;
            float f26 = lerp2 + f24;
            rectF2.set(f21 - lerp6, f25, f21, f26);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.b0 == null) {
                    f11 = f21;
                    this.b0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f11 = f21;
                }
                i11 = i14;
                this.b0.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                jf.r.d(this.b0, centerX, centerY, 17);
                jf.r.b(canvas2, this.b0, this.h);
            } else {
                f11 = f21;
                i11 = i14;
            }
            canvas2.scale(lerp7, lerp7, centerX, centerY);
            if (this.c0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                this.c0.setBounds(rect);
                this.c0.draw(canvas2);
            }
            if (!this.A) {
                canvas2.drawPath(path, paint);
            }
            canvas2.clipPath(path);
            int i16 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                Paint paint2 = this.U;
                paint2.setColor(-1);
                paint2.setAlpha((int) (f9 * 255.0f));
                float dp = AndroidUtilities.dp(8.66f);
                rectF2.set(f23 - dp, lerp2 - dp, f23 + dp, dp + lerp2);
                if (this.N) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f27 = (1520 * currentTimeMillis) / 5400.0f;
                    float max = Math.max(0.0f, f27 - 20.0f);
                    int i17 = 0;
                    while (i17 < 4) {
                        int i18 = i17 * 1350;
                        u1.a aVar = this.O;
                        f27 += aVar.getInterpolation((r33 - i18) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation((r33 - (i18 + 667)) / 667.0f) * 250.0f;
                        i17++;
                        currentTimeMillis = currentTimeMillis;
                    }
                    canvas2 = canvas;
                    f14 = f9;
                    i12 = i15;
                    f12 = 0.0f;
                    i13 = i16;
                    f15 = f23;
                    canvas2.drawArc(AndroidUtilities.rectTmp, max, f27 - max, false, paint2);
                } else {
                    f14 = f9;
                    i12 = i15;
                    i13 = i16;
                    f15 = f23;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f) - 90.0f, this.S.d(this.Q, false) * 360.0f, false, paint2);
                }
                canvas2.save();
                float lerp8 = AndroidUtilities.lerp(1.0f, 0.6f, f14);
                canvas2.scale(lerp8, lerp8, f15, lerp2);
                invalidate();
            } else {
                f14 = f9;
                i12 = i15;
                i13 = i16;
                f15 = f23;
            }
            if (e12 > f12) {
                if (this.d0) {
                    n6Var.l((f11 - n6Var.d) - AndroidUtilities.dp(11.0f), f25, f11 - AndroidUtilities.dp(11.0f), f26);
                } else if (this.A) {
                    n6Var.l(rectF.left + AndroidUtilities.dp(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    n6Var.l((getMeasuredWidth() - n6Var.d) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                }
                f16 = 1.0f;
                n6Var.w = (int) ((1.0f - f14) * e12 * 255.0f);
                n6Var.draw(canvas2);
            } else {
                f16 = 1.0f;
            }
            this.e.setAlpha((int) ((f16 - e12) * (f16 - f14) * 255.0f));
            if (this.E > 0) {
                this.e.setBounds((int) (f15 - (r2.getIntrinsicWidth() / f10)), (int) (lerp2 - (this.e.getIntrinsicHeight() / f10)), (int) ((this.e.getIntrinsicWidth() / f10) + f15), (int) ((this.e.getIntrinsicHeight() / f10) + lerp2));
            } else {
                this.e.setBounds(i11, i12, drawable.getIntrinsicWidth() + i11, drawable.getIntrinsicHeight() + i12);
            }
            this.e.draw(canvas2);
            if (i13 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            i10 = save;
            f11 = f21;
            f12 = 0.0f;
        }
        n6 n6Var2 = this.V;
        float g10 = (1.0f - e12) * n6Var2.g();
        if (!this.B) {
            float max2 = Math.max(n6Var2.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
            if (this.d0) {
                measuredWidth = (f11 - AndroidUtilities.dp(50.0f)) + f22;
                measuredHeight2 = (max2 / f10) + (lerp2 - (getCircleHeight() / f10));
                f13 = AndroidUtilities.dp(0.66f);
            } else {
                float f28 = max2 / f10;
                measuredWidth = (getMeasuredWidth() - this.I) - f28;
                measuredHeight2 = (getMeasuredHeight() - this.J) - f28;
                f13 = 0.0f;
            }
            float f29 = max2 / f10;
            n6Var2.setBounds((int) (measuredWidth - f29), (int) ((measuredHeight2 - f29) - f13), (int) (measuredWidth + f29), (int) ((measuredHeight2 + f29) - f13));
            if (g10 > f12) {
                float lerp9 = AndroidUtilities.lerp(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(lerp9, lerp9, measuredWidth, measuredHeight2);
                if (!this.A) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (AndroidUtilities.dp(f10) + f29) * g10 * this.W, org.telegram.ui.ActionBar.g6.Il);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f29 * g10 * this.W, paint);
                }
                n6Var2.w = (int) (g10 * 255.0f);
                n6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (g10 < 1.0f) {
            int dp2 = AndroidUtilities.dp(8.0f);
            int lerp10 = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f10)) - this.I) + AndroidUtilities.dp(12.0f), f11 - AndroidUtilities.dp(f10), e12);
            int lerp11 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f10)) - this.J) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), e12);
            int i19 = lerp10 - dp2;
            int i20 = lerp11 - dp2;
            int i21 = lerp10 + dp2;
            int i22 = lerp11 + dp2;
            n5 n5Var = this.f;
            n5Var.setBounds(i19, i20, i21, i22);
            n5Var.v = (int) ((1.0f - g10) * 255.0f);
            n5Var.draw(canvas2);
        }
        if (!this.A) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i10);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) org.telegram.messenger.AndroidUtilities.lerp((r9.J + getCircleHeight()) + r9.J, org.telegram.messenger.AndroidUtilities.dp(32.0f), r9.r > 0 ? 1.0f : 0.0f)))) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getX() >= getWidth() - l()) {
                float y8 = motionEvent.getY();
                int height = getHeight();
                getMeasuredHeight();
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlurredBackgroundDrawable(ng.d dVar) {
        this.c0 = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.c0.o(AndroidUtilities.dp(4.0f));
    }

    public void setCircleSize(int i10) {
        this.E = i10;
        this.F = i10;
    }

    public void setEffect(long j10) {
        TLRPC.TL_availableEffect effect = MessagesController.getInstance(UserConfig.selectedAccount).getEffect(j10);
        setEmoji(effect != null ? Emoji.getEmojiDrawable(effect.emoticon) : null);
    }

    public void setEmoji(Drawable drawable) {
        this.f.g(drawable, true);
    }

    public void setEphemeralFactor(float f9) {
        if (this.h != f9) {
            this.h = f9;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.B == z10) {
            return;
        }
        this.B = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.M.c(z10);
    }

    public void setResourceId(int i10) {
        if (this.b != i10) {
            this.b = i10;
            this.c = getContext().getResources().getDrawable(i10).mutate();
            this.d = getContext().getResources().getDrawable(i10).mutate();
            this.e = getContext().getResources().getDrawable(i10).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f9) {
        if (this.n != f9) {
            this.n = f9;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i10) {
        this.G = i10;
        this.H.setColor(i10);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.V || drawable == this.f || drawable == this.w || super.verifyDrawable(drawable);
    }
}
