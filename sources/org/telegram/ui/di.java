package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class di implements org.telegram.ui.Components.n8 {
    public final /* synthetic */ yn a;

    public di(yn ynVar) {
        this.a = ynVar;
    }

    @Override // org.telegram.ui.Components.n8
    public final void U0(int i10, int i11) {
        yn ynVar = this.a;
        ynVar.getMessagesController().setDialogHistoryTTL(ynVar.R5, i10);
        if (ynVar.Y7 == null && ynVar.X7 == null) {
            return;
        }
        ynVar.Q7();
        UndoView undoView = ynVar.w3;
        if (undoView == null) {
            return;
        }
        long j3 = ynVar.R5;
        TLRPC.User user = ynVar.f;
        TLRPC.UserFull userFull = ynVar.Y7;
        undoView.k(j3, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : ynVar.X7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.n8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a.O8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final /* synthetic */ void l1() {
    }
}
