package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k40 implements org.telegram.ui.Components.s00, org.telegram.ui.ActionBar.r1, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ w40 b;

    public /* synthetic */ k40(w40 w40Var, int i7) {
        this.a = i7;
        this.b = w40Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = org.telegram.messenger.g0.I0(k1Var, false).d;
        w40 w40Var = this.b;
        w40Var.m0 = i7;
        bi.s1 s1Var = w40Var.F;
        if (s1Var != null) {
            s1Var.setPadding(0, 0, 0, i7);
        }
        w40Var.o0();
        w40Var.m0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.s00
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
