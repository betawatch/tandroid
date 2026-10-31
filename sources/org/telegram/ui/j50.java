package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j50 implements org.telegram.ui.Components.i10, org.telegram.ui.ActionBar.u1, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ j50(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = org.telegram.messenger.i0.I0(j1Var, false).d;
        v50 v50Var = this.b;
        v50Var.m0 = i10;
        jg.a3 a3Var = v50Var.F;
        if (a3Var != null) {
            a3Var.setPadding(0, 0, 0, i10);
        }
        v50Var.n0();
        v50Var.l0();
        return r0.j1.b;
    }

    @Override // org.telegram.ui.Components.i10
    public void a(int i10) {
        this.b.b.a(Math.min(i10, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.s0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
