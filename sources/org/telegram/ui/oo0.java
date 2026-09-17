package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class oo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xo0 c;

    public /* synthetic */ oo0(xo0 xo0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = xo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                xo0 xo0Var = this.c;
                AnimatorSet animatorSet = xo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xo0Var.v = null;
                    break;
                }
                break;
            default:
                xo0 xo0Var2 = this.c;
                AnimatorSet animatorSet2 = xo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    xo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                xo0 xo0Var = this.c;
                AnimatorSet animatorSet = xo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        xo0Var.r.setVisibility(4);
                        break;
                    } else {
                        xo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                xo0 xo0Var2 = this.c;
                AnimatorSet animatorSet2 = xo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        xo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        xo0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
