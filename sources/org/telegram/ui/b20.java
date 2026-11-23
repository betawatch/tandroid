package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b20 extends q4 {
    public final /* synthetic */ e40 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = e40Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.cg0
    public final void c() {
        e40 e40Var = this.V;
        org.telegram.messenger.c cVar = e40Var.o1;
        c20 c20Var = e40Var.m1;
        long dialogId = c20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(cVar.a).c2(Long.valueOf(dialogId));
            c20Var.H(null, org.telegram.messenger.fc.m(cVar.a, 0, c22), org.telegram.messenger.fc.m(cVar.a, 1, c22), false);
        }
    }
}
