package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ai implements org.telegram.ui.Components.q8 {
    public final /* synthetic */ wn a;

    public ai(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.Components.q8
    public final void T0(int i10, int i11) {
        wn wnVar = this.a;
        wnVar.getMessagesController().setDialogHistoryTTL(wnVar.j6, i10);
        if (wnVar.q8 == null && wnVar.p8 == null) {
            return;
        }
        wnVar.Z7();
        UndoView undoView = wnVar.K3;
        if (undoView == null) {
            return;
        }
        long j10 = wnVar.j6;
        TLRPC.User user = wnVar.f;
        TLRPC.UserFull userFull = wnVar.q8;
        undoView.k(j10, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : wnVar.p8.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.q8
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a.g9;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.q8
    public final /* synthetic */ void e1() {
    }
}
