package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class i81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m81 b;

    public /* synthetic */ i81(m81 m81Var, int i7) {
        this.a = i7;
        this.b = m81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m81 m81Var = this.b;
                m81Var.w = 0;
                m81Var.n.setVisibility(8);
                break;
            case 1:
                this.b.w = 0;
                break;
            default:
                this.b.F.setVisibility(8);
                break;
        }
    }
}
