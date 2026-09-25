package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class i3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ i3(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b;
                k3Var.r = 0;
                k3Var.invalidate();
                break;
            default:
                k3 k3Var2 = this.b;
                k3Var2.s = 0;
                k3Var2.invalidate();
                break;
        }
    }
}
