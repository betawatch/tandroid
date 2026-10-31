package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.sc;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b0 extends FrameLayout {
    public final a0 a;
    public final g9 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public b0(Activity activity) {
        super(activity);
        a0 a0Var = new a0(org.telegram.messenger.i0.L(104.0f), org.telegram.messenger.i0.L(111.0f), org.telegram.messenger.i0.L(12.0f), 8);
        this.a = a0Var;
        a0Var.b(3.0d);
        if (!a0Var.e) {
            invalidate();
        }
        a0Var.e = true;
        g9 g9Var = new g9(activity);
        this.b = g9Var;
        addView(g9Var, b6.e(zs.R1, zs.R1, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<b0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<b0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(gr.g);
        this.c.setDuration(3000L);
        boolean e = sc.e(512);
        this.f = e;
        if (e) {
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<b0, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<b0, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(gr.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            a0 a0Var = this.a;
            if (z10) {
                a0Var.b(3.0d);
            }
            if (a0Var.h != z10) {
                a0Var.h = z10;
                ValueAnimator valueAnimator = a0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    a0Var.j.cancel();
                }
                if (z10) {
                    a0Var.j = ValueAnimator.ofFloat(a0Var.i, 0.0f);
                    a0Var.k = (int) (2000.0f / org.telegram.messenger.i0.t);
                } else {
                    a0Var.k = 0;
                    a0Var.j = ValueAnimator.ofFloat(a0Var.i, 1.0f);
                }
                a0Var.j.addUpdateListener(new bg.k(a0Var, 20));
                if (z11) {
                    a0Var.j.setDuration(150L);
                } else {
                    a0Var.j.setDuration(1000L);
                }
                a0Var.j.start();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            a0 a0Var = this.a;
            a0Var.c();
            a0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        a0 a0Var = this.a;
        if (d > 1.5d) {
            a0Var.b(d);
        } else {
            a0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        a0 a0Var = this.a;
        if (a0Var.e != z10) {
            invalidate();
        }
        a0Var.e = z10;
    }
}
