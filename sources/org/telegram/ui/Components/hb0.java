package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class hb0 extends org.telegram.ui.Cells.r9 {
    public final /* synthetic */ qb0 B0;

    public hb0(qb0 qb0Var) {
        this.B0 = qb0Var;
        this.h0 = qb0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean A(MessageObject messageObject) {
        qb0 qb0Var = this.B0;
        return qb0Var.a == 0 && !qb0Var.c0.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.da
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.sn snVar;
        MessageObject messageObject2;
        qb0 qb0Var = this.B0;
        hb0 hb0Var = qb0Var.e;
        int i12 = hb0Var.v - hb0Var.u;
        wb0 wb0Var = qb0Var.c0;
        if (i12 > MessagesController.getInstance(wb0Var.w).quoteLengthMax) {
            qb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = wb0Var.d;
        messagePreviewParams.quoteStart = hb0Var.u;
        messagePreviewParams.quoteEnd = hb0Var.v;
        MessageObject c10 = qb0Var.c(messageObject);
        if (c10 != null && ((snVar = wb0Var.d.quote) == null || (messageObject2 = snVar.a) == null || messageObject2.getId() != c10.getId())) {
            wb0Var.d.quote = org.telegram.ui.sn.b(i10, i11, c10);
        }
        wb0Var.b();
        wb0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        qb0 qb0Var = this.B0;
        if (qb0Var.a == 0 && (c10 = qb0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = qb0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        qb0 qb0Var = this.B0;
        int i10 = qb0Var.a;
        if (i10 != 0 || qb0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = qb0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.da
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.r9, org.telegram.ui.Cells.da
    public final void x() {
        super.x();
        ib0 ib0Var = this.B0.f;
        if (ib0Var != null) {
            ib0Var.invalidate();
        }
    }
}
