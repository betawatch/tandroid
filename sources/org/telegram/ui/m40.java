package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m40 implements org.telegram.ui.Components.d10, org.telegram.ui.ActionBar.q1, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ y40 b;

    public /* synthetic */ m40(y40 y40Var, int i7) {
        this.a = i7;
        this.b = y40Var;
    }

    @Override // org.telegram.ui.Components.d10
    public void a(int i7) {
        this.b.b.a(Math.min(i7, r0.d0));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.t0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        int i7 = org.telegram.messenger.g0.I0(l1Var, false).d;
        y40 y40Var = this.b;
        y40Var.n0 = i7;
        di.d1 d1Var = y40Var.G;
        if (d1Var != null) {
            d1Var.setPadding(0, 0, 0, i7);
        }
        y40Var.o0();
        y40Var.m0();
        return r0.l1.b;
    }
}
