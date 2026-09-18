package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.nl0 {
    public final /* synthetic */ dg1 a;

    public /* synthetic */ cf1(dg1 dg1Var) {
        this.a = dg1Var;
    }

    @Override // r0.n
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        int i10 = m1Var.a.f(519).d;
        dg1 dg1Var = this.a;
        dg1Var.e1 = i10;
        zf1 zf1Var = dg1Var.r0;
        if (zf1Var != null) {
            zf1Var.setPadding(0, 0, 0, i10);
        }
        tf1 tf1Var = dg1Var.n;
        if (tf1Var != null) {
            tf1Var.a.setTranslationY((-dg1Var.e1) - dg1Var.d1);
        }
        dg1Var.h.setTranslationY(((-dg1Var.X0) - dg1Var.e1) - dg1Var.d1);
        dg1Var.B0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.nl0
    public boolean c(float f7, float f10, int i10, View view) {
        return dg1.W(this.a, view, f7);
    }

    @Override // wh.c
    public void h(boolean z10, boolean z11) {
        dg1 dg1Var = this.a;
        dg1Var.U0.i(dg1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return dg1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q(float f7) {
    }
}
