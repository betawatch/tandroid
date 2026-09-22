package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.cl0 {
    public final /* synthetic */ eg1 a;

    public /* synthetic */ df1(eg1 eg1Var) {
        this.a = eg1Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
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
    public boolean c(float f7, float f10, int i10, View view) {
        return eg1.W(this.a, view, f7);
    }

    @Override // wh.c
    public void h(boolean z10, boolean z11) {
        eg1 eg1Var = this.a;
        eg1Var.U0.i(eg1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return eg1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void q(float f7) {
    }
}
