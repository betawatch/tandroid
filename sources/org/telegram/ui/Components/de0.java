package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class de0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ de0(ee0 ee0Var, int i7) {
        this.a = i7;
        this.b = ee0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ee0 ee0Var = this.b;
                ee0Var.h = false;
                ee0Var.a = ee0Var.c;
                ee0Var.invalidate();
                int i7 = ee0Var.J;
                if (i7 >= 0) {
                    ee0Var.b(i7);
                    ee0Var.J = -1;
                    break;
                }
                break;
            default:
                ee0 ee0Var2 = this.b;
                ee0Var2.n = false;
                ee0Var2.h = false;
                ee0Var2.invalidate();
                int i10 = ee0Var2.J;
                if (i10 >= 0) {
                    ee0Var2.b(i10);
                    ee0Var2.J = -1;
                }
                ee0Var2.a();
                break;
        }
    }
}
