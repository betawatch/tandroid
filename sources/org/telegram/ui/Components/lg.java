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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class lg extends View implements o70 {
    public boolean B;
    public boolean C;
    public Drawable D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final Paint I;
    public float J;
    public float K;
    public final lq[] L;
    public final z5 M;
    public final rc N;
    public boolean O;
    public final u1.a P;
    public boolean Q;
    public float R;
    public final z5 S;
    public final z5 T;
    public final Path U;
    public final Paint V;
    public final j6 W;
    public final org.telegram.ui.ActionBar.f6 a;
    public float a0;
    public int b;
    public final z5 b0;
    public Drawable c;
    public Drawable c0;
    public Drawable d;
    public pg.b d0;
    public Drawable e;
    public boolean e0;
    public final j5 f;
    public int f0;
    public ValueAnimator g0;
    public float h;
    public final RectF h0;
    public float n;
    public long r;
    public int s;
    public boolean v;
    public final j6 w;
    public final z5 x;
    public final Paint y;

    public lg(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        mr mrVar = mr.h;
        this.x = new z5(this, 0L, 320L, mrVar);
        this.y = new Paint(1);
        this.F = -1;
        this.G = -1;
        this.I = new Paint(1);
        this.L = new lq[1];
        this.M = new z5(this, 0L, 420L, mrVar);
        this.N = new rc(this);
        this.P = new u1.a();
        this.S = new z5(this, 0L, 420L, mrVar);
        this.T = new z5(this, 0L, 500L, mrVar);
        this.U = new Path();
        Paint paint = new Paint(1);
        this.V = paint;
        j6 j6Var = new j6(true, true, true, false);
        this.W = j6Var;
        this.a0 = 1.0f;
        this.b0 = new z5(this, 0L, 320L, mrVar);
        this.h0 = new RectF();
        this.b = i10;
        this.a = f6Var;
        this.B = z4;
        j6 j6Var2 = new j6(false, false, false, false);
        this.w = j6Var2;
        j6Var2.t(AndroidUtilities.dp(15.0f));
        j6Var2.u(AndroidUtilities.bold());
        j6Var2.r(-1);
        j6Var2.b = 3;
        j6Var2.setCallback(this);
        j6Var2.G = AndroidUtilities.displaySize.x;
        this.c = context.getResources().getDrawable(i10).mutate();
        this.d = context.getResources().getDrawable(i10).mutate();
        this.e = context.getResources().getDrawable(i10).mutate();
        this.f = new j5(AndroidUtilities.dp(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        j6Var.setCallback(this);
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(12.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.b = 17;
    }

    @Override // org.telegram.ui.Components.o70
    public final void a(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.J;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.K;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    @Override // org.telegram.ui.Components.o70
    public final void b(Canvas canvas, float f10) {
        float lerp;
        float lerp2;
        float lerp3;
        float f11;
        float f12;
        int i10 = this.H;
        if (i10 != 0) {
            Paint paint = this.I;
            paint.setColor(i10);
            paint.setAlpha((int) (Color.alpha(this.H) * f10));
            float f13 = this.M.c;
            float f14 = this.x.c;
            if (this.e0) {
                lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f13) - this.J;
                lerp3 = getCircleHeight() * f13;
                lerp2 = ((getMeasuredHeight() - this.K) - AndroidUtilities.dp(4.0f)) - (lerp3 / 2.0f);
            } else {
                lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f13) - this.J, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f14);
                lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.K) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f14);
                lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f14) * f13;
            }
            float lerp4 = AndroidUtilities.lerp(getCircleWidth(), this.w.d() + AndroidUtilities.dp(this.B ? 20.0f : 22.0f), f14) * f13;
            if (f13 > 0.0f && lerp4 > 0.0f && lerp3 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f15 = lerp3 / 2.0f;
                rectF.set(lerp - lerp4, lerp2 - f15, lerp, f15 + lerp2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                float min = (Math.min(lerp4, lerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            j6 j6Var = this.W;
            float g10 = (1.0f - f14) * j6Var.g();
            if (g10 > 0.0f) {
                float max = Math.max(j6Var.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                if (this.e0) {
                    f11 = lerp - AndroidUtilities.dp(50.0f);
                    f12 = (max / 2.0f) + (lerp2 - (getCircleHeight() / 2.0f));
                } else {
                    float f16 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.J) - f16;
                    float measuredHeight = (getMeasuredHeight() - this.K) - f16;
                    f11 = measuredWidth;
                    f12 = measuredHeight;
                }
                canvas.drawCircle(f11, f12, ((max / 2.0f) + AndroidUtilities.dp(2.0f)) * g10 * this.a0, paint);
            }
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 8));
        this.g0.addListener(new a9(this, 2));
        this.g0.setDuration(180L);
        this.g0.setInterpolator(new OvershootInterpolator());
        this.g0.start();
    }

    public boolean d() {
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.C) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        float dp = AndroidUtilities.dp(18.0f);
        RectF rectF = this.h0;
        float f10 = dp / 2.0f;
        float dp2 = (rectF.left + f10) - AndroidUtilities.dp(6.0f);
        float dp3 = (rectF.top + f10) - AndroidUtilities.dp(6.0f);
        canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(2.0f) + f10, org.telegram.ui.ActionBar.j6.Il);
        canvas.drawCircle(dp2, dp3, f10, this.y);
        if (this.D == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.D = mutate;
            int i10 = this.f0;
            this.E = i10;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (this.E != this.f0) {
            Drawable drawable = this.D;
            int i11 = this.f0;
            this.E = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.D.setBounds((int) (dp2 - AndroidUtilities.dp(8.0f)), (int) (dp3 - AndroidUtilities.dp(8.0f)), (int) (dp2 + AndroidUtilities.dp(8.0f)), (int) (dp3 + AndroidUtilities.dp(8.0f)));
        this.D.draw(canvas);
        canvas.restore();
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public final void g(int i10, boolean z4) {
        this.W.q(i10 > 0 ? kf.k0.j(i10, "") : "", z4, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i10 = this.G;
        return i10 >= 0 ? i10 : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getCircleWidth() {
        int i10 = this.F;
        return i10 >= 0 ? i10 : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, this.a);
    }

    public final void h(boolean z4) {
        if (this.Q == z4 && (!z4 || Math.abs(this.R - (-3.0f)) < 0.01f)) {
            if (this.O == (Math.abs(0.0f) < 0.01f)) {
                return;
            }
        }
        this.O = Math.abs(0.0f) < 0.01f;
        if (!this.Q && z4) {
            this.T.d(0.0f, true);
        }
        z5 z5Var = this.S;
        z5Var.f = (!z4 || z5Var.c < 1.0f) ? 0L : 650L;
        this.Q = z4;
        this.R = z4 ? -3.0f : 1.0f;
        invalidate();
    }

    public final void i(int i10, long j10, boolean z4) {
        if (this.r == j10 && this.s == i10) {
            return;
        }
        this.r = j10;
        this.s = i10;
        j6 j6Var = this.w;
        if (j10 > 0) {
            j6Var.q(lh.ja.V0(false, kf.k0.l(j10 * Math.max(1, this.s), ',', new StringBuilder("⭐️")), this.L), z4, true);
        } else {
            j6Var.q("", z4, true);
        }
        if (z4) {
            invalidate();
        } else {
            this.x.a(this.r > 0);
        }
    }

    public boolean j() {
        return this instanceof vh;
    }

    public final void k() {
        boolean z4 = this.B;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int v02 = z4 ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, f6Var);
        if (v02 != this.f0) {
            this.f0 = v02;
            Drawable drawable = this.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var);
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(v03), Color.green(v03), Color.blue(v03)), mode));
            this.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bf, f6Var), mode));
        }
        boolean z10 = this.B;
        Paint paint = this.y;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yd, f6Var));
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
        return (int) AndroidUtilities.lerp(this.J + getCircleWidth() + this.J, AndroidUtilities.dp(this.B ? 20.0f : 22.0f) + AndroidUtilities.dp(18.0f) + this.w.d, (this.r > 0 ? 1.0f : 0.0f) * (f() ? 1.0f : 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int u10;
        int measuredHeight;
        float f10;
        float f11;
        float lerp;
        float lerp2;
        float lerp3;
        int i10;
        float f12;
        float f13;
        float measuredWidth;
        float measuredHeight2;
        float f14;
        int i11;
        float f15;
        int i12;
        int i13;
        float f16;
        float f17;
        int save = canvas.save();
        if (this.B) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        }
        k();
        float dpf2 = AndroidUtilities.dpf2(3.0f);
        float dpf22 = AndroidUtilities.dpf2(38.0f);
        float dpf23 = AndroidUtilities.dpf2(20.0f);
        j6 j6Var = this.w;
        RectF rectF = this.h0;
        rectF.set((getMeasuredWidth() - AndroidUtilities.lerp(Math.max(dpf22, j6Var.d() + dpf23), dpf22, this.n)) - dpf2, (getMeasuredHeight() - dpf22) - dpf2, getMeasuredWidth() - dpf2, getMeasuredHeight() - dpf2);
        boolean z4 = this.B;
        Paint paint = this.y;
        if (z4) {
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        Drawable drawable = e() ? this.d : this.c;
        if (this.B) {
            u10 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
        } else {
            u10 = org.telegram.ui.b.u(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
            measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= AndroidUtilities.dp(1.0f);
            } else {
                u10 += AndroidUtilities.dp(2.0f);
            }
        }
        int i14 = u10;
        int i15 = measuredHeight;
        float e = this.S.e(this.Q);
        float e6 = this.M.e(f());
        float e10 = this.x.e(this.r > 0 && !this.v) * (1.0f - this.h);
        float d = this.b0.d(1.0f, false);
        if (e6 < 1.0f) {
            canvas2.save();
            f11 = 2.0f;
            float f18 = 1.0f - d;
            canvas2.translate((-AndroidUtilities.dp(24.0f)) * f18, AndroidUtilities.dp(24.0f) * f18);
            float lerp4 = AndroidUtilities.lerp(0.35f, 1.0f, d);
            float f19 = i14;
            float f20 = i15;
            f10 = e;
            canvas2.scale(lerp4, lerp4, (drawable.getIntrinsicWidth() / 2.0f) + f19, (drawable.getIntrinsicHeight() / 2.0f) + f20);
            canvas2.rotate(60.0f * f18, (drawable.getIntrinsicWidth() / 2.0f) + f19, (drawable.getIntrinsicHeight() / 2.0f) + f20);
            drawable.setBounds(i14, i15, drawable.getIntrinsicWidth() + i14, drawable.getIntrinsicHeight() + i15);
            drawable.setAlpha((int) ((1.0f - e10) * 255.0f));
            drawable.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = e;
            f11 = 2.0f;
        }
        if (this.e0) {
            lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e6) - this.J;
            lerp3 = getCircleHeight() * e6;
            lerp2 = ((getMeasuredHeight() - this.K) - AndroidUtilities.dp(4.0f)) - (lerp3 / f11);
        } else {
            lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e6) - this.J, getMeasuredWidth() - AndroidUtilities.dp(9.0f), e10);
            lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.K) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f11), getMeasuredHeight() - AndroidUtilities.dp(24.0f), e10);
            lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), e10) * e6;
        }
        float f21 = lerp3;
        float f22 = lerp;
        float lerp5 = AndroidUtilities.lerp(getCircleWidth(), j6Var.d() + AndroidUtilities.dp(this.B ? 20.0f : 22.0f), e10);
        float lerp6 = AndroidUtilities.lerp(lerp5, f21, this.n) * e6;
        float f23 = lerp5 - lerp6;
        float f24 = f22 - (lerp6 / f11);
        setPivotX(f24);
        setPivotY(lerp2);
        float lerp7 = AndroidUtilities.lerp(1.0f, 0.79f, this.h);
        if (e6 > 0.0f) {
            canvas2.save();
            Path path = this.U;
            path.rewind();
            f13 = 0.0f;
            float min = Math.min(lerp6, f21) / f11;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f25 = f21 / f11;
            float f26 = lerp2 - f25;
            i10 = save;
            float f27 = lerp2 + f25;
            rectF2.set(f22 - lerp6, f26, f22, f27);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.c0 == null) {
                    f12 = f22;
                    this.c0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f12 = f22;
                }
                i11 = i14;
                this.c0.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                kf.r.d(this.c0, centerX, centerY, 17);
                kf.r.b(canvas2, this.c0, this.h);
            } else {
                f12 = f22;
                i11 = i14;
            }
            canvas2.scale(lerp7, lerp7, centerX, centerY);
            if (this.d0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                this.d0.setBounds(rect);
                this.d0.draw(canvas2);
            }
            if (!this.B) {
                canvas2.drawPath(path, paint);
            }
            canvas2.clipPath(path);
            int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                Paint paint2 = this.V;
                paint2.setColor(-1);
                paint2.setAlpha((int) (f10 * 255.0f));
                float dp = AndroidUtilities.dp(8.66f);
                rectF2.set(f24 - dp, lerp2 - dp, f24 + dp, dp + lerp2);
                if (this.O) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f28 = (1520 * currentTimeMillis) / 5400.0f;
                    float max = Math.max(0.0f, f28 - 20.0f);
                    int i17 = 0;
                    while (i17 < 4) {
                        int i18 = i17 * 1350;
                        u1.a aVar = this.P;
                        f28 += aVar.getInterpolation((r33 - i18) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation((r33 - (i18 + 667)) / 667.0f) * 250.0f;
                        i17++;
                        currentTimeMillis = currentTimeMillis;
                    }
                    canvas2 = canvas;
                    f15 = f10;
                    i12 = i15;
                    f13 = 0.0f;
                    i13 = i16;
                    f16 = f24;
                    canvas2.drawArc(AndroidUtilities.rectTmp, max, f28 - max, false, paint2);
                } else {
                    f15 = f10;
                    i12 = i15;
                    i13 = i16;
                    f16 = f24;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f) - 90.0f, this.T.d(this.R, false) * 360.0f, false, paint2);
                }
                canvas2.save();
                float lerp8 = AndroidUtilities.lerp(1.0f, 0.6f, f15);
                canvas2.scale(lerp8, lerp8, f16, lerp2);
                invalidate();
            } else {
                f15 = f10;
                i12 = i15;
                i13 = i16;
                f16 = f24;
            }
            if (e10 > f13) {
                if (this.e0) {
                    j6Var.l((f12 - j6Var.d) - AndroidUtilities.dp(11.0f), f26, f12 - AndroidUtilities.dp(11.0f), f27);
                } else if (this.B) {
                    j6Var.l(rectF.left + AndroidUtilities.dp(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    j6Var.l((getMeasuredWidth() - j6Var.d) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                }
                f17 = 1.0f;
                j6Var.w = (int) ((1.0f - f15) * e10 * 255.0f);
                j6Var.draw(canvas2);
            } else {
                f17 = 1.0f;
            }
            this.e.setAlpha((int) ((f17 - e10) * (f17 - f15) * 255.0f));
            if (this.F > 0) {
                this.e.setBounds((int) (f16 - (r2.getIntrinsicWidth() / f11)), (int) (lerp2 - (this.e.getIntrinsicHeight() / f11)), (int) ((this.e.getIntrinsicWidth() / f11) + f16), (int) ((this.e.getIntrinsicHeight() / f11) + lerp2));
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
            f12 = f22;
            f13 = 0.0f;
        }
        j6 j6Var2 = this.W;
        float g10 = (1.0f - e10) * j6Var2.g();
        if (!this.C) {
            float max2 = Math.max(j6Var2.d() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
            if (this.e0) {
                measuredWidth = (f12 - AndroidUtilities.dp(50.0f)) + f23;
                measuredHeight2 = (max2 / f11) + (lerp2 - (getCircleHeight() / f11));
                f14 = AndroidUtilities.dp(0.66f);
            } else {
                float f29 = max2 / f11;
                measuredWidth = (getMeasuredWidth() - this.J) - f29;
                measuredHeight2 = (getMeasuredHeight() - this.K) - f29;
                f14 = 0.0f;
            }
            float f30 = max2 / f11;
            j6Var2.setBounds((int) (measuredWidth - f30), (int) ((measuredHeight2 - f30) - f14), (int) (measuredWidth + f30), (int) ((measuredHeight2 + f30) - f14));
            if (g10 > f13) {
                float lerp9 = AndroidUtilities.lerp(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(lerp9, lerp9, measuredWidth, measuredHeight2);
                if (!this.B) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (AndroidUtilities.dp(f11) + f30) * g10 * this.a0, org.telegram.ui.ActionBar.j6.Il);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f30 * g10 * this.a0, paint);
                }
                j6Var2.w = (int) (g10 * 255.0f);
                j6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (g10 < 1.0f) {
            int dp2 = AndroidUtilities.dp(8.0f);
            int lerp10 = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f11)) - this.J) + AndroidUtilities.dp(12.0f), f12 - AndroidUtilities.dp(f11), e10);
            int lerp11 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f11)) - this.K) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), e10);
            int i19 = lerp10 - dp2;
            int i20 = lerp11 - dp2;
            int i21 = lerp10 + dp2;
            int i22 = lerp11 + dp2;
            j5 j5Var = this.f;
            j5Var.setBounds(i19, i20, i21, i22);
            j5Var.v = (int) ((1.0f - g10) * 255.0f);
            j5Var.draw(canvas2);
        }
        if (!this.B) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i10);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) org.telegram.messenger.AndroidUtilities.lerp((r9.K + getCircleHeight()) + r9.K, org.telegram.messenger.AndroidUtilities.dp(32.0f), r9.r > 0 ? 1.0f : 0.0f)))) goto L14;
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
                float y10 = motionEvent.getY();
                int height = getHeight();
                getMeasuredHeight();
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlurredBackgroundDrawable(pg.b bVar) {
        this.d0 = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.d0.o(AndroidUtilities.dp(4.0f));
    }

    public void setCircleSize(int i10) {
        this.F = i10;
        this.G = i10;
    }

    public void setEffect(long j10) {
        TLRPC.TL_availableEffect effect = MessagesController.getInstance(UserConfig.selectedAccount).getEffect(j10);
        setEmoji(effect != null ? Emoji.getEmojiDrawable(effect.emoticon) : null);
    }

    public void setEmoji(Drawable drawable) {
        this.f.g(drawable, true);
    }

    public void setEphemeralFactor(float f10) {
        if (this.h != f10) {
            this.h = f10;
            invalidate();
        }
    }

    public void setLocked(boolean z4) {
        if (this.C == z4) {
            return;
        }
        this.C = z4;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        this.N.c(z4);
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

    public void setSameWidthFactor(float f10) {
        if (this.n != f10) {
            this.n = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i10) {
        this.H = i10;
        this.I.setColor(i10);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.W || drawable == this.f || drawable == this.w || super.verifyDrawable(drawable);
    }
}
