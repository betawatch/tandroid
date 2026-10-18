package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class g51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i51 b;

    public /* synthetic */ g51(i51 i51Var, int i10) {
        this.a = i10;
        this.b = i51Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                i51 i51Var = this.b;
                i51Var.N = 0.0f;
                i51Var.I = null;
                i51Var.M = false;
                i51Var.d(true, false);
                break;
        }
    }
}
