package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cx0 c;

    public qw0(cx0 cx0Var, int i10, boolean z10) {
        this.c = cx0Var;
        this.a = i10;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.c.z1;
        int i10 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        animatorSetArr[i10] = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cx0 cx0Var = this.c;
        AnimatorSet[] animatorSetArr = cx0Var.z1;
        int i10 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.b) {
            cx0Var.A1[i10].setVisibility(4);
        }
        animatorSetArr[i10] = null;
    }
}
