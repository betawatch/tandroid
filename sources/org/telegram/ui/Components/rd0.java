package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd0 b;

    public /* synthetic */ rd0(sd0 sd0Var, int i10) {
        this.a = i10;
        this.b = sd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sd0 sd0Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) sd0Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sd0Var.e = null;
                    break;
                }
                break;
            case 1:
                sd0 sd0Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) sd0Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sd0Var2.e = null;
                    break;
                }
                break;
            default:
                sd0 sd0Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) sd0Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    sd0Var3.e = null;
                    break;
                }
                break;
        }
    }
}
