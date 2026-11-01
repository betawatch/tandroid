package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qm0 c;

    public /* synthetic */ jm0(qm0 qm0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = qm0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                qm0 qm0Var = this.c;
                AnimatorSet animatorSet = qm0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qm0Var.w = null;
                    break;
                }
                break;
            default:
                qm0 qm0Var2 = this.c;
                AnimatorSet animatorSet2 = qm0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qm0Var2.w = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qm0 qm0Var = this.c;
                AnimatorSet animatorSet = qm0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        qm0Var.r.setVisibility(4);
                        break;
                    } else {
                        qm0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                qm0 qm0Var2 = this.c;
                AnimatorSet animatorSet2 = qm0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        qm0Var2.s.setVisibility(4);
                        break;
                    } else {
                        qm0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
