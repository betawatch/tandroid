package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ao implements l8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n1[] a;
    public final /* synthetic */ eo b;

    public ao(eo eoVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.b = eoVar;
        this.a = n1VarArr;
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
        org.telegram.ui.ActionBar.n1 n1Var = this.a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.l8
    public final /* synthetic */ void j1() {
    }
}
