package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class on implements f8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n1[] a;
    public final /* synthetic */ rn b;

    public on(rn rnVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.b = rnVar;
        this.a = n1VarArr;
    }

    @Override // org.telegram.ui.Components.f8
    public final void V0(int i10, int i11) {
        org.telegram.ui.rn rnVar = this.b.C;
        if (rnVar == null) {
            return;
        }
        rnVar.getMessagesController().setDialogHistoryTTL(rnVar.a(), i10);
        TLRPC.ChatFull chatFull = rnVar.V7;
        TLRPC.UserFull userFull = rnVar.W7;
        if (userFull == null && chatFull == null) {
            return;
        }
        rnVar.Q7();
        UndoView undoView = rnVar.u3;
        if (undoView != null) {
            undoView.k(rnVar.a(), i11, rnVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.f8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.f8
    public final /* synthetic */ void j1() {
    }
}
