package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wn implements i8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g1[] a;
    public final /* synthetic */ zn b;

    public wn(zn znVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.b = znVar;
        this.a = g1VarArr;
    }

    @Override // org.telegram.ui.Components.i8
    public final void B0(int i7, int i10) {
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

    @Override // org.telegram.ui.Components.i8
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.i8
    public final /* synthetic */ void X0() {
    }
}
