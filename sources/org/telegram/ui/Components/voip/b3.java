package org.telegram.ui.Components.voip;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.y11;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public boolean F;
    public final Path G;
    public int H;
    public int I;
    public ValueAnimator J;
    public ValueAnimator K;
    public AnimatorSet L;
    public final AnimatorSet M;
    public boolean N;
    public volatile boolean O;
    public final n1 P;
    public final boolean Q;
    public int R;
    public final Drawable a;
    public final Drawable b;
    public final jb0 c;
    public final jb0 d;
    public final Drawable e;
    public final Drawable f;
    public final jb0 h;
    public final jb0 n;
    public final Drawable r;
    public final Drawable s;
    public final jb0 v;
    public final jb0 w;
    public final jb0 x;
    public final jb0 y;

    public b3(Activity activity, boolean z10, n1 n1Var) {
        super(activity);
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0.0f;
        this.F = false;
        this.G = new Path();
        this.H = 0;
        this.I = 0;
        this.N = false;
        this.O = false;
        this.P = n1Var;
        boolean isEnabled = LiteMode.isEnabled(512);
        this.Q = isEnabled;
        this.a = z10 ? new a3() : new jb0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        this.b = z10 ? new a3() : new jb0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        this.c = new jb0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new jb0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        Drawable a3Var = z10 ? new a3() : new jb0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        this.e = a3Var;
        Drawable a3Var2 = z10 ? new a3() : new jb0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        this.f = a3Var2;
        jb0 jb0Var = new jb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = jb0Var;
        jb0 jb0Var2 = new jb0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.n = jb0Var2;
        Drawable a3Var3 = z10 ? new a3() : new jb0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        this.r = a3Var3;
        Drawable a3Var4 = z10 ? new a3() : new jb0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        this.s = a3Var4;
        jb0 jb0Var3 = new jb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.v = jb0Var3;
        jb0 jb0Var4 = new jb0(-34714, -32091, -85931, -29103, false, 0, true);
        this.w = jb0Var4;
        this.x = new jb0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.y = new jb0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        a3Var.setBounds(0, 0, 80, 80);
        a3Var2.setBounds(0, 0, 80, 80);
        jb0Var.setBounds(0, 0, 80, 80);
        jb0Var2.setBounds(0, 0, 80, 80);
        a3Var3.setBounds(0, 0, 80, 80);
        a3Var4.setBounds(0, 0, 80, 80);
        jb0Var3.setBounds(0, 0, 80, 80);
        jb0Var4.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.M = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new f2.g(15, this, n1Var));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (isEnabled) {
            animatorSet.start();
        }
        if (this.R == 1) {
            return;
        }
        this.R = 1;
        this.B = 255;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0, 255);
        this.J = ofInt2;
        ofInt2.addUpdateListener(new z2(this, 3));
        this.J.setRepeatCount(-1);
        this.J.setRepeatMode(1);
        this.J.setInterpolator(new LinearInterpolator());
        this.J.setDuration(12000L);
        if (isEnabled) {
            this.J.start();
        }
    }

    public final void a() {
        if (this.N) {
            this.N = false;
            AnimatorSet animatorSet = this.M;
            if (animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = this.L;
            if (animatorSet2 == null || !animatorSet2.isPaused()) {
                return;
            }
            this.L.resume();
        }
    }

    public final void b(int i9, int i10, boolean z10) {
        int i11 = this.R;
        if (i11 == 2 || i11 == 3) {
            return;
        }
        this.R = 2;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.J.cancel();
            this.J = null;
        }
        this.H = i9;
        this.I = i10;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x - i9;
        int i13 = i12 * i12;
        int i14 = ((point.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight) - i10;
        int i15 = i14 * i14;
        int i16 = i9 * i9;
        int i17 = i10 * i10;
        double max = Math.max(Math.max(Math.max(Math.sqrt(i13 + i15), Math.sqrt(i15 + i16)), Math.sqrt(i16 + i17)), Math.sqrt(i13 + i17));
        this.F = true;
        this.P.e = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
        ofFloat.addUpdateListener(new z2(this, 1));
        ofFloat.addListener(new y11(this, 17));
        ofFloat.setDuration(z10 ? 400L : 0L);
        ofFloat.start();
    }

    public final void c() {
        if (this.L != null) {
            return;
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.J.cancel();
            this.J = null;
        }
        this.C = 255;
        this.L = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        ofInt.addUpdateListener(new z2(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new z2(this, 5));
        ofInt2.setRepeatCount(-1);
        ofInt2.setRepeatMode(1);
        this.L.playTogether(ofInt2, ofInt);
        this.L.setInterpolator(new LinearInterpolator());
        this.L.setDuration(24000L);
        if (this.Q) {
            this.L.start();
        } else {
            this.B = 0;
            this.A = 0;
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.L;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.O) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float sqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(sqrt, sqrt, width, height);
        canvas.rotate(this.P.h, width, height);
        Canvas canvas2 = (Canvas) this.P.a.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas2.drawColor(0, mode);
        ((Canvas) this.P.b.b).drawColor(0, mode);
        int i9 = this.C;
        if (i9 != 0 && this.D != 255) {
            this.c.setAlpha(i9);
            this.v.setAlpha(this.C);
            this.h.setAlpha(this.C);
            this.c.draw(canvas);
            this.v.draw((Canvas) this.P.a.b);
            this.h.draw((Canvas) this.P.b.b);
        }
        int i10 = this.B;
        if (i10 != 0 && this.D != 255) {
            this.b.setAlpha(i10);
            this.f.setAlpha(this.B);
            this.s.setAlpha(this.B);
            this.b.draw(canvas);
            this.f.draw((Canvas) this.P.b.b);
            this.s.draw((Canvas) this.P.a.b);
        }
        int i11 = this.A;
        if (i11 != 0 && this.D != 255) {
            this.a.setAlpha(i11);
            this.e.setAlpha(this.A);
            this.r.setAlpha(this.A);
            this.a.draw(canvas);
            this.e.draw((Canvas) this.P.b.b);
            this.r.draw((Canvas) this.P.a.b);
        }
        int i12 = this.D;
        if (i12 != 0) {
            this.d.setAlpha(i12);
            this.n.setAlpha(this.D);
            this.w.setAlpha(this.D);
            this.d.draw(canvas);
            this.n.draw((Canvas) this.P.b.b);
            this.w.draw((Canvas) this.P.a.b);
        }
        canvas.restore();
        if (this.F) {
            this.G.rewind();
            Path path = this.G;
            float f10 = this.H;
            float f11 = this.I;
            float f12 = this.E;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f10, f11, f12, direction);
            canvas.clipPath(this.G);
            Objects.requireNonNull(this.P);
            Objects.requireNonNull(this.P);
            canvas.scale(1.12f, 1.12f, width, height);
            this.c.setAlpha(255);
            this.c.draw(canvas);
            this.G.rewind();
            this.G.addCircle(this.H / 4.0f, this.I / 4.0f, this.E / 4.0f, direction);
            ((Canvas) this.P.c.b).drawColor(0, mode);
            ((Canvas) this.P.c.b).save();
            ((Canvas) this.P.c.b).clipPath(this.G);
            this.x.setAlpha(255);
            this.x.draw((Canvas) this.P.c.b);
            ((Canvas) this.P.c.b).restore();
            ((Canvas) this.P.d.b).drawColor(0, mode);
            ((Canvas) this.P.d.b).save();
            ((Canvas) this.P.d.b).clipPath(this.G);
            this.y.setAlpha(255);
            this.y.draw((Canvas) this.P.d.b);
            ((Canvas) this.P.d.b).restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.b.setBounds(0, 0, getWidth(), getHeight());
        this.a.setBounds(0, 0, getWidth(), getHeight());
        this.x.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        n1 n1Var = this.P;
        n1Var.f = width;
        n1Var.g = height;
        int i13 = width / 4;
        int i14 = height / 4;
        n1Var.c = new com.google.firebase.messaging.m(i13, i14);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(i13, i14);
        n1Var.d = mVar;
        ((Paint) mVar.a).setAlpha(180);
    }
}
