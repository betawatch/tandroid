package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.j3;
import org.telegram.messenger.ls;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p0 extends FrameLayout {
    public final o0 a;
    public final q9 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public p0(Activity activity) {
        super(activity);
        o0 o0Var = new o0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.a = o0Var;
        o0Var.b(3.0d);
        if (!o0Var.e) {
            invalidate();
        }
        o0Var.e = true;
        q9 q9Var = new q9(activity);
        this.b = q9Var;
        addView(q9Var, ma.e(ls.R1, ls.R1, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<p0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<p0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(nr.g);
        this.c.setDuration(3000L);
        boolean e10 = qc.e(512);
        this.f = e10;
        if (e10) {
            this.c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<p0, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<p0, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(nr.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            o0 o0Var = this.a;
            if (z10) {
                o0Var.b(3.0d);
            }
            if (o0Var.h != z10) {
                o0Var.h = z10;
                ValueAnimator valueAnimator = o0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    o0Var.j.cancel();
                }
                if (z10) {
                    o0Var.j = ValueAnimator.ofFloat(o0Var.i, 0.0f);
                    o0Var.k = (int) (2000.0f / org.telegram.messenger.g0.t);
                } else {
                    o0Var.k = 0;
                    o0Var.j = ValueAnimator.ofFloat(o0Var.i, 1.0f);
                }
                o0Var.j.addUpdateListener(new j3(o0Var, 17));
                if (z11) {
                    o0Var.j.setDuration(150L);
                } else {
                    o0Var.j.setDuration(1000L);
                }
                o0Var.j.start();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            o0 o0Var = this.a;
            o0Var.c();
            o0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        o0 o0Var = this.a;
        if (d > 1.5d) {
            o0Var.b(d);
        } else {
            o0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i7) {
        this.b.setRoundRadius(i7);
    }

    public void setShowWaves(boolean z10) {
        o0 o0Var = this.a;
        if (o0Var.e != z10) {
            invalidate();
        }
        o0Var.e = z10;
    }
}
