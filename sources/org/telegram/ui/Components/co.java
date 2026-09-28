package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class co implements n8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m1[] a;
    public final /* synthetic */ go b;

    public co(go goVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.b = goVar;
        this.a = m1VarArr;
    }

    @Override // org.telegram.ui.Components.n8
    public final void U0(int i10, int i11) {
        org.telegram.ui.wn wnVar = this.b.G;
        if (wnVar == null) {
            return;
        }
        wnVar.getMessagesController().setDialogHistoryTTL(wnVar.a(), i10);
        TLRPC.ChatFull chatFull = wnVar.Z7;
        TLRPC.UserFull userFull = wnVar.a8;
        if (userFull == null && chatFull == null) {
            return;
        }
        wnVar.Q7();
        UndoView undoView = wnVar.y3;
        if (undoView != null) {
            undoView.k(wnVar.a(), i11, wnVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final /* synthetic */ void j1() {
    }
}
