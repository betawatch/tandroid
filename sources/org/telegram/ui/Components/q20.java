package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;

    public /* synthetic */ q20(r20 r20Var, int i10) {
        this.a = i10;
        this.b = r20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r20 r20Var = this.b;
                NotificationCenter.getInstance(r20Var.r.a).onAnimationFinish(r20Var.f);
                r20Var.requestLayout();
                break;
            default:
                r20 r20Var2 = this.b;
                r20Var2.d = null;
                r20Var2.a = null;
                r20Var2.b = false;
                break;
        }
    }
}
