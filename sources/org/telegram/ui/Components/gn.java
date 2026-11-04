package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gn implements d8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f1[] a;
    public final /* synthetic */ jn b;

    public gn(jn jnVar, org.telegram.ui.ActionBar.f1[] f1VarArr) {
        this.b = jnVar;
        this.a = f1VarArr;
    }

    @Override // org.telegram.ui.Components.d8
    public final void W0(int i3, int i10) {
        org.telegram.ui.wm wmVar = this.b.H;
        if (wmVar == null) {
            return;
        }
        wmVar.getMessagesController().I4(i3, wmVar.a());
        TLRPC.ChatFull chatFull = wmVar.q8;
        TLRPC.UserFull userFull = wmVar.r8;
        if (userFull == null && chatFull == null) {
            return;
        }
        wmVar.f8();
        UndoView undoView = wmVar.N3;
        if (undoView != null) {
            undoView.k(wmVar.a(), i10, wmVar.j(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.d8
    public final void dismiss() {
        org.telegram.ui.ActionBar.f1 f1Var = this.a[0];
        if (f1Var != null) {
            f1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.d8
    public final /* synthetic */ void g1() {
    }
}
