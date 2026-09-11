package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.ui.Components.p8 {
    public final /* synthetic */ co a;

    public fi(co coVar) {
        this.a = coVar;
    }

    @Override // org.telegram.ui.Components.p8
    public final void Y0(int i10, int i11) {
        co coVar = this.a;
        coVar.getMessagesController().setDialogHistoryTTL(coVar.T5, i10);
        if (coVar.a8 == null && coVar.Z7 == null) {
            return;
        }
        coVar.Q7();
        UndoView undoView = coVar.y3;
        if (undoView == null) {
            return;
        }
        long j3 = coVar.T5;
        TLRPC.User user = coVar.f;
        TLRPC.UserFull userFull = coVar.a8;
        undoView.k(j3, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : coVar.Z7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.p8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a.Q8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.p8
    public final /* synthetic */ void l1() {
    }
}
