package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class gg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ gg0(hg0 hg0Var, int i7) {
        this.a = i7;
        this.b = hg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                hg0 hg0Var = this.b;
                AnimatorSet animatorSet = hg0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hg0Var.s = null;
                    hg0Var.getClass();
                    break;
                }
                break;
            case 2:
                hg0 hg0Var2 = this.b;
                AnimatorSet animatorSet2 = hg0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    hg0Var2.s = null;
                    hg0Var2.getClass();
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
        hg0 hg0Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = hg0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hg0Var.h = null;
                }
                org.telegram.messenger.qs.e().k(99, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = hg0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    hg0Var.s = null;
                    if (hg0Var.x) {
                        hg0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.qs.e().k(99, 512);
                break;
            default:
                AnimatorSet animatorSet3 = hg0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    hg0Var.s = null;
                    org.telegram.messenger.g0.h3(new ob0(this, 9));
                }
                org.telegram.messenger.qs.e().k(99, 512);
                break;
        }
    }
}
