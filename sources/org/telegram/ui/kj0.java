package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ek0 c;

    public /* synthetic */ kj0(ek0 ek0Var, boolean z10, int i7) {
        this.a = i7;
        this.c = ek0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ek0 ek0Var = this.c;
                AnimatorSet animatorSet = ek0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ek0Var.N = null;
                    break;
                }
                break;
            default:
                ek0 ek0Var2 = this.c;
                AnimatorSet animatorSet2 = ek0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ek0Var2.N = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ek0 ek0Var = this.c;
                AnimatorSet animatorSet = ek0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        ek0Var.O.setVisibility(4);
                        break;
                    } else {
                        ek0Var.M.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ek0 ek0Var2 = this.c;
                AnimatorSet animatorSet2 = ek0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        ek0Var2.Q.setVisibility(4);
                        break;
                    } else {
                        ek0Var2.P.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
