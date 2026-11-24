// default package

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
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kkc extends FrameLayout {
    public final ah7 E;
    public int F;
    public int G;
    public short H;
    public int I;
    public float J;
    public boolean K;
    public final Path L;
    public int M;
    public int N;
    public ValueAnimator O;
    public ValueAnimator P;
    public AnimatorSet Q;
    public final AnimatorSet R;
    public boolean S;
    public volatile boolean T;
    public final lhc U;
    public final boolean V;
    public int W;
    public final Drawable a;
    public final Drawable b;
    public final ah7 c;
    public final ah7 d;
    public final Drawable e;
    public final Drawable f;
    public final ah7 h;
    public final ah7 n;
    public final Drawable r;
    public final Drawable s;
    public final ah7 w;
    public final ah7 x;
    public final ah7 y;

    public kkc(Activity activity, boolean z, lhc lhcVar) {
        super(activity);
        this.F = 0;
        this.G = 0;
        this.H = (short) 0;
        this.I = 0;
        this.J = 0.0f;
        this.K = false;
        this.L = new Path();
        this.M = 0;
        this.N = 0;
        this.S = false;
        this.T = false;
        this.U = lhcVar;
        boolean e = e86.e(512);
        this.V = e;
        this.a = z ? new jkc() : new ah7(-4958504, -8304404, -14637865, -12612630, false, true);
        this.b = z ? new jkc() : new ah7(-12224791, -12879119, -16207709, -15226140, false, true);
        this.c = new ah7(-16275028, -16270749, -5649306, -10833593, false, true);
        this.d = new ah7(-1545896, -1613425, -2387892, -2198984, false, true);
        Drawable jkcVar = z ? new jkc() : new ah7(-5818672, -9819171, -15755831, -14124319, false, true);
        this.e = jkcVar;
        Drawable jkcVar2 = z ? new jkc() : new ah7(-13803306, -13866273, -16738923, -16608823, false, true);
        this.f = jkcVar2;
        ah7 ah7Var = new ah7(-16741490, -16673972, -7357129, -13525721, false, true);
        this.h = ah7Var;
        ah7 ah7Var2 = new ah7(-1949911, -1691537, -3705322, -2663914, false, true);
        this.n = ah7Var2;
        Drawable jkcVar3 = z ? new jkc() : new ah7(-2726657, -7186179, -13778695, -11034113, false, true);
        this.r = jkcVar3;
        Drawable jkcVar4 = z ? new jkc() : new ah7(-11170817, -10507265, -16458548, -14105857, false, true);
        this.s = jkcVar4;
        ah7 ah7Var3 = new ah7(-16723243, -16129415, -3674272, -9578153, false, true);
        this.w = ah7Var3;
        ah7 ah7Var4 = new ah7(-34714, -32091, -85931, -29103, false, true);
        this.x = ah7Var4;
        this.y = new ah7(-16723243, -16129415, -3674272, -9578153, false, true);
        this.E = new ah7(-16741490, -16673972, -7357129, -13525721, false, true);
        jkcVar.setBounds(0, 0, 80, 80);
        jkcVar2.setBounds(0, 0, 80, 80);
        ah7Var.setBounds(0, 0, 80, 80);
        ah7Var2.setBounds(0, 0, 80, 80);
        jkcVar3.setBounds(0, 0, 80, 80);
        jkcVar4.setBounds(0, 0, 80, 80);
        ah7Var3.setBounds(0, 0, 80, 80);
        ah7Var4.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.R = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new vjc(this, lhcVar, (byte) 1));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (e) {
            animatorSet.start();
        }
        if (this.W != 1) {
            this.W = 1;
            this.G = nm7.d4;
            ValueAnimator ofInt2 = ValueAnimator.ofInt(nm7.d4, 0, nm7.d4);
            this.O = ofInt2;
            ofInt2.addUpdateListener(new ikc(this, (byte) 3));
            this.O.setRepeatCount(-1);
            this.O.setRepeatMode(1);
            this.O.setInterpolator(new LinearInterpolator());
            this.O.setDuration(12000L);
            if (e) {
                this.O.start();
            }
        }
    }

    public final void a() {
        if (this.S) {
            this.S = false;
            AnimatorSet animatorSet = this.R;
            if (animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = this.Q;
            if (animatorSet2 == null || !animatorSet2.isPaused()) {
                return;
            }
            this.Q.resume();
        }
    }

    public final void b(int i, int i2, boolean z) {
        int i3 = this.W;
        if (i3 == 2 || i3 == 3) {
            return;
        }
        this.W = 2;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.O.cancel();
            this.O = null;
        }
        this.M = i;
        this.N = i2;
        Point point = gm.q;
        int i4 = point.x - i;
        int i5 = i4 * i4;
        int i6 = ((point.y + gm.m) + gm.n) - i2;
        int i7 = i6 * i6;
        int i8 = i * i;
        int i9 = i2 * i2;
        double max = Math.max(Math.max(Math.max(Math.sqrt(i5 + i7), Math.sqrt(i7 + i8)), Math.sqrt(i8 + i9)), Math.sqrt(i5 + i9));
        this.K = true;
        this.U.e = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
        ofFloat.addUpdateListener(new ikc(this, (byte) 1));
        ofFloat.addListener(new q7b(this, (byte) 25));
        ofFloat.setDuration(z ? 400L : 0L);
        ofFloat.start();
    }

    public final void c() {
        if (this.Q != null) {
            return;
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.O.cancel();
            this.O = null;
        }
        this.H = (short) 255;
        this.Q = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, nm7.d4, nm7.d4, nm7.d4, 0);
        ofInt.addUpdateListener(new ikc(this, (byte) 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, nm7.d4, 0, 0);
        ofInt2.addUpdateListener(new ikc(this, (byte) 5));
        ofInt2.setRepeatCount(-1);
        ofInt2.setRepeatMode(1);
        this.Q.playTogether(ofInt2, ofInt);
        this.Q.setInterpolator(new LinearInterpolator());
        this.Q.setDuration(24000L);
        if (this.V) {
            this.Q.start();
        } else {
            this.G = 0;
            this.F = 0;
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.Q;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float sqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(sqrt, sqrt, width, height);
        canvas.rotate(this.U.h, width, height);
        Canvas canvas2 = (Canvas) this.U.a.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas2.drawColor(0, mode);
        ((Canvas) this.U.b.b).drawColor(0, mode);
        short s = this.H;
        if (s != 0 && this.I != 255) {
            this.c.setAlpha(s);
            this.w.setAlpha(this.H);
            this.h.setAlpha(this.H);
            this.c.draw(canvas);
            this.w.draw((Canvas) this.U.a.b);
            this.h.draw((Canvas) this.U.b.b);
        }
        int i = this.G;
        if (i != 0 && this.I != 255) {
            this.b.setAlpha(i);
            this.f.setAlpha(this.G);
            this.s.setAlpha(this.G);
            this.b.draw(canvas);
            this.f.draw((Canvas) this.U.b.b);
            this.s.draw((Canvas) this.U.a.b);
        }
        int i2 = this.F;
        if (i2 != 0 && this.I != 255) {
            this.a.setAlpha(i2);
            this.e.setAlpha(this.F);
            this.r.setAlpha(this.F);
            this.a.draw(canvas);
            this.e.draw((Canvas) this.U.b.b);
            this.r.draw((Canvas) this.U.a.b);
        }
        int i3 = this.I;
        if (i3 != 0) {
            this.d.setAlpha(i3);
            this.n.setAlpha(this.I);
            this.x.setAlpha(this.I);
            this.d.draw(canvas);
            this.n.draw((Canvas) this.U.b.b);
            this.x.draw((Canvas) this.U.a.b);
        }
        canvas.restore();
        if (this.K) {
            this.L.rewind();
            Path path = this.L;
            float f = this.M;
            float f2 = this.N;
            float f3 = this.J;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f, f2, f3, direction);
            canvas.clipPath(this.L);
            Objects.requireNonNull(this.U);
            Objects.requireNonNull(this.U);
            canvas.scale(1.12f, 1.12f, width, height);
            this.c.setAlpha(nm7.d4);
            this.c.draw(canvas);
            this.L.rewind();
            this.L.addCircle(this.M / 4.0f, this.N / 4.0f, this.J / 4.0f, direction);
            ((Canvas) this.U.c.b).drawColor(0, mode);
            ((Canvas) this.U.c.b).save();
            ((Canvas) this.U.c.b).clipPath(this.L);
            this.y.setAlpha(nm7.d4);
            this.y.draw((Canvas) this.U.c.b);
            ((Canvas) this.U.c.b).restore();
            ((Canvas) this.U.d.b).drawColor(0, mode);
            ((Canvas) this.U.d.b).save();
            ((Canvas) this.U.d.b).clipPath(this.L);
            this.E.setAlpha(nm7.d4);
            this.E.draw((Canvas) this.U.d.b);
            ((Canvas) this.U.d.b).restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.b.setBounds(0, 0, getWidth(), getHeight());
        this.a.setBounds(0, 0, getWidth(), getHeight());
        this.y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.E.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        lhc lhcVar = this.U;
        lhcVar.f = width;
        lhcVar.g = height;
        int i5 = width / 4;
        int i6 = height / 4;
        lhcVar.c = new eq(i5, i6);
        eq eqVar = new eq(i5, i6);
        lhcVar.d = eqVar;
        ((Paint) eqVar.a).setAlpha(nm7.J2);
    }
}
