package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ uc0 b;

    public /* synthetic */ tc0(uc0 uc0Var, int i10) {
        this.a = i10;
        this.b = uc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                uc0 uc0Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) uc0Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    uc0Var.e = null;
                    break;
                }
                break;
            case 1:
                uc0 uc0Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) uc0Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    uc0Var2.e = null;
                    break;
                }
                break;
            default:
                uc0 uc0Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) uc0Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    uc0Var3.e = null;
                    break;
                }
                break;
        }
    }
}
