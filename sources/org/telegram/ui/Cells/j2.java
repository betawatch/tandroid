package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ j2(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.N3 = 1.0f;
                p2Var.Q3 = null;
                p2Var.R3 = null;
                p2Var.S3 = null;
                p2Var.invalidate();
                break;
            case 1:
                p2 p2Var2 = this.b;
                p2Var2.O3 = 1.0f;
                p2Var2.invalidate();
                break;
            default:
                p2 p2Var3 = this.b;
                int i10 = (p2Var3.O2 ? 1 : 0) + (p2Var3.M2 ? 2 : 0) + (p2Var3.N2 ? 4 : 0);
                int i11 = p2Var3.n4;
                if (i11 != i10) {
                    p2Var3.B(i11, i10);
                } else {
                    p2Var3.r4 = false;
                    p2Var3.p4 = i11;
                }
                p2Var3.invalidate();
                break;
        }
    }
}
