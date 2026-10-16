package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class x70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y70 b;

    public /* synthetic */ x70(y70 y70Var, int i10) {
        this.a = i10;
        this.b = y70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y70 y70Var = this.b;
                y70Var.e.d0 = null;
                y70Var.requestLayout();
                break;
            default:
                y70 y70Var2 = this.b;
                y70Var2.e.d0 = null;
                y70Var2.a = false;
                break;
        }
    }
}
