package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class vg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;

    public /* synthetic */ vg0(wg0 wg0Var, int i7) {
        this.a = i7;
        this.b = wg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                wg0 wg0Var = this.b;
                AnimatorSet animatorSet = wg0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wg0Var.s = null;
                    wg0Var.getClass();
                    break;
                }
                break;
            case 2:
                wg0 wg0Var2 = this.b;
                AnimatorSet animatorSet2 = wg0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wg0Var2.s = null;
                    wg0Var2.getClass();
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
        wg0 wg0Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = wg0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wg0Var.h = null;
                }
                org.telegram.messenger.ls.e().k(99, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = wg0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wg0Var.s = null;
                    if (wg0Var.x) {
                        wg0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.ls.e().k(99, 512);
                break;
            default:
                AnimatorSet animatorSet3 = wg0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    wg0Var.s = null;
                    org.telegram.messenger.g0.g3(new hb0(this, 11));
                }
                org.telegram.messenger.ls.e().k(99, 512);
                break;
        }
    }
}
