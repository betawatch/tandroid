package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hi implements org.telegram.ui.Components.a8 {
    public final /* synthetic */ un a;

    public hi(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Components.a8
    public final void Y0(int i10, int i11) {
        un unVar = this.a;
        unVar.getMessagesController().F4(i10, unVar.j6);
        if (unVar.q8 == null && unVar.p8 == null) {
            return;
        }
        unVar.c8();
        UndoView undoView = unVar.M3;
        if (undoView == null) {
            return;
        }
        long j10 = unVar.j6;
        TLRPC.User user = unVar.f;
        TLRPC.UserFull userFull = unVar.q8;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : unVar.p8.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.a8
    public final void dismiss() {
        org.telegram.ui.ActionBar.k1 k1Var = this.a.e9;
        if (k1Var != null) {
            k1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.a8
    public final /* synthetic */ void t1() {
    }
}
