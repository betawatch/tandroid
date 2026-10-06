package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class om0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kn0 c;

    public /* synthetic */ om0(kn0 kn0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = kn0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = this.c;
                AnimatorSet animatorSet = kn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kn0Var.M = null;
                    break;
                }
                break;
            default:
                kn0 kn0Var2 = this.c;
                AnimatorSet animatorSet2 = kn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kn0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = this.c;
                AnimatorSet animatorSet = kn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        kn0Var.N.setVisibility(4);
                        break;
                    } else {
                        kn0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                kn0 kn0Var2 = this.c;
                AnimatorSet animatorSet2 = kn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        kn0Var2.P.setVisibility(4);
                        break;
                    } else {
                        kn0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
