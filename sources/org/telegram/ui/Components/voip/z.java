package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ k0 a;

    public z(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.a;
        k0Var.J0 = null;
        k0Var.y.A = false;
        t tVar = k0Var.A;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.A);
                k0Var.A.e();
            }
            k0Var.A = null;
        }
    }
}
