package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ub0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi.z7 b;

    public /* synthetic */ ub0(gi.z7 z7Var, int i3) {
        this.a = i3;
        this.b = z7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gi.z7 z7Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) z7Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    z7Var.e = null;
                    break;
                }
                break;
            case 1:
                gi.z7 z7Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) z7Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z7Var2.e = null;
                    break;
                }
                break;
            default:
                gi.z7 z7Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) z7Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    z7Var3.e = null;
                    break;
                }
                break;
        }
    }
}
