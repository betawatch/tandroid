package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fk0 c;

    public /* synthetic */ lj0(fk0 fk0Var, boolean z10, int i7) {
        this.a = i7;
        this.c = fk0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                fk0 fk0Var = this.c;
                AnimatorSet animatorSet = fk0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fk0Var.N = null;
                    break;
                }
                break;
            default:
                fk0 fk0Var2 = this.c;
                AnimatorSet animatorSet2 = fk0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fk0Var2.N = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fk0 fk0Var = this.c;
                AnimatorSet animatorSet = fk0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        fk0Var.O.setVisibility(4);
                        break;
                    } else {
                        fk0Var.M.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                fk0 fk0Var2 = this.c;
                AnimatorSet animatorSet2 = fk0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        fk0Var2.Q.setVisibility(4);
                        break;
                    } else {
                        fk0Var2.P.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
