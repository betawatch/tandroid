package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf1 implements xh.c, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.dm0 {
    public final /* synthetic */ lg1 a;

    public /* synthetic */ kf1(lg1 lg1Var) {
        this.a = lg1Var;
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.a.f(519).d;
        lg1 lg1Var = this.a;
        lg1Var.e1 = i10;
        hg1 hg1Var = lg1Var.r0;
        if (hg1Var != null) {
            hg1Var.setPadding(0, 0, 0, i10);
        }
        bg1 bg1Var = lg1Var.n;
        if (bg1Var != null) {
            bg1Var.a.setTranslationY((-lg1Var.e1) - lg1Var.d1);
        }
        lg1Var.h.setTranslationY(((-lg1Var.X0) - lg1Var.e1) - lg1Var.d1);
        lg1Var.B0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean d(float f7, float f10, int i10, View view) {
        return lg1.W(this.a, view, f7);
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        lg1 lg1Var = this.a;
        lg1Var.U0.i(lg1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return lg1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public /* synthetic */ void q(float f7) {
    }
}
