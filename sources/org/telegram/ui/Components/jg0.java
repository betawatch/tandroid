package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg0 b;

    public /* synthetic */ jg0(kg0 kg0Var, int i7) {
        this.a = i7;
        this.b = kg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                kg0 kg0Var = this.b;
                AnimatorSet animatorSet = kg0Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kg0Var.s = null;
                    kg0Var.getClass();
                    break;
                }
                break;
            case 2:
                kg0 kg0Var2 = this.b;
                AnimatorSet animatorSet2 = kg0Var2.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kg0Var2.s = null;
                    kg0Var2.getClass();
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
        kg0 kg0Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = kg0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kg0Var.h = null;
                }
                org.telegram.messenger.ns.e().k(99, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = kg0Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kg0Var.s = null;
                    if (kg0Var.x) {
                        kg0Var.setLayerType(0, null);
                    }
                }
                org.telegram.messenger.ns.e().k(99, 512);
                break;
            default:
                AnimatorSet animatorSet3 = kg0Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kg0Var.s = null;
                    org.telegram.messenger.g0.h3(new wa0(this, 11));
                }
                org.telegram.messenger.ns.e().k(99, 512);
                break;
        }
    }
}
