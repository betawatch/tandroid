package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hi.s8 b;

    public /* synthetic */ jc0(hi.s8 s8Var, int i7) {
        this.a = i7;
        this.b = s8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hi.s8 s8Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) s8Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    s8Var.e = null;
                    break;
                }
                break;
            case 1:
                hi.s8 s8Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) s8Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s8Var2.e = null;
                    break;
                }
                break;
            default:
                hi.s8 s8Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) s8Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    s8Var3.e = null;
                    break;
                }
                break;
        }
    }
}
