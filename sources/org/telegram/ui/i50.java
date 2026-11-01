package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i50 implements org.telegram.ui.Components.i10, org.telegram.ui.ActionBar.u1, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ i50(u50 u50Var, int i10) {
        this.a = i10;
        this.b = u50Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = org.telegram.messenger.i0.I0(j1Var, false).d;
        u50 u50Var = this.b;
        u50Var.m0 = i10;
        jg.a3 a3Var = u50Var.F;
        if (a3Var != null) {
            a3Var.setPadding(0, 0, 0, i10);
        }
        u50Var.o0();
        u50Var.m0();
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
                this.b.t0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
