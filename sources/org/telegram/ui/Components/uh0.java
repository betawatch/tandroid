package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh0 b;

    public /* synthetic */ uh0(xh0 xh0Var, int i10) {
        this.a = i10;
        this.b = xh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xh0 xh0Var = this.b;
                xh0Var.getClass();
                xh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh0Var.c(true);
                break;
            default:
                xh0 xh0Var2 = this.b;
                xh0Var2.getClass();
                xh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh0Var2.c(true);
                break;
        }
    }
}
