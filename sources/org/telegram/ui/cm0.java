package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class cm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xm0 c;

    public /* synthetic */ cm0(xm0 xm0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = xm0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                xm0 xm0Var = this.c;
                AnimatorSet animatorSet = xm0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xm0Var.M = null;
                    break;
                }
                break;
            default:
                xm0 xm0Var2 = this.c;
                AnimatorSet animatorSet2 = xm0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    xm0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                xm0 xm0Var = this.c;
                AnimatorSet animatorSet = xm0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        xm0Var.N.setVisibility(4);
                        break;
                    } else {
                        xm0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                xm0 xm0Var2 = this.c;
                AnimatorSet animatorSet2 = xm0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        xm0Var2.P.setVisibility(4);
                        break;
                    } else {
                        xm0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
