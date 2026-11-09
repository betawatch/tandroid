package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ v50(x50 x50Var, int i7) {
        this.a = i7;
        this.b = x50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x50 x50Var = this.b;
                x50Var.e.U1 = null;
                x50Var.requestLayout();
                break;
            default:
                x50 x50Var2 = this.b;
                x50Var2.e.U1 = null;
                x50Var2.a = false;
                break;
        }
    }
}
