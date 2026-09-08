package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ p3(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                x3Var.getClass();
                x3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.invalidate();
                break;
            case 1:
                x3 x3Var2 = this.b;
                x3Var2.getClass();
                x3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var2.invalidate();
                break;
            default:
                x3 x3Var3 = this.b;
                x3Var3.getClass();
                x3Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
