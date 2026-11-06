package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ y2(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                a3Var.r = 0;
                a3Var.invalidate();
                break;
            default:
                a3 a3Var2 = this.b;
                a3Var2.s = 0;
                a3Var2.invalidate();
                break;
        }
    }
}
