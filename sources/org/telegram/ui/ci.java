package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ci implements org.telegram.ui.Components.n8 {
    public final /* synthetic */ xn a;

    public ci(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.ui.Components.n8
    public final void U0(int i10, int i11) {
        xn xnVar = this.a;
        xnVar.getMessagesController().setDialogHistoryTTL(xnVar.T5, i10);
        if (xnVar.a8 == null && xnVar.Z7 == null) {
            return;
        }
        xnVar.Q7();
        UndoView undoView = xnVar.y3;
        if (undoView == null) {
            return;
        }
        long j3 = xnVar.T5;
        TLRPC.User user = xnVar.f;
        TLRPC.UserFull userFull = xnVar.a8;
        undoView.k(j3, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : xnVar.Z7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.n8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a.Q8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final /* synthetic */ void j1() {
    }
}
