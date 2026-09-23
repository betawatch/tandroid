package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class mm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ in0 c;

    public /* synthetic */ mm0(in0 in0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = in0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                in0 in0Var = this.c;
                AnimatorSet animatorSet = in0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    in0Var.M = null;
                    break;
                }
                break;
            default:
                in0 in0Var2 = this.c;
                AnimatorSet animatorSet2 = in0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    in0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                in0 in0Var = this.c;
                AnimatorSet animatorSet = in0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        in0Var.N.setVisibility(4);
                        break;
                    } else {
                        in0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                in0 in0Var2 = this.c;
                AnimatorSet animatorSet2 = in0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        in0Var2.P.setVisibility(4);
                        break;
                    } else {
                        in0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
