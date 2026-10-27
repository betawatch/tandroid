package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ry0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dz0 c;

    public ry0(dz0 dz0Var, int i10, boolean z10) {
        this.c = dz0Var;
        this.a = i10;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.c.I;
        int i10 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        animatorSetArr[i10] = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dz0 dz0Var = this.c;
        AnimatorSet[] animatorSetArr = dz0Var.I;
        int i10 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.b) {
            dz0Var.J[i10].setVisibility(4);
        }
        animatorSetArr[i10] = null;
    }
}
