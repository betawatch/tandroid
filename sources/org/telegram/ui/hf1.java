package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf1 implements vh.d, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.ml0 {
    public final /* synthetic */ ig1 a;

    public /* synthetic */ hf1(ig1 ig1Var) {
        this.a = ig1Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.a.f(519).d;
        ig1 ig1Var = this.a;
        ig1Var.e1 = i10;
        eg1 eg1Var = ig1Var.r0;
        if (eg1Var != null) {
            eg1Var.setPadding(0, 0, 0, i10);
        }
        yf1 yf1Var = ig1Var.n;
        if (yf1Var != null) {
            yf1Var.a.setTranslationY((-ig1Var.e1) - ig1Var.d1);
        }
        ig1Var.h.setTranslationY(((-ig1Var.X0) - ig1Var.e1) - ig1Var.d1);
        ig1Var.B0();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean c(float f7, float f10, int i10, View view) {
        return ig1.W(this.a, view, f7);
    }

    @Override // vh.d
    public void g(boolean z10, boolean z11) {
        ig1 ig1Var = this.a;
        ig1Var.U0.i(ig1Var.R0.c(), z10, z11);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return ig1.U(this.a, tL_error);
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ml0
    public /* synthetic */ void p(float f7) {
    }
}
