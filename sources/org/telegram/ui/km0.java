package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class km0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gn0 c;

    public /* synthetic */ km0(gn0 gn0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = gn0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                gn0 gn0Var = this.c;
                AnimatorSet animatorSet = gn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    gn0Var.M = null;
                    break;
                }
                break;
            default:
                gn0 gn0Var2 = this.c;
                AnimatorSet animatorSet2 = gn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    gn0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gn0 gn0Var = this.c;
                AnimatorSet animatorSet = gn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        gn0Var.N.setVisibility(4);
                        break;
                    } else {
                        gn0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                gn0 gn0Var2 = this.c;
                AnimatorSet animatorSet2 = gn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        gn0Var2.P.setVisibility(4);
                        break;
                    } else {
                        gn0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
