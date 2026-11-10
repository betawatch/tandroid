package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ek0 c;

    public /* synthetic */ kj0(ek0 ek0Var, boolean z9, int i7) {
        this.a = i7;
        this.c = ek0Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ek0 ek0Var = this.c;
                AnimatorSet animatorSet = ek0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ek0Var.M = null;
                    break;
                }
                break;
            default:
                ek0 ek0Var2 = this.c;
                AnimatorSet animatorSet2 = ek0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ek0Var2.M = null;
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
                AnimatorSet animatorSet = ek0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        ek0Var.N.setVisibility(4);
                        break;
                    } else {
                        ek0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ek0 ek0Var2 = this.c;
                AnimatorSet animatorSet2 = ek0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        ek0Var2.P.setVisibility(4);
                        break;
                    } else {
                        ek0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
