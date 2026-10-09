package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g60 b;

    public /* synthetic */ a50(g60 g60Var, int i10) {
        this.a = i10;
        this.b = g60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g60 g60Var = this.b;
                g60Var.V.setVisibility(4);
                g60Var.W.setVisibility(4);
                g60Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                g60 g60Var2 = this.b;
                g60Var2.h1 = null;
                g60Var2.g1.setColor(g60Var2.T1 == 3 ? -1163700 : -12761513);
                g60Var2.f1.invalidate();
                break;
        }
    }
}
