package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ox0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ px0 b;

    public /* synthetic */ ox0(px0 px0Var, int i10) {
        this.a = i10;
        this.b = px0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                px0 px0Var = this.b;
                px0Var.y = 1.0f;
                px0Var.invalidate();
                px0Var.G = null;
                break;
            case 1:
                px0 px0Var2 = this.b;
                px0Var2.m(((Float) px0Var2.v.getAnimatedValue()).floatValue());
                px0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
