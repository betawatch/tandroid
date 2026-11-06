package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import fi.v3;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class p0 extends FrameLayout {
    public final o0 a;
    public final l9 b;
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
        l9 l9Var = new l9(activity);
        this.b = l9Var;
        addView(l9Var, ha.e(qs.R1, qs.R1, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<p0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<p0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(xq.g);
        this.c.setDuration(3000L);
        boolean e10 = rc.e(512);
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
        this.c.setInterpolator(xq.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z9, boolean z10) {
        if (this.e != z9) {
            this.e = z9;
            o0 o0Var = this.a;
            if (z9) {
                o0Var.b(3.0d);
            }
            if (o0Var.h != z9) {
                o0Var.h = z9;
                ValueAnimator valueAnimator = o0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    o0Var.j.cancel();
                }
                if (z9) {
                    o0Var.j = ValueAnimator.ofFloat(o0Var.i, 0.0f);
                    o0Var.k = (int) (2000.0f / org.telegram.messenger.g0.t);
                } else {
                    o0Var.k = 0;
                    o0Var.j = ValueAnimator.ofFloat(o0Var.i, 1.0f);
                }
                o0Var.j.addUpdateListener(new v3(o0Var, 17));
                if (z10) {
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

    public void setShowWaves(boolean z9) {
        o0 o0Var = this.a;
        if (o0Var.e != z9) {
            invalidate();
        }
        o0Var.e = z9;
    }
}
