package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uu0 b;

    public /* synthetic */ ru0(uu0 uu0Var, int i7) {
        this.a = i7;
        this.b = uu0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uu0 uu0Var = this.b;
                uu0Var.getClass();
                uu0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uu0Var.invalidate();
                break;
            case 1:
                uu0 uu0Var2 = this.b;
                uu0Var2.getClass();
                uu0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                uu0 uu0Var3 = this.b;
                uu0Var3.getClass();
                uu0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uu0Var3.invalidate();
                break;
        }
    }
}
