package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dk0 c;

    public /* synthetic */ jj0(dk0 dk0Var, boolean z9, int i7) {
        this.a = i7;
        this.c = dk0Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                dk0 dk0Var = this.c;
                AnimatorSet animatorSet = dk0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dk0Var.M = null;
                    break;
                }
                break;
            default:
                dk0 dk0Var2 = this.c;
                AnimatorSet animatorSet2 = dk0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dk0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                dk0 dk0Var = this.c;
                AnimatorSet animatorSet = dk0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        dk0Var.N.setVisibility(4);
                        break;
                    } else {
                        dk0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                dk0 dk0Var2 = this.c;
                AnimatorSet animatorSet2 = dk0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        dk0Var2.P.setVisibility(4);
                        break;
                    } else {
                        dk0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
