package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class am0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vm0 c;

    public /* synthetic */ am0(vm0 vm0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = vm0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.c;
                AnimatorSet animatorSet = vm0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vm0Var.M = null;
                    break;
                }
                break;
            default:
                vm0 vm0Var2 = this.c;
                AnimatorSet animatorSet2 = vm0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vm0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.c;
                AnimatorSet animatorSet = vm0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        vm0Var.N.setVisibility(4);
                        break;
                    } else {
                        vm0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                vm0 vm0Var2 = this.c;
                AnimatorSet animatorSet2 = vm0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        vm0Var2.P.setVisibility(4);
                        break;
                    } else {
                        vm0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
