package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f40 implements org.telegram.ui.Components.o00, org.telegram.ui.ActionBar.p1, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ r40 b;

    public /* synthetic */ f40(r40 r40Var, int i3) {
        this.a = i3;
        this.b = r40Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        int i3 = org.telegram.messenger.g0.I0(k1Var, false).d;
        r40 r40Var = this.b;
        r40Var.n0 = i3;
        ci.l1 l1Var = r40Var.G;
        if (l1Var != null) {
            l1Var.setPadding(0, 0, 0, i3);
        }
        r40Var.o0();
        r40Var.m0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.o00
    public void a(int i3) {
        this.b.b.a(Math.min(i3, r0.d0));
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
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
