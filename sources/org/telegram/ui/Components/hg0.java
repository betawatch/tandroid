package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;

    public /* synthetic */ hg0(ig0 ig0Var, int i7) {
        this.a = i7;
        this.b = ig0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ig0 ig0Var = this.b;
                AnimatorSet animatorSet = ig0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.s = null;
                    ig0Var.getClass();
                    break;
                }
                break;
            case 2:
                ig0 ig0Var2 = this.b;
                AnimatorSet animatorSet2 = ig0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ig0Var2.s = null;
                    ig0Var2.getClass();
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        ig0 ig0Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = ig0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.h = null;
                }
                org.telegram.messenger.qs.e().k(99, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = ig0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ig0Var.s = null;
                    if (ig0Var.x) {
                        ig0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.qs.e().k(99, 512);
                break;
            default:
                AnimatorSet animatorSet3 = ig0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ig0Var.s = null;
                    org.telegram.messenger.g0.h3(new pb0(this, 9));
                }
                org.telegram.messenger.qs.e().k(99, 512);
                break;
        }
    }
}
