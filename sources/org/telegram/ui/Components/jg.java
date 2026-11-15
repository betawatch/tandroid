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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class jg extends View implements l60 {
    public final g6 E;
    public final u5 F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public Drawable J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final Paint O;
    public float P;
    public float Q;
    public final eq[] R;
    public final u5 S;
    public final dc T;
    public boolean U;
    public final x1.a V;
    public boolean W;
    public boolean a;
    public float a0;
    public final u5 b;
    public final u5 b0;
    public final org.telegram.ui.ActionBar.e6 c;
    public final u5 c0;
    public int d;
    public final Path d0;
    public Drawable e;
    public final Paint e0;
    public Drawable f;
    public final g6 f0;
    public float g0;
    public Drawable h;
    public float h0;
    public float i0;
    public float j0;
    public int k0;
    public int l0;
    public boolean m0;
    public final e5 n;
    public final u5 n0;
    public Drawable o0;
    public fh.g p0;
    public boolean q0;
    public float r;
    public int r0;
    public float s;
    public int s0;
    public int t0;
    public ValueAnimator u0;
    public final RectF v0;
    public long w;
    public int x;
    public boolean y;

    public jg(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        er erVar = er.h;
        this.b = new u5(this, 0L, 260L, erVar);
        this.F = new u5(this, 0L, 320L, erVar);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new eq[1];
        this.S = new u5(this, 0L, 420L, erVar);
        this.T = new dc(this);
        this.V = new x1.a();
        this.b0 = new u5(this, 0L, 420L, erVar);
        this.c0 = new u5(this, 0L, 500L, erVar);
        this.d0 = new Path();
        Paint paint = new Paint(1);
        this.e0 = paint;
        g6 g6Var = new g6(true, true, true);
        this.f0 = g6Var;
        this.g0 = 1.0f;
        this.n0 = new u5(this, 0L, 320L, erVar);
        this.v0 = new RectF();
        this.d = i7;
        this.c = e6Var;
        this.H = z10;
        g6 g6Var2 = new g6(false, false, false);
        this.E = g6Var2;
        g6Var2.w(org.telegram.messenger.g0.L(15.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(-1);
        g6Var2.b = 3;
        g6Var2.setCallback(this);
        g6Var2.N = org.telegram.messenger.g0.q.x;
        this.e = i5.c.g(context, i7);
        this.f = i5.c.g(context, i7);
        this.h = i5.c.g(context, i7);
        this.n = new e5(org.telegram.messenger.g0.L(14.0f), this);
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
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 8));
        this.u0.addListener(new x5(this, 7));
        this.u0.setDuration(180L);
        this.u0.setInterpolator(new OvershootInterpolator());
        this.u0.start();
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
        if (!this.I) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), getWidth(), getHeight(), org.telegram.messenger.ns.e4, 31);
        super.draw(canvas);
        float L = org.telegram.messenger.g0.L(18.0f);
        RectF rectF = this.v0;
        float f10 = L / 2.0f;
        float L2 = (rectF.left + f10) - org.telegram.messenger.g0.L(6.0f);
        float L3 = (rectF.top + f10) - org.telegram.messenger.g0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(2.0f) + f10, org.telegram.ui.ActionBar.j6.Fm);
        canvas.drawCircle(L2, L3, f10, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.J = mutate;
            int i7 = this.r0;
            this.K = i7;
            mutate.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.r0) {
            Drawable drawable = this.J;
            int i10 = this.r0;
            this.K = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.J.setBounds((int) (L2 - org.telegram.messenger.g0.L(8.0f)), (int) (L3 - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + org.telegram.messenger.g0.L(8.0f)), (int) (L3 + org.telegram.messenger.g0.L(8.0f)));
        this.J.draw(canvas);
        canvas.restore();
    }

    public final void e(int i7, boolean z10) {
        this.f0.t(i7 > 0 ? i5.c.i(i7, "") : "", z10, true);
        invalidate();
    }

    @Override // org.telegram.ui.Components.l60
    public final void f(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f)) - this.P;
        float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f)) - this.Q;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    public final void g(boolean z10) {
        if (this.W == z10 && (!z10 || Math.abs(this.a0 - (-3.0f)) < 0.01f)) {
            if (this.U == (Math.abs(0.0f) < 0.01f)) {
                return;
            }
        }
        this.U = Math.abs(0.0f) < 0.01f;
        if (!this.W && z10) {
            this.c0.e(true, 0.0f);
        }
        u5 u5Var = this.b0;
        u5Var.f = (!z10 || u5Var.c < 1.0f) ? 0L : 650L;
        this.W = z10;
        this.a0 = z10 ? -3.0f : 1.0f;
        invalidate();
    }

    public int getCircleHeight() {
        int i7 = this.M;
        return i7 >= 0 ? i7 : getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getCircleWidth() {
        int i7 = this.L;
        return i7 >= 0 ? i7 : getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Pe, this.c);
    }

    @Override // org.telegram.ui.Components.l60
    public final void h(Canvas canvas, float f10) {
        float T1;
        float T12;
        float W1;
        float f11;
        float f12;
        int i7 = this.N;
        if (i7 != 0) {
            Paint paint = this.O;
            paint.setColor(i7);
            paint.setAlpha((int) (Color.alpha(this.N) * f10));
            float f13 = this.S.c;
            float f14 = this.F.c;
            if (this.q0) {
                T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f13) - this.P;
                W1 = getCircleHeight() * f13;
                T12 = ((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (W1 / 2.0f);
            } else {
                T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f13) - this.P, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), f14);
                T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), f14);
                W1 = org.telegram.messenger.g0.W1(f14, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * f13;
            }
            float T13 = org.telegram.messenger.g0.T1(getCircleWidth(), this.E.c() + org.telegram.messenger.g0.L(this.H ? 20.0f : 22.0f), f14) * f13;
            if (f13 > 0.0f && T13 > 0.0f && W1 > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f15 = W1 / 2.0f;
                rectF.set(T1 - T13, T12 - f15, T1, f15 + T12);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                float min = (Math.min(T13, W1) / 2.0f) + org.telegram.messenger.g0.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            g6 g6Var = this.f0;
            float i10 = (1.0f - f14) * g6Var.i();
            if (i10 > 0.0f) {
                float max = Math.max(g6Var.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                if (this.q0) {
                    f11 = T1 - org.telegram.messenger.g0.L(50.0f);
                    f12 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f16 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f16;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f16;
                    f11 = measuredWidth;
                    f12 = measuredHeight;
                }
                canvas.drawCircle(f11, f12, ((max / 2.0f) + org.telegram.messenger.g0.L(2.0f)) * i10 * this.g0, paint);
            }
        }
        draw(canvas);
    }

    public final void i(int i7, long j3, boolean z10) {
        if (this.w == j3 && this.x == i7) {
            return;
        }
        this.w = j3;
        this.x = i7;
        g6 g6Var = this.E;
        if (j3 > 0) {
            g6Var.t(di.lb.Y0(false, i5.c.l(j3 * Math.max(1, this.x), ',', new StringBuilder("⭐️")), this.R), z10, true);
        } else {
            g6Var.t("", z10, true);
        }
        if (z10) {
            invalidate();
        } else {
            this.F.a(this.w > 0);
        }
    }

    public boolean j() {
        return this instanceof sh;
    }

    public final void k() {
        boolean z10 = this.H;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        int w02 = z10 ? -1 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Pe, e6Var);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, e6Var);
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Tf, e6Var);
        if (w02 != this.r0 || w03 != this.s0 || w04 != this.t0) {
            this.r0 = w02;
            this.s0 = w03;
            this.t0 = w04;
            Drawable drawable = this.e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.f.setColorFilter(new PorterDuffColorFilter(Color.argb(org.telegram.messenger.ns.K2, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.H;
        Paint paint = this.G;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Pe, e6Var));
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
        return (int) org.telegram.messenger.g0.T1(this.P + getCircleWidth() + this.P, org.telegram.messenger.g0.L(this.H ? 20.0f : 22.0f) + org.telegram.messenger.g0.L(18.0f) + this.E.d, (this.w > 0 ? 1.0f : 0.0f) * (d() ? 1.0f : 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int A;
        int measuredHeight;
        float f10;
        float T1;
        float T12;
        float W1;
        float f11;
        float f12;
        int i7;
        Paint paint;
        float f13;
        float f14;
        float measuredWidth;
        float measuredHeight2;
        float f15;
        float f16;
        int i10;
        float f17;
        int i11;
        float f18;
        float f19;
        int save = canvas.save();
        if (this.H) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.ns.e4, 31);
        }
        k();
        float N = org.telegram.messenger.g0.N(3.0f);
        float N2 = org.telegram.messenger.g0.N(38.0f);
        float N3 = org.telegram.messenger.g0.N(20.0f);
        g6 g6Var = this.E;
        RectF rectF = this.v0;
        rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.T1(Math.max(N2, g6Var.c() + N3), N2, this.s)) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        boolean z10 = this.H;
        Paint paint2 = this.G;
        if (z10) {
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f), paint2);
        }
        Drawable drawable = c() ? this.f : this.e;
        if (this.H) {
            A = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
        } else {
            A = org.telegram.ui.Cells.y0.A(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
            measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
            if (b()) {
                measuredHeight -= org.telegram.messenger.g0.L(1.0f);
            } else {
                A += org.telegram.messenger.g0.L(2.0f);
            }
        }
        int i12 = A;
        int i13 = measuredHeight;
        float d = this.b0.d(this.W);
        float d2 = this.S.d(d());
        float d10 = (1.0f - this.r) * this.F.d(this.w > 0 && !this.y);
        float e10 = this.n0.e(false, 1.0f);
        if (d2 < 1.0f) {
            canvas2.save();
            float f20 = 1.0f - e10;
            canvas2.translate((-org.telegram.messenger.g0.L(24.0f)) * f20, org.telegram.messenger.g0.L(24.0f) * f20);
            float T13 = org.telegram.messenger.g0.T1(0.35f, 1.0f, e10);
            float f21 = i12;
            float f22 = i13;
            f10 = d;
            canvas2.scale(T13, T13, (drawable.getIntrinsicWidth() / 2.0f) + f21, (drawable.getIntrinsicHeight() / 2.0f) + f22);
            canvas2.rotate(60.0f * f20, (drawable.getIntrinsicWidth() / 2.0f) + f21, (drawable.getIntrinsicHeight() / 2.0f) + f22);
            drawable.setBounds(i12, i13, drawable.getIntrinsicWidth() + i12, drawable.getIntrinsicHeight() + i13);
            drawable.setAlpha((int) (org.telegram.messenger.g0.T1(1.0f, 0.6f, this.b.d(this.a)) * (1.0f - d10) * 255.0f));
            drawable.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = d;
        }
        if (this.q0) {
            T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d2) - this.P;
            W1 = getCircleHeight() * d2;
            T12 = ((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (W1 / 2.0f);
        } else {
            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d2) - this.P, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), d10);
            T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), d10);
            W1 = org.telegram.messenger.g0.W1(d10, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * d2;
        }
        float f23 = T12;
        float f24 = T1;
        float T14 = org.telegram.messenger.g0.T1(getCircleWidth(), g6Var.c() + org.telegram.messenger.g0.L(this.H ? 20.0f : 22.0f), d10);
        float T15 = org.telegram.messenger.g0.T1(T14, W1, this.s) * d2;
        float f25 = T14 - T15;
        float f26 = f24 - (T15 / 2.0f);
        setPivotX(f26);
        setPivotY(f23);
        float T16 = org.telegram.messenger.g0.T1(1.0f, 0.79f, this.r);
        if (d2 > 0.0f) {
            canvas2.save();
            Path path = this.d0;
            path.rewind();
            f11 = 0.0f;
            float min = Math.min(T15, W1) / 2.0f;
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f27 = W1;
            float f28 = f24 - T15;
            float f29 = f27 / 2.0f;
            float f30 = f23 - f29;
            i7 = save;
            float f31 = f23 + f29;
            rectF2.set(f28, f30, f24, f31);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            f13 = f24;
            if (this.r > 0.0f) {
                if (this.o0 == null) {
                    f12 = d10;
                    this.o0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f12 = d10;
                }
                f16 = f29;
                this.o0.setColorFilter(paint2.getColor(), PorterDuff.Mode.MULTIPLY);
                bg.s.d(this.o0, centerX, centerY, 17);
                bg.s.b(canvas2, this.o0, this.r);
            } else {
                f12 = d10;
                f16 = f29;
            }
            canvas2.scale(T16, T16, centerX, centerY);
            if (this.p0 != null) {
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
                this.p0.setBounds(rect);
                this.p0.draw(canvas2);
            }
            if (!this.H) {
                canvas2.drawPath(path, paint2);
            }
            canvas2.clipPath(path);
            int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i14 > 0) {
                Paint paint3 = this.e0;
                paint3.setColor(-1);
                paint3.setAlpha((int) (f10 * 255.0f));
                float L = org.telegram.messenger.g0.L(8.66f);
                rectF2.set(f26 - L, f23 - L, f26 + L, f23 + L);
                if (this.U) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f32 = (1520 * currentTimeMillis) / 5400.0f;
                    float max = Math.max(0.0f, f32 - 20.0f);
                    int i15 = 0;
                    while (i15 < 4) {
                        int i16 = i15 * 1350;
                        x1.a aVar = this.V;
                        f32 += aVar.getInterpolation((r37 - i16) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation((r37 - (i16 + 667)) / 667.0f) * 250.0f;
                        i15++;
                        currentTimeMillis = currentTimeMillis;
                    }
                    canvas2 = canvas;
                    i10 = i14;
                    f17 = f10;
                    i11 = i13;
                    f14 = f23;
                    f11 = 0.0f;
                    paint = paint2;
                    f18 = f26;
                    canvas2.drawArc(org.telegram.messenger.g0.P, max, f32 - max, false, paint3);
                } else {
                    i10 = i14;
                    f17 = f10;
                    i11 = i13;
                    f14 = f23;
                    paint = paint2;
                    f18 = f26;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.c0.e(false, this.a0) * 360.0f, false, paint3);
                }
                canvas2.save();
                float T17 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f17);
                canvas2.scale(T17, T17, f18, f14);
                invalidate();
            } else {
                i10 = i14;
                f17 = f10;
                i11 = i13;
                f14 = f23;
                paint = paint2;
                f18 = f26;
            }
            if (f12 > f11) {
                if (this.q0) {
                    g6Var.o((f13 - g6Var.d) - org.telegram.messenger.g0.L(11.0f), f30, f13 - org.telegram.messenger.g0.L(11.0f), f31);
                } else if (this.H) {
                    g6Var.o(rectF.left + org.telegram.messenger.g0.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    g6Var.o((getMeasuredWidth() - g6Var.d) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight());
                }
                f19 = 1.0f;
                g6Var.C = (int) ((1.0f - f17) * f12 * 255.0f);
                g6Var.draw(canvas2);
            } else {
                f19 = 1.0f;
            }
            this.h.setAlpha((int) ((f19 - f12) * (f19 - f17) * 255.0f));
            if (this.L > 0) {
                this.h.setBounds((int) (f18 - (r2.getIntrinsicWidth() / 2.0f)), (int) (f14 - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + f18), (int) ((this.h.getIntrinsicHeight() / 2.0f) + f14));
            } else {
                this.h.setBounds(i12, i11, drawable.getIntrinsicWidth() + i12, drawable.getIntrinsicHeight() + i11);
            }
            if (d2 >= 1.0f && f12 <= f11 && f17 <= f11 && T15 > f11) {
                this.h0 = f18;
                this.i0 = f14;
                this.j0 = f16;
                this.k0 = this.h.getBounds().left;
                this.l0 = this.h.getBounds().top;
                this.m0 = true;
            }
            this.h.draw(canvas2);
            if (i10 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f11 = 0.0f;
            f12 = d10;
            i7 = save;
            paint = paint2;
            f13 = f24;
            f14 = f23;
        }
        g6 g6Var2 = this.f0;
        float i17 = (1.0f - f12) * g6Var2.i();
        if (!this.I) {
            float max2 = Math.max(g6Var2.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
            if (this.q0) {
                measuredWidth = (f13 - org.telegram.messenger.g0.L(50.0f)) + f25;
                measuredHeight2 = (max2 / 2.0f) + (f14 - (getCircleHeight() / 2.0f));
                f15 = org.telegram.messenger.g0.L(0.66f);
            } else {
                float f33 = max2 / 2.0f;
                measuredWidth = (getMeasuredWidth() - this.P) - f33;
                measuredHeight2 = (getMeasuredHeight() - this.Q) - f33;
                f15 = f11;
            }
            float f34 = max2 / 2.0f;
            g6Var2.setBounds((int) (measuredWidth - f34), (int) ((measuredHeight2 - f34) - f15), (int) (measuredWidth + f34), (int) ((measuredHeight2 + f34) - f15));
            if (i17 > f11) {
                float T18 = org.telegram.messenger.g0.T1(1.0f, 0.85f, this.r);
                canvas2.save();
                canvas2.scale(T18, T18, measuredWidth, measuredHeight2);
                if (!this.H) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (org.telegram.messenger.g0.L(2.0f) + f34) * i17 * this.g0, org.telegram.ui.ActionBar.j6.Fm);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f34 * i17 * this.g0, paint);
                }
                g6Var2.C = (int) (i17 * 255.0f);
                g6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i17 < 1.0f) {
            int L2 = org.telegram.messenger.g0.L(8.0f);
            float f35 = f12;
            int T19 = (int) org.telegram.messenger.g0.T1(((getMeasuredWidth() - (getCircleWidth() / 2.0f)) - this.P) + org.telegram.messenger.g0.L(12.0f), f13 - org.telegram.messenger.g0.L(2.0f), f35);
            int T110 = (int) org.telegram.messenger.g0.T1(((getMeasuredHeight() - (getCircleHeight() / 2.0f)) - this.Q) + org.telegram.messenger.g0.L(10.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f), f35);
            int i18 = T19 - L2;
            int i19 = T110 - L2;
            int i20 = T19 + L2;
            int i21 = T110 + L2;
            e5 e5Var = this.n;
            e5Var.setBounds(i18, i19, i20, i21);
            e5Var.w = (int) ((1.0f - i17) * 255.0f);
            e5Var.draw(canvas2);
        }
        if (!this.H) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i7);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) org.telegram.messenger.g0.T1((r8.Q + getCircleHeight()) + r8.Q, org.telegram.messenger.g0.L(32.0f), r8.w > 0 ? 1.0f : 0.0f)))) goto L14;
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

    public void setBlurredBackgroundDrawable(fh.g gVar) {
        this.p0 = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.p0.q(org.telegram.messenger.g0.L(4.0f));
    }

    public void setCircleSize(int i7) {
        this.L = i7;
        this.M = i7;
    }

    public void setEffect(long j3) {
        TLRPC.TL_availableEffect Z0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).Z0(j3);
        setEmoji(Z0 != null ? org.telegram.messenger.j6.g(Z0.emoticon) : null);
    }

    public void setEmoji(Drawable drawable) {
        this.n.g(drawable, true);
    }

    public void setEphemeralFactor(float f10) {
        if (this.r != f10) {
            this.r = f10;
            invalidate();
        }
    }

    public void setIconDimmed(boolean z10) {
        if (this.a != z10) {
            this.a = z10;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.T.c(z10);
    }

    public void setResourceId(int i7) {
        if (this.d != i7) {
            this.d = i7;
            this.e = getContext().getResources().getDrawable(i7).mutate();
            this.f = getContext().getResources().getDrawable(i7).mutate();
            this.h = getContext().getResources().getDrawable(i7).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.s != f10) {
            this.s = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i7) {
        this.N = i7;
        this.O.setColor(i7);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f0 || drawable == this.n || drawable == this.E || super.verifyDrawable(drawable);
    }
}
