package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class n6 extends AnimatorListenerAdapter {
    public final /* synthetic */ di a;
    public final /* synthetic */ w6 b;
    public final /* synthetic */ o6 c;

    public n6(o6 o6Var, di diVar, w6 w6Var) {
        this.c = o6Var;
        this.a = diVar;
        this.b = w6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            org.telegram.messenger.g0.v1(this.b);
        }
    }
}
