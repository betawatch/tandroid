package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k40 implements org.telegram.ui.Components.w00, org.telegram.ui.ActionBar.q1, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ w40 b;

    public /* synthetic */ k40(w40 w40Var, int i7) {
        this.a = i7;
        this.b = w40Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i7 = org.telegram.messenger.g0.I0(k1Var, false).d;
        w40 w40Var = this.b;
        w40Var.n0 = i7;
        di.e1 e1Var = w40Var.G;
        if (e1Var != null) {
            e1Var.setPadding(0, 0, 0, i7);
        }
        w40Var.o0();
        w40Var.m0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.w00
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
