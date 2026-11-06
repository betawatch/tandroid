package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class mv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yv0 c;

    public mv0(yv0 yv0Var, int i7, boolean z9) {
        this.c = yv0Var;
        this.a = i7;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet[] animatorSetArr = this.c.z1;
        int i7 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        animatorSetArr[i7] = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yv0 yv0Var = this.c;
        AnimatorSet[] animatorSetArr = yv0Var.z1;
        int i7 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.b) {
            yv0Var.A1[i7].setVisibility(4);
        }
        animatorSetArr[i7] = null;
    }
}
