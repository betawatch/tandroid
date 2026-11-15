package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pn implements c8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g1[] a;
    public final /* synthetic */ sn b;

    public pn(sn snVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.b = snVar;
        this.a = g1VarArr;
    }

    @Override // org.telegram.ui.Components.c8
    public final void R0(int i7, int i10) {
        org.telegram.ui.an anVar = this.b.H;
        if (anVar == null) {
            return;
        }
        anVar.getMessagesController().J4(i7, anVar.a());
        TLRPC.ChatFull chatFull = anVar.q8;
        TLRPC.UserFull userFull = anVar.r8;
        if (userFull == null && chatFull == null) {
            return;
        }
        anVar.h8();
        UndoView undoView = anVar.N3;
        if (undoView != null) {
            undoView.k(anVar.a(), i10, anVar.j(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.c8
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.c8
    public final /* synthetic */ void g1() {
    }
}
