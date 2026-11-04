package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ n2(p2 p2Var, int i3) {
        this.a = i3;
        this.b = p2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.r = 0;
                p2Var.invalidate();
                break;
            default:
                p2 p2Var2 = this.b;
                p2Var2.s = 0;
                p2Var2.invalidate();
                break;
        }
    }
}
