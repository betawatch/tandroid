package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ug0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ ug0(vg0 vg0Var, int i7) {
        this.a = i7;
        this.b = vg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                vg0 vg0Var = this.b;
                AnimatorSet animatorSet = vg0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vg0Var.s = null;
                    vg0Var.getClass();
                    break;
                }
                break;
            case 2:
                vg0 vg0Var2 = this.b;
                AnimatorSet animatorSet2 = vg0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vg0Var2.s = null;
                    vg0Var2.getClass();
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
        int i7 = this.a;
        vg0 vg0Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = vg0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vg0Var.h = null;
                }
                org.telegram.messenger.ks.e().k(99, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = vg0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vg0Var.s = null;
                    if (vg0Var.x) {
                        vg0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.ks.e().k(99, 512);
                break;
            default:
                AnimatorSet animatorSet3 = vg0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    vg0Var.s = null;
                    org.telegram.messenger.g0.g3(new eb0(this, 11));
                }
                org.telegram.messenger.ks.e().k(99, 512);
                break;
        }
    }
}
