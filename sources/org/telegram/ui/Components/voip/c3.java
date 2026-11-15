package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ c3(e3 e3Var, int i7) {
        this.a = i7;
        this.b = e3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                e3Var.r = 0;
                e3Var.invalidate();
                break;
            default:
                e3 e3Var2 = this.b;
                e3Var2.s = 0;
                e3Var2.invalidate();
                break;
        }
    }
}
