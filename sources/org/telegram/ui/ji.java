package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ji implements org.telegram.ui.Components.r8 {
    public final /* synthetic */ fo a;

    public ji(fo foVar) {
        this.a = foVar;
    }

    @Override // org.telegram.ui.Components.r8
    public final void X0(int i10, int i11) {
        fo foVar = this.a;
        foVar.getMessagesController().setDialogHistoryTTL(foVar.T5, i10);
        if (foVar.a8 == null && foVar.Z7 == null) {
            return;
        }
        foVar.T7();
        UndoView undoView = foVar.y3;
        if (undoView == null) {
            return;
        }
        long j10 = foVar.T5;
        TLRPC.User user = foVar.f;
        TLRPC.UserFull userFull = foVar.a8;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : foVar.Z7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.r8
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.a.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.r8
    public final /* synthetic */ void l1() {
    }
}
