package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    public /* synthetic */ xg0(ah0 ah0Var, int i10) {
        this.a = i10;
        this.b = ah0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ah0 ah0Var = this.b;
                ah0Var.getClass();
                ah0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var.c(true);
                break;
            default:
                ah0 ah0Var2 = this.b;
                ah0Var2.getClass();
                ah0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var2.c(true);
                break;
        }
    }
}
