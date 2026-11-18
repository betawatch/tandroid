package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class sg extends View implements x60 {
    public final m6 E;
    public final c6 F;
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
    public final lq[] R;
    public final c6 S;
    public final mc T;
    public boolean U;
    public final x1.a V;
    public boolean W;
    public boolean a;
    public float a0;
    public final c6 b;
    public final c6 b0;
    public final org.telegram.ui.ActionBar.i6 c;
    public final c6 c0;
    public int d;
    public final Path d0;
    public Drawable e;
    public final Paint e0;
    public Drawable f;
    public final m6 f0;
    public float g0;
    public Drawable h;
    public p0 h0;
    public ChatActivityEnterView i0;
    public float j0;
    public float k0;
    public float l0;
    public int m0;
    public final m5 n;
    public int n0;
    public boolean o0;
    public final c6 p0;
    public Drawable q0;
    public float r;
    public fh.g r0;
    public float s;
    public boolean s0;
    public int t0;
    public int u0;
    public int v0;
    public long w;
    public ValueAnimator w0;
    public int x;
    public final RectF x0;
    public boolean y;

    public sg(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        lr lrVar = lr.h;
        this.b = new c6(this, 0L, 260L, lrVar);
        this.F = new c6(this, 0L, 320L, lrVar);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new lq[1];
        this.S = new c6(this, 0L, 420L, lrVar);
        this.T = new mc(this);
        this.V = new x1.a();
        this.b0 = new c6(this, 0L, 420L, lrVar);
        this.c0 = new c6(this, 0L, 500L, lrVar);
        this.d0 = new Path();
        Paint paint = new Paint(1);
        this.e0 = paint;
        m6 m6Var = new m6(true, true, true);
        this.f0 = m6Var;
        this.g0 = 1.0f;
        this.p0 = new c6(this, 0L, 320L, lrVar);
        this.x0 = new RectF();
        this.d = i7;
        this.c = i6Var;
        this.H = z10;
        m6 m6Var2 = new m6(false, false, false);
        this.E = m6Var2;
        m6Var2.w(org.telegram.messenger.g0.L(15.0f));
        m6Var2.x(org.telegram.messenger.g0.o());
        m6Var2.u(-1);
        m6Var2.b = 3;
        m6Var2.setCallback(this);
        m6Var2.N = org.telegram.messenger.g0.q.x;
        this.e = i5.c.g(context, i7);
        this.f = i5.c.g(context, i7);
        this.h = i5.c.g(context, i7);
        this.n = new m5(org.telegram.messenger.g0.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        m6Var.setCallback(this);
        m6Var.u(-1);
        m6Var.w(org.telegram.messenger.g0.L(12.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.w0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.w0 = ofFloat;
        ofFloat.addUpdateListener(new w(this, 9));
        this.w0.addListener(new x(this, 8));
        this.w0.setDuration(180L);
        this.w0.setInterpolator(new OvershootInterpolator());
        this.w0.start();
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
        canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), getWidth(), getHeight(), org.telegram.messenger.ks.e4, 31);
        super.draw(canvas);
        float L = org.telegram.messenger.g0.L(18.0f);
        RectF rectF = this.x0;
        float f10 = L / 2.0f;
        float L2 = (rectF.left + f10) - org.telegram.messenger.g0.L(6.0f);
        float L3 = (rectF.top + f10) - org.telegram.messenger.g0.L(6.0f);
        canvas.drawCircle(L2, L3, org.telegram.messenger.g0.L(2.0f) + f10, org.telegram.ui.ActionBar.n6.Fm);
        canvas.drawCircle(L2, L3, f10, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.J = mutate;
            int i7 = this.t0;
            this.K = i7;
            mutate.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.t0) {
            Drawable drawable = this.J;
            int i10 = this.t0;
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

    @Override // org.telegram.ui.Components.x60
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
        c6 c6Var = this.b0;
        c6Var.f = (!z10 || c6Var.c < 1.0f) ? 0L : 650L;
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
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Pe, this.c);
    }

    @Override // org.telegram.ui.Components.x60
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
            if (this.s0) {
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
            m6 m6Var = this.f0;
            float i10 = (1.0f - f14) * m6Var.i();
            if (i10 > 0.0f) {
                float max = Math.max(m6Var.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                if (this.s0) {
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
        m6 m6Var = this.E;
        if (j3 > 0) {
            m6Var.t(di.pb.Z0(false, i5.c.l(j3 * Math.max(1, this.x), ',', new StringBuilder("⭐️")), this.R), z10, true);
        } else {
            m6Var.t("", z10, true);
        }
        if (z10) {
            invalidate();
        } else {
            this.F.a(this.w > 0);
        }
    }

    public boolean j() {
        return this instanceof ai;
    }

    public final void k() {
        boolean z10 = this.H;
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        int w02 = z10 ? -1 : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Pe, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, i6Var);
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tf, i6Var);
        if (w02 != this.t0 || w03 != this.u0 || w04 != this.v0) {
            this.t0 = w02;
            this.u0 = w03;
            this.v0 = w04;
            Drawable drawable = this.e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            this.f.setColorFilter(new PorterDuffColorFilter(Color.argb(org.telegram.messenger.ks.K2, Color.red(w03), Color.green(w03), Color.blue(w03)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(w04, mode));
        }
        boolean z11 = this.H;
        Paint paint = this.G;
        if (z11) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Pe, i6Var));
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        if ((android.os.SystemClock.uptimeMillis() - r2.s6) < 1200) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0608  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        long j3;
        boolean z10;
        float f11;
        float f12;
        long j10;
        float f13;
        Paint paint;
        float f14;
        int C;
        int measuredHeight;
        float d;
        float T1;
        float T12;
        float W1;
        float f15;
        int i7;
        float f16;
        float i10;
        float measuredWidth;
        float measuredHeight2;
        float f17;
        int i11;
        int i12;
        int i13;
        float f18;
        float f19;
        float f20;
        float f21;
        float L;
        float sin;
        float f22;
        float f23;
        Paint paint2;
        ChatActivityEnterView chatActivityEnterView;
        long uptimeMillis;
        ai.n0 n0Var;
        int save = canvas.save();
        if (this.H) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.ks.e4, 31);
        }
        k();
        float N = org.telegram.messenger.g0.N(3.0f);
        float N2 = org.telegram.messenger.g0.N(38.0f);
        float N3 = org.telegram.messenger.g0.N(20.0f);
        m6 m6Var = this.E;
        RectF rectF = this.x0;
        rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.T1(Math.max(N2, m6Var.c() + N3), N2, this.s)) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        if (this.h0 == null || !this.H) {
            f10 = 1.0f;
            j3 = 1200;
        } else {
            j3 = 1200;
            if (this.w <= 0 && Math.abs(rectF.width() - rectF.height()) < 1.0f) {
                ChatActivityEnterView chatActivityEnterView2 = this.i0;
                if (chatActivityEnterView2 != null) {
                    boolean z11 = chatActivityEnterView2.S1 || chatActivityEnterView2.R1 != null || ((n0Var = chatActivityEnterView2.j1) != null && n0Var.m());
                    if (chatActivityEnterView2.P3 != null || chatActivityEnterView2.S3 != null || (chatActivityEnterView2.R0() && !z11)) {
                        f10 = 1.0f;
                        chatActivityEnterView2.s6 = SystemClock.uptimeMillis();
                    } else if (chatActivityEnterView2.s6 != 0) {
                        f10 = 1.0f;
                    }
                }
                f10 = 1.0f;
                z10 = true;
                if (!z10 && this.h0 != null && (chatActivityEnterView = this.i0) != null && chatActivityEnterView.s6 != 0) {
                    uptimeMillis = SystemClock.uptimeMillis() - this.i0.s6;
                    if (j3 - uptimeMillis > 0) {
                        postInvalidateDelayed(1216 - uptimeMillis);
                    }
                }
                Paint paint3 = this.G;
                if (z10) {
                    f11 = 3.0f;
                    f12 = 20.0f;
                    j10 = 0;
                    f13 = 0.003f;
                } else {
                    p0 p0Var = this.h0;
                    int color = paint3.getColor();
                    f13 = 0.003f;
                    Paint paint4 = p0Var.n;
                    f11 = 3.0f;
                    f12 = 20.0f;
                    float d2 = p0Var.f.d(p0Var.c);
                    if (d2 <= 0.003f) {
                        j10 = 0;
                    } else {
                        float height = rectF.height() / 2.0f;
                        p0Var.a(height, color);
                        canvas2.save();
                        j10 = 0;
                        canvas2.translate(rectF.centerX(), rectF.centerY());
                        paint4.setAlpha((int) com.google.android.gms.internal.vision.e2.B((float) Math.sin(p0Var.d() * 4.2f), 0.25f, 0.75f, d2 * 255.0f));
                        canvas2.drawCircle(0.0f, 0.0f, height + org.telegram.messenger.g0.L(4.0f), paint4);
                        canvas2.restore();
                    }
                }
                if (this.H) {
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f), paint3);
                }
                if (z10) {
                    paint = paint3;
                    f14 = 1.25f;
                } else {
                    p0 p0Var2 = this.h0;
                    int color2 = paint3.getColor();
                    Paint paint5 = p0Var2.j;
                    Paint paint6 = p0Var2.h;
                    f14 = 1.25f;
                    Paint paint7 = p0Var2.m;
                    Path path = p0Var2.o;
                    Matrix matrix = p0Var2.q;
                    float d10 = p0Var2.f.d(p0Var2.c);
                    if (d10 <= f13) {
                        paint = paint3;
                    } else {
                        float height2 = rectF.height() / 2.0f;
                        p0Var2.a(height2, color2);
                        float d11 = p0Var2.d();
                        canvas2.save();
                        path.rewind();
                        path.addCircle(rectF.centerX(), rectF.centerY(), height2, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.translate(rectF.centerX(), rectF.centerY());
                        matrix.reset();
                        float f24 = -height2;
                        matrix.setTranslate((((d11 / 1.25f) % f10) * 2.2f * height2) + (1.1f * f24), 0.0f);
                        matrix.postRotate(-32.0f);
                        p0Var2.r.setLocalMatrix(matrix);
                        paint5.setAlpha((int) (d10 * 255.0f));
                        paint = paint3;
                        canvas2.drawRect(f24, f24, height2, height2, paint5);
                        float f25 = height2;
                        int i14 = 0;
                        while (i14 < 5) {
                            float f26 = (d11 + p0Var2.L[i14]) / p0Var2.M[i14];
                            float floor = f26 - ((int) Math.floor(f26));
                            float f27 = ((((104729 * i14) + (r4 * 7919)) & 1023) / 1023.0f) - 0.5f;
                            float L2 = (org.telegram.messenger.g0.L(f11) * f27) + p0Var2.N[i14];
                            float x10 = com.google.android.gms.internal.vision.e2.x(floor, f25, 2.1f, 1.05f * f24);
                            float f28 = (x10 * (-0.848f)) - (L2 * 0.53f);
                            float f29 = (L2 * (-0.848f)) + (x10 * 0.53f);
                            float f30 = f25;
                            int i15 = i14;
                            float sin2 = ((float) Math.sin(floor * 3.141592653589793d)) * d10 * 0.5f;
                            if (sin2 <= 0.01f) {
                                f22 = f30;
                                f23 = d10;
                                paint2 = paint7;
                            } else {
                                float B = com.google.android.gms.internal.vision.e2.B(f27, 0.3f, 1.0f, p0Var2.O[i15]);
                                float f31 = p0Var2.P[i15];
                                int i16 = 0;
                                while (i16 < 4) {
                                    float f32 = i16 / 4.0f;
                                    int i17 = i16 + 1;
                                    float f33 = i17 / 4.0f;
                                    float f34 = B;
                                    float f35 = 1.0f - f32;
                                    paint7.setStrokeWidth(Math.max(org.telegram.messenger.g0.L(0.5f), f34 * 0.55f * f35));
                                    paint7.setColor(Color.argb((int) (sin2 * 255.0f * 0.55f * f35 * f35), org.telegram.messenger.ks.e4, org.telegram.messenger.ks.e4, org.telegram.messenger.ks.e4));
                                    float f36 = f31 * (-0.848f);
                                    float f37 = f28 - (f36 * f32);
                                    float f38 = f31 * 0.53f;
                                    float f39 = f29 - (f32 * f38);
                                    float f40 = f28 - (f36 * f33);
                                    float f41 = f29 - (f38 * f33);
                                    float f42 = d10;
                                    float f43 = f29;
                                    Paint paint8 = paint7;
                                    canvas.drawLine(f37, f39, f40, f41, paint8);
                                    B = f34;
                                    f30 = f30;
                                    i16 = i17;
                                    paint7 = paint8;
                                    f29 = f43;
                                    d10 = f42;
                                }
                                f22 = f30;
                                f23 = d10;
                                float f44 = f29;
                                paint2 = paint7;
                                float f45 = B;
                                paint6.setColor(-1);
                                paint6.setAlpha((int) (sin2 * 255.0f));
                                canvas.save();
                                canvas.translate(f28, f44);
                                canvas.rotate(floor * 30.0f);
                                canvas.scale(f45, f45);
                                canvas.drawPath(p0Var2.i, paint6);
                                canvas.restore();
                            }
                            i14 = i15 + 1;
                            paint7 = paint2;
                            d10 = f23;
                            f25 = f22;
                        }
                        canvas2 = canvas;
                        canvas2.restore();
                    }
                }
                Drawable drawable = !c() ? this.f : this.e;
                if (this.H) {
                    C = org.telegram.ui.Cells.c0.C(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
                    measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
                    if (b()) {
                        measuredHeight -= org.telegram.messenger.g0.L(1.0f);
                    } else {
                        C += org.telegram.messenger.g0.L(2.0f);
                    }
                } else {
                    C = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
                    measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
                }
                int i18 = C;
                int i19 = measuredHeight;
                float d12 = this.b0.d(this.W);
                d = this.S.d(d());
                float d13 = this.F.d(this.w <= j10 && !this.y) * (1.0f - this.r);
                float e10 = this.p0.e(false, 1.0f);
                if (d >= 1.0f) {
                    canvas2.save();
                    float f46 = 1.0f - e10;
                    canvas2.translate((-org.telegram.messenger.g0.L(24.0f)) * f46, org.telegram.messenger.g0.L(24.0f) * f46);
                    float T13 = org.telegram.messenger.g0.T1(0.35f, 1.0f, e10);
                    float f47 = i18;
                    float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) + f47;
                    float f48 = i19;
                    canvas2.scale(T13, T13, intrinsicWidth, (drawable.getIntrinsicHeight() / 2.0f) + f48);
                    canvas2.rotate(60.0f * f46, (drawable.getIntrinsicWidth() / 2.0f) + f47, (drawable.getIntrinsicHeight() / 2.0f) + f48);
                    if (z10) {
                        float f49 = this.h0.f.c;
                        if (f49 <= 0.001f) {
                            f21 = 0.001f;
                            L = 0.0f;
                        } else {
                            f21 = 0.001f;
                            double d14 = r3.d() * 6.283185307179586d;
                            L = org.telegram.messenger.g0.L(f14) * f49 * ((float) Math.sin((Math.sin(d14 / 3.0999999046325684d) * 0.6000000238418579d) + (d14 / 1.2999999523162842d)));
                        }
                        canvas2.translate(0.0f, L);
                        float f50 = this.h0.f.c;
                        if (f50 <= f21) {
                            sin = 0.0f;
                        } else {
                            double d15 = r3.d() * 6.283185307179586d;
                            sin = f50 * 3.5f * ((float) Math.sin((Math.sin(d15 / 2.9000000953674316d) * 0.5d) + (d15 / 1.7000000476837158d) + 1.100000023841858d));
                        }
                        canvas2.rotate(sin, (drawable.getIntrinsicWidth() / 2.0f) + f47, (drawable.getIntrinsicHeight() / 2.0f) + f48);
                    }
                    drawable.setBounds(i18, i19, drawable.getIntrinsicWidth() + i18, drawable.getIntrinsicHeight() + i19);
                    drawable.setAlpha((int) (org.telegram.messenger.g0.T1(1.0f, 0.6f, this.b.d(this.a)) * (1.0f - d13) * 255.0f));
                    drawable.draw(canvas2);
                    canvas2.restore();
                }
                if (z10 && d < 1.0f) {
                    this.h0.b(canvas2, rectF, this.t0, paint.getColor());
                }
                if (this.s0) {
                    T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d) - this.P, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), d13);
                    T12 = org.telegram.messenger.g0.T1(((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f), d13);
                    W1 = org.telegram.messenger.g0.W1(d13, getCircleHeight(), org.telegram.messenger.g0.L(32.0f)) * d;
                } else {
                    T1 = org.telegram.messenger.g0.T1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(4.0f), d) - this.P;
                    W1 = getCircleHeight() * d;
                    T12 = ((getMeasuredHeight() - this.Q) - org.telegram.messenger.g0.L(4.0f)) - (W1 / 2.0f);
                }
                float T14 = org.telegram.messenger.g0.T1(getCircleWidth(), m6Var.c() + org.telegram.messenger.g0.L(!this.H ? f12 : 22.0f), d13);
                float T15 = org.telegram.messenger.g0.T1(T14, W1, this.s) * d;
                float f51 = T14 - T15;
                float f52 = T1 - (T15 / 2.0f);
                setPivotX(f52);
                setPivotY(T12);
                float f53 = T12;
                float T16 = org.telegram.messenger.g0.T1(1.0f, 0.79f, this.r);
                if (d <= 0.0f) {
                    canvas2.save();
                    Path path2 = this.d0;
                    path2.rewind();
                    float min = Math.min(T15, W1) / 2.0f;
                    float f54 = W1;
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f55 = f54 / 2.0f;
                    i7 = save;
                    float f56 = f53 - f55;
                    float f57 = f53 + f55;
                    rectF2.set(T1 - T15, f56, T1, f57);
                    path2.addRoundRect(rectF2, min, min, Path.Direction.CW);
                    float centerX = rectF2.centerX();
                    float centerY = rectF2.centerY();
                    f15 = T1;
                    if (this.r > 0.0f) {
                        if (this.q0 == null) {
                            i11 = i18;
                            this.q0 = getContext().getResources().getDrawable(R.drawable.send_outline);
                        } else {
                            i11 = i18;
                        }
                        i12 = i19;
                        this.q0.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                        bg.t.d(this.q0, centerX, centerY, 17);
                        bg.t.b(canvas2, this.q0, this.r);
                    } else {
                        i11 = i18;
                        i12 = i19;
                    }
                    canvas2.scale(T16, T16, centerX, centerY);
                    if (this.r0 != null) {
                        Rect rect = org.telegram.messenger.g0.Q;
                        rectF2.round(rect);
                        rect.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
                        this.r0.setBounds(rect);
                        this.r0.draw(canvas2);
                    }
                    if (!this.H) {
                        canvas2.drawPath(path2, paint);
                    }
                    canvas2.clipPath(path2);
                    int i20 = (d12 > 0.0f ? 1 : (d12 == 0.0f ? 0 : -1));
                    if (i20 > 0) {
                        Paint paint9 = this.e0;
                        paint9.setColor(-1);
                        paint9.setAlpha((int) (d12 * 255.0f));
                        float L3 = org.telegram.messenger.g0.L(8.66f);
                        rectF2.set(f52 - L3, f53 - L3, f52 + L3, f53 + L3);
                        if (this.U) {
                            long currentTimeMillis = System.currentTimeMillis() % 5400;
                            float f58 = (1520 * currentTimeMillis) / 5400.0f;
                            float max = Math.max(0.0f, f58 - f12);
                            int i21 = 0;
                            while (i21 < 4) {
                                int i22 = i21 * 1350;
                                x1.a aVar = this.V;
                                f58 += aVar.getInterpolation((r38 - i22) / 667.0f) * 250.0f;
                                max += aVar.getInterpolation((r38 - (i22 + 667)) / 667.0f) * 250.0f;
                                i21++;
                                currentTimeMillis = currentTimeMillis;
                            }
                            canvas2 = canvas;
                            i13 = i20;
                            f16 = f53;
                            f18 = f52;
                            f20 = 0.6f;
                            canvas2.drawArc(org.telegram.messenger.g0.P, max, f58 - max, false, paint9);
                        } else {
                            i13 = i20;
                            f16 = f53;
                            f18 = f52;
                            f20 = 0.6f;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF2, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.c0.e(false, this.a0) * 360.0f, false, paint9);
                        }
                        canvas2.save();
                        float T17 = org.telegram.messenger.g0.T1(1.0f, f20, d12);
                        canvas2.scale(T17, T17, f18, f16);
                        invalidate();
                    } else {
                        i13 = i20;
                        f16 = f53;
                        f18 = f52;
                    }
                    if (d13 > 0.0f) {
                        if (this.s0) {
                            m6Var.o((f15 - m6Var.d) - org.telegram.messenger.g0.L(11.0f), f56, f15 - org.telegram.messenger.g0.L(11.0f), f57);
                        } else if (this.H) {
                            m6Var.o(rectF.left + org.telegram.messenger.g0.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                        } else {
                            m6Var.o((getMeasuredWidth() - m6Var.d) - org.telegram.messenger.g0.L(f12), getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(f12), getMeasuredHeight());
                        }
                        f19 = 1.0f;
                        m6Var.C = (int) ((1.0f - d12) * d13 * 255.0f);
                        m6Var.draw(canvas2);
                    } else {
                        f19 = 1.0f;
                    }
                    this.h.setAlpha((int) ((f19 - d13) * (f19 - d12) * 255.0f));
                    if (this.L > 0) {
                        this.h.setBounds((int) (f18 - (r2.getIntrinsicWidth() / 2.0f)), (int) (f16 - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + f18), (int) ((this.h.getIntrinsicHeight() / 2.0f) + f16));
                    } else {
                        this.h.setBounds(i11, i12, drawable.getIntrinsicWidth() + i11, drawable.getIntrinsicHeight() + i12);
                    }
                    if (d >= 1.0f && d13 <= 0.0f && d12 <= 0.0f && T15 > 0.0f) {
                        this.j0 = f18;
                        this.k0 = f16;
                        this.l0 = f55;
                        this.m0 = this.h.getBounds().left;
                        this.n0 = this.h.getBounds().top;
                        this.o0 = true;
                    }
                    this.h.draw(canvas2);
                    if (i13 > 0) {
                        canvas2.restore();
                    }
                    canvas2.restore();
                } else {
                    f15 = T1;
                    i7 = save;
                    f16 = f53;
                }
                m6 m6Var2 = this.f0;
                i10 = (1.0f - d13) * m6Var2.i();
                if (!this.I) {
                    float max2 = Math.max(m6Var2.c() + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f));
                    if (this.s0) {
                        measuredWidth = (f15 - org.telegram.messenger.g0.L(50.0f)) + f51;
                        measuredHeight2 = (max2 / 2.0f) + (f16 - (getCircleHeight() / 2.0f));
                        f17 = org.telegram.messenger.g0.L(0.66f);
                    } else {
                        float f59 = max2 / 2.0f;
                        measuredWidth = (getMeasuredWidth() - this.P) - f59;
                        measuredHeight2 = (getMeasuredHeight() - this.Q) - f59;
                        f17 = 0.0f;
                    }
                    float f60 = max2 / 2.0f;
                    m6Var2.setBounds((int) (measuredWidth - f60), (int) ((measuredHeight2 - f60) - f17), (int) (measuredWidth + f60), (int) ((measuredHeight2 + f60) - f17));
                    if (i10 > 0.0f) {
                        float T18 = org.telegram.messenger.g0.T1(1.0f, 0.85f, this.r);
                        canvas2.save();
                        canvas2.scale(T18, T18, measuredWidth, measuredHeight2);
                        if (!this.H) {
                            canvas2.drawCircle(measuredWidth, measuredHeight2, (org.telegram.messenger.g0.L(2.0f) + f60) * i10 * this.g0, org.telegram.ui.ActionBar.n6.Fm);
                            canvas2.drawCircle(measuredWidth, measuredHeight2, f60 * i10 * this.g0, paint);
                        }
                        m6Var2.C = (int) (i10 * 255.0f);
                        m6Var2.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (i10 < 1.0f) {
                    int L4 = org.telegram.messenger.g0.L(8.0f);
                    int T19 = (int) org.telegram.messenger.g0.T1(((getMeasuredWidth() - (getCircleWidth() / 2.0f)) - this.P) + org.telegram.messenger.g0.L(12.0f), f15 - org.telegram.messenger.g0.L(2.0f), d13);
                    int T110 = (int) org.telegram.messenger.g0.T1(((getMeasuredHeight() - (getCircleHeight() / 2.0f)) - this.Q) + org.telegram.messenger.g0.L(10.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f), d13);
                    int i23 = T19 - L4;
                    int i24 = T110 - L4;
                    int i25 = T19 + L4;
                    int i26 = T110 + L4;
                    m5 m5Var = this.n;
                    m5Var.setBounds(i23, i24, i25, i26);
                    m5Var.w = (int) ((1.0f - i10) * 255.0f);
                    m5Var.draw(canvas2);
                }
                if (!this.H) {
                    canvas2.restore();
                }
                canvas2.restoreToCount(i7);
                super.onDraw(canvas);
            }
            f10 = 1.0f;
        }
        z10 = false;
        if (!z10) {
            uptimeMillis = SystemClock.uptimeMillis() - this.i0.s6;
            if (j3 - uptimeMillis > 0) {
            }
        }
        Paint paint32 = this.G;
        if (z10) {
        }
        if (this.H) {
        }
        if (z10) {
        }
        Drawable drawable2 = !c() ? this.f : this.e;
        if (this.H) {
        }
        int i182 = C;
        int i192 = measuredHeight;
        float d122 = this.b0.d(this.W);
        d = this.S.d(d());
        float d132 = this.F.d(this.w <= j10 && !this.y) * (1.0f - this.r);
        float e102 = this.p0.e(false, 1.0f);
        if (d >= 1.0f) {
        }
        if (z10) {
            this.h0.b(canvas2, rectF, this.t0, paint.getColor());
        }
        if (this.s0) {
        }
        float T142 = org.telegram.messenger.g0.T1(getCircleWidth(), m6Var.c() + org.telegram.messenger.g0.L(!this.H ? f12 : 22.0f), d132);
        float T152 = org.telegram.messenger.g0.T1(T142, W1, this.s) * d;
        float f512 = T142 - T152;
        float f522 = T1 - (T152 / 2.0f);
        setPivotX(f522);
        setPivotY(T12);
        float f532 = T12;
        float T162 = org.telegram.messenger.g0.T1(1.0f, 0.79f, this.r);
        if (d <= 0.0f) {
        }
        m6 m6Var22 = this.f0;
        i10 = (1.0f - d132) * m6Var22.i();
        if (!this.I) {
        }
        if (i10 < 1.0f) {
        }
        if (!this.H) {
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
        this.r0 = gVar;
        gVar.r(org.telegram.messenger.g0.L(22.0f));
        this.r0.q(org.telegram.messenger.g0.L(4.0f));
    }

    public void setCircleSize(int i7) {
        this.L = i7;
        this.M = i7;
    }

    public void setEffect(long j3) {
        TLRPC.TL_availableEffect b12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).b1(j3);
        setEmoji(b12 != null ? org.telegram.messenger.j6.g(b12.emoticon) : null);
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

    @Override // org.telegram.ui.Components.x60
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
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
