package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ e50(k60 k60Var, int i10) {
        this.a = i10;
        this.b = k60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k60 k60Var = this.b;
                k60Var.V.setVisibility(4);
                k60Var.W.setVisibility(4);
                k60Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                k60 k60Var2 = this.b;
                k60Var2.h1 = null;
                k60Var2.g1.setColor(k60Var2.T1 == 3 ? -1163700 : -12761513);
                k60Var2.f1.invalidate();
                break;
        }
    }
}
