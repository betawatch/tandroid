package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xv0 c;

    public lv0(xv0 xv0Var, int i3, boolean z10) {
        this.c = xv0Var;
        this.a = i3;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.c.A1;
        int i3 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i3];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        animatorSetArr[i3] = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xv0 xv0Var = this.c;
        AnimatorSet[] animatorSetArr = xv0Var.A1;
        int i3 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i3];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.b) {
            xv0Var.B1[i3].setVisibility(4);
        }
        animatorSetArr[i3] = null;
    }
}
