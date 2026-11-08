package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class al0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hl0 c;

    public /* synthetic */ al0(hl0 hl0Var, boolean z9, int i7) {
        this.a = i7;
        this.c = hl0Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                hl0 hl0Var = this.c;
                AnimatorSet animatorSet = hl0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hl0Var.w = null;
                    break;
                }
                break;
            default:
                hl0 hl0Var2 = this.c;
                AnimatorSet animatorSet2 = hl0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    hl0Var2.w = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hl0 hl0Var = this.c;
                AnimatorSet animatorSet = hl0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        hl0Var.r.setVisibility(4);
                        break;
                    } else {
                        hl0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                hl0 hl0Var2 = this.c;
                AnimatorSet animatorSet2 = hl0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        hl0Var2.s.setVisibility(4);
                        break;
                    } else {
                        hl0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
