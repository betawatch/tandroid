package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ov0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bw0 c;

    public ov0(bw0 bw0Var, int i7, boolean z10) {
        this.c = bw0Var;
        this.a = i7;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.c.D1;
        int i7 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        animatorSetArr[i7] = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bw0 bw0Var = this.c;
        AnimatorSet[] animatorSetArr = bw0Var.D1;
        int i7 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.b) {
            bw0Var.E1[i7].setVisibility(4);
        }
        animatorSetArr[i7] = null;
    }
}
