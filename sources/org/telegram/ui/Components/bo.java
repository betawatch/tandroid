package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bo implements n8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n1[] a;
    public final /* synthetic */ fo b;

    public bo(fo foVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.b = foVar;
        this.a = n1VarArr;
    }

    @Override // org.telegram.ui.Components.n8
    public final void U0(int i10, int i11) {
        org.telegram.ui.xn xnVar = this.b.G;
        if (xnVar == null) {
            return;
        }
        xnVar.getMessagesController().setDialogHistoryTTL(xnVar.a(), i10);
        TLRPC.ChatFull chatFull = xnVar.Z7;
        TLRPC.UserFull userFull = xnVar.a8;
        if (userFull == null && chatFull == null) {
            return;
        }
        xnVar.Q7();
        UndoView undoView = xnVar.y3;
        if (undoView != null) {
            undoView.k(xnVar.a(), i11, xnVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final /* synthetic */ void j1() {
    }
}
