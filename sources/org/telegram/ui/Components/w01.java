package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class w01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;

    public /* synthetic */ w01(g11 g11Var, int i7) {
        this.a = i7;
        this.b = g11Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g11 g11Var = this.b;
                if (g11Var.b0 == animator) {
                    g11Var.b0 = null;
                    break;
                }
                break;
            case 1:
                g11 g11Var2 = this.b;
                if (g11Var2.k0 == animator) {
                    g11Var2.k0 = null;
                }
                g11Var2.c(1.0f);
                break;
            default:
                g11 g11Var3 = this.b;
                if (g11Var3.K == animator) {
                    g11Var3.K = null;
                    break;
                }
                break;
        }
    }
}
