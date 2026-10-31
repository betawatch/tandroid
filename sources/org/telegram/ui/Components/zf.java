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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class zf extends View implements y60 {
    public final Paint D;
    public boolean E;
    public boolean F;
    public Drawable G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final Paint L;
    public float M;
    public float N;
    public final dq[] O;
    public final t5 P;
    public final dc Q;
    public boolean R;
    public final u1.a S;
    public boolean T;
    public float U;
    public final t5 V;
    public final t5 W;
    public final org.telegram.ui.ActionBar.p6 a;
    public final Path a0;
    public int b;
    public final Paint b0;
    public Drawable c;
    public final e6 c0;
    public Drawable d;
    public float d0;
    public Drawable e;
    public final t5 e0;
    public final d5 f;
    public Drawable f0;
    public vg.f g0;
    public float h;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public ValueAnimator l0;
    public final RectF m0;
    public float n;
    public long r;
    public int s;
    public boolean w;
    public final e6 x;
    public final t5 y;

    public zf(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        gr grVar = gr.h;
        this.y = new t5(this, 0L, 320L, grVar);
        this.D = new Paint(1);
        this.I = -1;
        this.J = -1;
        this.L = new Paint(1);
        this.O = new dq[1];
        this.P = new t5(this, 0L, 420L, grVar);
        this.Q = new dc(this);
        this.S = new u1.a();
        this.V = new t5(this, 0L, 420L, grVar);
        this.W = new t5(this, 0L, 500L, grVar);
        this.a0 = new Path();
        Paint paint = new Paint(1);
        this.b0 = paint;
        e6 e6Var = new e6(true, true, true);
        this.c0 = e6Var;
        this.d0 = 1.0f;
        this.e0 = new t5(this, 0L, 320L, grVar);
        this.m0 = new RectF();
        this.b = i10;
        this.a = p6Var;
        this.E = z10;
        e6 e6Var2 = new e6(false, false, false);
        this.x = e6Var2;
        e6Var2.w(org.telegram.messenger.i0.L(15.0f));
        e6Var2.x(org.telegram.messenger.i0.o());
        e6Var2.u(-1);
        e6Var2.b = 3;
        e6Var2.setCallback(this);
        e6Var2.M = org.telegram.messenger.i0.q.x;
        this.c = i0.a.f(context, i10);
        this.d = i0.a.f(context, i10);
        this.e = i0.a.f(context, i10);
        this.f = new d5(org.telegram.messenger.i0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        e6Var.setCallback(this);
        e6Var.u(-1);
        e6Var.w(org.telegram.messenger.i0.L(12.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.b = 17;
    }

    @Override // org.telegram.ui.Components.y60
    public final void a(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f)) - this.M;
        float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.i0.L(4.0f)) - this.N;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    @Override // org.telegram.ui.Components.y60
    public final void b(Canvas canvas, float f7) {
        float T1;
        float T12;
        float W1;
        float f10;
        float f11;
        int i10 = this.K;
        if (i10 != 0) {
            Paint paint = this.L;
            paint.setColor(i10);
            paint.setAlpha((int) (Color.alpha(this.K) * f7));
            float f12 = this.P.c;
            float f13 = this.y.c;
            if (this.h0) {
                T1 = org.telegram.messenger.i0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f), f12) - this.M;
                W1 = getCircleHeight() * f12;
                T12 = ((getMeasuredHeight() - this.N) - org.telegram.messenger.i0.L(4.0f)) - (W1 / 2.0f);
            } else {
                T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f), f12) - this.M, getMeasuredWidth() - org.telegram.messenger.i0.L(9.0f), f13);
                T12 = org.telegram.messenger.i0.T1(((getMeasuredHeight() - this.N) - org.telegram.messenger.i0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(24.0f), f13);
                W1 = org.telegram.messenger.i0.W1(f13, getCircleHeight(), org.telegram.messenger.i0.L(32.0f)) * f12;
            }
            float T13 = org.telegram.messenger.i0.T1(getCircleWidth(), this.x.c() + org.telegram.messenger.i0.L(this.E ? 20.0f : 22.0f), f13) * f12;
            if (f12 > 0.0f && T13 > 0.0f && W1 > 0.0f) {
                RectF rectF = org.telegram.messenger.i0.P;
                float f14 = W1 / 2.0f;
                rectF.set(T1 - T13, T12 - f14, T1, f14 + T12);
                rectF.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
                float min = (Math.min(T13, W1) / 2.0f) + org.telegram.messenger.i0.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            e6 e6Var = this.c0;
            float i11 = (1.0f - f13) * e6Var.i();
            if (i11 > 0.0f) {
                float max = Math.max(e6Var.c() + org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f));
                if (this.h0) {
                    f10 = T1 - org.telegram.messenger.i0.L(50.0f);
                    f11 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f15 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.M) - f15;
                    float measuredHeight = (getMeasuredHeight() - this.N) - f15;
                    f10 = measuredWidth;
                    f11 = measuredHeight;
                }
                canvas.drawCircle(f10, f11, ((max / 2.0f) + org.telegram.messenger.i0.L(2.0f)) * i11 * this.d0, paint);
            }
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new a6(this, 8));
        this.l0.addListener(new w5(this, 7));
        this.l0.setDuration(180L);
        this.l0.setInterpolator(new OvershootInterpolator());
        this.l0.start();
    }

    public boolean d() {
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.F) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(6.0f), getWidth(), getHeight(), org.telegram.messenger.zs.e4, 31);
        super.draw(canvas);
        float L = org.telegram.messenger.i0.L(18.0f);
        RectF rectF = this.m0;
        float f7 = L / 2.0f;
        float L2 = (rectF.left + f7) - org.telegram.messenger.i0.L(6.0f);
        float L3 = (rectF.top + f7) - org.telegram.messenger.i0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.i0.L(2.0f) + f7, org.telegram.ui.ActionBar.t6.Cm);
        canvas.drawCircle(L2, L3, f7, this.D);
        if (this.G == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.G = mutate;
            int i10 = this.i0;
            this.H = i10;
            mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (this.H != this.i0) {
            Drawable drawable = this.G;
            int i11 = this.i0;
            this.H = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.G.setBounds((int) (L2 - org.telegram.messenger.i0.L(8.0f)), (int) (L3 - org.telegram.messenger.i0.L(8.0f)), (int) (L2 + org.telegram.messenger.i0.L(8.0f)), (int) (L3 + org.telegram.messenger.i0.L(8.0f)));
        this.G.draw(canvas);
        canvas.restore();
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public final void g(int i10, boolean z10) {
        this.c0.t(i10 > 0 ? i0.a.i(i10, "") : "", z10, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i10 = this.J;
        return i10 >= 0 ? i10 : getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f);
    }

    public int getCircleWidth() {
        int i10 = this.I;
        return i10 >= 0 ? i10 : getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Me, this.a);
    }

    public final void h(boolean z10) {
        if (this.T == z10 && (!z10 || Math.abs(this.U - (-3.0f)) < 0.01f)) {
            if (this.R == (Math.abs(0.0f) < 0.01f)) {
                return;
            }
        }
        this.R = Math.abs(0.0f) < 0.01f;
        if (!this.T && z10) {
            this.W.e(true, 0.0f);
        }
        t5 t5Var = this.V;
        t5Var.f = (!z10 || t5Var.c < 1.0f) ? 0L : 650L;
        this.T = z10;
        this.U = z10 ? -3.0f : 1.0f;
        invalidate();
    }

    public final void i(int i10, long j10, boolean z10) {
        if (this.r == j10 && this.s == i10) {
            return;
        }
        this.r = j10;
        this.s = i10;
        e6 e6Var = this.x;
        if (j10 > 0) {
            e6Var.t(rh.h8.X0(false, i0.a.k(j10 * Math.max(1, this.s), ',', new StringBuilder("⭐️")), this.O), z10, true);
        } else {
            e6Var.t("", z10, true);
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
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        int w02 = z10 ? -1 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Me, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var);
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Qf, p6Var);
        if (w02 != this.i0 || w03 != this.j0 || w04 != this.k0) {
            this.i0 = w02;
            this.j0 = w03;
            this.k0 = w04;
            Drawable drawable = this.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(org.telegram.messenger.zs.K2, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.e.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.E;
        Paint paint = this.D;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Me, p6Var));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(i0.b.o(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        return (int) org.telegram.messenger.i0.T1(this.M + getCircleWidth() + this.M, org.telegram.messenger.i0.L(this.E ? 20.0f : 22.0f) + org.telegram.messenger.i0.L(18.0f) + this.x.d, (this.r > 0 ? 1.0f : 0.0f) * (f() ? 1.0f : 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int z10;
        int measuredHeight;
        float f7;
        float f10;
        float f11;
        float T1;
        float T12;
        float W1;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        Paint paint;
        float measuredWidth;
        float measuredHeight2;
        float f16;
        float f17;
        int i11;
        int i12;
        float f18;
        float f19;
        float f20;
        int save = canvas.save();
        if (this.E) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.zs.e4, 31);
        }
        k();
        float N = org.telegram.messenger.i0.N(3.0f);
        float N2 = org.telegram.messenger.i0.N(38.0f);
        float N3 = org.telegram.messenger.i0.N(20.0f);
        e6 e6Var = this.x;
        RectF rectF = this.m0;
        rectF.set((getMeasuredWidth() - org.telegram.messenger.i0.T1(Math.max(N2, e6Var.c() + N3), N2, this.n)) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        boolean z11 = this.E;
        Paint paint2 = this.D;
        if (z11) {
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(19.0f), paint2);
        }
        Drawable drawable = e() ? this.d : this.c;
        if (this.E) {
            z10 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
        } else {
            z10 = org.telegram.ui.Cells.f1.z(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
            measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= org.telegram.messenger.i0.L(1.0f);
            } else {
                z10 += org.telegram.messenger.i0.L(2.0f);
            }
        }
        int i13 = z10;
        int i14 = measuredHeight;
        float d = this.V.d(this.T);
        float d10 = this.P.d(f());
        float d11 = (1.0f - this.h) * this.y.d(this.r > 0 && !this.w);
        float e = this.e0.e(false, 1.0f);
        if (d10 < 1.0f) {
            canvas2.save();
            f11 = 2.0f;
            float f21 = 1.0f - e;
            canvas2.translate((-org.telegram.messenger.i0.L(24.0f)) * f21, org.telegram.messenger.i0.L(24.0f) * f21);
            float T13 = org.telegram.messenger.i0.T1(0.35f, 1.0f, e);
            float f22 = i13;
            f10 = 1.0f;
            float f23 = i14;
            f7 = d;
            canvas2.scale(T13, T13, (drawable.getIntrinsicWidth() / 2.0f) + f22, (drawable.getIntrinsicHeight() / 2.0f) + f23);
            canvas2.rotate(60.0f * f21, (drawable.getIntrinsicWidth() / 2.0f) + f22, (drawable.getIntrinsicHeight() / 2.0f) + f23);
            drawable.setBounds(i13, i14, drawable.getIntrinsicWidth() + i13, drawable.getIntrinsicHeight() + i14);
            drawable.setAlpha((int) ((1.0f - d11) * 255.0f));
            drawable.draw(canvas2);
            canvas2.restore();
        } else {
            f7 = d;
            f10 = 1.0f;
            f11 = 2.0f;
        }
        if (this.h0) {
            T1 = org.telegram.messenger.i0.T1(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f), d10) - this.M;
            W1 = getCircleHeight() * d10;
            T12 = ((getMeasuredHeight() - this.N) - org.telegram.messenger.i0.L(4.0f)) - (W1 / f11);
        } else {
            T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - org.telegram.messenger.i0.L(4.0f), d10) - this.M, getMeasuredWidth() - org.telegram.messenger.i0.L(9.0f), d11);
            T12 = org.telegram.messenger.i0.T1(((getMeasuredHeight() - this.N) - org.telegram.messenger.i0.L(4.0f)) - (getCircleHeight() / f11), getMeasuredHeight() - org.telegram.messenger.i0.L(24.0f), d11);
            W1 = org.telegram.messenger.i0.W1(d11, getCircleHeight(), org.telegram.messenger.i0.L(32.0f)) * d10;
        }
        float f24 = T12;
        float f25 = T1;
        float T14 = org.telegram.messenger.i0.T1(getCircleWidth(), e6Var.c() + org.telegram.messenger.i0.L(this.E ? 20.0f : 22.0f), d11);
        float T15 = org.telegram.messenger.i0.T1(T14, W1, this.n) * d10;
        float f26 = T14 - T15;
        float f27 = f25 - (T15 / f11);
        setPivotX(f27);
        setPivotY(f24);
        float T16 = org.telegram.messenger.i0.T1(f10, 0.79f, this.h);
        if (d10 > 0.0f) {
            canvas2.save();
            Path path = this.a0;
            path.rewind();
            f12 = 0.0f;
            float min = Math.min(T15, W1) / f11;
            RectF rectF2 = org.telegram.messenger.i0.P;
            float f28 = W1 / f11;
            float f29 = f24 - f28;
            float f30 = f24 + f28;
            rectF2.set(f25 - T15, f29, f25, f30);
            path.addRoundRect(rectF2, min, min, Path.Direction.CW);
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (this.h > 0.0f) {
                if (this.f0 == null) {
                    f14 = f25;
                    this.f0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f14 = f25;
                }
                i10 = save;
                this.f0.setColorFilter(paint2.getColor(), PorterDuff.Mode.MULTIPLY);
                rf.o.d(this.f0, centerX, centerY, 17);
                rf.o.b(canvas2, this.f0, this.h);
            } else {
                i10 = save;
                f14 = f25;
            }
            canvas2.scale(T16, T16, centerX, centerY);
            if (this.g0 != null) {
                Rect rect = org.telegram.messenger.i0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.i0.L(7.0f), -org.telegram.messenger.i0.L(7.0f));
                this.g0.setBounds(rect);
                this.g0.draw(canvas2);
            }
            if (!this.E) {
                canvas2.drawPath(path, paint2);
            }
            canvas2.clipPath(path);
            int i15 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                Paint paint3 = this.b0;
                paint3.setColor(-1);
                paint3.setAlpha((int) (f7 * 255.0f));
                float L = org.telegram.messenger.i0.L(8.66f);
                rectF2.set(f27 - L, f24 - L, f27 + L, f24 + L);
                if (this.R) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f31 = (1520 * currentTimeMillis) / 5400.0f;
                    float max = Math.max(0.0f, f31 - 20.0f);
                    int i16 = 0;
                    while (i16 < 4) {
                        int i17 = i16 * 1350;
                        u1.a aVar = this.S;
                        f31 += aVar.getInterpolation((r33 - i17) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation((r33 - (i17 + 667)) / 667.0f) * 250.0f;
                        i16++;
                        currentTimeMillis = currentTimeMillis;
                    }
                    canvas2 = canvas;
                    f17 = f7;
                    i11 = i14;
                    f12 = 0.0f;
                    f13 = d11;
                    i12 = i15;
                    f15 = f24;
                    f18 = f27;
                    paint = paint2;
                    f19 = f30;
                    canvas2.drawArc(org.telegram.messenger.i0.P, max, f31 - max, false, paint3);
                } else {
                    f17 = f7;
                    i11 = i14;
                    f13 = d11;
                    i12 = i15;
                    f15 = f24;
                    f18 = f27;
                    paint = paint2;
                    f19 = f30;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.W.e(false, this.U) * 360.0f, false, paint3);
                }
                canvas2.save();
                float T17 = org.telegram.messenger.i0.T1(1.0f, 0.6f, f17);
                canvas2.scale(T17, T17, f18, f15);
                invalidate();
            } else {
                f17 = f7;
                i11 = i14;
                f13 = d11;
                i12 = i15;
                f15 = f24;
                f18 = f27;
                paint = paint2;
                f19 = f30;
            }
            if (f13 > f12) {
                if (this.h0) {
                    e6Var.o((f14 - e6Var.d) - org.telegram.messenger.i0.L(11.0f), f29, f14 - org.telegram.messenger.i0.L(11.0f), f19);
                } else if (this.E) {
                    e6Var.o(rectF.left + org.telegram.messenger.i0.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    e6Var.o((getMeasuredWidth() - e6Var.d) - org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(20.0f), getMeasuredHeight());
                }
                f20 = 1.0f;
                e6Var.B = (int) ((1.0f - f17) * f13 * 255.0f);
                e6Var.draw(canvas2);
            } else {
                f20 = 1.0f;
            }
            this.e.setAlpha((int) ((f20 - f13) * (f20 - f17) * 255.0f));
            if (this.I > 0) {
                this.e.setBounds((int) (f18 - (r2.getIntrinsicWidth() / f11)), (int) (f15 - (this.e.getIntrinsicHeight() / f11)), (int) ((this.e.getIntrinsicWidth() / f11) + f18), (int) ((this.e.getIntrinsicHeight() / f11) + f15));
            } else {
                this.e.setBounds(i13, i11, drawable.getIntrinsicWidth() + i13, drawable.getIntrinsicHeight() + i11);
            }
            this.e.draw(canvas2);
            if (i12 > 0) {
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f12 = 0.0f;
            f13 = d11;
            i10 = save;
            f14 = f25;
            f15 = f24;
            paint = paint2;
        }
        e6 e6Var2 = this.c0;
        float i18 = (1.0f - f13) * e6Var2.i();
        if (!this.F) {
            float max2 = Math.max(e6Var2.c() + org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f));
            if (this.h0) {
                measuredWidth = (f14 - org.telegram.messenger.i0.L(50.0f)) + f26;
                measuredHeight2 = (max2 / f11) + (f15 - (getCircleHeight() / f11));
                f16 = org.telegram.messenger.i0.L(0.66f);
            } else {
                float f32 = max2 / f11;
                measuredWidth = (getMeasuredWidth() - this.M) - f32;
                measuredHeight2 = (getMeasuredHeight() - this.N) - f32;
                f16 = f12;
            }
            float f33 = max2 / f11;
            e6Var2.setBounds((int) (measuredWidth - f33), (int) ((measuredHeight2 - f33) - f16), (int) (measuredWidth + f33), (int) ((measuredHeight2 + f33) - f16));
            if (i18 > f12) {
                float T18 = org.telegram.messenger.i0.T1(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(T18, T18, measuredWidth, measuredHeight2);
                if (!this.E) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (org.telegram.messenger.i0.L(f11) + f33) * i18 * this.d0, org.telegram.ui.ActionBar.t6.Cm);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f33 * i18 * this.d0, paint);
                }
                e6Var2.B = (int) (i18 * 255.0f);
                e6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i18 < 1.0f) {
            int L2 = org.telegram.messenger.i0.L(8.0f);
            float f34 = f13;
            int T19 = (int) org.telegram.messenger.i0.T1(((getMeasuredWidth() - (getCircleWidth() / f11)) - this.M) + org.telegram.messenger.i0.L(12.0f), f14 - org.telegram.messenger.i0.L(f11), f34);
            int T110 = (int) org.telegram.messenger.i0.T1(((getMeasuredHeight() - (getCircleHeight() / f11)) - this.N) + org.telegram.messenger.i0.L(10.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(12.0f), f34);
            int i19 = T19 - L2;
            int i20 = T110 - L2;
            int i21 = T19 + L2;
            int i22 = T110 + L2;
            d5 d5Var = this.f;
            d5Var.setBounds(i19, i20, i21, i22);
            d5Var.w = (int) ((1.0f - i18) * 255.0f);
            d5Var.draw(canvas2);
        }
        if (!this.E) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i10);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) org.telegram.messenger.i0.T1((r8.N + getCircleHeight()) + r8.N, org.telegram.messenger.i0.L(32.0f), r8.r > 0 ? 1.0f : 0.0f)))) goto L14;
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
                float y3 = motionEvent.getY();
                int height = getHeight();
                getMeasuredHeight();
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlurredBackgroundDrawable(vg.f fVar) {
        this.g0 = fVar;
        fVar.q(org.telegram.messenger.i0.L(22.0f));
        this.g0.p(org.telegram.messenger.i0.L(4.0f));
    }

    public void setCircleSize(int i10) {
        this.I = i10;
        this.J = i10;
    }

    public void setEffect(long j10) {
        TLRPC.TL_availableEffect Y0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).Y0(j10);
        setEmoji(Y0 != null ? org.telegram.messenger.k6.g(Y0.emoticon) : null);
    }

    public void setEmoji(Drawable drawable) {
        this.f.g(drawable, true);
    }

    public void setEphemeralFactor(float f7) {
        if (this.h != f7) {
            this.h = f7;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.Q.c(z10);
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

    public void setSameWidthFactor(float f7) {
        if (this.n != f7) {
            this.n = f7;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i10) {
        this.K = i10;
        this.L.setColor(i10);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c0 || drawable == this.f || drawable == this.x || super.verifyDrawable(drawable);
    }
}
