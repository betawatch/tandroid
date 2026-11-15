package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kl0 c;

    public /* synthetic */ dl0(kl0 kl0Var, boolean z10, int i7) {
        this.a = i7;
        this.c = kl0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                kl0 kl0Var = this.c;
                AnimatorSet animatorSet = kl0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kl0Var.w = null;
                    break;
                }
                break;
            default:
                kl0 kl0Var2 = this.c;
                AnimatorSet animatorSet2 = kl0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kl0Var2.w = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kl0 kl0Var = this.c;
                AnimatorSet animatorSet = kl0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        kl0Var.r.setVisibility(4);
                        break;
                    } else {
                        kl0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                kl0 kl0Var2 = this.c;
                AnimatorSet animatorSet2 = kl0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        kl0Var2.s.setVisibility(4);
                        break;
                    } else {
                        kl0Var2.V.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
