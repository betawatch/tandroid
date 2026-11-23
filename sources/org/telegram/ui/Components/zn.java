package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zn implements j8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g1[] a;
    public final /* synthetic */ co b;

    public zn(co coVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.b = coVar;
        this.a = g1VarArr;
    }

    @Override // org.telegram.ui.Components.j8
    public final void R0(int i7, int i10) {
        org.telegram.ui.bn bnVar = this.b.H;
        if (bnVar == null) {
            return;
        }
        bnVar.getMessagesController().T4(i7, bnVar.a());
        TLRPC.ChatFull chatFull = bnVar.r8;
        TLRPC.UserFull userFull = bnVar.s8;
        if (userFull == null && chatFull == null) {
            return;
        }
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView != null) {
            undoView.k(bnVar.a(), i10, bnVar.j(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.j8
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.j8
    public final /* synthetic */ void d1() {
    }
}
