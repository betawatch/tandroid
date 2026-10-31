package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ih0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh0 b;

    public /* synthetic */ ih0(jh0 jh0Var, int i10) {
        this.a = i10;
        this.b = jh0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                jh0 jh0Var = this.b;
                AnimatorSet animatorSet = jh0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jh0Var.s = null;
                    jh0Var.getClass();
                    break;
                }
                break;
            case 2:
                jh0 jh0Var2 = this.b;
                AnimatorSet animatorSet2 = jh0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jh0Var2.s = null;
                    jh0Var2.getClass();
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        jh0 jh0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = jh0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jh0Var.h = null;
                }
                org.telegram.messenger.zs.e().k(99, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = jh0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jh0Var.s = null;
                    if (jh0Var.x) {
                        jh0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.zs.e().k(99, 512);
                break;
            default:
                AnimatorSet animatorSet3 = jh0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    jh0Var.s = null;
                    org.telegram.messenger.i0.g3(new eb0(this, 14));
                }
                org.telegram.messenger.zs.e().k(99, 512);
                break;
        }
    }
}
