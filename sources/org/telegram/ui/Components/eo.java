package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class eo implements n8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n1[] a;
    public final /* synthetic */ ho b;

    public eo(ho hoVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.b = hoVar;
        this.a = n1VarArr;
    }

    @Override // org.telegram.ui.Components.n8
    public final void U0(int i10, int i11) {
        org.telegram.ui.yn ynVar = this.b.G;
        if (ynVar == null) {
            return;
        }
        ynVar.getMessagesController().setDialogHistoryTTL(ynVar.a(), i10);
        TLRPC.ChatFull chatFull = ynVar.X7;
        TLRPC.UserFull userFull = ynVar.Y7;
        if (userFull == null && chatFull == null) {
            return;
        }
        ynVar.Q7();
        UndoView undoView = ynVar.w3;
        if (undoView != null) {
            undoView.k(ynVar.a(), i11, ynVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.n8
    public final /* synthetic */ void l1() {
    }
}
