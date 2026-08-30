package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hb0 extends org.telegram.ui.Cells.n9 {
    public final /* synthetic */ qb0 B0;

    public hb0(qb0 qb0Var) {
        this.B0 = qb0Var;
        this.h0 = qb0Var.W.C;
    }

    @Override // org.telegram.ui.Cells.z9
    public final boolean A(MessageObject messageObject) {
        qb0 qb0Var = this.B0;
        return qb0Var.a == 0 && !qb0Var.W.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.z9
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.nn nnVar;
        MessageObject messageObject2;
        qb0 qb0Var = this.B0;
        hb0 hb0Var = qb0Var.e;
        int i12 = hb0Var.v - hb0Var.u;
        wb0 wb0Var = qb0Var.W;
        if (i12 > MessagesController.getInstance(wb0Var.w).quoteLengthMax) {
            qb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = wb0Var.d;
        messagePreviewParams.quoteStart = hb0Var.u;
        messagePreviewParams.quoteEnd = hb0Var.v;
        MessageObject c3 = qb0Var.c(messageObject);
        if (c3 != null && ((nnVar = wb0Var.d.quote) == null || (messageObject2 = nnVar.a) == null || messageObject2.getId() != c3.getId())) {
            wb0Var.d.quote = org.telegram.ui.nn.b(i10, i11, c3);
        }
        wb0Var.b();
        wb0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.z9
    public final boolean b() {
        MessageObject c3;
        TLRPC.Message message;
        qb0 qb0Var = this.B0;
        if (qb0Var.a == 0 && (c3 = qb0Var.c(null)) != null && (message = c3.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = qb0Var.W.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.z9
    public final boolean e() {
        MessageObject c3;
        TLRPC.Message message;
        qb0 qb0Var = this.B0;
        int i10 = qb0Var.a;
        if (i10 != 0 || qb0Var.W.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c3 = qb0Var.c(null)) == null || (message = c3.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.z9
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.n9, org.telegram.ui.Cells.z9
    public final void x() {
        super.x();
        ib0 ib0Var = this.B0.f;
        if (ib0Var != null) {
            ib0Var.invalidate();
        }
    }
}
