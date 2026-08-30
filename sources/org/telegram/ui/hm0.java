package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dn0 c;

    public /* synthetic */ hm0(dn0 dn0Var, boolean z4, int i10) {
        this.a = i10;
        this.c = dn0Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                dn0 dn0Var = this.c;
                AnimatorSet animatorSet = dn0Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dn0Var.J = null;
                    break;
                }
                break;
            default:
                dn0 dn0Var2 = this.c;
                AnimatorSet animatorSet2 = dn0Var2.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dn0Var2.J = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                dn0 dn0Var = this.c;
                AnimatorSet animatorSet = dn0Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        dn0Var.K.setVisibility(4);
                        break;
                    } else {
                        dn0Var.I.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                dn0 dn0Var2 = this.c;
                AnimatorSet animatorSet2 = dn0Var2.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        dn0Var2.M.setVisibility(4);
                        break;
                    } else {
                        dn0Var2.L.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
