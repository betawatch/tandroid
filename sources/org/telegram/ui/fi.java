package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.ui.Components.p8 {
    public final /* synthetic */ zn a;

    public fi(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.Components.p8
    public final void Q0(int i10, int i11) {
        zn znVar = this.a;
        znVar.getMessagesController().setDialogHistoryTTL(znVar.T5, i10);
        if (znVar.a8 == null && znVar.Z7 == null) {
            return;
        }
        znVar.T7();
        UndoView undoView = znVar.y3;
        if (undoView == null) {
            return;
        }
        long j3 = znVar.T5;
        TLRPC.User user = znVar.f;
        TLRPC.UserFull userFull = znVar.a8;
        undoView.k(j3, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : znVar.Z7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.p8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a.Q8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.p8
    public final /* synthetic */ void h1() {
    }
}
