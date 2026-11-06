package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class yd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd0 b;

    public /* synthetic */ yd0(zd0 zd0Var, int i7) {
        this.a = i7;
        this.b = zd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.a.n.setVisibility(8);
                break;
            default:
                this.b.a.h.setVisibility(8);
                break;
        }
    }
}
