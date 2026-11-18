package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f11 b;

    public /* synthetic */ v01(f11 f11Var, int i7) {
        this.a = i7;
        this.b = f11Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f11 f11Var = this.b;
                if (f11Var.b0 == animator) {
                    f11Var.b0 = null;
                    break;
                }
                break;
            case 1:
                f11 f11Var2 = this.b;
                if (f11Var2.k0 == animator) {
                    f11Var2.k0 = null;
                }
                f11Var2.c(1.0f);
                break;
            default:
                f11 f11Var3 = this.b;
                if (f11Var3.K == animator) {
                    f11Var3.K = null;
                    break;
                }
                break;
        }
    }
}
