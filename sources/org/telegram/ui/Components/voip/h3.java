package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ h3(j3 j3Var, int i10) {
        this.a = i10;
        this.b = j3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j3 j3Var = this.b;
                j3Var.r = 0;
                j3Var.invalidate();
                break;
            default:
                j3 j3Var2 = this.b;
                j3Var2.s = 0;
                j3Var2.invalidate();
                break;
        }
    }
}
