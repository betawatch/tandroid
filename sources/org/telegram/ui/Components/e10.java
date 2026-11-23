package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g10 b;

    public /* synthetic */ e10(g10 g10Var, int i7) {
        this.a = i7;
        this.b = g10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g10 g10Var = this.b;
                org.telegram.messenger.ks.f(g10Var.r.a).j(g10Var.f);
                g10Var.requestLayout();
                break;
            default:
                g10 g10Var2 = this.b;
                g10Var2.d = null;
                g10Var2.a = null;
                g10Var2.b = false;
                break;
        }
    }
}
