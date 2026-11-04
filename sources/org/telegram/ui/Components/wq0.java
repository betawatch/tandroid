package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws0 b;

    public /* synthetic */ wq0(ws0 ws0Var, int i3) {
        this.a = i3;
        this.b = ws0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.O0 = null;
                break;
            default:
                ws0 ws0Var = this.b;
                org.telegram.ui.ActionBar.q0 q0Var = ws0Var.q0;
                rr0[] rr0VarArr = ws0Var.n0;
                ws0Var.i1 = null;
                if (ws0Var.l1) {
                    rr0VarArr[1].setVisibility(8);
                    if (q0Var == null || ws0Var.I()) {
                        ws0Var.r0 = ws0Var.l0(0.0f);
                        ws0Var.K1(0.0f);
                    } else {
                        ws0Var.setSearchItemVisibility(ws0Var.H0() ? 8 : 4);
                        ws0Var.r0 = 0.0f;
                    }
                    ws0Var.G1(false);
                    ws0Var.A0 = 0;
                } else {
                    rr0 rr0Var = rr0VarArr[0];
                    rr0VarArr[0] = rr0VarArr[1];
                    rr0VarArr[1] = rr0Var;
                    rr0Var.setVisibility(8);
                    if (q0Var != null && ws0Var.A0 == 2) {
                        ws0Var.setSearchItemVisibility(ws0Var.H0() ? 8 : 4);
                    }
                    ws0Var.A0 = 0;
                    ws0Var.j1(1.0f, rr0VarArr[0].F);
                    ws0Var.W0();
                    ws0Var.s1();
                }
                ws0Var.j1 = false;
                ws0Var.B1 = false;
                ws0Var.A1 = false;
                ws0Var.setHeaderEnabled(true);
                ws0Var.L0.setEnabled(true);
                break;
        }
    }
}
