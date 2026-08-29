package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a20 b;

    public /* synthetic */ z10(a20 a20Var, int i10) {
        this.a = i10;
        this.b = a20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a20 a20Var = this.b;
                NotificationCenter.getInstance(a20Var.r.a).onAnimationFinish(a20Var.f);
                a20Var.requestLayout();
                break;
            default:
                a20 a20Var2 = this.b;
                a20Var2.d = null;
                a20Var2.a = null;
                a20Var2.b = false;
                break;
        }
    }
}
