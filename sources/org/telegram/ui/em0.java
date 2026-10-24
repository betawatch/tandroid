package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class em0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ an0 c;

    public /* synthetic */ em0(an0 an0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = an0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                an0 an0Var = this.c;
                AnimatorSet animatorSet = an0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    an0Var.M = null;
                    break;
                }
                break;
            default:
                an0 an0Var2 = this.c;
                AnimatorSet animatorSet2 = an0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    an0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                an0 an0Var = this.c;
                AnimatorSet animatorSet = an0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        an0Var.N.setVisibility(4);
                        break;
                    } else {
                        an0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                an0 an0Var2 = this.c;
                AnimatorSet animatorSet2 = an0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        an0Var2.P.setVisibility(4);
                        break;
                    } else {
                        an0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
