package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class io0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ro0 c;

    public /* synthetic */ io0(ro0 ro0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = ro0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ro0 ro0Var = this.c;
                AnimatorSet animatorSet = ro0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ro0Var.v = null;
                    break;
                }
                break;
            default:
                ro0 ro0Var2 = this.c;
                AnimatorSet animatorSet2 = ro0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ro0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ro0 ro0Var = this.c;
                AnimatorSet animatorSet = ro0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        ro0Var.r.setVisibility(4);
                        break;
                    } else {
                        ro0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ro0 ro0Var2 = this.c;
                AnimatorSet animatorSet2 = ro0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        ro0Var2.s.setVisibility(4);
                        break;
                    } else {
                        ro0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
