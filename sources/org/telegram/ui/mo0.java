package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vo0 c;

    public /* synthetic */ mo0(vo0 vo0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = vo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                vo0 vo0Var = this.c;
                AnimatorSet animatorSet = vo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vo0Var.v = null;
                    break;
                }
                break;
            default:
                vo0 vo0Var2 = this.c;
                AnimatorSet animatorSet2 = vo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vo0 vo0Var = this.c;
                AnimatorSet animatorSet = vo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        vo0Var.r.setVisibility(4);
                        break;
                    } else {
                        vo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                vo0 vo0Var2 = this.c;
                AnimatorSet animatorSet2 = vo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        vo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        vo0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
