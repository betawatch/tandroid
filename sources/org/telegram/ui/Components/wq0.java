package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class wq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs0 b;

    public /* synthetic */ wq0(xs0 xs0Var, int i7) {
        this.a = i7;
        this.b = xs0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N0 = null;
                break;
            default:
                xs0 xs0Var = this.b;
                org.telegram.ui.ActionBar.r0 r0Var = xs0Var.p0;
                sr0[] sr0VarArr = xs0Var.m0;
                xs0Var.h1 = null;
                if (xs0Var.k1) {
                    sr0VarArr[1].setVisibility(8);
                    if (r0Var == null || xs0Var.I()) {
                        xs0Var.q0 = xs0Var.l0(0.0f);
                        xs0Var.K1(0.0f);
                    } else {
                        xs0Var.setSearchItemVisibility(xs0Var.H0() ? 8 : 4);
                        xs0Var.q0 = 0.0f;
                    }
                    xs0Var.G1(false);
                    xs0Var.z0 = 0;
                } else {
                    sr0 sr0Var = sr0VarArr[0];
                    sr0VarArr[0] = sr0VarArr[1];
                    sr0VarArr[1] = sr0Var;
                    sr0Var.setVisibility(8);
                    if (r0Var != null && xs0Var.z0 == 2) {
                        xs0Var.setSearchItemVisibility(xs0Var.H0() ? 8 : 4);
                    }
                    xs0Var.z0 = 0;
                    xs0Var.j1(1.0f, sr0VarArr[0].E);
                    xs0Var.W0();
                    xs0Var.s1();
                }
                xs0Var.i1 = false;
                xs0Var.A1 = false;
                xs0Var.z1 = false;
                xs0Var.setHeaderEnabled(true);
                xs0Var.K0.setEnabled(true);
                break;
        }
    }
}
