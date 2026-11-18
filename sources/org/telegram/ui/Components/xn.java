package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
