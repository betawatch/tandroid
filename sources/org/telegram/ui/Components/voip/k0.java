package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ k0(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.O0 = null;
                l0Var.E.F = false;
                z zVar = l0Var.F;
                if (zVar != null) {
                    if (zVar.getParent() != null) {
                        l0Var.removeView(l0Var.F);
                        l0Var.F.e();
                    }
                    l0Var.F = null;
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                l0 l0Var2 = this.b;
                l0Var2.K0 = null;
                l0Var2.J0 = 0.0f;
                l0Var2.invalidate();
                break;
            default:
                l0 l0Var3 = this.b;
                l0Var3.C0 = null;
                l0Var3.z0 = 1.0f;
                l0Var3.s0 = 0.0f;
                l0Var3.t0 = 0.0f;
                l0Var3.invalidate();
                break;
        }
    }
}
