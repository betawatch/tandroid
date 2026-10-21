package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class t70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u70 b;

    public /* synthetic */ t70(u70 u70Var, int i10) {
        this.a = i10;
        this.b = u70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u70 u70Var = this.b;
                u70Var.e.d0 = null;
                u70Var.requestLayout();
                break;
            default:
                u70 u70Var2 = this.b;
                u70Var2.e.d0 = null;
                u70Var2.a = false;
                break;
        }
    }
}
