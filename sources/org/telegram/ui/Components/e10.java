package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;

    public /* synthetic */ e10(f10 f10Var, int i7) {
        this.a = i7;
        this.b = f10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f10 f10Var = this.b;
                org.telegram.messenger.ks.f(f10Var.r.a).j(f10Var.f);
                f10Var.requestLayout();
                break;
            default:
                f10 f10Var2 = this.b;
                f10Var2.d = null;
                f10Var2.a = null;
                f10Var2.b = false;
                break;
        }
    }
}
