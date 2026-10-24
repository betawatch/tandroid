package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ m40(u50 u50Var, int i10) {
        this.a = i10;
        this.b = u50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u50 u50Var = this.b;
                u50Var.V.setVisibility(4);
                u50Var.W.setVisibility(4);
                u50Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                u50 u50Var2 = this.b;
                u50Var2.h1 = null;
                u50Var2.g1.setColor(u50Var2.T1 == 3 ? -1163700 : -12761513);
                u50Var2.f1.invalidate();
                break;
        }
    }
}
