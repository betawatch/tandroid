package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yn implements g8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p1[] a;
    public final /* synthetic */ bo b;

    public yn(bo boVar, org.telegram.ui.ActionBar.p1[] p1VarArr) {
        this.b = boVar;
        this.a = p1VarArr;
    }

    @Override // org.telegram.ui.Components.g8
    public final void Q0(int i10, int i11) {
        org.telegram.ui.xn xnVar = this.b.D;
        if (xnVar == null) {
            return;
        }
        xnVar.getMessagesController().setDialogHistoryTTL(xnVar.a(), i10);
        TLRPC.ChatFull chatFull = xnVar.W7;
        TLRPC.UserFull userFull = xnVar.X7;
        if (userFull == null && chatFull == null) {
            return;
        }
        xnVar.Q7();
        UndoView undoView = xnVar.v3;
        if (undoView != null) {
            undoView.k(xnVar.a(), i11, xnVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.g8
    public final void dismiss() {
        org.telegram.ui.ActionBar.p1 p1Var = this.a[0];
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.g8
    public final /* synthetic */ void h1() {
    }
}
