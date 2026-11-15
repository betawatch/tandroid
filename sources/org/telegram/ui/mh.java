package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mh implements org.telegram.ui.Components.c8 {
    public final /* synthetic */ an a;

    public mh(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Components.c8
    public final void R0(int i7, int i10) {
        an anVar = this.a;
        anVar.getMessagesController().J4(i7, anVar.k6);
        if (anVar.r8 == null && anVar.q8 == null) {
            return;
        }
        anVar.h8();
        UndoView undoView = anVar.N3;
        if (undoView == null) {
            return;
        }
        long j3 = anVar.k6;
        TLRPC.User user = anVar.f;
        TLRPC.UserFull userFull = anVar.r8;
        undoView.k(j3, i10, user, Integer.valueOf(userFull != null ? userFull.ttl_period : anVar.q8.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.c8
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.a.f9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.c8
    public final /* synthetic */ void g1() {
    }
}
