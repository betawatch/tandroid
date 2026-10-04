package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class j61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l61 b;

    public /* synthetic */ j61(l61 l61Var, int i10) {
        this.a = i10;
        this.b = l61Var;
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
                l61 l61Var = this.b;
                l61Var.N = 0.0f;
                l61Var.I = null;
                l61Var.M = false;
                l61Var.d(true, false);
                break;
        }
    }
}
