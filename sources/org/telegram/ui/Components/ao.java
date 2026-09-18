package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ao implements l8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o1[] a;
    public final /* synthetic */ eo b;

    public ao(eo eoVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.b = eoVar;
        this.a = o1VarArr;
    }

    @Override // org.telegram.ui.Components.l8
    public final void U0(int i10, int i11) {
        org.telegram.ui.bo boVar = this.b.G;
        if (boVar == null) {
            return;
        }
        boVar.getMessagesController().setDialogHistoryTTL(boVar.a(), i10);
        TLRPC.ChatFull chatFull = boVar.Z7;
        TLRPC.UserFull userFull = boVar.a8;
        if (userFull == null && chatFull == null) {
            return;
        }
        boVar.Q7();
        UndoView undoView = boVar.y3;
        if (undoView != null) {
            undoView.k(boVar.a(), i11, boVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.l8
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.l8
    public final /* synthetic */ void j1() {
    }
}
