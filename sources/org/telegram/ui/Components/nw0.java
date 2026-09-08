package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class nw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qw0 b;

    public /* synthetic */ nw0(qw0 qw0Var, int i10) {
        this.a = i10;
        this.b = qw0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qw0 qw0Var = this.b;
                qw0Var.getClass();
                qw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qw0Var.invalidate();
                break;
            case 1:
                qw0 qw0Var2 = this.b;
                qw0Var2.getClass();
                qw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                qw0 qw0Var3 = this.b;
                qw0Var3.getClass();
                qw0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qw0Var3.invalidate();
                break;
        }
    }
}
