package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
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
        h1Var.F = null;
        h1Var.D = false;
    }
}
