package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class s30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o40 b;

    public /* synthetic */ s30(o40 o40Var, int i7) {
        this.a = i7;
        this.b = o40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o40 o40Var = this.b;
                if (animator.equals(o40Var.K)) {
                    o40Var.K = null;
                    break;
                }
                break;
            case 1:
                o40 o40Var2 = this.b;
                if (o40Var2.k1 != null) {
                    o40Var2.k1 = null;
                    break;
                }
                break;
            default:
                o40 o40Var3 = this.b;
                if (animator.equals(o40Var3.d0)) {
                    o40Var3.d(true);
                    o40Var3.f1 = false;
                    o40Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
