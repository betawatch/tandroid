package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ab1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pb1 c;

    public /* synthetic */ ab1(pb1 pb1Var, boolean z10, int i10) {
        this.a = i10;
        this.c = pb1Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.b;
                float f7 = z10 ? 1.0f : 0.0f;
                pb1 pb1Var = this.c;
                pb1Var.V0(f7);
                if (!z10) {
                    Activity parentActivity = pb1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.k2) pb1Var).classGuid;
                    org.telegram.messenger.i0.k3(parentActivity, i10);
                    pb1Var.r0.setVisibility(8);
                    pb1Var.T0(true);
                    break;
                } else {
                    pb1Var.q0.setVisibility(8);
                    break;
                }
            default:
                if (!this.b) {
                    this.c.o0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
