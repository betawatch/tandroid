package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xn implements g8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p1[] a;
    public final /* synthetic */ ao b;

    public xn(ao aoVar, org.telegram.ui.ActionBar.p1[] p1VarArr) {
        this.b = aoVar;
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
