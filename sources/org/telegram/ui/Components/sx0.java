package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tx0 b;

    public /* synthetic */ sx0(tx0 tx0Var, int i10) {
        this.a = i10;
        this.b = tx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                tx0 tx0Var = this.b;
                tx0Var.y = 1.0f;
                tx0Var.invalidate();
                tx0Var.G = null;
                break;
            case 1:
                tx0 tx0Var2 = this.b;
                tx0Var2.m(((Float) tx0Var2.v.getAnimatedValue()).floatValue());
                tx0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
