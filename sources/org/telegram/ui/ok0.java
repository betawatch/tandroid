package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ok0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jl0 c;

    public /* synthetic */ ok0(jl0 jl0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = jl0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                jl0 jl0Var = this.c;
                AnimatorSet animatorSet = jl0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jl0Var.M = null;
                    break;
                }
                break;
            default:
                jl0 jl0Var2 = this.c;
                AnimatorSet animatorSet2 = jl0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jl0Var2.M = null;
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
                AnimatorSet animatorSet = jl0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        jl0Var.N.setVisibility(4);
                        break;
                    } else {
                        jl0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                jl0 jl0Var2 = this.c;
                AnimatorSet animatorSet2 = jl0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        jl0Var2.P.setVisibility(4);
                        break;
                    } else {
                        jl0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
