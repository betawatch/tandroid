package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd1 b;

    public /* synthetic */ nc1(jd1 jd1Var, int i10) {
        this.a = i10;
        this.b = jd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                jd1 jd1Var = this.b;
                jd1Var.u0.invalidate();
                jd1Var.t0[1].setVisibility(8);
                jd1Var.Z1 = null;
                break;
            case 1:
                this.b.y0 = null;
                break;
            case 2:
                jd1 jd1Var2 = this.b;
                if (jd1Var2.A0.getTag() == null) {
                    jd1Var2.A0.setVisibility(4);
                }
                jd1Var2.E0 = null;
                break;
            case 3:
                jd1 jd1Var3 = this.b;
                if (jd1Var3.B0.getTag() == null) {
                    jd1Var3.B0.setVisibility(4);
                }
                jd1Var3.F0 = null;
                break;
            case 4:
                jd1 jd1Var4 = this.b;
                mc mcVar = jd1Var4.e2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) jd1Var4.e2.getParent()).removeView(jd1Var4.e2);
                    }
                    jd1Var4.e2 = null;
                }
                jd1Var4.g2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                jd1 jd1Var5 = this.b;
                if (!jd1Var5.m1.a()) {
                    jd1Var5.O1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
