package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g20 b;

    public /* synthetic */ f20(g20 g20Var, int i10) {
        this.a = i10;
        this.b = g20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g20 g20Var = this.b;
                NotificationCenter.getInstance(g20Var.r.a).onAnimationFinish(g20Var.f);
                g20Var.requestLayout();
                break;
            default:
                g20 g20Var2 = this.b;
                g20Var2.d = null;
                g20Var2.a = null;
                g20Var2.b = false;
                break;
        }
    }
}
