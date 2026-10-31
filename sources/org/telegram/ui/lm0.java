package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sm0 c;

    public /* synthetic */ lm0(sm0 sm0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = sm0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                sm0 sm0Var = this.c;
                AnimatorSet animatorSet = sm0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sm0Var.w = null;
                    break;
                }
                break;
            default:
                sm0 sm0Var2 = this.c;
                AnimatorSet animatorSet2 = sm0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sm0Var2.w = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sm0 sm0Var = this.c;
                AnimatorSet animatorSet = sm0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        sm0Var.r.setVisibility(4);
                        break;
                    } else {
                        sm0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                sm0 sm0Var2 = this.c;
                AnimatorSet animatorSet2 = sm0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        sm0Var2.s.setVisibility(4);
                        break;
                    } else {
                        sm0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
