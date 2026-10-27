package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f1 extends AnimatorListenerAdapter {
    public final /* synthetic */ i1 a;

    public f1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i1 i1Var = this.a;
        i1Var.b.removeViewImmediate(i1Var.d);
        i1Var.f.d.release();
        i1Var.v = null;
        i1Var.w = true;
        i1Var.x = false;
        i1Var.J = null;
        i1Var.H = false;
    }
}
