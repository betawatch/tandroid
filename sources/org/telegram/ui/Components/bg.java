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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class bg extends View implements e60 {
    public final Paint E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final Paint M;
    public float N;
    public float O;
    public final wp[] P;
    public final u5 Q;
    public final gc R;
    public boolean S;
    public final w1.a T;
    public boolean U;
    public float V;
    public final u5 W;
    public final org.telegram.ui.ActionBar.e6 a;
    public final u5 a0;
    public int b;
    public final Path b0;
    public Drawable c;
    public final Paint c0;
    public Drawable d;
    public final g6 d0;
    public Drawable e;
    public float e0;
    public final e5 f;
    public final u5 f0;
    public Drawable g0;
    public float h;
    public gh.g h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public ValueAnimator m0;
    public float n;
    public final RectF n0;
    public long r;
    public int s;
    public boolean w;
    public final g6 x;
    public final u5 y;

    public bg(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        xq xqVar = xq.h;
        this.y = new u5(this, 0L, 320L, xqVar);
        this.E = new Paint(1);
        this.J = -1;
        this.K = -1;
        this.M = new Paint(1);
        this.P = new wp[1];
        this.Q = new u5(this, 0L, 420L, xqVar);
        this.R = new gc(this);
        this.T = new w1.a();
        this.W = new u5(this, 0L, 420L, xqVar);
        this.a0 = new u5(this, 0L, 500L, xqVar);
        this.b0 = new Path();
        Paint paint = new Paint(1);
        this.c0 = paint;
        g6 g6Var = new g6(true, true, true);
        this.d0 = g6Var;
        this.e0 = 1.0f;
        this.f0 = new u5(this, 0L, 320L, xqVar);
        this.n0 = new RectF();
        this.b = i3;
        this.a = e6Var;
        this.F = z10;
        g6 g6Var2 = new g6(false, false, false);
        this.x = g6Var2;
        g6Var2.w(org.telegram.messenger.g0.L(15.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(-1);
        g6Var2.b = 3;
        g6Var2.setCallback(this);
        g6Var2.M = org.telegram.messenger.g0.q.x;
        this.c = k2.p1.g(context, i3);
        this.d = k2.p1.g(context, i3);
        this.e = k2.p1.g(context, i3);
        this.f = new e5(org.telegram.messenger.g0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        g6Var.setCallback(this);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(12.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.m0 = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 8));
        this.m0.addListener(new x5(this, 7));
        this.m0.setDuration(180L);
        this.m0.setInterpolator(new OvershootInterpolator());
        this.m0.start();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public abstract boolean d();

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.G) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
        super.draw(canvas);
        float L = org.telegram.messenger.g0.L(18.0f);
        RectF rectF = this.n0;
        float f10 = L / 2.0f;
        float L2 = (rectF.left + f10) - org.telegram.messenger.g0.L(6.0f);
        float L3 = (rectF.top + f10) - org.telegram.messenger.g0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(2.0f) + f10, org.telegram.ui.ActionBar.k6.Cm);
        canvas.drawCircle(L2, L3, f10, this.E);
        if (this.H == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.H = mutate;
            int i3 = this.j0;
            this.I = i3;
            mutate.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
        if (this.I != this.j0) {
            Drawable drawable = this.H;
            int i10 = this.j0;
            this.I = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.H.setBounds((int) (L2 - org.telegram.messenger.g0.L(8.0f)), (int) (L3 - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + org.telegram.messenger.g0.L(8.0f)), (int) (L3 + org.telegram.messenger.g0.L(8.0f)));
        this.H.draw(canvas);
        canvas.restore();
    }

    public final void e(int i3, boolean z10) {
        this.d0.t(i3 > 0 ? k2.p1.i(i3, "") : "", z10, true);
        invalidate();
    }

    public final void f(boolean z10) {
        if (this.U == z10 && (!z10 || Math.abs(this.V - (-3.0f)) < 0.01f)) {
            if (this.S == (Math.abs(0.0f) < 0.01f)) {
                return;
            }
        }
        this.S = Math.abs(0.0f) < 0.01f;
        if (!this.U && z10) {
            this.a0.e(true, 0.0f);
        }
        u5 u5Var = this.W;
        u5Var.f = (!z10 || u5Var.c < 1.0f) ? 0L : 650L;
        this.U = z10;
        this.V = z10 ? -3.0f : 1.0f;
        invalidate();
    }

    @Override // org.telegram.ui.Components.e60
    public final void g(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f)) - this.N;
        float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f)) - this.O;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    public int getCircleHeight() {
        int i3 = this.K;
        return i3 >= 0 ? i3 : getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getCircleWidth() {
        int i3 = this.J;
        return i3 >= 0 ? i3 : getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, this.a);
    }

    @Override // org.telegram.ui.Components.e60
    public final void h(Canvas canvas, float f10) {
        float T1;
        float T12;
        float W1;
        float f11;
        float f12;
        int i3 = this.L;
        if (i3 != 0) {
            Paint paint = this.M;
            paint.setColor(i3);
            paint.setAlpha((int) (Color.alpha(this.L) * f10));
            float f13 = this.Q.c;
            float f14 = this.y.c;
            if (this.i0) {
                T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f13) - this.N;
                W1 = getCircleHeight() * f13;
                T12 = ((getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(4.0f)) - (W1 / 2.0f);
            } else {
                T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f13) - this.N, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), f14);
                T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), f14);
                W1 = org.telegram.messenger.g0.W1(f14, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * f13;
            }
            float T13 = org.telegram.messenger.g0.T1(getCircleWidth(), this.x.c() + org.telegram.messenger.g0.L(this.F ? 20.0f : 22.0f), f14) * f13;
            if (f13 > 0.0f && T13 > 0.0f && W1 > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f15 = W1 / 2.0f;
                rectF.set(T1 - T13, T12 - f15, T1, f15 + T12);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                float min = (Math.min(T13, W1) / 2.0f) + org.telegram.messenger.g0.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            g6 g6Var = this.d0;
            float i10 = (1.0f - f14) * g6Var.i();
            if (i10 > 0.0f) {
                float max = Math.max(g6Var.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                if (this.i0) {
                    f11 = T1 - org.telegram.messenger.g0.L(50.0f);
                    f12 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f16 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.N) - f16;
                    float measuredHeight = (getMeasuredHeight() - this.O) - f16;
                    f11 = measuredWidth;
                    f12 = measuredHeight;
                }
                canvas.drawCircle(f11, f12, ((max / 2.0f) + org.telegram.messenger.g0.L(2.0f)) * i10 * this.e0, paint);
            }
        }
        draw(canvas);
    }

    public final void i(int i3, long j10, boolean z10) {
        if (this.r == j10 && this.s == i3) {
            return;
        }
        this.r = j10;
        this.s = i3;
        g6 g6Var = this.x;
        if (j10 > 0) {
            g6Var.t(ci.wb.Y0(false, k2.p1.l(j10 * Math.max(1, this.s), ',', new StringBuilder("⭐️")), this.P), z10, true);
        } else {
            g6Var.t("", z10, true);
        }
        if (z10) {
            invalidate();
        } else {
            this.y.a(this.r > 0);
        }
    }

    public boolean j() {
        return this instanceof ih;
    }

    public final void k() {
        boolean z10 = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        int w02 = z10 ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qf, e6Var);
        if (w02 != this.j0 || w03 != this.k0 || w04 != this.l0) {
            this.j0 = w02;
            this.k0 = w03;
            this.l0 = w04;
            Drawable drawable = this.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(org.telegram.messenger.hs.K2, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.e.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.F;
        Paint paint = this.E;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, e6Var));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(i0.a.o(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        return (int) org.telegram.messenger.g0.T1(this.N + getCircleWidth() + this.N, org.telegram.messenger.g0.L(this.F ? 20.0f : 22.0f) + org.telegram.messenger.g0.L(18.0f) + this.x.d, (this.r > 0 ? 1.0f : 0.0f) * (d() ? 1.0f : 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int C;
        int measuredHeight;
        float f10;
        float f11;
        float f12;
        float T1;
        float T12;
        float W1;
        float f13;
        float f14;
        int i3;
        float f15;
        float f16;
        Paint paint;
        float measuredWidth;
        float measuredHeight2;
        float f17;
        float f18;
        int i10;
        int i11;
        float f19;
        float f20;
        float f21;
        int save = canvas.save();
        if (this.F) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
        }
        k();
        float N = org.telegram.messenger.g0.N(3.0f);
        float N2 = org.telegram.messenger.g0.N(38.0f);
        float N3 = org.telegram.messenger.g0.N(20.0f);
        g6 g6Var = this.x;
        RectF rectF = this.n0;
        rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.T1(Math.max(N2, g6Var.c() + N3), N2, this.n)) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        boolean z10 = this.F;
        Paint paint2 = this.E;
        if (z10) {
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f), paint2);
        }
        Drawable drawable = c() ? this.d : this.c;
        if (this.F) {
            C = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
        } else {
            C = org.telegram.ui.Cells.f1.C(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
            measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
            if (b()) {
                measuredHeight -= org.telegram.messenger.g0.L(1.0f);
            } else {
                C += org.telegram.messenger.g0.L(2.0f);
            }
        }
        int i12 = C;
        int i13 = measuredHeight;
        float d = this.W.d(this.U);
        float d10 = this.Q.d(d());
        float d11 = (1.0f - this.h) * this.y.d(this.r > 0 && !this.w);
        float e10 = this.f0.e(false, 1.0f);
        if (d10 < 1.0f) {
            canvas2.save();
            f12 = 2.0f;
            float f22 = 1.0f - e10;
            canvas2.translate((-org.telegram.messenger.g0.L(24.0f)) * f22, org.telegram.messenger.g0.L(24.0f) * f22);
            float T13 = org.telegram.messenger.g0.T1(0.35f, 1.0f, e10);
            float f23 = i12;
            f11 = 1.0f;
            float f24 = i13;
            f10 = d;
            canvas2.scale(T13, T13, (drawable.getIntrinsicWidth() / 2.0f) + f23, (drawable.getIntrinsicHeight() / 2.0f) + f24);
            canvas2.rotate(60.0f * f22, (drawable.getIntrinsicWidth() / 2.0f) + f23, (drawable.getIntrinsicHeight() / 2.0f) + f24);
            drawable.setBounds(i12, i13, drawable.getIntrinsicWidth() + i12, drawable.getIntrinsicHeight() + i13);
            drawable.setAlpha((int) ((1.0f - d11) * 255.0f));
            drawable.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = d;
            f11 = 1.0f;
            f12 = 2.0f;
        }
        if (this.i0) {
            T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / f12), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d10) - this.N;
            W1 = getCircleHeight() * d10;
            T12 = ((getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(4.0f)) - (W1 / f12);
        } else {
            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / f12), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d10) - this.N, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), d11);
            T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / f12), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), d11);
            W1 = org.telegram.messenger.g0.W1(d11, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * d10;
        }
        float f25 = T12;
        float f26 = T1;
        float T14 = org.telegram.messenger.g0.T1(getCircleWidth(), g6Var.c() + org.telegram.messenger.g0.L(this.F ? 20.0f : 22.0f), d11);
        float T15 = org.telegram.messenger.g0.T1(T14, W1, this.n) * d10;
        float f27 = T14 - T15;
        float f28 = f26 - (T15 / f12);
        setPivotX(f28);
        setPivotY(f25);
        float T16 = org.telegram.messenger.g0.T1(f11, 0.79f, this.h);
        if (d10 > 0.0f) {
            canvas2.save();
            Path path = this.b0;
            path.rewind();
            f13 = 0.0f;
            float min = Math.min(T15, W1) / f12;
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f29 = W1 / f12;
            float f30 = f25 - f29;
            float f31 = f25 + f29;
            rectF2.set(f26 - T15, f30, f26, f31);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.g0 == null) {
                    f15 = f26;
                    this.g0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f15 = f26;
                }
                i3 = save;
                this.g0.setColorFilter(paint2.getColor(), PorterDuff.Mode.MULTIPLY);
                cg.r.d(this.g0, centerX, centerY, 17);
                cg.r.b(canvas2, this.g0, this.h);
            } else {
                i3 = save;
                f15 = f26;
            }
            canvas2.scale(T16, T16, centerX, centerY);
            if (this.h0 != null) {
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
                this.h0.setBounds(rect);
                this.h0.draw(canvas2);
            }
            if (!this.F) {
                canvas2.drawPath(path, paint2);
            }
            canvas2.clipPath(path);
            int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i14 > 0) {
                Paint paint3 = this.c0;
                paint3.setColor(-1);
                paint3.setAlpha((int) (f10 * 255.0f));
                float L = org.telegram.messenger.g0.L(8.66f);
                rectF2.set(f28 - L, f25 - L, f28 + L, f25 + L);
                if (this.S) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f32 = (1520 * currentTimeMillis) / 5400.0f;
                    float max = Math.max(0.0f, f32 - 20.0f);
                    int i15 = 0;
                    while (i15 < 4) {
                        int i16 = i15 * 1350;
                        w1.a aVar = this.T;
                        f32 += aVar.getInterpolation((r33 - i16) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation((r33 - (i16 + 667)) / 667.0f) * 250.0f;
                        i15++;
                        currentTimeMillis = currentTimeMillis;
                    }
                    canvas2 = canvas;
                    f18 = f10;
                    i10 = i13;
                    f13 = 0.0f;
                    f14 = d11;
                    i11 = i14;
                    f16 = f25;
                    f19 = f28;
                    paint = paint2;
                    f20 = f31;
                    canvas2.drawArc(org.telegram.messenger.g0.P, max, f32 - max, false, paint3);
                } else {
                    f18 = f10;
                    i10 = i13;
                    f14 = d11;
                    i11 = i14;
                    f16 = f25;
                    f19 = f28;
                    paint = paint2;
                    f20 = f31;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.a0.e(false, this.V) * 360.0f, false, paint3);
                }
                canvas2.save();
                float T17 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f18);
                canvas2.scale(T17, T17, f19, f16);
                invalidate();
            } else {
                f18 = f10;
                i10 = i13;
                f14 = d11;
                i11 = i14;
                f16 = f25;
                f19 = f28;
                paint = paint2;
                f20 = f31;
            }
            if (f14 > f13) {
                if (this.i0) {
                    g6Var.o((f15 - g6Var.d) - org.telegram.messenger.g0.L(11.0f), f30, f15 - org.telegram.messenger.g0.L(11.0f), f20);
                } else if (this.F) {
                    g6Var.o(rectF.left + org.telegram.messenger.g0.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    g6Var.o((getMeasuredWidth() - g6Var.d) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight());
                }
                f21 = 1.0f;
                g6Var.B = (int) ((1.0f - f18) * f14 * 255.0f);
                g6Var.draw(canvas2);
            } else {
                f21 = 1.0f;
            }
            this.e.setAlpha((int) ((f21 - f14) * (f21 - f18) * 255.0f));
            if (this.J > 0) {
                this.e.setBounds((int) (f19 - (r2.getIntrinsicWidth() / f12)), (int) (f16 - (this.e.getIntrinsicHeight() / f12)), (int) ((this.e.getIntrinsicWidth() / f12) + f19), (int) ((this.e.getIntrinsicHeight() / f12) + f16));
            } else {
                this.e.setBounds(i12, i10, drawable.getIntrinsicWidth() + i12, drawable.getIntrinsicHeight() + i10);
            }
            this.e.draw(canvas2);
            if (i11 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f13 = 0.0f;
            f14 = d11;
            i3 = save;
            f15 = f26;
            f16 = f25;
            paint = paint2;
        }
        g6 g6Var2 = this.d0;
        float i17 = (1.0f - f14) * g6Var2.i();
        if (!this.G) {
            float max2 = Math.max(g6Var2.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
            if (this.i0) {
                measuredWidth = (f15 - org.telegram.messenger.g0.L(50.0f)) + f27;
                measuredHeight2 = (max2 / f12) + (f16 - (getCircleHeight() / f12));
                f17 = org.telegram.messenger.g0.L(0.66f);
            } else {
                float f33 = max2 / f12;
                measuredWidth = (getMeasuredWidth() - this.N) - f33;
                measuredHeight2 = (getMeasuredHeight() - this.O) - f33;
                f17 = f13;
            }
            float f34 = max2 / f12;
            g6Var2.setBounds((int) (measuredWidth - f34), (int) ((measuredHeight2 - f34) - f17), (int) (measuredWidth + f34), (int) ((measuredHeight2 + f34) - f17));
            if (i17 > f13) {
                float T18 = org.telegram.messenger.g0.T1(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(T18, T18, measuredWidth, measuredHeight2);
                if (!this.F) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (org.telegram.messenger.g0.L(f12) + f34) * i17 * this.e0, org.telegram.ui.ActionBar.k6.Cm);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f34 * i17 * this.e0, paint);
                }
                g6Var2.B = (int) (i17 * 255.0f);
                g6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i17 < 1.0f) {
            int L2 = org.telegram.messenger.g0.L(8.0f);
            float f35 = f14;
            int T19 = (int) org.telegram.messenger.g0.T1(((getMeasuredWidth() - (getCircleWidth() / f12)) - this.N) + org.telegram.messenger.g0.L(12.0f), f15 - org.telegram.messenger.g0.L(f12), f35);
            int T110 = (int) org.telegram.messenger.g0.T1(((getMeasuredHeight() - (getCircleHeight() / f12)) - this.O) + org.telegram.messenger.g0.L(10.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f), f35);
            int i18 = T19 - L2;
            int i19 = T110 - L2;
            int i20 = T19 + L2;
            int i21 = T110 + L2;
            e5 e5Var = this.f;
            e5Var.setBounds(i18, i19, i20, i21);
            e5Var.w = (int) ((1.0f - i17) * 255.0f);
            e5Var.draw(canvas2);
        }
        if (!this.F) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i3);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) org.telegram.messenger.g0.T1((r8.O + getCircleHeight()) + r8.O, org.telegram.messenger.g0.L(32.0f), r8.r > 0 ? 1.0f : 0.0f)))) goto L14;
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
                float y9 = motionEvent.getY();
                int height = getHeight();
                getMeasuredHeight();
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlurredBackgroundDrawable(gh.g gVar) {
        this.h0 = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.h0.q(org.telegram.messenger.g0.L(4.0f));
    }

    public void setCircleSize(int i3) {
        this.J = i3;
        this.K = i3;
    }

    public void setEffect(long j10) {
        TLRPC.TL_availableEffect Z0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).Z0(j10);
        setEmoji(Z0 != null ? org.telegram.messenger.i6.g(Z0.emoticon) : null);
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

    public void setLocked(boolean z10) {
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.R.c(z10);
    }

    public void setResourceId(int i3) {
        if (this.b != i3) {
            this.b = i3;
            this.c = getContext().getResources().getDrawable(i3).mutate();
            this.d = getContext().getResources().getDrawable(i3).mutate();
            this.e = getContext().getResources().getDrawable(i3).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.n != f10) {
            this.n = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i3) {
        this.L = i3;
        this.M.setColor(i3);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d0 || drawable == this.f || drawable == this.x || super.verifyDrawable(drawable);
    }
}
