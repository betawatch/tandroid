package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class q0 extends FrameLayout {
    public final p0 a;
    public final i9 b;
    public AnimatorSet c;
    public boolean d;
    public boolean e;
    public final boolean f;

    public q0(Activity activity) {
        super(activity);
        p0 p0Var = new p0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.a = p0Var;
        p0Var.b(3.0d);
        if (!p0Var.e) {
            invalidate();
        }
        p0Var.e = true;
        i9 i9Var = new i9(activity);
        this.b = i9Var;
        addView(i9Var, ja.e(ns.R1, ns.R1, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.c.setInterpolator(er.g);
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.c.setInterpolator(er.g);
        this.c.setDuration(400L);
        this.c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            p0 p0Var = this.a;
            if (z10) {
                p0Var.b(3.0d);
            }
            if (p0Var.h != z10) {
                p0Var.h = z10;
                ValueAnimator valueAnimator = p0Var.j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    p0Var.j.cancel();
                }
                if (z10) {
                    p0Var.j = ValueAnimator.ofFloat(p0Var.i, 0.0f);
                    p0Var.k = (int) (2000.0f / org.telegram.messenger.g0.t);
                } else {
                    p0Var.k = 0;
                    p0Var.j = ValueAnimator.ofFloat(p0Var.i, 1.0f);
                }
                p0Var.j.addUpdateListener(new hi.j3(p0Var, 17));
                if (z11) {
                    p0Var.j.setDuration(150L);
                } else {
                    p0Var.j.setDuration(1000L);
                }
                p0Var.j.start();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            p0 p0Var = this.a;
            p0Var.c();
            p0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        p0 p0Var = this.a;
        if (d > 1.5d) {
            p0Var.b(d);
        } else {
            p0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i7) {
        this.b.setRoundRadius(i7);
    }

    public void setShowWaves(boolean z10) {
        p0 p0Var = this.a;
        if (p0Var.e != z10) {
            invalidate();
        }
        p0Var.e = z10;
    }
}
