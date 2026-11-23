package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ it0 b;

    public /* synthetic */ hr0(it0 it0Var, int i7) {
        this.a = i7;
        this.b = it0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.O0 = null;
                break;
            default:
                it0 it0Var = this.b;
                org.telegram.ui.ActionBar.q0 q0Var = it0Var.q0;
                ds0[] ds0VarArr = it0Var.n0;
                it0Var.i1 = null;
                if (it0Var.l1) {
                    ds0VarArr[1].setVisibility(8);
                    if (q0Var == null || it0Var.I()) {
                        it0Var.r0 = it0Var.l0(0.0f);
                        it0Var.M1(0.0f);
                    } else {
                        it0Var.setSearchItemVisibility(it0Var.I0() ? 8 : 4);
                        it0Var.r0 = 0.0f;
                    }
                    it0Var.I1(false);
                    it0Var.A0 = 0;
                } else {
                    ds0 ds0Var = ds0VarArr[0];
                    ds0VarArr[0] = ds0VarArr[1];
                    ds0VarArr[1] = ds0Var;
                    ds0Var.setVisibility(8);
                    if (q0Var != null && it0Var.A0 == 2) {
                        it0Var.setSearchItemVisibility(it0Var.I0() ? 8 : 4);
                    }
                    it0Var.A0 = 0;
                    it0Var.l1(1.0f, ds0VarArr[0].F);
                    it0Var.Y0();
                    it0Var.u1();
                }
                it0Var.j1 = false;
                it0Var.B1 = false;
                it0Var.A1 = false;
                it0Var.setHeaderEnabled(true);
                it0Var.L0.setEnabled(true);
                break;
        }
    }
}
