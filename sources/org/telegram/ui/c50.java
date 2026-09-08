package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;

    public /* synthetic */ c50(j60 j60Var, int i10) {
        this.a = i10;
        this.b = j60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j60 j60Var = this.b;
                j60Var.V.setVisibility(4);
                j60Var.W.setVisibility(4);
                j60Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                j60 j60Var2 = this.b;
                j60Var2.h1 = null;
                j60Var2.g1.setColor(j60Var2.T1 == 3 ? -1163700 : -12761513);
                j60Var2.f1.invalidate();
                break;
        }
    }
}
