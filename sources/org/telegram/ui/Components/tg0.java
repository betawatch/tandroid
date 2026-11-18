package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ tg0(ug0 ug0Var, int i7) {
        this.a = i7;
        this.b = ug0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ug0 ug0Var = this.b;
                AnimatorSet animatorSet = ug0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ug0Var.s = null;
                    ug0Var.getClass();
                    break;
                }
                break;
            case 2:
                ug0 ug0Var2 = this.b;
                AnimatorSet animatorSet2 = ug0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ug0Var2.s = null;
                    ug0Var2.getClass();
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
        ug0 ug0Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = ug0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ug0Var.h = null;
                }
                org.telegram.messenger.ks.e().k(99, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = ug0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ug0Var.s = null;
                    if (ug0Var.x) {
                        ug0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.ks.e().k(99, 512);
                break;
            default:
                AnimatorSet animatorSet3 = ug0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ug0Var.s = null;
                    org.telegram.messenger.g0.g3(new gb0(this, 11));
                }
                org.telegram.messenger.ks.e().k(99, 512);
                break;
        }
    }
}
