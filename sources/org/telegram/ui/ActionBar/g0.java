package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ g0(q0 q0Var, int i7) {
        this.a = i7;
        this.b = q0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.s.setVisibility(4);
                q0Var.w = null;
                break;
            default:
                this.b.w = null;
                break;
        }
    }
}
