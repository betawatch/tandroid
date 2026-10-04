package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class n70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o70 b;

    public /* synthetic */ n70(o70 o70Var, int i10) {
        this.a = i10;
        this.b = o70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o70 o70Var = this.b;
                o70Var.e.d0 = null;
                o70Var.requestLayout();
                break;
            default:
                o70 o70Var2 = this.b;
                o70Var2.e.d0 = null;
                o70Var2.a = false;
                break;
        }
    }
}
