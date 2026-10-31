package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class aa1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea1 b;

    public /* synthetic */ aa1(ea1 ea1Var, int i10) {
        this.a = i10;
        this.b = ea1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ea1 ea1Var = this.b;
                ea1Var.w = 0;
                ea1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.w = 0;
                break;
            default:
                this.b.F.setVisibility(8);
                break;
        }
    }
}
