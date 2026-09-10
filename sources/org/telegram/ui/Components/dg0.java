package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ dg0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                eg0Var.h = false;
                eg0Var.a = eg0Var.c;
                eg0Var.invalidate();
                int i10 = eg0Var.J;
                if (i10 >= 0) {
                    eg0Var.b(i10);
                    eg0Var.J = -1;
                    break;
                }
                break;
            default:
                eg0 eg0Var2 = this.b;
                eg0Var2.n = false;
                eg0Var2.h = false;
                eg0Var2.invalidate();
                int i11 = eg0Var2.J;
                if (i11 >= 0) {
                    eg0Var2.b(i11);
                    eg0Var2.J = -1;
                }
                eg0Var2.a();
                break;
        }
    }
}
