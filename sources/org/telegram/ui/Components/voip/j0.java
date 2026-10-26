package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;
    public final /* synthetic */ t b;
    public final /* synthetic */ l0 c;

    public j0(l0 l0Var, t tVar, t tVar2) {
        this.c = l0Var;
        this.a = tVar;
        this.b = tVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.c;
        l0Var.N0 = null;
        this.a.E = false;
        t tVar = l0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                l0Var.removeView(l0Var.E);
                this.b.e();
            }
            l0Var.E = null;
        }
    }
}
