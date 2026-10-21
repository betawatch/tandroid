package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ob1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ ob1(kc1 kc1Var, int i10) {
        this.a = i10;
        this.b = kc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                kc1 kc1Var = this.b;
                kc1Var.x0.invalidate();
                kc1Var.w0[1].setVisibility(8);
                kc1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                kc1 kc1Var2 = this.b;
                if (kc1Var2.D0.getTag() == null) {
                    kc1Var2.D0.setVisibility(4);
                }
                kc1Var2.H0 = null;
                break;
            case 3:
                kc1 kc1Var3 = this.b;
                if (kc1Var3.E0.getTag() == null) {
                    kc1Var3.E0.setVisibility(4);
                }
                kc1Var3.I0 = null;
                break;
            case 4:
                kc1 kc1Var4 = this.b;
                lc lcVar = kc1Var4.h2;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) kc1Var4.h2.getParent()).removeView(kc1Var4.h2);
                    }
                    kc1Var4.h2 = null;
                }
                kc1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                kc1 kc1Var5 = this.b;
                if (!kc1Var5.p1.a()) {
                    kc1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
