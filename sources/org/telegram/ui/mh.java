package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mh implements org.telegram.ui.Components.f8 {
    public final /* synthetic */ an a;

    public mh(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Components.f8
    public final void X0(int i7, int i10) {
        an anVar = this.a;
        anVar.getMessagesController().I4(i7, anVar.j6);
        if (anVar.q8 == null && anVar.p8 == null) {
            return;
        }
        anVar.f8();
        UndoView undoView = anVar.M3;
        if (undoView == null) {
            return;
        }
        long j3 = anVar.j6;
        TLRPC.User user = anVar.f;
        TLRPC.UserFull userFull = anVar.q8;
        undoView.k(j3, i10, user, Integer.valueOf(userFull != null ? userFull.ttl_period : anVar.p8.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.f8
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.a.e9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.f8
    public final /* synthetic */ void i1() {
    }
}
