package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class tg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ tg0(ug0 ug0Var, int i10) {
        this.a = i10;
        this.b = ug0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ug0 ug0Var = this.b;
                ug0Var.h = false;
                ug0Var.a = ug0Var.c;
                ug0Var.invalidate();
                int i10 = ug0Var.J;
                if (i10 >= 0) {
                    ug0Var.b(i10);
                    ug0Var.J = -1;
                    break;
                }
                break;
            default:
                ug0 ug0Var2 = this.b;
                ug0Var2.n = false;
                ug0Var2.h = false;
                ug0Var2.invalidate();
                int i11 = ug0Var2.J;
                if (i11 >= 0) {
                    ug0Var2.b(i11);
                    ug0Var2.J = -1;
                }
                ug0Var2.a();
                break;
        }
    }
}
