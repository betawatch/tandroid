package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw0 b;

    public /* synthetic */ rw0(sw0 sw0Var, int i10) {
        this.a = i10;
        this.b = sw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sw0 sw0Var = this.b;
                sw0Var.y = 1.0f;
                sw0Var.invalidate();
                sw0Var.G = null;
                break;
            case 1:
                sw0 sw0Var2 = this.b;
                sw0Var2.m(((Float) sw0Var2.v.getAnimatedValue()).floatValue());
                sw0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
