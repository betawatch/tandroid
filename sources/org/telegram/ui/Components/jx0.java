package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class jx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kx0 b;

    public /* synthetic */ jx0(kx0 kx0Var, int i10) {
        this.a = i10;
        this.b = kx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kx0 kx0Var = this.b;
                kx0Var.y = 1.0f;
                kx0Var.invalidate();
                kx0Var.G = null;
                break;
            case 1:
                kx0 kx0Var2 = this.b;
                kx0Var2.m(((Float) kx0Var2.v.getAnimatedValue()).floatValue());
                kx0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
