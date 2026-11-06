package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ce0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ ce0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                de0 de0Var = this.b;
                de0Var.h = false;
                de0Var.a = de0Var.c;
                de0Var.invalidate();
                int i7 = de0Var.J;
                if (i7 >= 0) {
                    de0Var.b(i7);
                    de0Var.J = -1;
                    break;
                }
                break;
            default:
                de0 de0Var2 = this.b;
                de0Var2.n = false;
                de0Var2.h = false;
                de0Var2.invalidate();
                int i10 = de0Var2.J;
                if (i10 >= 0) {
                    de0Var2.b(i10);
                    de0Var2.J = -1;
                }
                de0Var2.a();
                break;
        }
    }
}
