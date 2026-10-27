package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ q40(x50 x50Var, int i10) {
        this.a = i10;
        this.b = x50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x50 x50Var = this.b;
                x50Var.V.setVisibility(4);
                x50Var.W.setVisibility(4);
                x50Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                x50 x50Var2 = this.b;
                x50Var2.h1 = null;
                x50Var2.g1.setColor(x50Var2.T1 == 3 ? -1163700 : -12761513);
                x50Var2.f1.invalidate();
                break;
        }
    }
}
