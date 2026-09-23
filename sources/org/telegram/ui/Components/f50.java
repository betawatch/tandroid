package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class f50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ f50(x50 x50Var, int i10) {
        this.a = i10;
        this.b = x50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x50 x50Var = this.b;
                if (animator.equals(x50Var.G)) {
                    x50Var.G = null;
                    break;
                }
                break;
            case 1:
                x50 x50Var2 = this.b;
                if (x50Var2.b1 != null) {
                    x50Var2.b1 = null;
                    break;
                }
                break;
            default:
                x50 x50Var3 = this.b;
                if (animator.equals(x50Var3.W)) {
                    x50Var3.h(true);
                    x50Var3.W0 = false;
                    x50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
