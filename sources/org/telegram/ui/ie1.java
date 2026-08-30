package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie1 implements jh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.ll0 {
    public final /* synthetic */ kf1 a;

    public /* synthetic */ ie1(kf1 kf1Var) {
        this.a = kf1Var;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        int i10 = m1Var.a.f(519).d;
        kf1 kf1Var = this.a;
        kf1Var.b1 = i10;
        gf1 gf1Var = kf1Var.o0;
        if (gf1Var != null) {
            gf1Var.setPadding(0, 0, 0, i10);
        }
        af1 af1Var = kf1Var.n;
        if (af1Var != null) {
            af1Var.a.setTranslationY((-kf1Var.b1) - kf1Var.a1);
        }
        kf1Var.h.setTranslationY(((-kf1Var.U0) - kf1Var.b1) - kf1Var.a1);
        kf1Var.B0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean c(float f10, float f11, int i10, View view) {
        return kf1.W(this.a, view, f10);
    }

    @Override // jh.d
    public void g(boolean z4, boolean z10) {
        kf1 kf1Var = this.a;
        kf1Var.R0.i(kf1Var.O0.c(), z4, z10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return kf1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void p(float f10) {
    }
}
