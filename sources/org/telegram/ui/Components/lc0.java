package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class lc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.x7 b;

    public /* synthetic */ lc0(hi.x7 x7Var, int i7) {
        this.a = i7;
        this.b = x7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hi.x7 x7Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) x7Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x7Var.e = null;
                    break;
                }
                break;
            case 1:
                hi.x7 x7Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) x7Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x7Var2.e = null;
                    break;
                }
                break;
            default:
                hi.x7 x7Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) x7Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x7Var3.e = null;
                    break;
                }
                break;
        }
    }
}
