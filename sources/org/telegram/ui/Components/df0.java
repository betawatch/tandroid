package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class df0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef0 b;

    public /* synthetic */ df0(ef0 ef0Var, int i9) {
        this.a = i9;
        this.b = ef0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ef0 ef0Var = this.b;
                ef0Var.h = false;
                ef0Var.a = ef0Var.c;
                ef0Var.invalidate();
                int i9 = ef0Var.F;
                if (i9 >= 0) {
                    ef0Var.b(i9);
                    ef0Var.F = -1;
                    break;
                }
                break;
            default:
                ef0 ef0Var2 = this.b;
                ef0Var2.n = false;
                ef0Var2.h = false;
                ef0Var2.invalidate();
                int i10 = ef0Var2.F;
                if (i10 >= 0) {
                    ef0Var2.b(i10);
                    ef0Var2.F = -1;
                }
                ef0Var2.a();
                break;
        }
    }
}
