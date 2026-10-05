package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class om0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kn0 c;

    public /* synthetic */ om0(kn0 kn0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = kn0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = this.c;
                AnimatorSet animatorSet = kn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kn0Var.M = null;
                    break;
                }
                break;
            default:
                kn0 kn0Var2 = this.c;
                AnimatorSet animatorSet2 = kn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kn0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = this.c;
                AnimatorSet animatorSet = kn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        kn0Var.N.setVisibility(4);
                        break;
                    } else {
                        kn0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                kn0 kn0Var2 = this.c;
                AnimatorSet animatorSet2 = kn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        kn0Var2.P.setVisibility(4);
                        break;
                    } else {
                        kn0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
