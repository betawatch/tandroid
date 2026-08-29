package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class un implements l8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o1[] a;
    public final /* synthetic */ xn b;

    public un(xn xnVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.b = xnVar;
        this.a = o1VarArr;
    }

    @Override // org.telegram.ui.Components.l8
    public final void T0(int i10, int i11) {
        org.telegram.ui.tn tnVar = this.b.C;
        if (tnVar == null) {
            return;
        }
        tnVar.getMessagesController().setDialogHistoryTTL(tnVar.a(), i10);
        TLRPC.ChatFull chatFull = tnVar.V7;
        TLRPC.UserFull userFull = tnVar.W7;
        if (userFull == null && chatFull == null) {
            return;
        }
        tnVar.Q7();
        UndoView undoView = tnVar.u3;
        if (undoView != null) {
            undoView.k(tnVar.a(), i11, tnVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.l8
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.l8
    public final /* synthetic */ void e1() {
    }
}
