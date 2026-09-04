package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class z60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a70 b;

    public /* synthetic */ z60(a70 a70Var, int i10) {
        this.a = i10;
        this.b = a70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a70 a70Var = this.b;
                a70Var.e.d0 = null;
                a70Var.requestLayout();
                break;
            default:
                a70 a70Var2 = this.b;
                a70Var2.e.d0 = null;
                a70Var2.a = false;
                break;
        }
    }
}
