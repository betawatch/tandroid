package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;

    public /* synthetic */ x00(y00 y00Var, int i7) {
        this.a = i7;
        this.b = y00Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y00 y00Var = this.b;
                org.telegram.messenger.ns.f(y00Var.r.a).j(y00Var.f);
                y00Var.requestLayout();
                break;
            default:
                y00 y00Var2 = this.b;
                y00Var2.d = null;
                y00Var2.a = null;
                y00Var2.b = false;
                break;
        }
    }
}
