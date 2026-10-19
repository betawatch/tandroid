package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class kx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ lx0 b;

    public /* synthetic */ kx0(lx0 lx0Var, int i10) {
        this.a = i10;
        this.b = lx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                lx0 lx0Var = this.b;
                lx0Var.y = 1.0f;
                lx0Var.invalidate();
                lx0Var.G = null;
                break;
            case 1:
                lx0 lx0Var2 = this.b;
                lx0Var2.m(((Float) lx0Var2.v.getAnimatedValue()).floatValue());
                lx0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
