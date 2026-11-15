package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ac0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.y7 b;

    public /* synthetic */ ac0(hi.y7 y7Var, int i7) {
        this.a = i7;
        this.b = y7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hi.y7 y7Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) y7Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    y7Var.e = null;
                    break;
                }
                break;
            case 1:
                hi.y7 y7Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) y7Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    y7Var2.e = null;
                    break;
                }
                break;
            default:
                hi.y7 y7Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) y7Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    y7Var3.e = null;
                    break;
                }
                break;
        }
    }
}
