package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class lo implements o8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m1[] a;
    public final /* synthetic */ oo b;

    public lo(oo ooVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.b = ooVar;
        this.a = m1VarArr;
    }

    @Override // org.telegram.ui.Components.o8
    public final void H0(int i10, int i11) {
        org.telegram.ui.qn qnVar = this.b.G;
        if (qnVar == null) {
            return;
        }
        qnVar.getMessagesController().setDialogHistoryTTL(qnVar.a(), i10);
        TLRPC.ChatFull chatFull = qnVar.Z7;
        TLRPC.UserFull userFull = qnVar.a8;
        if (userFull == null && chatFull == null) {
            return;
        }
        qnVar.T7();
        UndoView undoView = qnVar.y3;
        if (undoView != null) {
            undoView.k(qnVar.a(), i11, qnVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.o8
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.o8
    public final /* synthetic */ void Y0() {
    }
}
