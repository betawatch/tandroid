package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
