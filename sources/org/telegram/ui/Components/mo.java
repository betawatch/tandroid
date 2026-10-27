package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        org.telegram.ui.wn wnVar = this.b.G;
        if (wnVar == null) {
            return;
        }
        wnVar.getMessagesController().setDialogHistoryTTL(wnVar.a(), i10);
        TLRPC.ChatFull chatFull = wnVar.p8;
        TLRPC.UserFull userFull = wnVar.q8;
        if (userFull == null && chatFull == null) {
            return;
        }
        wnVar.Z7();
        UndoView undoView = wnVar.K3;
        if (undoView != null) {
            undoView.k(wnVar.a(), i11, wnVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
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
