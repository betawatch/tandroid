package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
