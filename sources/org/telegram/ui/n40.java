package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n40 implements org.telegram.ui.Components.f10, org.telegram.ui.ActionBar.q1, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ z40 b;

    public /* synthetic */ n40(z40 z40Var, int i7) {
        this.a = i7;
        this.b = z40Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i7 = org.telegram.messenger.g0.I0(l1Var, false).d;
        z40 z40Var = this.b;
        z40Var.n0 = i7;
        di.d1 d1Var = z40Var.G;
        if (d1Var != null) {
            d1Var.setPadding(0, 0, 0, i7);
        }
        z40Var.o0();
        z40Var.m0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.f10
    public void a(int i7) {
        this.b.b.a(Math.min(i7, r0.d0));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
