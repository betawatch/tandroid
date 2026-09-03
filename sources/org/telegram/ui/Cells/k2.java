package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ k2(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.O3 = 1.0f;
                q2Var.R3 = null;
                q2Var.S3 = null;
                q2Var.T3 = null;
                q2Var.invalidate();
                break;
            case 1:
                q2 q2Var2 = this.b;
                q2Var2.P3 = 1.0f;
                q2Var2.invalidate();
                break;
            default:
                q2 q2Var3 = this.b;
                int i10 = (q2Var3.P2 ? 1 : 0) + (q2Var3.N2 ? 2 : 0) + (q2Var3.O2 ? 4 : 0);
                int i11 = q2Var3.o4;
                if (i11 != i10) {
                    q2Var3.A(i11, i10);
                } else {
                    q2Var3.s4 = false;
                    q2Var3.q4 = i11;
                }
                q2Var3.invalidate();
                break;
        }
    }
}
