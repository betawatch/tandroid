package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dx0 c;

    public rw0(dx0 dx0Var, int i10, boolean z10) {
        this.c = dx0Var;
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
        dx0 dx0Var = this.c;
        AnimatorSet[] animatorSetArr = dx0Var.z1;
        int i10 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.b) {
            dx0Var.A1[i10].setVisibility(4);
        }
        animatorSetArr[i10] = null;
    }
}
