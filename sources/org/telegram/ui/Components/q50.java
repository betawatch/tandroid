package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p60 b;

    public /* synthetic */ q50(p60 p60Var, int i10) {
        this.a = i10;
        this.b = p60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p60 p60Var = this.b;
                if (animator.equals(p60Var.K)) {
                    p60Var.K = null;
                    break;
                }
                break;
            case 1:
                p60 p60Var2 = this.b;
                if (p60Var2.k1 != null) {
                    p60Var2.k1 = null;
                    break;
                }
                break;
            default:
                p60 p60Var3 = this.b;
                if (animator.equals(p60Var3.d0)) {
                    p60Var3.c(true);
                    p60Var3.f1 = false;
                    p60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
