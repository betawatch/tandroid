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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class xg extends View implements o80 {
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
    public final er[] O;
    public final g6 P;
    public final bd Q;
    public boolean R;
    public final u1.a S;
    public boolean T;
    public float U;
    public final g6 V;
    public final g6 W;
    public final org.telegram.ui.ActionBar.e6 a;
    public final Path a0;
    public int b;
    public final Paint b0;
    public Drawable c;
    public final q6 c0;
    public Drawable d;
    public float d0;
    public Drawable e;
    public final g6 e0;
    public final q5 f;
    public Drawable f0;
    public ch.d g0;
    public float h;
    public boolean h0;
    public int i0;
    public ValueAnimator j0;
    public final RectF k0;
    public float n;
    public long r;
    public int s;
    public boolean v;
    public final q6 w;
    public final g6 x;
    public final Paint y;

    public xg(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        hs hsVar = hs.h;
        this.x = new g6(this, 0L, 320L, hsVar);
        this.y = new Paint(1);
        this.I = -1;
        this.J = -1;
        this.L = new Paint(1);
        this.O = new er[1];
        this.P = new g6(this, 0L, 420L, hsVar);
        this.Q = new bd(this);
        this.S = new u1.a();
        this.V = new g6(this, 0L, 420L, hsVar);
        this.W = new g6(this, 0L, 500L, hsVar);
        this.a0 = new Path();
        Paint paint = new Paint(1);
        this.b0 = paint;
        q6 q6Var = new q6(true, true, true);
        this.c0 = q6Var;
        this.d0 = 1.0f;
        this.e0 = new g6(this, 0L, 320L, hsVar);
        this.k0 = new RectF();
        this.b = i10;
        this.a = e6Var;
        this.E = z10;
        q6 q6Var2 = new q6(false, false, false);
        this.w = q6Var2;
        q6Var2.w(AndroidUtilities.dp(15.0f));
        q6Var2.x(AndroidUtilities.bold());
        q6Var2.u(-1);
        q6Var2.b = 3;
        q6Var2.setCallback(this);
        q6Var2.M = AndroidUtilities.displaySize.x;
        this.c = context.getResources().getDrawable(i10).mutate();
        this.d = context.getResources().getDrawable(i10).mutate();
        this.e = context.getResources().getDrawable(i10).mutate();
        this.f = new q5(AndroidUtilities.dp(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        q6Var.setCallback(this);
        q6Var.u(-1);
        q6Var.w(AndroidUtilities.dp(12.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.b = 17;
    }

    @Override // org.telegram.ui.Components.o80
    public final void a(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.M;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.N;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    @Override // org.telegram.ui.Components.o80
    public final void b(Canvas canvas, float f7) {
        float lerp;
        float lerp2;
        float lerp3;
        float f10;
        float f11;
        int i10 = this.K;
        if (i10 != 0) {
            Paint paint = this.L;
            paint.setColor(i10);
            paint.setAlpha((int) (Color.alpha(this.K) * f7));
            float f12 = this.P.c;
            float f13 = this.x.c;
            if (this.h0) {
                lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f12) - this.M;
                lerp3 = getCircleHeight() * f12;
                lerp2 = ((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (lerp3 / 2.0f);
            } else {
                lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f12) - this.M, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f13);
                lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f13);
                lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f13) * f12;
            }
            float lerp4 = AndroidUtilities.lerp(getCircleWidth(), this.w.c() + AndroidUtilities.dp(this.E ? 20.0f : 22.0f), f13) * f12;
            if (f12 > 0.0f && lerp4 > 0.0f && lerp3 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f14 = lerp3 / 2.0f;
                rectF.set(lerp - lerp4, lerp2 - f14, lerp, f14 + lerp2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                float min = (Math.min(lerp4, lerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            q6 q6Var = this.c0;
            float i11 = (1.0f - f13) * q6Var.i();
            if (i11 > 0.0f) {
                float max = Math.max(q6Var.c() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                if (this.h0) {
                    f10 = lerp - AndroidUtilities.dp(50.0f);
                    f11 = (max / 2.0f) + (lerp2 - (getCircleHeight() / 2.0f));
                } else {
                    float f15 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.M) - f15;
                    float measuredHeight = (getMeasuredHeight() - this.N) - f15;
                    f10 = measuredWidth;
                    f11 = measuredHeight;
                }
                canvas.drawCircle(f10, f11, ((max / 2.0f) + AndroidUtilities.dp(2.0f)) * i11 * this.d0, paint);
            }
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.j0 = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 8));
        this.j0.addListener(new t8(this, 3));
        this.j0.setDuration(180L);
        this.j0.setInterpolator(new OvershootInterpolator());
        this.j0.start();
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
        canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        float dp = AndroidUtilities.dp(18.0f);
        RectF rectF = this.k0;
        float f7 = dp / 2.0f;
        float dp2 = (rectF.left + f7) - AndroidUtilities.dp(6.0f);
        float dp3 = (rectF.top + f7) - AndroidUtilities.dp(6.0f);
        canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(2.0f) + f7, org.telegram.ui.ActionBar.i6.Ll);
        canvas.drawCircle(dp2, dp3, f7, this.y);
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
        this.G.setBounds((int) (dp2 - AndroidUtilities.dp(8.0f)), (int) (dp3 - AndroidUtilities.dp(8.0f)), (int) (dp2 + AndroidUtilities.dp(8.0f)), (int) (dp3 + AndroidUtilities.dp(8.0f)));
        this.G.draw(canvas);
        canvas.restore();
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public final void g(int i10, boolean z10) {
        this.c0.t(i10 > 0 ? hg.c.h(i10, "") : "", z10, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i10 = this.J;
        return i10 >= 0 ? i10 : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getCircleWidth() {
        int i10 = this.I;
        return i10 >= 0 ? i10 : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
    }

    public int getFillColor() {
        return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Yd, this.a);
    }

    public final void h(boolean z10) {
        if (this.T == z10 && (!z10 || Math.abs(this.U - (-3.0f)) < 0.01f)) {
            if (this.R == (Math.abs(0.0f) < 0.01f)) {
                return;
            }
        }
        this.R = Math.abs(0.0f) < 0.01f;
        if (!this.T && z10) {
            this.W.d(0.0f, true);
        }
        g6 g6Var = this.V;
        g6Var.f = (!z10 || g6Var.c < 1.0f) ? 0L : 650L;
        this.T = z10;
        this.U = z10 ? -3.0f : 1.0f;
        invalidate();
    }

    public final void i(int i10, long j3, boolean z10) {
        if (this.r == j3 && this.s == i10) {
            return;
        }
        this.r = j3;
        this.s = i10;
        q6 q6Var = this.w;
        if (j3 > 0) {
            q6Var.t(yh.p7.W0(false, org.telegram.messenger.q.h(j3 * Math.max(1, this.s), ',', new StringBuilder("⭐️")), this.O), z10, true);
        } else {
            q6Var.t("", z10, true);
        }
        if (z10) {
            invalidate();
        } else {
            this.x.a(this.r > 0);
        }
    }

    public boolean j() {
        return this instanceof ii;
    }

    public final void k() {
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        int w02 = z10 ? -1 : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Yd, e6Var);
        if (w02 != this.i0) {
            this.i0 = w02;
            Drawable drawable = this.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wk, e6Var);
            this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.bf, e6Var), mode));
        }
        boolean z11 = this.E;
        Paint paint = this.y;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Yd, e6Var));
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
        return (int) AndroidUtilities.lerp(this.M + getCircleWidth() + this.M, AndroidUtilities.dp(this.E ? 20.0f : 22.0f) + AndroidUtilities.dp(18.0f) + this.w.d, (this.r > 0 ? 1.0f : 0.0f) * (f() ? 1.0f : 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int s10;
        int measuredHeight;
        float f7;
        float f10;
        float f11;
        float lerp;
        float lerp2;
        float lerp3;
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        }
        k();
        float dpf2 = AndroidUtilities.dpf2(3.0f);
        float dpf22 = AndroidUtilities.dpf2(38.0f);
        float dpf23 = AndroidUtilities.dpf2(20.0f);
        q6 q6Var = this.w;
        RectF rectF = this.k0;
        rectF.set((getMeasuredWidth() - AndroidUtilities.lerp(Math.max(dpf22, q6Var.c() + dpf23), dpf22, this.n)) - dpf2, (getMeasuredHeight() - dpf22) - dpf2, getMeasuredWidth() - dpf2, getMeasuredHeight() - dpf2);
        boolean z10 = this.E;
        Paint paint2 = this.y;
        if (z10) {
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint2);
        }
        Drawable drawable = e() ? this.d : this.c;
        if (this.E) {
            s10 = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
        } else {
            s10 = org.telegram.ui.Cells.c1.s(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
            measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
            if (d()) {
                measuredHeight -= AndroidUtilities.dp(1.0f);
            } else {
                s10 += AndroidUtilities.dp(2.0f);
            }
        }
        int i13 = s10;
        int i14 = measuredHeight;
        float e7 = this.V.e(this.T);
        float e10 = this.P.e(f());
        float e11 = (1.0f - this.h) * this.x.e(this.r > 0 && !this.v);
        float d = this.e0.d(1.0f, false);
        if (e10 < 1.0f) {
            canvas2.save();
            f11 = 2.0f;
            float f21 = 1.0f - d;
            canvas2.translate((-AndroidUtilities.dp(24.0f)) * f21, AndroidUtilities.dp(24.0f) * f21);
            float lerp4 = AndroidUtilities.lerp(0.35f, 1.0f, d);
            float f22 = i13;
            f10 = 1.0f;
            float f23 = i14;
            f7 = e7;
            canvas2.scale(lerp4, lerp4, (drawable.getIntrinsicWidth() / 2.0f) + f22, (drawable.getIntrinsicHeight() / 2.0f) + f23);
            canvas2.rotate(60.0f * f21, (drawable.getIntrinsicWidth() / 2.0f) + f22, (drawable.getIntrinsicHeight() / 2.0f) + f23);
            drawable.setBounds(i13, i14, drawable.getIntrinsicWidth() + i13, drawable.getIntrinsicHeight() + i14);
            drawable.setAlpha((int) ((1.0f - e11) * 255.0f));
            drawable.draw(canvas2);
            canvas2.restore();
        } else {
            f7 = e7;
            f10 = 1.0f;
            f11 = 2.0f;
        }
        if (this.h0) {
            lerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e10) - this.M;
            lerp3 = getCircleHeight() * e10;
            lerp2 = ((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (lerp3 / f11);
        } else {
            lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f11), getMeasuredWidth() - AndroidUtilities.dp(4.0f), e10) - this.M, getMeasuredWidth() - AndroidUtilities.dp(9.0f), e11);
            lerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.N) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f11), getMeasuredHeight() - AndroidUtilities.dp(24.0f), e11);
            lerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), e11) * e10;
        }
        float f24 = lerp2;
        float f25 = lerp;
        float lerp5 = AndroidUtilities.lerp(getCircleWidth(), q6Var.c() + AndroidUtilities.dp(this.E ? 20.0f : 22.0f), e11);
        float lerp6 = AndroidUtilities.lerp(lerp5, lerp3, this.n) * e10;
        float f26 = lerp5 - lerp6;
        float f27 = f25 - (lerp6 / f11);
        setPivotX(f27);
        setPivotY(f24);
        float lerp7 = AndroidUtilities.lerp(f10, 0.79f, this.h);
        if (e10 > 0.0f) {
            canvas2.save();
            Path path = this.a0;
            path.rewind();
            f12 = 0.0f;
            float min = Math.min(lerp6, lerp3) / f11;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f28 = lerp3 / f11;
            float f29 = f24 - f28;
            float f30 = f24 + f28;
            rectF2.set(f25 - lerp6, f29, f25, f30);
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
                yf.p.d(this.f0, centerX, centerY, 17);
                yf.p.b(canvas2, this.f0, this.h);
            } else {
                i10 = save;
                f14 = f25;
            }
            canvas2.scale(lerp7, lerp7, centerX, centerY);
            if (this.g0 != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
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
                float dp = AndroidUtilities.dp(8.66f);
                rectF2.set(f27 - dp, f24 - dp, f27 + dp, f24 + dp);
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
                    f13 = e11;
                    i12 = i15;
                    f15 = f24;
                    f18 = f27;
                    paint = paint2;
                    f19 = f30;
                    canvas2.drawArc(AndroidUtilities.rectTmp, max, f31 - max, false, paint3);
                } else {
                    f17 = f7;
                    i11 = i14;
                    f13 = e11;
                    i12 = i15;
                    f15 = f24;
                    f18 = f27;
                    paint = paint2;
                    f19 = f30;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.W.d(this.U, false) * 360.0f, false, paint3);
                }
                canvas2.save();
                float lerp8 = AndroidUtilities.lerp(1.0f, 0.6f, f17);
                canvas2.scale(lerp8, lerp8, f18, f15);
                invalidate();
            } else {
                f17 = f7;
                i11 = i14;
                f13 = e11;
                i12 = i15;
                f15 = f24;
                f18 = f27;
                paint = paint2;
                f19 = f30;
            }
            if (f13 > f12) {
                if (this.h0) {
                    q6Var.o((f14 - q6Var.d) - AndroidUtilities.dp(11.0f), f29, f14 - AndroidUtilities.dp(11.0f), f19);
                } else if (this.E) {
                    q6Var.o(rectF.left + AndroidUtilities.dp(10.0f), rectF.top, rectF.right, rectF.bottom);
                } else {
                    q6Var.o((getMeasuredWidth() - q6Var.d) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                }
                f20 = 1.0f;
                q6Var.B = (int) ((1.0f - f17) * f13 * 255.0f);
                q6Var.draw(canvas2);
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
            f13 = e11;
            i10 = save;
            f14 = f25;
            f15 = f24;
            paint = paint2;
        }
        q6 q6Var2 = this.c0;
        float i18 = (1.0f - f13) * q6Var2.i();
        if (!this.F) {
            float max2 = Math.max(q6Var2.c() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
            if (this.h0) {
                measuredWidth = (f14 - AndroidUtilities.dp(50.0f)) + f26;
                measuredHeight2 = (max2 / f11) + (f15 - (getCircleHeight() / f11));
                f16 = AndroidUtilities.dp(0.66f);
            } else {
                float f32 = max2 / f11;
                measuredWidth = (getMeasuredWidth() - this.M) - f32;
                measuredHeight2 = (getMeasuredHeight() - this.N) - f32;
                f16 = f12;
            }
            float f33 = max2 / f11;
            q6Var2.setBounds((int) (measuredWidth - f33), (int) ((measuredHeight2 - f33) - f16), (int) (measuredWidth + f33), (int) ((measuredHeight2 + f33) - f16));
            if (i18 > f12) {
                float lerp9 = AndroidUtilities.lerp(1.0f, 0.85f, this.h);
                canvas2.save();
                canvas2.scale(lerp9, lerp9, measuredWidth, measuredHeight2);
                if (!this.E) {
                    canvas2.drawCircle(measuredWidth, measuredHeight2, (AndroidUtilities.dp(f11) + f33) * i18 * this.d0, org.telegram.ui.ActionBar.i6.Ll);
                    canvas2.drawCircle(measuredWidth, measuredHeight2, f33 * i18 * this.d0, paint);
                }
                q6Var2.B = (int) (i18 * 255.0f);
                q6Var2.draw(canvas2);
                canvas2.restore();
            }
        }
        if (i18 < 1.0f) {
            int dp2 = AndroidUtilities.dp(8.0f);
            float f34 = f13;
            int lerp10 = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f11)) - this.M) + AndroidUtilities.dp(12.0f), f14 - AndroidUtilities.dp(f11), f34);
            int lerp11 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f11)) - this.N) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), f34);
            int i19 = lerp10 - dp2;
            int i20 = lerp11 - dp2;
            int i21 = lerp10 + dp2;
            int i22 = lerp11 + dp2;
            q5 q5Var = this.f;
            q5Var.setBounds(i19, i20, i21, i22);
            q5Var.v = (int) ((1.0f - i18) * 255.0f);
            q5Var.draw(canvas2);
        }
        if (!this.E) {
            canvas2.restore();
        }
        canvas2.restoreToCount(i10);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) org.telegram.messenger.AndroidUtilities.lerp((r8.N + getCircleHeight()) + r8.N, org.telegram.messenger.AndroidUtilities.dp(32.0f), r8.r > 0 ? 1.0f : 0.0f)))) goto L14;
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

    public void setBlurredBackgroundDrawable(ch.d dVar) {
        this.g0 = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.g0.p(AndroidUtilities.dp(4.0f));
    }

    public void setCircleSize(int i10) {
        this.I = i10;
        this.J = i10;
    }

    public void setEffect(long j3) {
        TLRPC.TL_availableEffect effect = MessagesController.getInstance(UserConfig.selectedAccount).getEffect(j3);
        setEmoji(effect != null ? Emoji.getEmojiDrawable(effect.emoticon) : null);
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
        return drawable == this.c0 || drawable == this.f || drawable == this.w || super.verifyDrawable(drawable);
    }
}
