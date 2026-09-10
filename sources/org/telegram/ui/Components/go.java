package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class go implements n8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p1[] a;
    public final /* synthetic */ jo b;

    public go(jo joVar, org.telegram.ui.ActionBar.p1[] p1VarArr) {
        this.b = joVar;
        this.a = p1VarArr;
    }

    @Override // org.telegram.ui.Components.n8
    public final void U0(int i10, int i11) {
        org.telegram.ui.eo eoVar = this.b.G;
        if (eoVar == null) {
            return;
        }
        eoVar.getMessagesController().setDialogHistoryTTL(eoVar.a(), i10);
        TLRPC.ChatFull chatFull = eoVar.Z7;
        TLRPC.UserFull userFull = eoVar.a8;
        if (userFull == null && chatFull == null) {
            return;
        }
        eoVar.Q7();
        UndoView undoView = eoVar.y3;
        if (undoView != null) {
            undoView.k(eoVar.a(), i11, eoVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final void dismiss() {
        org.telegram.ui.ActionBar.p1 p1Var = this.a[0];
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final /* synthetic */ void i1() {
    }
}
