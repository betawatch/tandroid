package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ki;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class ca extends AnimatorListenerAdapter {
    public final /* synthetic */ ki a;
    public final /* synthetic */ w6 b;
    public final /* synthetic */ da c;

    public ca(da daVar, ki kiVar, w6 w6Var) {
        this.c = daVar;
        this.a = kiVar;
        this.b = w6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            org.telegram.messenger.g0.v1(this.b);
        }
    }
}
