package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class jo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ so0 c;

    public /* synthetic */ jo0(so0 so0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = so0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                so0 so0Var = this.c;
                AnimatorSet animatorSet = so0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    so0Var.v = null;
                    break;
                }
                break;
            default:
                so0 so0Var2 = this.c;
                AnimatorSet animatorSet2 = so0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    so0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                so0 so0Var = this.c;
                AnimatorSet animatorSet = so0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        so0Var.r.setVisibility(4);
                        break;
                    } else {
                        so0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                so0 so0Var2 = this.c;
                AnimatorSet animatorSet2 = so0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        so0Var2.s.setVisibility(4);
                        break;
                    } else {
                        so0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
