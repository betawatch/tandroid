package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class hn implements f8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g1[] a;
    public final /* synthetic */ kn b;

    public hn(kn knVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.b = knVar;
        this.a = g1VarArr;
    }

    @Override // org.telegram.ui.Components.f8
    public final void X0(int i7, int i10) {
        org.telegram.ui.an anVar = this.b.G;
        if (anVar == null) {
            return;
        }
        anVar.getMessagesController().I4(i7, anVar.a());
        TLRPC.ChatFull chatFull = anVar.p8;
        TLRPC.UserFull userFull = anVar.q8;
        if (userFull == null && chatFull == null) {
            return;
        }
        anVar.f8();
        UndoView undoView = anVar.M3;
        if (undoView != null) {
            undoView.k(anVar.a(), i10, anVar.j(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.f8
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.f8
    public final /* synthetic */ void i1() {
    }
}
