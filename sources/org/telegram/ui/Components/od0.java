package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class od0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ di.l9 b;

    public /* synthetic */ od0(di.l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                di.l9 l9Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) l9Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l9Var.e = null;
                    break;
                }
                break;
            case 1:
                di.l9 l9Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) l9Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    l9Var2.e = null;
                    break;
                }
                break;
            default:
                di.l9 l9Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) l9Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    l9Var3.e = null;
                    break;
                }
                break;
        }
    }
}
