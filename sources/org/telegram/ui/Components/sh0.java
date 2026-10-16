package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vh0 b;

    public /* synthetic */ sh0(vh0 vh0Var, int i10) {
        this.a = i10;
        this.b = vh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vh0 vh0Var = this.b;
                vh0Var.getClass();
                vh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh0Var.c(true);
                break;
            default:
                vh0 vh0Var2 = this.b;
                vh0Var2.getClass();
                vh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh0Var2.c(true);
                break;
        }
    }
}
