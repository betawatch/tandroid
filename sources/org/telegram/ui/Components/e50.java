package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c60 b;

    public /* synthetic */ e50(c60 c60Var, int i10) {
        this.a = i10;
        this.b = c60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c60 c60Var = this.b;
                if (animator.equals(c60Var.L)) {
                    c60Var.L = null;
                    break;
                }
                break;
            case 1:
                c60 c60Var2 = this.b;
                if (c60Var2.g1 != null) {
                    c60Var2.g1 = null;
                    break;
                }
                break;
            default:
                c60 c60Var3 = this.b;
                if (animator.equals(c60Var3.e0)) {
                    c60Var3.c(true);
                    c60Var3.b1 = false;
                    c60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
