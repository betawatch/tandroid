package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class df1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.cl0 {
    public final /* synthetic */ eg1 a;

    public /* synthetic */ df1(eg1 eg1Var) {
        this.a = eg1Var;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        int i10 = l1Var.a.f(519).d;
        eg1 eg1Var = this.a;
        eg1Var.e1 = i10;
        ag1 ag1Var = eg1Var.r0;
        if (ag1Var != null) {
            ag1Var.setPadding(0, 0, 0, i10);
        }
        uf1 uf1Var = eg1Var.n;
        if (uf1Var != null) {
            uf1Var.a.setTranslationY((-eg1Var.e1) - eg1Var.d1);
        }
        eg1Var.h.setTranslationY(((-eg1Var.X0) - eg1Var.e1) - eg1Var.d1);
        eg1Var.B0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(float f7, float f10, int i10, View view) {
        return eg1.W(this.a, view, f7);
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        eg1 eg1Var = this.a;
        eg1Var.U0.i(eg1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return eg1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void q(float f7) {
    }
}
