package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class og0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    public /* synthetic */ og0(pg0 pg0Var, int i10) {
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                pg0 pg0Var = this.b;
                pg0Var.h = false;
                pg0Var.a = pg0Var.c;
                pg0Var.invalidate();
                int i10 = pg0Var.J;
                if (i10 >= 0) {
                    pg0Var.b(i10);
                    pg0Var.J = -1;
                    break;
                }
                break;
            default:
                pg0 pg0Var2 = this.b;
                pg0Var2.n = false;
                pg0Var2.h = false;
                pg0Var2.invalidate();
                int i11 = pg0Var2.J;
                if (i11 >= 0) {
                    pg0Var2.b(i11);
                    pg0Var2.J = -1;
                }
                pg0Var2.a();
                break;
        }
    }
}
