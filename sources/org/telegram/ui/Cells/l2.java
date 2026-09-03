package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                r2Var.O3 = 1.0f;
                r2Var.R3 = null;
                r2Var.S3 = null;
                r2Var.T3 = null;
                r2Var.invalidate();
                break;
            case 1:
                r2 r2Var2 = this.b;
                r2Var2.P3 = 1.0f;
                r2Var2.invalidate();
                break;
            default:
                r2 r2Var3 = this.b;
                int i10 = (r2Var3.P2 ? 1 : 0) + (r2Var3.N2 ? 2 : 0) + (r2Var3.O2 ? 4 : 0);
                int i11 = r2Var3.o4;
                if (i11 != i10) {
                    r2Var3.A(i11, i10);
                } else {
                    r2Var3.s4 = false;
                    r2Var3.q4 = i11;
                }
                r2Var3.invalidate();
                break;
        }
    }
}
