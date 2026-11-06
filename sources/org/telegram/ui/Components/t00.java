package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u00 b;

    public /* synthetic */ t00(u00 u00Var, int i7) {
        this.a = i7;
        this.b = u00Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u00 u00Var = this.b;
                org.telegram.messenger.qs.f(u00Var.r.a).j(u00Var.f);
                u00Var.requestLayout();
                break;
            default:
                u00 u00Var2 = this.b;
                u00Var2.d = null;
                u00Var2.a = null;
                u00Var2.b = false;
                break;
        }
    }
}
