package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.ui.Components.m8 {
    public final /* synthetic */ zn a;

    public fi(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.Components.m8
    public final void U0(int i10, int i11) {
        zn znVar = this.a;
        znVar.getMessagesController().setDialogHistoryTTL(znVar.T5, i10);
        if (znVar.a8 == null && znVar.Z7 == null) {
            return;
        }
        znVar.Q7();
        UndoView undoView = znVar.y3;
        if (undoView == null) {
            return;
        }
        long j3 = znVar.T5;
        TLRPC.User user = znVar.f;
        TLRPC.UserFull userFull = znVar.a8;
        undoView.k(j3, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : znVar.Z7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.m8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a.Q8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.m8
    public final /* synthetic */ void j1() {
    }
}
