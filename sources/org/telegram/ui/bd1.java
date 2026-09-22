package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd1 b;

    public /* synthetic */ bd1(xd1 xd1Var, int i10) {
        this.a = i10;
        this.b = xd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                xd1 xd1Var = this.b;
                xd1Var.x0.invalidate();
                xd1Var.w0[1].setVisibility(8);
                xd1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                xd1 xd1Var2 = this.b;
                if (xd1Var2.D0.getTag() == null) {
                    xd1Var2.D0.setVisibility(4);
                }
                xd1Var2.H0 = null;
                break;
            case 3:
                xd1 xd1Var3 = this.b;
                if (xd1Var3.E0.getTag() == null) {
                    xd1Var3.E0.setVisibility(4);
                }
                xd1Var3.I0 = null;
                break;
            case 4:
                xd1 xd1Var4 = this.b;
                mc mcVar = xd1Var4.h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) xd1Var4.h2.getParent()).removeView(xd1Var4.h2);
                    }
                    xd1Var4.h2 = null;
                }
                xd1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                xd1 xd1Var5 = this.b;
                if (!xd1Var5.p1.a()) {
                    xd1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
