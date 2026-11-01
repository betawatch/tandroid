package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k10 b;

    public /* synthetic */ j10(k10 k10Var, int i10) {
        this.a = i10;
        this.b = k10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k10 k10Var = this.b;
                org.telegram.messenger.at.f(k10Var.r.a).j(k10Var.f);
                k10Var.requestLayout();
                break;
            default:
                k10 k10Var2 = this.b;
                k10Var2.d = null;
                k10Var2.a = null;
                k10Var2.b = false;
                break;
        }
    }
}
