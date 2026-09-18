package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class oe1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ se1 b;

    public /* synthetic */ oe1(se1 se1Var, int i10) {
        this.a = i10;
        this.b = se1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                se1 se1Var = this.b;
                se1Var.v = 0;
                se1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.F.setVisibility(8);
                break;
        }
    }
}
