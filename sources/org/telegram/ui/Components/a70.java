package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;

    public /* synthetic */ a70(b70 b70Var, int i10) {
        this.a = i10;
        this.b = b70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b70 b70Var = this.b;
                b70Var.e.d0 = null;
                b70Var.requestLayout();
                break;
            default:
                b70 b70Var2 = this.b;
                b70Var2.e.d0 = null;
                b70Var2.a = false;
                break;
        }
    }
}
