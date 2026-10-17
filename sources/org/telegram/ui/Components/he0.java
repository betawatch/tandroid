package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class he0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei.x8 b;

    public /* synthetic */ he0(ei.x8 x8Var, int i10) {
        this.a = i10;
        this.b = x8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ei.x8 x8Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) x8Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x8Var.e = null;
                    break;
                }
                break;
            case 1:
                ei.x8 x8Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) x8Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x8Var2.e = null;
                    break;
                }
                break;
            default:
                ei.x8 x8Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) x8Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x8Var3.e = null;
                    break;
                }
                break;
        }
    }
}
