package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ n2(t2 t2Var, int i3) {
        this.a = i3;
        this.b = t2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b;
                t2Var.W3 = 1.0f;
                t2Var.Z3 = null;
                t2Var.a4 = null;
                t2Var.b4 = null;
                t2Var.invalidate();
                break;
            case 1:
                t2 t2Var2 = this.b;
                t2Var2.X3 = 1.0f;
                t2Var2.invalidate();
                break;
            default:
                t2 t2Var3 = this.b;
                int i3 = (t2Var3.T2 ? 1 : 0) + (t2Var3.R2 ? 2 : 0) + (t2Var3.S2 ? 4 : 0);
                int i10 = t2Var3.w4;
                if (i10 != i3) {
                    t2Var3.G(i10, i3);
                } else {
                    t2Var3.A4 = false;
                    t2Var3.y4 = i10;
                }
                t2Var3.invalidate();
                break;
        }
    }
}
