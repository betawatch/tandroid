package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class fo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ oo0 c;

    public /* synthetic */ fo0(oo0 oo0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = oo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                oo0 oo0Var = this.c;
                AnimatorSet animatorSet = oo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oo0Var.v = null;
                    break;
                }
                break;
            default:
                oo0 oo0Var2 = this.c;
                AnimatorSet animatorSet2 = oo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    oo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                oo0 oo0Var = this.c;
                AnimatorSet animatorSet = oo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        oo0Var.r.setVisibility(4);
                        break;
                    } else {
                        oo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                oo0 oo0Var2 = this.c;
                AnimatorSet animatorSet2 = oo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        oo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        oo0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
