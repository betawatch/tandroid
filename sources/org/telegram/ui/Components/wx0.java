package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx0 b;

    public /* synthetic */ wx0(xx0 xx0Var, int i10) {
        this.a = i10;
        this.b = xx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                xx0 xx0Var = this.b;
                xx0Var.y = 1.0f;
                xx0Var.invalidate();
                xx0Var.G = null;
                break;
            case 1:
                xx0 xx0Var2 = this.b;
                xx0Var2.m(((Float) xx0Var2.v.getAnimatedValue()).floatValue());
                xx0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
