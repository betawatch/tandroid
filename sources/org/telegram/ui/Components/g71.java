package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h71 b;

    public /* synthetic */ g71(h71 h71Var, int i7) {
        this.a = i7;
        this.b = h71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.D = null;
                break;
            default:
                this.b.D = null;
                break;
        }
    }
}
