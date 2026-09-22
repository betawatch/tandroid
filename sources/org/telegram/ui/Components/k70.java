package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class k70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l70 b;

    public /* synthetic */ k70(l70 l70Var, int i10) {
        this.a = i10;
        this.b = l70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l70 l70Var = this.b;
                l70Var.e.d0 = null;
                l70Var.requestLayout();
                break;
            default:
                l70 l70Var2 = this.b;
                l70Var2.e.d0 = null;
                l70Var2.a = false;
                break;
        }
    }
}
