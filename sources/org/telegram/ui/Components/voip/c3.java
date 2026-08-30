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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.f91;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c3 extends FrameLayout {
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public final Path H;
    public int I;
    public int J;
    public ValueAnimator K;
    public ValueAnimator L;
    public AnimatorSet M;
    public final AnimatorSet N;
    public boolean O;
    public volatile boolean P;
    public final n1 Q;
    public final boolean R;
    public int S;
    public final Drawable a;
    public final Drawable b;
    public final dc0 c;
    public final dc0 d;
    public final Drawable e;
    public final Drawable f;
    public final dc0 h;
    public final dc0 n;
    public final Drawable r;
    public final Drawable s;
    public final dc0 v;
    public final dc0 w;
    public final dc0 x;
    public final dc0 y;

    public c3(Activity activity, boolean z4, n1 n1Var) {
        super(activity);
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0.0f;
        this.G = false;
        this.H = new Path();
        this.I = 0;
        this.J = 0;
        this.O = false;
        this.P = false;
        this.Q = n1Var;
        boolean isEnabled = LiteMode.isEnabled(512);
        this.R = isEnabled;
        this.a = z4 ? new b3() : new dc0(-4958504, -8304404, -14637865, -12612630, false, 0, true);
        this.b = z4 ? new b3() : new dc0(-12224791, -12879119, -16207709, -15226140, false, 0, true);
        this.c = new dc0(-16275028, -16270749, -5649306, -10833593, false, 0, true);
        this.d = new dc0(-1545896, -1613425, -2387892, -2198984, false, 0, true);
        Drawable b3Var = z4 ? new b3() : new dc0(-5818672, -9819171, -15755831, -14124319, false, 0, true);
        this.e = b3Var;
        Drawable b3Var2 = z4 ? new b3() : new dc0(-13803306, -13866273, -16738923, -16608823, false, 0, true);
        this.f = b3Var2;
        dc0 dc0Var = new dc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        this.h = dc0Var;
        dc0 dc0Var2 = new dc0(-1949911, -1691537, -3705322, -2663914, false, 0, true);
        this.n = dc0Var2;
        Drawable b3Var3 = z4 ? new b3() : new dc0(-2726657, -7186179, -13778695, -11034113, false, 0, true);
        this.r = b3Var3;
        Drawable b3Var4 = z4 ? new b3() : new dc0(-11170817, -10507265, -16458548, -14105857, false, 0, true);
        this.s = b3Var4;
        dc0 dc0Var3 = new dc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.v = dc0Var3;
        dc0 dc0Var4 = new dc0(-34714, -32091, -85931, -29103, false, 0, true);
        this.w = dc0Var4;
        this.x = new dc0(-16723243, -16129415, -3674272, -9578153, false, 0, true);
        this.y = new dc0(-16741490, -16673972, -7357129, -13525721, false, 0, true);
        b3Var.setBounds(0, 0, 80, 80);
        b3Var2.setBounds(0, 0, 80, 80);
        dc0Var.setBounds(0, 0, 80, 80);
        dc0Var2.setBounds(0, 0, 80, 80);
        b3Var3.setBounds(0, 0, 80, 80);
        b3Var4.setBounds(0, 0, 80, 80);
        dc0Var3.setBounds(0, 0, 80, 80);
        dc0Var4.setBounds(0, 0, 80, 80);
        setWillNotDraw(false);
        setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        this.N = animatorSet;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.addUpdateListener(new ag.a(18, this, n1Var));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofInt);
        animatorSet.setDuration(12000L);
        if (isEnabled) {
            animatorSet.start();
        }
        if (this.S == 1) {
            return;
        }
        this.S = 1;
        this.C = 255;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0, 255);
        this.K = ofInt2;
        ofInt2.addUpdateListener(new a3(this, 3));
        this.K.setRepeatCount(-1);
        this.K.setRepeatMode(1);
        this.K.setInterpolator(new LinearInterpolator());
        this.K.setDuration(12000L);
        if (isEnabled) {
            this.K.start();
        }
    }

    public final void a() {
        if (this.O) {
            this.O = false;
            AnimatorSet animatorSet = this.N;
            if (animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = this.M;
            if (animatorSet2 == null || !animatorSet2.isPaused()) {
                return;
            }
            this.M.resume();
        }
    }

    public final void b(int i10, int i11, boolean z4) {
        int i12 = this.S;
        if (i12 == 2 || i12 == 3) {
            return;
        }
        this.S = 2;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.K.cancel();
            this.K = null;
        }
        this.I = i10;
        this.J = i11;
        Point point = AndroidUtilities.displaySize;
        int i13 = point.x - i10;
        int i14 = i13 * i13;
        int i15 = ((point.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight) - i11;
        int i16 = i15 * i15;
        int i17 = i10 * i10;
        int i18 = i11 * i11;
        double max = Math.max(Math.max(Math.max(Math.sqrt(i14 + i16), Math.sqrt(i16 + i17)), Math.sqrt(i17 + i18)), Math.sqrt(i14 + i18));
        this.G = true;
        this.Q.e = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) max);
        ofFloat.addUpdateListener(new a3(this, 1));
        ofFloat.addListener(new f91(this, 10));
        ofFloat.setDuration(z4 ? 400L : 0L);
        ofFloat.start();
    }

    public final void c() {
        if (this.M != null) {
            return;
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.K.cancel();
            this.K = null;
        }
        this.D = 255;
        this.M = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255, 255, 0);
        ofInt.addUpdateListener(new a3(this, 4));
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0, 255, 0, 0);
        ofInt2.addUpdateListener(new a3(this, 5));
        ofInt2.setRepeatCount(-1);
        ofInt2.setRepeatMode(1);
        this.M.playTogether(ofInt2, ofInt);
        this.M.setInterpolator(new LinearInterpolator());
        this.M.setDuration(24000L);
        if (this.R) {
            this.M.start();
        } else {
            this.C = 0;
            this.B = 0;
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.M;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.P) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.save();
        float sqrt = ((float) Math.sqrt((height * width) + (width * width))) / Math.min(height, width);
        canvas.scale(sqrt, sqrt, width, height);
        canvas.rotate(this.Q.h, width, height);
        Canvas canvas2 = (Canvas) this.Q.a.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas2.drawColor(0, mode);
        ((Canvas) this.Q.b.b).drawColor(0, mode);
        int i10 = this.D;
        if (i10 != 0 && this.E != 255) {
            this.c.setAlpha(i10);
            this.v.setAlpha(this.D);
            this.h.setAlpha(this.D);
            this.c.draw(canvas);
            this.v.draw((Canvas) this.Q.a.b);
            this.h.draw((Canvas) this.Q.b.b);
        }
        int i11 = this.C;
        if (i11 != 0 && this.E != 255) {
            this.b.setAlpha(i11);
            this.f.setAlpha(this.C);
            this.s.setAlpha(this.C);
            this.b.draw(canvas);
            this.f.draw((Canvas) this.Q.b.b);
            this.s.draw((Canvas) this.Q.a.b);
        }
        int i12 = this.B;
        if (i12 != 0 && this.E != 255) {
            this.a.setAlpha(i12);
            this.e.setAlpha(this.B);
            this.r.setAlpha(this.B);
            this.a.draw(canvas);
            this.e.draw((Canvas) this.Q.b.b);
            this.r.draw((Canvas) this.Q.a.b);
        }
        int i13 = this.E;
        if (i13 != 0) {
            this.d.setAlpha(i13);
            this.n.setAlpha(this.E);
            this.w.setAlpha(this.E);
            this.d.draw(canvas);
            this.n.draw((Canvas) this.Q.b.b);
            this.w.draw((Canvas) this.Q.a.b);
        }
        canvas.restore();
        if (this.G) {
            this.H.rewind();
            Path path = this.H;
            float f10 = this.I;
            float f11 = this.J;
            float f12 = this.F;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f10, f11, f12, direction);
            canvas.clipPath(this.H);
            Objects.requireNonNull(this.Q);
            Objects.requireNonNull(this.Q);
            canvas.scale(1.12f, 1.12f, width, height);
            this.c.setAlpha(255);
            this.c.draw(canvas);
            this.H.rewind();
            this.H.addCircle(this.I / 4.0f, this.J / 4.0f, this.F / 4.0f, direction);
            ((Canvas) this.Q.c.b).drawColor(0, mode);
            ((Canvas) this.Q.c.b).save();
            ((Canvas) this.Q.c.b).clipPath(this.H);
            this.x.setAlpha(255);
            this.x.draw((Canvas) this.Q.c.b);
            ((Canvas) this.Q.c.b).restore();
            ((Canvas) this.Q.d.b).drawColor(0, mode);
            ((Canvas) this.Q.d.b).save();
            ((Canvas) this.Q.d.b).clipPath(this.H);
            this.y.setAlpha(255);
            this.y.draw((Canvas) this.Q.d.b);
            ((Canvas) this.Q.d.b).restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.c.setBounds(0, 0, getWidth(), getHeight());
        this.d.setBounds(0, 0, getWidth(), getHeight());
        this.b.setBounds(0, 0, getWidth(), getHeight());
        this.a.setBounds(0, 0, getWidth(), getHeight());
        this.x.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        this.y.setBounds(0, 0, getWidth() / 4, getHeight() / 4);
        int width = getWidth();
        int height = getHeight();
        n1 n1Var = this.Q;
        n1Var.f = width;
        n1Var.g = height;
        int i14 = width / 4;
        int i15 = height / 4;
        n1Var.c = new a9.a(i14, i15);
        a9.a aVar = new a9.a(i14, i15);
        n1Var.d = aVar;
        ((Paint) aVar.a).setAlpha(180);
    }
}
