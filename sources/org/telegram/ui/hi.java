package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hi implements org.telegram.ui.Components.n8 {
    public final /* synthetic */ eo a;

    public hi(eo eoVar) {
        this.a = eoVar;
    }

    @Override // org.telegram.ui.Components.n8
    public final void U0(int i10, int i11) {
        eo eoVar = this.a;
        eoVar.getMessagesController().setDialogHistoryTTL(eoVar.T5, i10);
        if (eoVar.a8 == null && eoVar.Z7 == null) {
            return;
        }
        eoVar.Q7();
        UndoView undoView = eoVar.y3;
        if (undoView == null) {
            return;
        }
        long j3 = eoVar.T5;
        TLRPC.User user = eoVar.f;
        TLRPC.UserFull userFull = eoVar.a8;
        undoView.k(j3, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : eoVar.Z7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.n8
    public final void dismiss() {
        org.telegram.ui.ActionBar.p1 p1Var = this.a.Q8;
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final /* synthetic */ void i1() {
    }
}
