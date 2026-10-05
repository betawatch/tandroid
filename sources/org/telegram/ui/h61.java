package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class h61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j61 b;

    public /* synthetic */ h61(j61 j61Var, int i10) {
        this.a = i10;
        this.b = j61Var;
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
                j61 j61Var = this.b;
                j61Var.N = 0.0f;
                j61Var.I = null;
                j61Var.M = false;
                j61Var.d(true, false);
                break;
        }
    }
}
