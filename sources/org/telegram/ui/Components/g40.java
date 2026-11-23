package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c50 b;

    public /* synthetic */ g40(c50 c50Var, int i7) {
        this.a = i7;
        this.b = c50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c50 c50Var = this.b;
                if (animator.equals(c50Var.L)) {
                    c50Var.L = null;
                    break;
                }
                break;
            case 1:
                c50 c50Var2 = this.b;
                if (c50Var2.l1 != null) {
                    c50Var2.l1 = null;
                    break;
                }
                break;
            default:
                c50 c50Var3 = this.b;
                if (animator.equals(c50Var3.e0)) {
                    c50Var3.d(true);
                    c50Var3.g1 = false;
                    c50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
