package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class e1 extends AnimatorListenerAdapter {
    public final /* synthetic */ h1 a;

    public e1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var = this.a;
        h1Var.b.removeViewImmediate(h1Var.d);
        h1Var.f.d.release();
        h1Var.v = null;
        h1Var.w = true;
        h1Var.x = false;
        h1Var.J = null;
        h1Var.H = false;
    }
}
