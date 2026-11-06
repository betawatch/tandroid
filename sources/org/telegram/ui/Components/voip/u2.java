package org.telegram.ui.Components.voip;

import a8.b8;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import bi.de;
import j$.util.Objects;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.va;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class u2 extends FrameLayout {
    public final qa0 D;
    public int E;
    public int F;
    public int G;
    public int H;
    public float I;
    public boolean J;
    public final Path K;
    public int L;
    public int M;
    public ValueAnimator N;
    public ValueAnimator O;
    public AnimatorSet P;
    public final AnimatorSet Q;
    public boolean R;
    public volatile boolean S;
    public final i1 T;
    public final boolean U;
    public int V;
    public final Drawable a;
    public final Drawable b;
    public final qa0 c;
    public final qa0 d;
    public final Drawable e;
    public final Drawable f;
    public final qa0 h;
    public final qa0 n;
    public final Drawable r;
    public final Drawable s;
    public final qa0 w;
    public final qa0 x;
    public final qa0 y;

    public u2(Activity activity, boolean z9, i1 i1Var) {
        super(activity);
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0.0f;
        this.J = false;
        this.K = new Path();
        this.L = 0;
        this.M = 0;
        this.R = false;
        this.S = false;
        this.T = i1Var;
        boolean e10 = rc.e(512);
        this.U = e10;
        this.a = z9 ? new t2() : new qa0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        this.b = z9 ? new t2() : new qa0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        this.c = new qa0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new qa0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        Drawable t2Var = z9 ? new t2() : new qa0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        this.e = t2Var;
        Drawable t2Var2 = z9 ? new t2() : new qa0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        this.f = t2Var2;
        qa0 qa0Var = new qa0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = qa0Var;
        qa0 qa0Var2 = new qa0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.n = qa0Var2;
        Drawable t2Var3 = z9 ? new t2() : new qa0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        this.r = t2Var3;
        Drawable t2Var4 = z9 ? new t2() : new qa0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        this.s = t2Var4;
        qa0 qa0Var3 = new qa0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.w = qa0Var3;
        qa0 qa0Var4 = new qa0(-34714, -32091, -85931, -29103, false, 0, true);
        this.x = qa0Var4;
        this.y = new qa0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.D = new qa0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        t2Var.setBounds(0, 0, 80, 80);
        t2Var2.setBounds(0, 0, 80, 80);
        qa0Var.setBounds(0, 0, 80, 80);
        qa0Var2.setBounds(0, 0, 80, 80);
        t2Var3.setBounds(0, 0, 80, 80);
        t2Var4.setBounds(0, 0, 80, 80);
        qa0Var3.setBounds(0, 0, 80, 80);
        qa0Var4.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.Q = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new de(20, this, i1Var));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (e10) {
            animatorSet.start();
        }
        if (this.V == 1) {
            return;
        }
        this.V = 1;
        this.F = qs.e4;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(qs.e4, 0, qs.e4);
        this.N = ofInt2;
        ofInt2.addUpdateListener(new s2(this, 3));
        this.N.setRepeatCount(-1);
        this.N.setRepeatMode(1);
        this.N.setInterpolator(new LinearInterpolator());
        this.N.setDuration(12000L);
        if (e10) {
            this.N.start();
        }
    }

    public final void a() {
        if (this.R) {
            this.R = false;
            AnimatorSet animatorSet = this.Q;
            if (animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = this.P;
            if (animatorSet2 == null || !animatorSet2.isPaused()) {
                return;
            }
            this.P.resume();
        }
    }

    public final void b(int i7, int i10, boolean z9) {
        int i11 = this.V;
        if (i11 == 2 || i11 == 3) {
            return;
        }
        this.V = 2;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.N.cancel();
            this.N = null;
        }
        this.L = i7;
        this.M = i10;
        Point point = org.telegram.messenger.g0.q;
        int i12 = point.x - i7;
        int i13 = i12 * i12;
        int i14 = ((point.y + org.telegram.messenger.g0.m) + org.telegram.messenger.g0.n) - i10;
        int i15 = i14 * i14;
        int i16 = i7 * i7;
        int i17 = i10 * i10;
        double max = Math.max(Math.max(Math.max(Math.sqrt(i13 + i15), Math.sqrt(i15 + i16)), Math.sqrt(i16 + i17)), Math.sqrt(i13 + i17));
        this.J = true;
        this.T.e = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
        ofFloat.addUpdateListener(new s2(this, 1));
        ofFloat.addListener(new va(this, 19));
        ofFloat.setDuration(z9 ? 400L : 0L);
        ofFloat.start();
    }

    public final void c() {
        if (this.P != null) {
            return;
        }
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.N.cancel();
            this.N = null;
        }
        this.G = qs.e4;
        this.P = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, qs.e4, qs.e4, qs.e4, 0);
        ofInt.addUpdateListener(new s2(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, qs.e4, 0, 0);
        ofInt2.addUpdateListener(new s2(this, 5));
        ofInt2.setRepeatCount(-1);
        ofInt2.setRepeatMode(1);
        this.P.playTogether(ofInt2, ofInt);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.setDuration(24000L);
        if (this.U) {
            this.P.start();
        } else {
            this.F = 0;
            this.E = 0;
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.P;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float sqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(sqrt, sqrt, width, height);
        canvas.rotate(this.T.h, width, height);
        Canvas canvas2 = (Canvas) this.T.a.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas2.drawColor(0, mode);
        ((Canvas) this.T.b.b).drawColor(0, mode);
        int i7 = this.G;
        if (i7 != 0 && this.H != 255) {
            this.c.setAlpha(i7);
            this.w.setAlpha(this.G);
            this.h.setAlpha(this.G);
            this.c.draw(canvas);
            this.w.draw((Canvas) this.T.a.b);
            this.h.draw((Canvas) this.T.b.b);
        }
        int i10 = this.F;
        if (i10 != 0 && this.H != 255) {
            this.b.setAlpha(i10);
            this.f.setAlpha(this.F);
            this.s.setAlpha(this.F);
            this.b.draw(canvas);
            this.f.draw((Canvas) this.T.b.b);
            this.s.draw((Canvas) this.T.a.b);
        }
        int i11 = this.E;
        if (i11 != 0 && this.H != 255) {
            this.a.setAlpha(i11);
            this.e.setAlpha(this.E);
            this.r.setAlpha(this.E);
            this.a.draw(canvas);
            this.e.draw((Canvas) this.T.b.b);
            this.r.draw((Canvas) this.T.a.b);
        }
        int i12 = this.H;
        if (i12 != 0) {
            this.d.setAlpha(i12);
            this.n.setAlpha(this.H);
            this.x.setAlpha(this.H);
            this.d.draw(canvas);
            this.n.draw((Canvas) this.T.b.b);
            this.x.draw((Canvas) this.T.a.b);
        }
        canvas.restore();
        if (this.J) {
            this.K.rewind();
            Path path = this.K;
            float f10 = this.L;
            float f11 = this.M;
            float f12 = this.I;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f10, f11, f12, direction);
            canvas.clipPath(this.K);
            Objects.requireNonNull(this.T);
            Objects.requireNonNull(this.T);
            canvas.scale(1.12f, 1.12f, width, height);
            this.c.setAlpha(qs.e4);
            this.c.draw(canvas);
            this.K.rewind();
            this.K.addCircle(this.L / 4.0f, this.M / 4.0f, this.I / 4.0f, direction);
            ((Canvas) this.T.c.b).drawColor(0, mode);
            ((Canvas) this.T.c.b).save();
            ((Canvas) this.T.c.b).clipPath(this.K);
            this.y.setAlpha(qs.e4);
            this.y.draw((Canvas) this.T.c.b);
            ((Canvas) this.T.c.b).restore();
            ((Canvas) this.T.d.b).drawColor(0, mode);
            ((Canvas) this.T.d.b).save();
            ((Canvas) this.T.d.b).clipPath(this.K);
            this.D.setAlpha(qs.e4);
            this.D.draw((Canvas) this.T.d.b);
            ((Canvas) this.T.d.b).restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.b.setBounds(0, 0, getWidth(), getHeight());
        this.a.setBounds(0, 0, getWidth(), getHeight());
        this.y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.D.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        i1 i1Var = this.T;
        i1Var.f = width;
        i1Var.g = height;
        int i13 = width / 4;
        int i14 = height / 4;
        i1Var.c = new b8(i13, i14);
        b8 b8Var = new b8(i13, i14);
        i1Var.d = b8Var;
        ((Paint) b8Var.a).setAlpha(qs.K2);
    }
}
