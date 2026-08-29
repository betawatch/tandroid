package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh.l8 b;

    public /* synthetic */ jd0(nh.l8 l8Var, int i10) {
        this.a = i10;
        this.b = l8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                nh.l8 l8Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) l8Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l8Var.e = null;
                    break;
                }
                break;
            case 1:
                nh.l8 l8Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) l8Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    l8Var2.e = null;
                    break;
                }
                break;
            default:
                nh.l8 l8Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) l8Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    l8Var3.e = null;
                    break;
                }
                break;
        }
    }
}
