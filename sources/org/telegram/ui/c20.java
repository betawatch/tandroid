package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c20 extends q4 {
    public final /* synthetic */ e40 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = e40Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.pf0
    public final void c() {
        e40 e40Var = this.U;
        org.telegram.messenger.c cVar = e40Var.k1;
        d20 d20Var = e40Var.i1;
        long dialogId = d20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(dialogId));
            d20Var.H(null, org.telegram.messenger.hc.m(cVar.a, 0, a22), org.telegram.messenger.hc.m(cVar.a, 1, a22), false);
        }
    }
}
