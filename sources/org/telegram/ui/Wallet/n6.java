package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ki;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class n6 extends AnimatorListenerAdapter {
    public final /* synthetic */ ki a;
    public final /* synthetic */ w6 b;
    public final /* synthetic */ o6 c;

    public n6(o6 o6Var, ki kiVar, w6 w6Var) {
        this.c = o6Var;
        this.a = kiVar;
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
