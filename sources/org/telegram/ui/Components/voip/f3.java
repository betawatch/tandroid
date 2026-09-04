package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class f3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ f3(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h3 h3Var = this.b;
                h3Var.r = 0;
                h3Var.invalidate();
                break;
            default:
                h3 h3Var2 = this.b;
                h3Var2.s = 0;
                h3Var2.invalidate();
                break;
        }
    }
}
