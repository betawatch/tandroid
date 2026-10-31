package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xe0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye0 b;

    public /* synthetic */ xe0(ye0 ye0Var, int i10) {
        this.a = i10;
        this.b = ye0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ye0 ye0Var = this.b;
                ye0Var.h = false;
                ye0Var.a = ye0Var.c;
                ye0Var.invalidate();
                int i10 = ye0Var.J;
                if (i10 >= 0) {
                    ye0Var.b(i10);
                    ye0Var.J = -1;
                    break;
                }
                break;
            default:
                ye0 ye0Var2 = this.b;
                ye0Var2.n = false;
                ye0Var2.h = false;
                ye0Var2.invalidate();
                int i11 = ye0Var2.J;
                if (i11 >= 0) {
                    ye0Var2.b(i11);
                    ye0Var2.J = -1;
                }
                ye0Var2.a();
                break;
        }
    }
}
