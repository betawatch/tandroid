package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd0 b;

    public /* synthetic */ qd0(rd0 rd0Var, int i10) {
        this.a = i10;
        this.b = rd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rd0 rd0Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) rd0Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    rd0Var.e = null;
                    break;
                }
                break;
            case 1:
                rd0 rd0Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) rd0Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    rd0Var2.e = null;
                    break;
                }
                break;
            default:
                rd0 rd0Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) rd0Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    rd0Var3.e = null;
                    break;
                }
                break;
        }
    }
}
