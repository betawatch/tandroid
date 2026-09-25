package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci.j9 b;

    public /* synthetic */ yd0(ci.j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ci.j9 j9Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) j9Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    j9Var.e = null;
                    break;
                }
                break;
            case 1:
                ci.j9 j9Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) j9Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j9Var2.e = null;
                    break;
                }
                break;
            default:
                ci.j9 j9Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) j9Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    j9Var3.e = null;
                    break;
                }
                break;
        }
    }
}
