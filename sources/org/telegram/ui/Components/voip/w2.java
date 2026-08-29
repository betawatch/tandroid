package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ w2(x2 x2Var, int i10) {
        this.a = i10;
        this.b = x2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                x2Var.getClass();
                x2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.a(x2Var.N, x2Var.O);
                break;
            default:
                x2 x2Var2 = this.b;
                x2Var2.getClass();
                x2Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.invalidate();
                break;
        }
    }
}
