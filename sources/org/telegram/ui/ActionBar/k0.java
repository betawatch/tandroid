package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class k0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ k0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                u0Var.s.setVisibility(4);
                u0Var.v = null;
                break;
            default:
                this.b.v = null;
                break;
        }
    }
}
