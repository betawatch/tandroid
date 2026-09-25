package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ax0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx0 b;

    public /* synthetic */ ax0(bx0 bx0Var, int i10) {
        this.a = i10;
        this.b = bx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bx0 bx0Var = this.b;
                bx0Var.y = 1.0f;
                bx0Var.invalidate();
                bx0Var.G = null;
                break;
            case 1:
                bx0 bx0Var2 = this.b;
                bx0Var2.m(((Float) bx0Var2.v.getAnimatedValue()).floatValue());
                bx0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
