package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fn0 c;

    public /* synthetic */ jm0(fn0 fn0Var, boolean z4, int i10) {
        this.a = i10;
        this.c = fn0Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                fn0 fn0Var = this.c;
                AnimatorSet animatorSet = fn0Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fn0Var.J = null;
                    break;
                }
                break;
            default:
                fn0 fn0Var2 = this.c;
                AnimatorSet animatorSet2 = fn0Var2.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fn0Var2.J = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fn0 fn0Var = this.c;
                AnimatorSet animatorSet = fn0Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        fn0Var.K.setVisibility(4);
                        break;
                    } else {
                        fn0Var.I.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                fn0 fn0Var2 = this.c;
                AnimatorSet animatorSet2 = fn0Var2.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        fn0Var2.M.setVisibility(4);
                        break;
                    } else {
                        fn0Var2.L.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
