package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class oo implements r8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m1[] a;
    public final /* synthetic */ ro b;

    public oo(ro roVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.b = roVar;
        this.a = m1VarArr;
    }

    @Override // org.telegram.ui.Components.r8
    public final void X0(int i10, int i11) {
        org.telegram.ui.fo foVar = this.b.G;
        if (foVar == null) {
            return;
        }
        foVar.getMessagesController().setDialogHistoryTTL(foVar.a(), i10);
        TLRPC.ChatFull chatFull = foVar.Z7;
        TLRPC.UserFull userFull = foVar.a8;
        if (userFull == null && chatFull == null) {
            return;
        }
        foVar.T7();
        UndoView undoView = foVar.y3;
        if (undoView != null) {
            undoView.k(foVar.a(), i11, foVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.r8
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.r8
    public final /* synthetic */ void k1() {
    }
}
