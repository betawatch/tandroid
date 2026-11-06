package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr0 b;

    public /* synthetic */ gr0(pr0 pr0Var, int i7) {
        this.a = i7;
        this.b = pr0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pr0 pr0Var = this.b;
                pr0Var.getClass();
                pr0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                pr0 pr0Var2 = this.b;
                pr0Var2.getClass();
                pr0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
