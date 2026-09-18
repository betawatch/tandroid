package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e20 b;

    public /* synthetic */ d20(e20 e20Var, int i10) {
        this.a = i10;
        this.b = e20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e20 e20Var = this.b;
                NotificationCenter.getInstance(e20Var.r.a).onAnimationFinish(e20Var.f);
                e20Var.requestLayout();
                break;
            default:
                e20 e20Var2 = this.b;
                e20Var2.d = null;
                e20Var2.a = null;
                e20Var2.b = false;
                break;
        }
    }
}
