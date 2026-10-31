package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wv0 b;

    public /* synthetic */ vv0(wv0 wv0Var, int i10) {
        this.a = i10;
        this.b = wv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wv0 wv0Var = this.b;
                wv0Var.D = 1.0f;
                wv0Var.invalidate();
                wv0Var.G = null;
                break;
            case 1:
                wv0 wv0Var2 = this.b;
                wv0Var2.m(((Float) wv0Var2.w.getAnimatedValue()).floatValue());
                wv0Var2.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
