package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vn implements g8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p1[] a;
    public final /* synthetic */ yn b;

    public vn(yn ynVar, org.telegram.ui.ActionBar.p1[] p1VarArr) {
        this.b = ynVar;
        this.a = p1VarArr;
    }

    @Override // org.telegram.ui.Components.g8
    public final void Q0(int i10, int i11) {
        org.telegram.ui.zn znVar = this.b.D;
        if (znVar == null) {
            return;
        }
        znVar.getMessagesController().setDialogHistoryTTL(znVar.a(), i10);
        TLRPC.ChatFull chatFull = znVar.W7;
        TLRPC.UserFull userFull = znVar.X7;
        if (userFull == null && chatFull == null) {
            return;
        }
        znVar.Q7();
        UndoView undoView = znVar.v3;
        if (undoView != null) {
            undoView.k(znVar.a(), i11, znVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.g8
    public final void dismiss() {
        org.telegram.ui.ActionBar.p1 p1Var = this.a[0];
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.g8
    public final /* synthetic */ void i1() {
    }
}
