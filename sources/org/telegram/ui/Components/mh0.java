package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph0 b;

    public /* synthetic */ mh0(ph0 ph0Var, int i10) {
        this.a = i10;
        this.b = ph0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ph0 ph0Var = this.b;
                ph0Var.getClass();
                ph0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph0Var.c(true);
                break;
            default:
                ph0 ph0Var2 = this.b;
                ph0Var2.getClass();
                ph0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph0Var2.c(true);
                break;
        }
    }
}
