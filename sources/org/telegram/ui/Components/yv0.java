package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kw0 c;

    public yv0(kw0 kw0Var, int i7, boolean z10) {
        this.c = kw0Var;
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
        kw0 kw0Var = this.c;
        AnimatorSet[] animatorSetArr = kw0Var.D1;
        int i7 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.b) {
            kw0Var.E1[i7].setVisibility(4);
        }
        animatorSetArr[i7] = null;
    }
}
