package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bi implements org.telegram.ui.Components.g8 {
    public final /* synthetic */ xn a;

    public bi(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.ui.Components.g8
    public final void Q0(int i10, int i11) {
        xn xnVar = this.a;
        xnVar.getMessagesController().setDialogHistoryTTL(xnVar.Q5, i10);
        if (xnVar.X7 == null && xnVar.W7 == null) {
            return;
        }
        xnVar.Q7();
        UndoView undoView = xnVar.v3;
        if (undoView == null) {
            return;
        }
        long j10 = xnVar.Q5;
        TLRPC.User user = xnVar.f;
        TLRPC.UserFull userFull = xnVar.X7;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : xnVar.W7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.g8
    public final void dismiss() {
        org.telegram.ui.ActionBar.p1 p1Var = this.a.N8;
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.g8
    public final /* synthetic */ void h1() {
    }
}
