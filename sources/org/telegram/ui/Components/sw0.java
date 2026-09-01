package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw0 b;

    public /* synthetic */ sw0(tw0 tw0Var, int i10) {
        this.a = i10;
        this.b = tw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                tw0 tw0Var = this.b;
                tw0Var.y = 1.0f;
                tw0Var.invalidate();
                tw0Var.D = null;
                break;
            case 1:
                tw0 tw0Var2 = this.b;
                tw0Var2.m(((Float) tw0Var2.v.getAnimatedValue()).floatValue());
                tw0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.C = null;
                break;
        }
    }
}
