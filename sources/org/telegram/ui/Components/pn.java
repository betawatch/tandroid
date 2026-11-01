package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pn implements a8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k1[] a;
    public final /* synthetic */ sn b;

    public pn(sn snVar, org.telegram.ui.ActionBar.k1[] k1VarArr) {
        this.b = snVar;
        this.a = k1VarArr;
    }

    @Override // org.telegram.ui.Components.a8
    public final void Y0(int i10, int i11) {
        org.telegram.ui.un unVar = this.b.G;
        if (unVar == null) {
            return;
        }
        unVar.getMessagesController().F4(i10, unVar.a());
        TLRPC.ChatFull chatFull = unVar.p8;
        TLRPC.UserFull userFull = unVar.q8;
        if (userFull == null && chatFull == null) {
            return;
        }
        unVar.c8();
        UndoView undoView = unVar.M3;
        if (undoView != null) {
            undoView.k(unVar.a(), i11, unVar.j(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.a8
    public final void dismiss() {
        org.telegram.ui.ActionBar.k1 k1Var = this.a[0];
        if (k1Var != null) {
            k1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.a8
    public final /* synthetic */ void t1() {
    }
}
