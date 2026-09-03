package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ ag0(cg0 cg0Var, int i10) {
        this.a = i10;
        this.b = cg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                cg0 cg0Var = this.b;
                cg0Var.getClass();
                cg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var.invalidate();
                break;
            default:
                cg0 cg0Var2 = this.b;
                cg0Var2.getClass();
                cg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var2.invalidate();
                break;
        }
    }
}
