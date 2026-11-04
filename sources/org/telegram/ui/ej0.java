package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ej0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yj0 c;

    public /* synthetic */ ej0(yj0 yj0Var, boolean z10, int i3) {
        this.a = i3;
        this.c = yj0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                yj0 yj0Var = this.c;
                AnimatorSet animatorSet = yj0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    yj0Var.N = null;
                    break;
                }
                break;
            default:
                yj0 yj0Var2 = this.c;
                AnimatorSet animatorSet2 = yj0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    yj0Var2.N = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                yj0 yj0Var = this.c;
                AnimatorSet animatorSet = yj0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        yj0Var.O.setVisibility(4);
                        break;
                    } else {
                        yj0Var.M.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                yj0 yj0Var2 = this.c;
                AnimatorSet animatorSet2 = yj0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        yj0Var2.Q.setVisibility(4);
                        break;
                    } else {
                        yj0Var2.P.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
