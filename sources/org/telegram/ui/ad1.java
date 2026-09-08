package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ad1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd1 b;

    public /* synthetic */ ad1(wd1 wd1Var, int i10) {
        this.a = i10;
        this.b = wd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                wd1 wd1Var = this.b;
                wd1Var.x0.invalidate();
                wd1Var.w0[1].setVisibility(8);
                wd1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                wd1 wd1Var2 = this.b;
                if (wd1Var2.D0.getTag() == null) {
                    wd1Var2.D0.setVisibility(4);
                }
                wd1Var2.H0 = null;
                break;
            case 3:
                wd1 wd1Var3 = this.b;
                if (wd1Var3.E0.getTag() == null) {
                    wd1Var3.E0.setVisibility(4);
                }
                wd1Var3.I0 = null;
                break;
            case 4:
                wd1 wd1Var4 = this.b;
                mc mcVar = wd1Var4.h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) wd1Var4.h2.getParent()).removeView(wd1Var4.h2);
                    }
                    wd1Var4.h2 = null;
                }
                wd1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                wd1 wd1Var5 = this.b;
                if (!wd1Var5.p1.a()) {
                    wd1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
