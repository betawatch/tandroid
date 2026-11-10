package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kl0 c;

    public /* synthetic */ dl0(kl0 kl0Var, boolean z9, int i7) {
        this.a = i7;
        this.c = kl0Var;
        this.b = z9;
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
                        kl0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
