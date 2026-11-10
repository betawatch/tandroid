package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ m2(n2 n2Var, int i7) {
        this.a = i7;
        this.b = n2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n2 n2Var = this.b;
                n2Var.getClass();
                n2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.a(n2Var.R, n2Var.S);
                break;
            default:
                n2 n2Var2 = this.b;
                n2Var2.getClass();
                n2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var2.invalidate();
                break;
        }
    }
}
