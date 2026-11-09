package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m40 implements org.telegram.ui.Components.t00, org.telegram.ui.ActionBar.r1, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ y40 b;

    public /* synthetic */ m40(y40 y40Var, int i7) {
        this.a = i7;
        this.b = y40Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = org.telegram.messenger.g0.I0(k1Var, false).d;
        y40 y40Var = this.b;
        y40Var.m0 = i7;
        bi.s1 s1Var = y40Var.F;
        if (s1Var != null) {
            s1Var.setPadding(0, 0, 0, i7);
        }
        y40Var.o0();
        y40Var.m0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.t00
    public void a(int i7) {
        this.b.b.a(Math.min(i7, r0.c0));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
