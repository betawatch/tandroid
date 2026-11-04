package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ih implements org.telegram.ui.Components.d8 {
    public final /* synthetic */ wm a;

    public ih(wm wmVar) {
        this.a = wmVar;
    }

    @Override // org.telegram.ui.Components.d8
    public final void W0(int i3, int i10) {
        wm wmVar = this.a;
        wmVar.getMessagesController().I4(i3, wmVar.k6);
        if (wmVar.r8 == null && wmVar.q8 == null) {
            return;
        }
        wmVar.f8();
        UndoView undoView = wmVar.N3;
        if (undoView == null) {
            return;
        }
        long j10 = wmVar.k6;
        TLRPC.User user = wmVar.f;
        TLRPC.UserFull userFull = wmVar.r8;
        undoView.k(j10, i10, user, Integer.valueOf(userFull != null ? userFull.ttl_period : wmVar.q8.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.d8
    public final void dismiss() {
        org.telegram.ui.ActionBar.f1 f1Var = this.a.f9;
        if (f1Var != null) {
            f1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.d8
    public final /* synthetic */ void g1() {
    }
}
