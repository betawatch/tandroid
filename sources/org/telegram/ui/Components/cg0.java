package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class cg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ cg0(dg0 dg0Var, int i10) {
        this.a = i10;
        this.b = dg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                dg0 dg0Var = this.b;
                dg0Var.h = false;
                dg0Var.a = dg0Var.c;
                dg0Var.invalidate();
                int i10 = dg0Var.J;
                if (i10 >= 0) {
                    dg0Var.b(i10);
                    dg0Var.J = -1;
                    break;
                }
                break;
            default:
                dg0 dg0Var2 = this.b;
                dg0Var2.n = false;
                dg0Var2.h = false;
                dg0Var2.invalidate();
                int i11 = dg0Var2.J;
                if (i11 >= 0) {
                    dg0Var2.b(i11);
                    dg0Var2.J = -1;
                }
                dg0Var2.a();
                break;
        }
    }
}
