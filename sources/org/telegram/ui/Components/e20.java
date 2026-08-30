package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f20 b;

    public /* synthetic */ e20(f20 f20Var, int i10) {
        this.a = i10;
        this.b = f20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f20 f20Var = this.b;
                NotificationCenter.getInstance(f20Var.r.a).onAnimationFinish(f20Var.f);
                f20Var.requestLayout();
                break;
            default:
                f20 f20Var2 = this.b;
                f20Var2.d = null;
                f20Var2.a = null;
                f20Var2.b = false;
                break;
        }
    }
}
