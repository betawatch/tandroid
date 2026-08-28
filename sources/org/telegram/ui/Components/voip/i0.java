package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
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
        k0Var.J0 = null;
        this.a.A = false;
        t tVar = k0Var.A;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.A);
                this.b.e();
            }
            k0Var.A = null;
        }
    }
}
