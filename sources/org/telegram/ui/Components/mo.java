package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mo implements q8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o1[] a;
    public final /* synthetic */ po b;

    public mo(po poVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.b = poVar;
        this.a = o1VarArr;
    }

    @Override // org.telegram.ui.Components.q8
    public final void T0(int i10, int i11) {
        org.telegram.ui.un unVar = this.b.G;
        if (unVar == null) {
            return;
        }
        unVar.getMessagesController().setDialogHistoryTTL(unVar.a(), i10);
        TLRPC.ChatFull chatFull = unVar.l8;
        TLRPC.UserFull userFull = unVar.m8;
        if (userFull == null && chatFull == null) {
            return;
        }
        unVar.X7();
        UndoView undoView = unVar.K3;
        if (undoView != null) {
            undoView.k(unVar.a(), i11, unVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.q8
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.q8
    public final /* synthetic */ void e1() {
    }
}
