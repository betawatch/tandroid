package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ci implements org.telegram.ui.Components.n8 {
    public final /* synthetic */ wn a;

    public ci(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.Components.n8
    public final void U0(int i10, int i11) {
        wn wnVar = this.a;
        wnVar.getMessagesController().setDialogHistoryTTL(wnVar.T5, i10);
        if (wnVar.a8 == null && wnVar.Z7 == null) {
            return;
        }
        wnVar.Q7();
        UndoView undoView = wnVar.y3;
        if (undoView == null) {
            return;
        }
        long j3 = wnVar.T5;
        TLRPC.User user = wnVar.f;
        TLRPC.UserFull userFull = wnVar.a8;
        undoView.k(j3, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : wnVar.Z7.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.n8
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.a.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final /* synthetic */ void j1() {
    }
}
