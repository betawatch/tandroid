package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class co0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lo0 c;

    public /* synthetic */ co0(lo0 lo0Var, boolean z4, int i10) {
        this.a = i10;
        this.c = lo0Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                lo0 lo0Var = this.c;
                AnimatorSet animatorSet = lo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lo0Var.v = null;
                    break;
                }
                break;
            default:
                lo0 lo0Var2 = this.c;
                AnimatorSet animatorSet2 = lo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    lo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                lo0 lo0Var = this.c;
                AnimatorSet animatorSet = lo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        lo0Var.r.setVisibility(4);
                        break;
                    } else {
                        lo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                lo0 lo0Var2 = this.c;
                AnimatorSet animatorSet2 = lo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        lo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        lo0Var2.R.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
