package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class po0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yo0 c;

    public /* synthetic */ po0(yo0 yo0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = yo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                yo0 yo0Var = this.c;
                AnimatorSet animatorSet = yo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    yo0Var.v = null;
                    break;
                }
                break;
            default:
                yo0 yo0Var2 = this.c;
                AnimatorSet animatorSet2 = yo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    yo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                yo0 yo0Var = this.c;
                AnimatorSet animatorSet = yo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        yo0Var.r.setVisibility(4);
                        break;
                    } else {
                        yo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                yo0 yo0Var2 = this.c;
                AnimatorSet animatorSet2 = yo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        yo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        yo0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
