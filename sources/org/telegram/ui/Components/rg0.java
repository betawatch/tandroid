package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ rg0(ug0 ug0Var, int i10) {
        this.a = i10;
        this.b = ug0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ug0 ug0Var = this.b;
                ug0Var.getClass();
                ug0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var.c(true);
                break;
            default:
                ug0 ug0Var2 = this.b;
                ug0Var2.getClass();
                ug0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var2.c(true);
                break;
        }
    }
}
