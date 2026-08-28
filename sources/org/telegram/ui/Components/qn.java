package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qn implements g8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o1[] a;
    public final /* synthetic */ tn b;

    public qn(tn tnVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.b = tnVar;
        this.a = o1VarArr;
    }

    @Override // org.telegram.ui.Components.g8
    public final void V0(int i9, int i10) {
        org.telegram.ui.qn qnVar = this.b.C;
        if (qnVar == null) {
            return;
        }
        qnVar.getMessagesController().setDialogHistoryTTL(qnVar.a(), i9);
        TLRPC.ChatFull chatFull = qnVar.V7;
        TLRPC.UserFull userFull = qnVar.W7;
        if (userFull == null && chatFull == null) {
            return;
        }
        qnVar.Q7();
        UndoView undoView = qnVar.u3;
        if (undoView != null) {
            undoView.k(qnVar.a(), i10, qnVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.g8
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.g8
    public final /* synthetic */ void h1() {
    }
}
