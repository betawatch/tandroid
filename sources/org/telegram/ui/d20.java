package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d20 extends q4 {
    public final /* synthetic */ f40 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = f40Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.of0
    public final void c() {
        f40 f40Var = this.U;
        org.telegram.messenger.c cVar = f40Var.n1;
        e20 e20Var = f40Var.l1;
        long dialogId = e20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.a).a2(Long.valueOf(dialogId));
            e20Var.H(null, org.telegram.messenger.hc.m(cVar.a, 0, a22), org.telegram.messenger.hc.m(cVar.a, 1, a22), false);
        }
    }
}
