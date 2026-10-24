package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dc0 extends org.telegram.ui.Cells.p9 {
    public final /* synthetic */ lc0 w0;

    public dc0(lc0 lc0Var) {
        this.w0 = lc0Var;
        this.g0 = lc0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.ba
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.in inVar;
        MessageObject messageObject2;
        lc0 lc0Var = this.w0;
        dc0 dc0Var = lc0Var.e;
        int i12 = dc0Var.v - dc0Var.u;
        rc0 rc0Var = lc0Var.c0;
        if (i12 > MessagesController.getInstance(rc0Var.w).quoteLengthMax) {
            lc0Var.g();
            return;
        }
        MessagePreviewParams messagePreviewParams = rc0Var.d;
        messagePreviewParams.quoteStart = dc0Var.u;
        messagePreviewParams.quoteEnd = dc0Var.v;
        MessageObject c10 = lc0Var.c(messageObject);
        if (c10 != null && ((inVar = rc0Var.d.quote) == null || inVar.m || (messageObject2 = inVar.a) == null || messageObject2.getId() != c10.getId())) {
            rc0Var.d.quote = org.telegram.ui.in.c(c10, i10, i11);
        }
        rc0Var.b();
        rc0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        lc0 lc0Var = this.w0;
        if (lc0Var.a == 0 && (c10 = lc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = lc0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        lc0 lc0Var = this.w0;
        int i10 = lc0Var.a;
        if (i10 != 0 || lc0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = lc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null || RichQuote.canQuote(lc0Var.c(null));
    }

    @Override // org.telegram.ui.Cells.ba
    public final org.telegram.ui.ActionBar.g6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.p9, org.telegram.ui.Cells.ba
    public final void w() {
        super.w();
        ec0 ec0Var = this.w0.f;
        if (ec0Var != null) {
            ec0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean z(MessageObject messageObject) {
        lc0 lc0Var = this.w0;
        return lc0Var.a == 0 && !lc0Var.c0.d.isSecret && x();
    }
}
