package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;
    public final /* synthetic */ t b;
    public final /* synthetic */ k0 c;

    public i0(k0 k0Var, t tVar, t tVar2) {
        this.c = k0Var;
        this.a = tVar;
        this.b = tVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.c;
        k0Var.K0 = null;
        this.a.B = false;
        t tVar = k0Var.B;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.B);
                this.b.e();
            }
            k0Var.B = null;
        }
    }
}
