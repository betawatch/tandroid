package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class u00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v00 b;

    public /* synthetic */ u00(v00 v00Var, int i7) {
        this.a = i7;
        this.b = v00Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v00 v00Var = this.b;
                org.telegram.messenger.qs.f(v00Var.r.a).j(v00Var.f);
                v00Var.requestLayout();
                break;
            default:
                v00 v00Var2 = this.b;
                v00Var2.d = null;
                v00Var2.a = null;
                v00Var2.b = false;
                break;
        }
    }
}
