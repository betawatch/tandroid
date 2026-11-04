package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;

    public /* synthetic */ wd0(xd0 xd0Var, int i3) {
        this.a = i3;
        this.b = xd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                xd0 xd0Var = this.b;
                xd0Var.h = false;
                xd0Var.a = xd0Var.c;
                xd0Var.invalidate();
                int i3 = xd0Var.K;
                if (i3 >= 0) {
                    xd0Var.b(i3);
                    xd0Var.K = -1;
                    break;
                }
                break;
            default:
                xd0 xd0Var2 = this.b;
                xd0Var2.n = false;
                xd0Var2.h = false;
                xd0Var2.invalidate();
                int i10 = xd0Var2.K;
                if (i10 >= 0) {
                    xd0Var2.b(i10);
                    xd0Var2.K = -1;
                }
                xd0Var2.a();
                break;
        }
    }
}
