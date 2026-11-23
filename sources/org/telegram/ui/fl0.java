package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ml0 c;

    public /* synthetic */ fl0(ml0 ml0Var, boolean z10, int i7) {
        this.a = i7;
        this.c = ml0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ml0 ml0Var = this.c;
                AnimatorSet animatorSet = ml0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ml0Var.w = null;
                    break;
                }
                break;
            default:
                ml0 ml0Var2 = this.c;
                AnimatorSet animatorSet2 = ml0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ml0Var2.w = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ml0 ml0Var = this.c;
                AnimatorSet animatorSet = ml0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        ml0Var.r.setVisibility(4);
                        break;
                    } else {
                        ml0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ml0 ml0Var2 = this.c;
                AnimatorSet animatorSet2 = ml0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        ml0Var2.s.setVisibility(4);
                        break;
                    } else {
                        ml0Var2.V.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
