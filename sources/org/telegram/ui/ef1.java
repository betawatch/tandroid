package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.pl0 {
    public final /* synthetic */ fg1 a;

    public /* synthetic */ ef1(fg1 fg1Var) {
        this.a = fg1Var;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i10 = l1Var.a.f(519).d;
        fg1 fg1Var = this.a;
        fg1Var.e1 = i10;
        bg1 bg1Var = fg1Var.r0;
        if (bg1Var != null) {
            bg1Var.setPadding(0, 0, 0, i10);
        }
        vf1 vf1Var = fg1Var.n;
        if (vf1Var != null) {
            vf1Var.a.setTranslationY((-fg1Var.e1) - fg1Var.d1);
        }
        fg1Var.h.setTranslationY(((-fg1Var.X0) - fg1Var.e1) - fg1Var.d1);
        fg1Var.B0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.pl0
    public boolean c(float f7, float f10, int i10, View view) {
        return fg1.W(this.a, view, f7);
    }

    @Override // wh.c
    public void f(boolean z10, boolean z11) {
        fg1 fg1Var = this.a;
        fg1Var.U0.i(fg1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return fg1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.pl0
    public /* synthetic */ void q(float f7) {
    }
}
