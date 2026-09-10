package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ t2(u2 u2Var, int i10) {
        this.a = i10;
        this.b = u2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u2 u2Var = this.b;
                u2Var.getClass();
                u2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.a(u2Var.R, u2Var.S);
                break;
            default:
                u2 u2Var2 = this.b;
                u2Var2.getClass();
                u2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                break;
        }
    }
}
