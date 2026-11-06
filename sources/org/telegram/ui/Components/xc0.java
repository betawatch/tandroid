package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad0 b;

    public /* synthetic */ xc0(ad0 ad0Var, int i7) {
        this.a = i7;
        this.b = ad0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.t1 = null;
                break;
            default:
                this.b.u1 = null;
                break;
        }
    }
}
