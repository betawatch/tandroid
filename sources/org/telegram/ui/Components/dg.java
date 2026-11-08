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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class dg extends View implements j60 {
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
    public final wp[] O;
    public final w5 P;
    public final ic Q;
    public boolean R;
    public final x1.a S;
    public boolean T;
    public float U;
    public final w5 V;
    public final w5 W;
    public final org.telegram.ui.ActionBar.f6 a;
    public final Path a0;
    public int b;
    public final Paint b0;
    public Drawable c;
    public final i6 c0;
    public Drawable d;
    public float d0;
    public Drawable e;
    public final w5 e0;
    public final g5 f;
    public Drawable f0;
    public fh.g g0;
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
    public final i6 x;
    public final w5 y;

    public dg(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        xq xqVar = xq.h;
        this.y = new w5(this, 0L, 320L, xqVar);
        this.D = new Paint(1);
        this.I = -1;
        this.J = -1;
        this.L = new Paint(1);
        this.O = new wp[1];
        this.P = new w5(this, 0L, 420L, xqVar);
        this.Q = new ic(this);
        this.S = new x1.a();
        this.V = new w5(this, 0L, 420L, xqVar);
        this.W = new w5(this, 0L, 500L, xqVar);
        this.a0 = new Path();
        Paint paint = new Paint(1);
        this.b0 = paint;
        i6 i6Var = new i6(true, true, true);
        this.c0 = i6Var;
        this.d0 = 1.0f;
        this.e0 = new w5(this, 0L, 320L, xqVar);
        this.m0 = new RectF();
        this.b = i7;
        this.a = f6Var;
        this.E = z9;
        i6 i6Var2 = new i6(false, false, false);
        this.x = i6Var2;
        i6Var2.w(org.telegram.messenger.g0.L(15.0f));
        i6Var2.x(org.telegram.messenger.g0.o());
        i6Var2.u(-1);
        i6Var2.b = 3;
        i6Var2.setCallback(this);
        i6Var2.M = org.telegram.messenger.g0.q.x;
        this.c = jg.g.h(context, i7);
        this.d = jg.g.h(context, i7);
        this.e = jg.g.h(context, i7);
        this.f = new g5(org.telegram.messenger.g0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        i6Var.setCallback(this);
        i6Var.u(-1);
        i6Var.w(org.telegram.messenger.g0.L(12.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 8));
        this.l0.addListener(new z5(this, 7));
        this.l0.setDuration(180L);
        this.l0.setInterpolator(new OvershootInterpolator());
        this.l0.start();
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
        if (!this.F) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), getWidth(), getHeight(), org.telegram.messenger.qs.e4, 31);
        super.draw(canvas);
        float L = org.telegram.messenger.g0.L(18.0f);
        RectF rectF = this.m0;
        float f10 = L / 2.0f;
        float L2 = (rectF.left + f10) - org.telegram.messenger.g0.L(6.0f);
        float L3 = (rectF.top + f10) - org.telegram.messenger.g0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(2.0f) + f10, org.telegram.ui.ActionBar.k6.Cm);
        canvas.drawCircle(L2, L3, f10, this.D);
        if (this.G == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.G = mutate;
            int i7 = this.i0;
            this.H = i7;
            mutate.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        if (this.H != this.i0) {
            Drawable drawable = this.G;
            int i10 = this.i0;
            this.H = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.G.setBounds((int) (L2 - org.telegram.messenger.g0.L(8.0f)), (int) (L3 - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + org.telegram.messenger.g0.L(8.0f)), (int) (L3 + org.telegram.messenger.g0.L(8.0f)));
        this.G.draw(canvas);
        canvas.restore();
    }

    public final void e(int i7, boolean z9) {
        this.c0.t(i7 > 0 ? jg.g.j(i7, "") : "", z9, true);
        invalidate();
    }

    public final void f(boolean z9) {
        if (this.T == z9 && (!z9 || Math.abs(this.U - (-3.0f)) < 0.01f)) {
            if (this.R == (Math.abs(0.0f) < 0.01f)) {
                return;
            }
        }
        this.R = Math.abs(0.0f) < 0.01f;
        if (!this.T && z9) {
            this.W.e(true, 0.0f);
        }
        w5 w5Var = this.V;
        w5Var.f = (!z9 || w5Var.c < 1.0f) ? 0L : 650L;
        this.T = z9;
        this.U = z9 ? -3.0f : 1.0f;
        invalidate();
    }

    @Override // org.telegram.ui.Components.j60
    public final void g(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f)) - this.M;
        float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f)) - this.N;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    public int getCircleHeight() {
        int i7 = this.J;
        return i7 >= 0 ? i7 : getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getCircleWidth() {
        int i7 = this.I;
        return i7 >= 0 ? i7 : getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, this.a);
    }

    @Override // org.telegram.ui.Components.j60
    public final void h(Canvas canvas, float f10) {
        float T1;
        float T12;
        float W1;
        float f11;
        float f12;
        int i7 = this.K;
        if (i7 != 0) {
            Paint paint = this.L;
            paint.setColor(i7);
            paint.setAlpha((int) (Color.alpha(this.K) * f10));
            float f13 = this.P.c;
            float f14 = this.y.c;
            if (this.h0) {
                T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f13) - this.M;
                W1 = getCircleHeight() * f13;
                T12 = ((getMeasuredHeight() - this.N) - org.telegram.messenger.g0.L(4.0f)) - (W1 / 2.0f);
            } else {
                T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), f13) - this.M, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), f14);
                T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.N) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), f14);
                W1 = org.telegram.messenger.g0.W1(f14, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * f13;
            }
            float T13 = org.telegram.messenger.g0.T1(getCircleWidth(), this.x.c() + org.telegram.messenger.g0.L(this.E ? 20.0f : 22.0f), f14) * f13;
            if (f13 > 0.0f && T13 > 0.0f && W1 > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
                float f15 = W1 / 2.0f;
                rectF.set(T1 - T13, T12 - f15, T1, f15 + T12);
                rectF.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                float min = (Math.min(T13, W1) / 2.0f) + org.telegram.messenger.g0.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            i6 i6Var = this.c0;
            float i10 = (1.0f - f14) * i6Var.i();
            if (i10 > 0.0f) {
                float max = Math.max(i6Var.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                if (this.h0) {
                    f11 = T1 - org.telegram.messenger.g0.L(50.0f);
                    f12 = (max / 2.0f) + (T12 - (getCircleHeight() / 2.0f));
                } else {
                    float f16 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.M) - f16;
                    float measuredHeight = (getMeasuredHeight() - this.N) - f16;
                    f11 = measuredWidth;
                    f12 = measuredHeight;
                }
                canvas.drawCircle(f11, f12, ((max / 2.0f) + org.telegram.messenger.g0.L(2.0f)) * i10 * this.d0, paint);
            }
        }
        draw(canvas);
    }

    public final void i(int i7, long j3, boolean z9) {
        if (this.r == j3 && this.s == i7) {
            return;
        }
        this.r = j3;
        this.s = i7;
        i6 i6Var = this.x;
        if (j3 > 0) {
            i6Var.t(bi.dd.Y0(false, jg.g.m(j3 * Math.max(1, this.s), ',', new StringBuilder("⭐️")), this.O), z9, true);
        } else {
            i6Var.t("", z9, true);
        }
        if (z9) {
            invalidate();
        } else {
            this.y.a(this.r > 0);
        }
    }

    public boolean j() {
        return this instanceof lh;
    }

    public final void k() {
        boolean z9 = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int w02 = z9 ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, f6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qf, f6Var);
        if (w02 != this.i0 || w03 != this.j0 || w04 != this.k0) {
            this.i0 = w02;
            this.j0 = w03;
            this.k0 = w04;
            Drawable drawable = this.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(org.telegram.messenger.qs.K2, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.e.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z10 = this.E;
        Paint paint = this.D;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Me, f6Var));
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
        return (int) org.telegram.messenger.g0.T1(this.M + getCircleWidth() + this.M, org.telegram.messenger.g0.L(this.E ? 20.0f : 22.0f) + org.telegram.messenger.g0.L(18.0f) + this.x.d, (this.r > 0 ? 1.0f : 0.0f) * (d() ? 1.0f : 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int z9;
        int measuredHeight;
        float f10;
        float f11;
        float f12;
        float T1;
        float T12;
        float W1;
        float f13;
        float f14;
        int i7;
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
        if (this.E) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.qs.e4, 31);
        }
        k();
        float N = org.telegram.messenger.g0.N(3.0f);
        float N2 = org.telegram.messenger.g0.N(38.0f);
        float N3 = org.telegram.messenger.g0.N(20.0f);
        i6 i6Var = this.x;
        RectF rectF = this.m0;
        rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.T1(Math.max(N2, i6Var.c() + N3), N2, this.n)) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        boolean z10 = this.E;
        Paint paint2 = this.D;
        if (z10) {
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f), paint2);
        }
        Drawable drawable = c() ? this.d : this.c;
        if (this.E) {
            z9 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
        } else {
            z9 = org.telegram.ui.Cells.f1.z(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
            measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
            if (b()) {
                measuredHeight -= org.telegram.messenger.g0.L(1.0f);
            } else {
                z9 += org.telegram.messenger.g0.L(2.0f);
            }
        }
        int i12 = z9;
        int i13 = measuredHeight;
        float d = this.V.d(this.T);
        float d2 = this.P.d(d());
        float d10 = (1.0f - this.h) * this.y.d(this.r > 0 && !this.w);
        float e10 = this.e0.e(false, 1.0f);
        if (d2 < 1.0f) {
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
            drawable.setAlpha((int) ((1.0f - d10) * 255.0f));
            drawable.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = d;
            f11 = 1.0f;
            f12 = 2.0f;
        }
        if (this.h0) {
            T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / f12), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d2) - this.M;
            W1 = getCircleHeight() * d2;
            T12 = ((getMeasuredHeight() - this.N) - org.telegram.messenger.g0.L(4.0f)) - (W1 / f12);
        } else {
            T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / f12), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d2) - this.M, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), d10);
            T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.N) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / f12), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), d10);
            W1 = org.telegram.messenger.g0.W1(d10, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * d2;
        }
        float f25 = T12;
        float f26 = T1;
        float T14 = org.telegram.messenger.g0.T1(getCircleWidth(), i6Var.c() + org.telegram.messenger.g0.L(this.E ? 20.0f : 22.0f), d10);
        float T15 = org.telegram.messenger.g0.T1(T14, W1, this.n) * d2;
        float f27 = T14 - T15;
        float f28 = f26 - (T15 / f12);
        setPivotX(f28);
        setPivotY(f25);
        float T16 = org.telegram.messenger.g0.T1(f11, 0.79f, this.h);
        if (d2 > 0.0f) {
            canvas2.save();
            Path path = this.a0;
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
                if (this.f0 == null) {
                    f15 = f26;
                    this.f0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                } else {
                    f15 = f26;
                }
                i7 = save;
                this.f0.setColorFilter(paint2.getColor(), PorterDuff.Mode.MULTIPLY);
                bg.s.d(this.f0, centerX, centerY, 17);
                bg.s.b(canvas2, this.f0, this.h);
            } else {
                i7 = save;
                f15 = f26;
            }
            canvas2.scale(T16, T16, centerX, centerY);
            if (this.g0 != null) {
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
                this.g0.setBounds(rect);
                this.g0.draw(canvas2);
            }
            if (!this.E) {
                canvas2.drawPath(path, paint2);
            }
            canvas2.clipPath(path);
            int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i14 > 0) {
                Paint paint3 = this.b0;
                paint3.setColor(-1);
                paint3.setAlpha((int) (f10 * 255.0f));
                float L = org.telegram.messenger.g0.L(8.66f);
                rectF2.set(f28 - L, f25 - L, f28 + L, f25 + L);
                if (this.R) {
                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                    float f32 = (1520 * currentTimeMillis) / 5400.0f;
                    float max = Math.max(0.0f, f32 - 20.0f);
                    int i15 = 0;
                    while (i15 < 4) {
                        int i16 = i15 * 1350;
                        x1.a aVar = this.S;
                        f32 += aVar.getInterpolation((r33 - i16) / 667.0f) * 250.0f;
                        max += aVar.getInterpolation((r33 - (i16 + 667)) / 667.0f) * 250.0f;
                        i15++;
                        currentTimeMillis = currentTimeMillis;
                    }
                    canvas2 = canvas;
                    f18 = f10;
                    i10 = i13;
                    f13 = 0.0f;
                    f14 = d10;
                    i11 = i14;
                    f16 = f25;
                    f19 = f28;
                    paint = paint2;
                    f20 = f31;
                    canvas2.drawArc(org.telegram.messenger.g0.P, max, f32 - max, false, paint3);
                } else {
                    f18 = f10;
                    i10 = i13;
                    f14 = d10;
                    i11 = i14;
                    f16 = f25;
                    f19 = f28;
                    paint = paint2;
                    f20 = f31;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.W.e(false, this.U) * 360.0f, false, paint3);
                }
                canvas2.save();
                float T17 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f18);
                canvas2.scale(T17, T17, f19, f16);
                invalidate();
            } else {
                f18 = f10;
                i10 = i13;
                f14 = d10;
                i11 = i14;
                f16 = f25;
                f19 = f28;
                paint = paint2;
                f20 = f31;
            }
            if (f14 > f13) {
                if (this.h0) {
                    i6Var.o((f15 - i6Var.d) - org.telegram.messenger.g0.L(11.0f), f30, f15 - org.telegram.messenger.g0.L(11.0f), f20);
                } else if (this.E) {
                    i6Var.o(rectF.left + org.telegram.messenger.g0.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    i6Var.o((getMeasuredWidth() - i6Var.d) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight());
                }
                f21 = 1.0f;
                i6Var.B = (int) ((1.0f - f18) * f14 * 255.0f);
                i6Var.draw(canvas2);
            } else {
                f21 = 1.0f;
            }
            this.e.setAlpha((int) ((f21 - f14) * (f21 - f18) * 255.0f));
            if (this.I > 0) {
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
            f14 = d10;
            i7 = save;
            f15 = f26;
            f16 = f25;
            paint = paint2;
        }
        i6 i6Var2 = this.c0;
        float i17 = (1.0f - f14) * i6Var2.i();
        if (!this.F) {
            float max2 = Math.max(i6Var2.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
            if (this.h0) {
                measuredWidth = (f15 - org.telegram.messenger.g0.L(50.0f)) + f27;
                measuredHeight2 = (max2 / f12) + (f16 - (getCircleHeight() / f12));
                f17 = org.telegram.messenger.g0.L(0.66f);
            } else {
                float f33 = max2 / f12;
                measuredWidth = (getMeasuredWidth() - this.M) - f33;
                measuredHeight2 = (getMeasuredHeight() - this.N) - f33;
                f17 = f13;
            }
            float f34 = max2 / f12;
            i6Var2.setBounds((int) (measuredWidth - f34), (int) ((measuredHeight2 - f34) - f17), (int) (measuredWidth + f34), (int) ((measuredHeight2 + f34) - f17));
            if (i17 > f13) {
                float T18 = org.telegram.messenger.g0.T1(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(T18, T18, measuredWidth, measuredHeight2);
                if (!this.E) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (org.telegram.messenger.g0.L(f12) + f34) * i17 * this.d0, org.telegram.ui.ActionBar.k6.Cm);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f34 * i17 * this.d0, paint);
                }
                i6Var2.B = (int) (i17 * 255.0f);
                i6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i17 < 1.0f) {
            int L2 = org.telegram.messenger.g0.L(8.0f);
            float f35 = f14;
            int T19 = (int) org.telegram.messenger.g0.T1(((getMeasuredWidth() - (getCircleWidth() / f12)) - this.M) + org.telegram.messenger.g0.L(12.0f), f15 - org.telegram.messenger.g0.L(f12), f35);
            int T110 = (int) org.telegram.messenger.g0.T1(((getMeasuredHeight() - (getCircleHeight() / f12)) - this.N) + org.telegram.messenger.g0.L(10.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f), f35);
            int i18 = T19 - L2;
            int i19 = T110 - L2;
            int i20 = T19 + L2;
            int i21 = T110 + L2;
            g5 g5Var = this.f;
            g5Var.setBounds(i18, i19, i20, i21);
            g5Var.w = (int) ((1.0f - i17) * 255.0f);
            g5Var.draw(canvas2);
        }
        if (!this.E) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i7);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) org.telegram.messenger.g0.T1((r8.N + getCircleHeight()) + r8.N, org.telegram.messenger.g0.L(32.0f), r8.r > 0 ? 1.0f : 0.0f)))) goto L14;
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
        this.g0 = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.g0.q(org.telegram.messenger.g0.L(4.0f));
    }

    public void setCircleSize(int i7) {
        this.I = i7;
        this.J = i7;
    }

    public void setEffect(long j3) {
        TLRPC.TL_availableEffect Z0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).Z0(j3);
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

    public void setLocked(boolean z9) {
        if (this.F == z9) {
            return;
        }
        this.F = z9;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.Q.c(z9);
    }

    public void setResourceId(int i7) {
        if (this.b != i7) {
            this.b = i7;
            this.c = getContext().getResources().getDrawable(i7).mutate();
            this.d = getContext().getResources().getDrawable(i7).mutate();
            this.e = getContext().getResources().getDrawable(i7).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f10) {
        if (this.n != f10) {
            this.n = f10;
            invalidate();
        }
    }

    public void setScrimViewBackgroundColor(int i7) {
        this.K = i7;
        this.L.setColor(i7);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c0 || drawable == this.f || drawable == this.x || super.verifyDrawable(drawable);
    }
}
