package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ru0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ su0 b;

    public /* synthetic */ ru0(su0 su0Var, int i3) {
        this.a = i3;
        this.b = su0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                su0 su0Var = this.b;
                su0Var.E = 1.0f;
                su0Var.invalidate();
                su0Var.H = null;
                break;
            case 1:
                su0 su0Var2 = this.b;
                su0Var2.m(((Float) su0Var2.w.getAnimatedValue()).floatValue());
                su0Var2.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.G = null;
                break;
        }
    }
}
