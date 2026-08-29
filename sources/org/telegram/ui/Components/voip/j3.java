package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ j3(l3 l3Var, int i10) {
        this.a = i10;
        this.b = l3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l3 l3Var = this.b;
                l3Var.r = 0;
                l3Var.invalidate();
                break;
            default:
                l3 l3Var2 = this.b;
                l3Var2.s = 0;
                l3Var2.invalidate();
                break;
        }
    }
}
