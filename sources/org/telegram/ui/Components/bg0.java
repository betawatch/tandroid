package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ bg0(cg0 cg0Var, int i10) {
        this.a = i10;
        this.b = cg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                cg0 cg0Var = this.b;
                cg0Var.h = false;
                cg0Var.a = cg0Var.c;
                cg0Var.invalidate();
                int i10 = cg0Var.G;
                if (i10 >= 0) {
                    cg0Var.b(i10);
                    cg0Var.G = -1;
                    break;
                }
                break;
            default:
                cg0 cg0Var2 = this.b;
                cg0Var2.n = false;
                cg0Var2.h = false;
                cg0Var2.invalidate();
                int i11 = cg0Var2.G;
                if (i11 >= 0) {
                    cg0Var2.b(i11);
                    cg0Var2.G = -1;
                }
                cg0Var2.a();
                break;
        }
    }
}
