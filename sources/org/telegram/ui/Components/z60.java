package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
