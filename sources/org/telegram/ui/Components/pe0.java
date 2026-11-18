package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pe0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe0 b;

    public /* synthetic */ pe0(qe0 qe0Var, int i7) {
        this.a = i7;
        this.b = qe0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qe0 qe0Var = this.b;
                qe0Var.h = false;
                qe0Var.a = qe0Var.c;
                qe0Var.invalidate();
                int i7 = qe0Var.K;
                if (i7 >= 0) {
                    qe0Var.b(i7);
                    qe0Var.K = -1;
                    break;
                }
                break;
            default:
                qe0 qe0Var2 = this.b;
                qe0Var2.n = false;
                qe0Var2.h = false;
                qe0Var2.invalidate();
                int i10 = qe0Var2.K;
                if (i10 >= 0) {
                    qe0Var2.b(i10);
                    qe0Var2.K = -1;
                }
                qe0Var2.a();
                break;
        }
    }
}
