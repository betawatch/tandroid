package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class eg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ eg0(fg0 fg0Var, int i10) {
        this.a = i10;
        this.b = fg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                fg0Var.h = false;
                fg0Var.a = fg0Var.c;
                fg0Var.invalidate();
                int i10 = fg0Var.J;
                if (i10 >= 0) {
                    fg0Var.b(i10);
                    fg0Var.J = -1;
                    break;
                }
                break;
            default:
                fg0 fg0Var2 = this.b;
                fg0Var2.n = false;
                fg0Var2.h = false;
                fg0Var2.invalidate();
                int i11 = fg0Var2.J;
                if (i11 >= 0) {
                    fg0Var2.b(i11);
                    fg0Var2.J = -1;
                }
                fg0Var2.a();
                break;
        }
    }
}
