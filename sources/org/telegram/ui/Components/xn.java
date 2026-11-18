package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xn implements k8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.h1[] a;
    public final /* synthetic */ ao b;

    public xn(ao aoVar, org.telegram.ui.ActionBar.h1[] h1VarArr) {
        this.b = aoVar;
        this.a = h1VarArr;
    }

    @Override // org.telegram.ui.Components.k8
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

    @Override // org.telegram.ui.Components.k8
    public final void dismiss() {
        org.telegram.ui.ActionBar.h1 h1Var = this.a[0];
        if (h1Var != null) {
            h1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.k8
    public final /* synthetic */ void d1() {
    }
}
