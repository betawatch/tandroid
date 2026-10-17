package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class l40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ l40(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                s50Var.V.setVisibility(4);
                s50Var.W.setVisibility(4);
                s50Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                s50 s50Var2 = this.b;
                s50Var2.h1 = null;
                s50Var2.g1.setColor(s50Var2.T1 == 3 ? -1163700 : -12761513);
                s50Var2.f1.invalidate();
                break;
        }
    }
}
