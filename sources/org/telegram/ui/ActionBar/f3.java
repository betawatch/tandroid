package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ f3(l3 l3Var, int i7) {
        this.a = i7;
        this.b = l3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l3 l3Var = this.b;
                l3Var.getClass();
                l3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l3Var.invalidate();
                break;
            case 1:
                l3 l3Var2 = this.b;
                l3Var2.getClass();
                l3Var2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                l3 l3Var3 = this.b;
                l3Var3.getClass();
                l3Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l3Var3.invalidate();
                break;
        }
    }
}
