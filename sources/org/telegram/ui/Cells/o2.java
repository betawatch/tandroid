package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ o2(u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u2 u2Var = this.b;
                u2Var.W3 = 1.0f;
                u2Var.Z3 = null;
                u2Var.a4 = null;
                u2Var.b4 = null;
                u2Var.invalidate();
                break;
            case 1:
                u2 u2Var2 = this.b;
                u2Var2.X3 = 1.0f;
                u2Var2.invalidate();
                break;
            default:
                u2 u2Var3 = this.b;
                int i7 = (u2Var3.T2 ? 1 : 0) + (u2Var3.R2 ? 2 : 0) + (u2Var3.S2 ? 4 : 0);
                int i10 = u2Var3.w4;
                if (i10 != i7) {
                    u2Var3.H(i10, i7);
                } else {
                    u2Var3.A4 = false;
                    u2Var3.y4 = i10;
                }
                u2Var3.invalidate();
                break;
        }
    }
}
