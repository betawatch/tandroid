package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jh0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh0 b;

    public /* synthetic */ jh0(kh0 kh0Var, int i10) {
        this.a = i10;
        this.b = kh0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                kh0 kh0Var = this.b;
                AnimatorSet animatorSet = kh0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kh0Var.s = null;
                    kh0Var.getClass();
                    break;
                }
                break;
            case 2:
                kh0 kh0Var2 = this.b;
                AnimatorSet animatorSet2 = kh0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kh0Var2.s = null;
                    kh0Var2.getClass();
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
        kh0 kh0Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = kh0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kh0Var.h = null;
                }
                org.telegram.messenger.at.e().k(99, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = kh0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kh0Var.s = null;
                    if (kh0Var.x) {
                        kh0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.at.e().k(99, 512);
                break;
            default:
                AnimatorSet animatorSet3 = kh0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kh0Var.s = null;
                    org.telegram.messenger.i0.g3(new eb0(this, 14));
                }
                org.telegram.messenger.at.e().k(99, 512);
                break;
        }
    }
}
