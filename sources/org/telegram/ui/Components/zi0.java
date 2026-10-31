package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zi0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj0 b;

    public /* synthetic */ zi0(mj0 mj0Var, int i10) {
        this.a = i10;
        this.b = mj0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.L0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                mj0 mj0Var = this.b;
                mj0Var.Q = null;
                mj0Var.n0 = 0.0f;
                mj0Var.l0 = null;
                mj0Var.invalidate();
                break;
        }
    }
}
