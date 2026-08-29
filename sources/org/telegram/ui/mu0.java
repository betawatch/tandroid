package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu0 b;

    public /* synthetic */ mu0(vu0 vu0Var, int i10) {
        this.a = i10;
        this.b = vu0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vu0 vu0Var = this.b;
                vu0Var.getClass();
                vu0Var.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                vu0 vu0Var2 = this.b;
                vu0Var2.getClass();
                vu0Var2.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
