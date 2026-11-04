package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u20 b;

    public /* synthetic */ s20(u20 u20Var, int i3) {
        this.a = i3;
        this.b = u20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u20 u20Var = this.b;
                u20Var.d = null;
                gp gpVar = new gp(this, 20);
                u20Var.e = gpVar;
                org.telegram.messenger.g0.i3(gpVar, u20Var.w);
                break;
            default:
                u20 u20Var2 = this.b;
                u20Var2.setVisibility(4);
                u20Var2.c = null;
                u20Var2.d = null;
                break;
        }
    }
}
