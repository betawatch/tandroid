package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mh implements org.telegram.ui.Components.j8 {
    public final /* synthetic */ bn a;

    public mh(bn bnVar) {
        this.a = bnVar;
    }

    @Override // org.telegram.ui.Components.j8
    public final void R0(int i7, int i10) {
        bn bnVar = this.a;
        bnVar.getMessagesController().T4(i7, bnVar.l6);
        if (bnVar.s8 == null && bnVar.r8 == null) {
            return;
        }
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView == null) {
            return;
        }
        long j3 = bnVar.l6;
        TLRPC.User user = bnVar.f;
        TLRPC.UserFull userFull = bnVar.s8;
        undoView.k(j3, i10, user, Integer.valueOf(userFull != null ? userFull.ttl_period : bnVar.r8.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.j8
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.a.g9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.j8
    public final /* synthetic */ void d1() {
    }
}
