package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class k2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ k2(r2 r2Var, int i10) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.R3 = 1.0f;
                r2Var.U3 = null;
                r2Var.V3 = null;
                r2Var.W3 = null;
                r2Var.invalidate();
                break;
            case 1:
                r2 r2Var2 = this.b;
                r2Var2.S3 = 1.0f;
                r2Var2.invalidate();
                break;
            default:
                r2 r2Var3 = this.b;
                int i10 = (r2Var3.S2 ? 1 : 0) + (r2Var3.Q2 ? 2 : 0) + (r2Var3.R2 ? 4 : 0);
                int i11 = r2Var3.r4;
                if (i11 != i10) {
                    r2Var3.A(i11, i10);
                } else {
                    r2Var3.v4 = false;
                    r2Var3.t4 = i11;
                }
                r2Var3.invalidate();
                break;
        }
    }
}
