package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw0 b;

    public /* synthetic */ qw0(tw0 tw0Var, int i10) {
        this.a = i10;
        this.b = tw0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                tw0 tw0Var = this.b;
                tw0Var.getClass();
                tw0Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tw0Var.invalidate();
                break;
            case 1:
                tw0 tw0Var2 = this.b;
                tw0Var2.getClass();
                tw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                tw0 tw0Var3 = this.b;
                tw0Var3.getClass();
                tw0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tw0Var3.invalidate();
                break;
        }
    }
}
