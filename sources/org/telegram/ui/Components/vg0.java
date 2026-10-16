package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;

    public /* synthetic */ vg0(wg0 wg0Var, int i10) {
        this.a = i10;
        this.b = wg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wg0 wg0Var = this.b;
                wg0Var.h = false;
                wg0Var.a = wg0Var.c;
                wg0Var.invalidate();
                int i10 = wg0Var.J;
                if (i10 >= 0) {
                    wg0Var.b(i10);
                    wg0Var.J = -1;
                    break;
                }
                break;
            default:
                wg0 wg0Var2 = this.b;
                wg0Var2.n = false;
                wg0Var2.h = false;
                wg0Var2.invalidate();
                int i11 = wg0Var2.J;
                if (i11 >= 0) {
                    wg0Var2.b(i11);
                    wg0Var2.J = -1;
                }
                wg0Var2.a();
                break;
        }
    }
}
