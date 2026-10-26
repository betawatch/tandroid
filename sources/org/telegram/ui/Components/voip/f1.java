package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
