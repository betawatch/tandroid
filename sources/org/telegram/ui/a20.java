package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a20 extends q4 {
    public final /* synthetic */ c40 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = c40Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.of0
    public final void c() {
        c40 c40Var = this.U;
        org.telegram.messenger.c cVar = c40Var.k1;
        b20 b20Var = c40Var.i1;
        long dialogId = b20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(dialogId));
            b20Var.H(null, org.telegram.messenger.hc.m(cVar.a, 0, a22), org.telegram.messenger.hc.m(cVar.a, 1, a22), false);
        }
    }
}
