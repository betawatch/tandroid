package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ho0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qo0 c;

    public /* synthetic */ ho0(qo0 qo0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = qo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                qo0 qo0Var = this.c;
                AnimatorSet animatorSet = qo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qo0Var.v = null;
                    break;
                }
                break;
            default:
                qo0 qo0Var2 = this.c;
                AnimatorSet animatorSet2 = qo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qo0 qo0Var = this.c;
                AnimatorSet animatorSet = qo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        qo0Var.r.setVisibility(4);
                        break;
                    } else {
                        qo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                qo0 qo0Var2 = this.c;
                AnimatorSet animatorSet2 = qo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        qo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        qo0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
