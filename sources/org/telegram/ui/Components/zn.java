package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zn implements p8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n1[] a;
    public final /* synthetic */ co b;

    public zn(co coVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.b = coVar;
        this.a = n1VarArr;
    }

    @Override // org.telegram.ui.Components.p8
    public final void Y0(int i10, int i11) {
        org.telegram.ui.co coVar = this.b.G;
        if (coVar == null) {
            return;
        }
        coVar.getMessagesController().setDialogHistoryTTL(coVar.a(), i10);
        TLRPC.ChatFull chatFull = coVar.Z7;
        TLRPC.UserFull userFull = coVar.a8;
        if (userFull == null && chatFull == null) {
            return;
        }
        coVar.Q7();
        UndoView undoView = coVar.y3;
        if (undoView != null) {
            undoView.k(coVar.a(), i11, coVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.p8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.p8
    public final /* synthetic */ void l1() {
    }
}
