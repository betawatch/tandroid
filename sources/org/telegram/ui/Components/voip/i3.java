package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
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
