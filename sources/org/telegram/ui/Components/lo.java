package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class lo implements o8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m1[] a;
    public final /* synthetic */ oo b;

    public lo(oo ooVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.b = ooVar;
        this.a = m1VarArr;
    }

    @Override // org.telegram.ui.Components.o8
    public final void H0(int i10, int i11) {
        org.telegram.ui.sn snVar = this.b.G;
        if (snVar == null) {
            return;
        }
        snVar.getMessagesController().setDialogHistoryTTL(snVar.a(), i10);
        TLRPC.ChatFull chatFull = snVar.l8;
        TLRPC.UserFull userFull = snVar.m8;
        if (userFull == null && chatFull == null) {
            return;
        }
        snVar.T7();
        UndoView undoView = snVar.K3;
        if (undoView != null) {
            undoView.k(snVar.a(), i11, snVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.o8
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.o8
    public final /* synthetic */ void Y0() {
    }
}
