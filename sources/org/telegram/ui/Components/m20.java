package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class m20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n20 b;

    public /* synthetic */ m20(n20 n20Var, int i10) {
        this.a = i10;
        this.b = n20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n20 n20Var = this.b;
                NotificationCenter.getInstance(n20Var.r.a).onAnimationFinish(n20Var.f);
                n20Var.requestLayout();
                break;
            default:
                n20 n20Var2 = this.b;
                n20Var2.d = null;
                n20Var2.a = null;
                n20Var2.b = false;
                break;
        }
    }
}
