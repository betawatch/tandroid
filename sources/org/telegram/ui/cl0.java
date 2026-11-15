package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class cl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jl0 c;

    public /* synthetic */ cl0(jl0 jl0Var, boolean z10, int i7) {
        this.a = i7;
        this.c = jl0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                jl0 jl0Var = this.c;
                AnimatorSet animatorSet = jl0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jl0Var.w = null;
                    break;
                }
                break;
            default:
                jl0 jl0Var2 = this.c;
                AnimatorSet animatorSet2 = jl0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jl0Var2.w = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jl0 jl0Var = this.c;
                AnimatorSet animatorSet = jl0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        jl0Var.r.setVisibility(4);
                        break;
                    } else {
                        jl0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                jl0 jl0Var2 = this.c;
                AnimatorSet animatorSet2 = jl0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        jl0Var2.s.setVisibility(4);
                        break;
                    } else {
                        jl0Var2.V.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
