package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p10 b;

    public /* synthetic */ j10(p10 p10Var, int i7) {
        this.a = i7;
        this.b = p10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p10 p10Var = this.b;
                p10Var.b.setVisibility(8);
                p10Var.E = false;
                p10Var.F = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
