package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gi implements org.telegram.ui.Components.l8 {
    public final /* synthetic */ bo a;

    public gi(bo boVar) {
        this.a = boVar;
    }

    @Override // org.telegram.ui.Components.l8
    public final void U0(int i10, int i11) {
        bo boVar = this.a;
        boVar.getMessagesController().setDialogHistoryTTL(boVar.T5, i10);
        if (boVar.a8 == null && boVar.Z7 == null) {
            return;
        }
        boVar.Q7();
        UndoView undoView = boVar.y3;
        if (undoView == null) {
            return;
        }
        long j3 = boVar.T5;
        TLRPC.User user = boVar.f;
        TLRPC.UserFull userFull = boVar.a8;
        undoView.k(j3, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : boVar.Z7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.l8
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a.Q8;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.l8
    public final /* synthetic */ void j1() {
    }
}
