package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eh0 b;

    public /* synthetic */ bh0(eh0 eh0Var, int i10) {
        this.a = i10;
        this.b = eh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                eh0 eh0Var = this.b;
                eh0Var.getClass();
                eh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh0Var.c(true);
                break;
            default:
                eh0 eh0Var2 = this.b;
                eh0Var2.getClass();
                eh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh0Var2.c(true);
                break;
        }
    }
}
