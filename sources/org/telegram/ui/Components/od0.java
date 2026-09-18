package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class od0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci.m9 b;

    public /* synthetic */ od0(ci.m9 m9Var, int i10) {
        this.a = i10;
        this.b = m9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ci.m9 m9Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) m9Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m9Var.e = null;
                    break;
                }
                break;
            case 1:
                ci.m9 m9Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) m9Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    m9Var2.e = null;
                    break;
                }
                break;
            default:
                ci.m9 m9Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) m9Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m9Var3.e = null;
                    break;
                }
                break;
        }
    }
}
