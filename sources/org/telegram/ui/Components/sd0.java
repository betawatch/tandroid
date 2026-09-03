package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ td0 b;

    public /* synthetic */ sd0(td0 td0Var, int i10) {
        this.a = i10;
        this.b = td0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                td0 td0Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) td0Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    td0Var.e = null;
                    break;
                }
                break;
            case 1:
                td0 td0Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) td0Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    td0Var2.e = null;
                    break;
                }
                break;
            default:
                td0 td0Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) td0Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    td0Var3.e = null;
                    break;
                }
                break;
        }
    }
}
