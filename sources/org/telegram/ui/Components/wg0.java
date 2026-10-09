package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xg0 b;

    public /* synthetic */ wg0(xg0 xg0Var, int i10) {
        this.a = i10;
        this.b = xg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                xg0 xg0Var = this.b;
                xg0Var.h = false;
                xg0Var.a = xg0Var.c;
                xg0Var.invalidate();
                int i10 = xg0Var.J;
                if (i10 >= 0) {
                    xg0Var.b(i10);
                    xg0Var.J = -1;
                    break;
                }
                break;
            default:
                xg0 xg0Var2 = this.b;
                xg0Var2.n = false;
                xg0Var2.h = false;
                xg0Var2.invalidate();
                int i11 = xg0Var2.J;
                if (i11 >= 0) {
                    xg0Var2.b(i11);
                    xg0Var2.J = -1;
                }
                xg0Var2.a();
                break;
        }
    }
}
