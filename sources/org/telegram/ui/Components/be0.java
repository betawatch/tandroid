package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ be0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                de0 de0Var = this.b;
                de0Var.getClass();
                de0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.invalidate();
                break;
            default:
                de0 de0Var2 = this.b;
                de0Var2.getClass();
                de0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var2.invalidate();
                break;
        }
    }
}
