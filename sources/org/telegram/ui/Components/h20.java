package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class h20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i20 b;

    public /* synthetic */ h20(i20 i20Var, int i10) {
        this.a = i10;
        this.b = i20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i20 i20Var = this.b;
                NotificationCenter.getInstance(i20Var.r.a).onAnimationFinish(i20Var.f);
                i20Var.requestLayout();
                break;
            default:
                i20 i20Var2 = this.b;
                i20Var2.d = null;
                i20Var2.a = null;
                i20Var2.b = false;
                break;
        }
    }
}
