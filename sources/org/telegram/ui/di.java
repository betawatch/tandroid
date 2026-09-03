package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class di implements org.telegram.ui.Components.g8 {
    public final /* synthetic */ zn a;

    public di(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.Components.g8
    public final void Q0(int i10, int i11) {
        zn znVar = this.a;
        znVar.getMessagesController().setDialogHistoryTTL(znVar.Q5, i10);
        if (znVar.X7 == null && znVar.W7 == null) {
            return;
        }
        znVar.Q7();
        UndoView undoView = znVar.v3;
        if (undoView == null) {
            return;
        }
        long j10 = znVar.Q5;
        TLRPC.User user = znVar.f;
        TLRPC.UserFull userFull = znVar.X7;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : znVar.W7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.g8
    public final void dismiss() {
        org.telegram.ui.ActionBar.p1 p1Var = this.a.N8;
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.g8
    public final /* synthetic */ void i1() {
    }
}
