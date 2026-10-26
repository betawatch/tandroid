package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cz0 c;

    public qy0(cz0 cz0Var, int i10, boolean z10) {
        this.c = cz0Var;
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
        cz0 cz0Var = this.c;
        AnimatorSet[] animatorSetArr = cz0Var.I;
        int i10 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.b) {
            cz0Var.J[i10].setVisibility(4);
        }
        animatorSetArr[i10] = null;
    }
}
