package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class oh implements org.telegram.ui.Components.e8 {
    public final /* synthetic */ cn a;

    public oh(cn cnVar) {
        this.a = cnVar;
    }

    @Override // org.telegram.ui.Components.e8
    public final void X0(int i7, int i10) {
        cn cnVar = this.a;
        cnVar.getMessagesController().I4(i7, cnVar.j6);
        if (cnVar.q8 == null && cnVar.p8 == null) {
            return;
        }
        cnVar.g8();
        UndoView undoView = cnVar.M3;
        if (undoView == null) {
            return;
        }
        long j3 = cnVar.j6;
        TLRPC.User user = cnVar.f;
        TLRPC.UserFull userFull = cnVar.q8;
        undoView.k(j3, i10, user, Integer.valueOf(userFull != null ? userFull.ttl_period : cnVar.p8.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.e8
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.a.e9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.e8
    public final /* synthetic */ void i1() {
    }
}
