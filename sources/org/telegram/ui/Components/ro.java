package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ro implements p8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n1[] a;
    public final /* synthetic */ uo b;

    public ro(uo uoVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.b = uoVar;
        this.a = n1VarArr;
    }

    @Override // org.telegram.ui.Components.p8
    public final void Q0(int i10, int i11) {
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
        znVar.T7();
        UndoView undoView = znVar.y3;
        if (undoView != null) {
            undoView.k(znVar.a(), i11, znVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
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
    public final /* synthetic */ void h1() {
    }
}
