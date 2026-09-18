package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ao implements n8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n1[] a;
    public final /* synthetic */ eo b;

    public ao(eo eoVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.b = eoVar;
        this.a = n1VarArr;
    }

    @Override // org.telegram.ui.Components.n8
    public final void U0(int i10, int i11) {
        org.telegram.ui.zn znVar = this.b.G;
        if (znVar == null) {
            return;
        }
        znVar.getMessagesController().setDialogHistoryTTL(znVar.a(), i10);
        TLRPC.ChatFull chatFull = znVar.Z7;
        TLRPC.UserFull userFull = znVar.a8;
        if (userFull == null && chatFull == null) {
            return;
        }
        znVar.Q7();
        UndoView undoView = znVar.y3;
        if (undoView != null) {
            undoView.k(znVar.a(), i11, znVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
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
