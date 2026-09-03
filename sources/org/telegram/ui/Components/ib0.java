package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ib0 extends org.telegram.ui.Cells.m9 {
    public final /* synthetic */ rb0 B0;

    public ib0(rb0 rb0Var) {
        this.B0 = rb0Var;
        this.h0 = rb0Var.W.C;
    }

    @Override // org.telegram.ui.Cells.y9
    public final boolean A(MessageObject messageObject) {
        rb0 rb0Var = this.B0;
        return rb0Var.a == 0 && !rb0Var.W.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.y9
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        rb0 rb0Var = this.B0;
        ib0 ib0Var = rb0Var.e;
        int i12 = ib0Var.v - ib0Var.u;
        xb0 xb0Var = rb0Var.W;
        if (i12 > MessagesController.getInstance(xb0Var.w).quoteLengthMax) {
            rb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = xb0Var.d;
        messagePreviewParams.quoteStart = ib0Var.u;
        messagePreviewParams.quoteEnd = ib0Var.v;
        MessageObject c3 = rb0Var.c(messageObject);
        if (c3 != null && ((pnVar = xb0Var.d.quote) == null || (messageObject2 = pnVar.a) == null || messageObject2.getId() != c3.getId())) {
            xb0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c3);
        }
        xb0Var.b();
        xb0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.y9
    public final boolean b() {
        MessageObject c3;
        TLRPC.Message message;
        rb0 rb0Var = this.B0;
        if (rb0Var.a == 0 && (c3 = rb0Var.c(null)) != null && (message = c3.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = rb0Var.W.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.y9
    public final boolean e() {
        MessageObject c3;
        TLRPC.Message message;
        rb0 rb0Var = this.B0;
        int i10 = rb0Var.a;
        if (i10 != 0 || rb0Var.W.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c3 = rb0Var.c(null)) == null || (message = c3.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.y9
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.m9, org.telegram.ui.Cells.y9
    public final void x() {
        super.x();
        jb0 jb0Var = this.B0.f;
        if (jb0Var != null) {
            jb0Var.invalidate();
        }
    }
}
