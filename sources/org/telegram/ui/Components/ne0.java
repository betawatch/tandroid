package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ne0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ di.i9 b;

    public /* synthetic */ ne0(di.i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                di.i9 i9Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) i9Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    i9Var.e = null;
                    break;
                }
                break;
            case 1:
                di.i9 i9Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) i9Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    i9Var2.e = null;
                    break;
                }
                break;
            default:
                di.i9 i9Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) i9Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    i9Var3.e = null;
                    break;
                }
                break;
        }
    }
}
