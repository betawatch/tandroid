package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce1 b;

    public /* synthetic */ gd1(ce1 ce1Var, int i10) {
        this.a = i10;
        this.b = ce1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                ce1 ce1Var = this.b;
                ce1Var.x0.invalidate();
                ce1Var.w0[1].setVisibility(8);
                ce1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                ce1 ce1Var2 = this.b;
                if (ce1Var2.D0.getTag() == null) {
                    ce1Var2.D0.setVisibility(4);
                }
                ce1Var2.H0 = null;
                break;
            case 3:
                ce1 ce1Var3 = this.b;
                if (ce1Var3.E0.getTag() == null) {
                    ce1Var3.E0.setVisibility(4);
                }
                ce1Var3.I0 = null;
                break;
            case 4:
                ce1 ce1Var4 = this.b;
                rc rcVar = ce1Var4.h2;
                if (rcVar != null) {
                    if (rcVar.getParent() != null) {
                        ((ViewGroup) ce1Var4.h2.getParent()).removeView(ce1Var4.h2);
                    }
                    ce1Var4.h2 = null;
                }
                ce1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                ce1 ce1Var5 = this.b;
                if (!ce1Var5.p1.a()) {
                    ce1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
