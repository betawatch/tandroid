package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y20 b;

    public /* synthetic */ w20(y20 y20Var, int i7) {
        this.a = i7;
        this.b = y20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y20 y20Var = this.b;
                y20Var.d = null;
                gp gpVar = new gp(this, 20);
                y20Var.e = gpVar;
                org.telegram.messenger.g0.i3(gpVar, y20Var.w);
                break;
            default:
                y20 y20Var2 = this.b;
                y20Var2.setVisibility(4);
                y20Var2.c = null;
                y20Var2.d = null;
                break;
        }
    }
}
