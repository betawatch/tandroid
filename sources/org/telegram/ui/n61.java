package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class n61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p61 b;

    public /* synthetic */ n61(p61 p61Var, int i10) {
        this.a = i10;
        this.b = p61Var;
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
                p61 p61Var = this.b;
                p61Var.N = 0.0f;
                p61Var.I = null;
                p61Var.M = false;
                p61Var.d(true, false);
                break;
        }
    }
}
