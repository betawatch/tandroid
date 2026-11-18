package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iw0 c;

    public wv0(iw0 iw0Var, int i7, boolean z10) {
        this.c = iw0Var;
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
        iw0 iw0Var = this.c;
        AnimatorSet[] animatorSetArr = iw0Var.D1;
        int i7 = this.a;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet == null || !animatorSet.equals(animator)) {
            return;
        }
        if (!this.b) {
            iw0Var.E1[i7].setVisibility(4);
        }
        animatorSetArr[i7] = null;
    }
}
