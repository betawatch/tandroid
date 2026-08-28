package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f50 b;

    public /* synthetic */ o40(f50 f50Var, int i9) {
        this.a = i9;
        this.b = f50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f50 f50Var = this.b;
                if (animator.equals(f50Var.C)) {
                    f50Var.C = null;
                    break;
                }
                break;
            case 1:
                f50 f50Var2 = this.b;
                if (f50Var2.X0 != null) {
                    f50Var2.X0 = null;
                    break;
                }
                break;
            default:
                f50 f50Var3 = this.b;
                if (animator.equals(f50Var3.S)) {
                    f50Var3.h(true);
                    f50Var3.S0 = false;
                    f50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
