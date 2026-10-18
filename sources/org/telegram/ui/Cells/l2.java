package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class l2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ l2(r2 r2Var, int i10) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.V3 = 1.0f;
                r2Var.Y3 = null;
                r2Var.Z3 = null;
                r2Var.a4 = null;
                r2Var.invalidate();
                break;
            case 1:
                r2 r2Var2 = this.b;
                r2Var2.W3 = 1.0f;
                r2Var2.invalidate();
                break;
            default:
                r2 r2Var3 = this.b;
                int i10 = (r2Var3.S2 ? 1 : 0) + (r2Var3.Q2 ? 2 : 0) + (r2Var3.R2 ? 4 : 0);
                int i11 = r2Var3.v4;
                if (i11 != i10) {
                    r2Var3.A(i11, i10);
                } else {
                    r2Var3.z4 = false;
                    r2Var3.x4 = i11;
                }
                r2Var3.invalidate();
                break;
        }
    }
}
