package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class qb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ mc1 b;

    public /* synthetic */ qb1(mc1 mc1Var, int i10) {
        this.a = i10;
        this.b = mc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                mc1 mc1Var = this.b;
                mc1Var.x0.invalidate();
                mc1Var.w0[1].setVisibility(8);
                mc1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                mc1 mc1Var2 = this.b;
                if (mc1Var2.D0.getTag() == null) {
                    mc1Var2.D0.setVisibility(4);
                }
                mc1Var2.H0 = null;
                break;
            case 3:
                mc1 mc1Var3 = this.b;
                if (mc1Var3.E0.getTag() == null) {
                    mc1Var3.E0.setVisibility(4);
                }
                mc1Var3.I0 = null;
                break;
            case 4:
                mc1 mc1Var4 = this.b;
                nc ncVar = mc1Var4.h2;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) mc1Var4.h2.getParent()).removeView(mc1Var4.h2);
                    }
                    mc1Var4.h2 = null;
                }
                mc1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                mc1 mc1Var5 = this.b;
                if (!mc1Var5.p1.a()) {
                    mc1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
