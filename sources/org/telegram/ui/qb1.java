package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc1 b;

    public /* synthetic */ qb1(nc1 nc1Var, int i10) {
        this.a = i10;
        this.b = nc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                nc1 nc1Var = this.b;
                nc1Var.t0.invalidate();
                nc1Var.s0[1].setVisibility(8);
                nc1Var.Y1 = null;
                break;
            case 1:
                this.b.x0 = null;
                break;
            case 2:
                nc1 nc1Var2 = this.b;
                if (nc1Var2.z0.getTag() == null) {
                    nc1Var2.z0.setVisibility(4);
                }
                nc1Var2.D0 = null;
                break;
            case 3:
                nc1 nc1Var3 = this.b;
                if (nc1Var3.A0.getTag() == null) {
                    nc1Var3.A0.setVisibility(4);
                }
                nc1Var3.E0 = null;
                break;
            case 4:
                nc1 nc1Var4 = this.b;
                hc hcVar = nc1Var4.d2;
                if (hcVar != null) {
                    if (hcVar.getParent() != null) {
                        ((ViewGroup) nc1Var4.d2.getParent()).removeView(nc1Var4.d2);
                    }
                    nc1Var4.d2 = null;
                }
                nc1Var4.f2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                nc1 nc1Var5 = this.b;
                if (!nc1Var5.l1.a()) {
                    nc1Var5.N1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
