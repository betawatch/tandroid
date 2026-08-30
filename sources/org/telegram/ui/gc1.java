package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd1 b;

    public /* synthetic */ gc1(cd1 cd1Var, int i10) {
        this.a = i10;
        this.b = cd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                cd1 cd1Var = this.b;
                cd1Var.u0.invalidate();
                cd1Var.t0[1].setVisibility(8);
                cd1Var.Z1 = null;
                break;
            case 1:
                this.b.y0 = null;
                break;
            case 2:
                cd1 cd1Var2 = this.b;
                if (cd1Var2.A0.getTag() == null) {
                    cd1Var2.A0.setVisibility(4);
                }
                cd1Var2.E0 = null;
                break;
            case 3:
                cd1 cd1Var3 = this.b;
                if (cd1Var3.B0.getTag() == null) {
                    cd1Var3.B0.setVisibility(4);
                }
                cd1Var3.F0 = null;
                break;
            case 4:
                cd1 cd1Var4 = this.b;
                kc kcVar = cd1Var4.e2;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) cd1Var4.e2.getParent()).removeView(cd1Var4.e2);
                    }
                    cd1Var4.e2 = null;
                }
                cd1Var4.g2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                cd1 cd1Var5 = this.b;
                if (!cd1Var5.m1.a()) {
                    cd1Var5.O1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
