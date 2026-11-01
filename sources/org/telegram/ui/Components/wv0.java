package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ wv0(xv0 xv0Var, int i10) {
        this.a = i10;
        this.b = xv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                xv0 xv0Var = this.b;
                xv0Var.D = 1.0f;
                xv0Var.invalidate();
                xv0Var.G = null;
                break;
            case 1:
                xv0 xv0Var2 = this.b;
                xv0Var2.m(((Float) xv0Var2.w.getAnimatedValue()).floatValue());
                xv0Var2.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
