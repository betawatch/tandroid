package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class hj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bk0 c;

    public /* synthetic */ hj0(bk0 bk0Var, boolean z9, int i7) {
        this.a = i7;
        this.c = bk0Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                bk0 bk0Var = this.c;
                AnimatorSet animatorSet = bk0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bk0Var.M = null;
                    break;
                }
                break;
            default:
                bk0 bk0Var2 = this.c;
                AnimatorSet animatorSet2 = bk0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bk0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bk0 bk0Var = this.c;
                AnimatorSet animatorSet = bk0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        bk0Var.N.setVisibility(4);
                        break;
                    } else {
                        bk0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                bk0 bk0Var2 = this.c;
                AnimatorSet animatorSet2 = bk0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        bk0Var2.P.setVisibility(4);
                        break;
                    } else {
                        bk0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
