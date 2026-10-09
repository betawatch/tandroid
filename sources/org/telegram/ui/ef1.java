package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.hm0 {
    public final /* synthetic */ fg1 a;

    public /* synthetic */ ef1(fg1 fg1Var) {
        this.a = fg1Var;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = k1Var.a.f(519).d;
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
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.hm0
    public boolean c(float f7, float f10, int i10, View view) {
        return fg1.W(this.a, view, f7);
    }

    @Override // wh.c
    public void g(boolean z10, boolean z11) {
        fg1 fg1Var = this.a;
        fg1Var.U0.i(fg1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return fg1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.hm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.hm0
    public /* synthetic */ void q(float f7) {
    }
}
