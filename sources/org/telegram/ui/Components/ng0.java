package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ ng0(qg0 qg0Var, int i10) {
        this.a = i10;
        this.b = qg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qg0 qg0Var = this.b;
                qg0Var.getClass();
                qg0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var.c(true);
                break;
            default:
                qg0 qg0Var2 = this.b;
                qg0Var2.getClass();
                qg0Var2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var2.c(true);
                break;
        }
    }
}
