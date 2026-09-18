package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gb0 extends org.telegram.ui.Cells.r9 {
    public final /* synthetic */ pb0 B0;

    public gb0(pb0 pb0Var) {
        this.B0 = pb0Var;
        this.h0 = pb0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean A(MessageObject messageObject) {
        pb0 pb0Var = this.B0;
        return pb0Var.a == 0 && !pb0Var.c0.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.da
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.rn rnVar;
        MessageObject messageObject2;
        pb0 pb0Var = this.B0;
        gb0 gb0Var = pb0Var.e;
        int i12 = gb0Var.v - gb0Var.u;
        vb0 vb0Var = pb0Var.c0;
        if (i12 > MessagesController.getInstance(vb0Var.w).quoteLengthMax) {
            pb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = vb0Var.d;
        messagePreviewParams.quoteStart = gb0Var.u;
        messagePreviewParams.quoteEnd = gb0Var.v;
        MessageObject c10 = pb0Var.c(messageObject);
        if (c10 != null && ((rnVar = vb0Var.d.quote) == null || (messageObject2 = rnVar.a) == null || messageObject2.getId() != c10.getId())) {
            vb0Var.d.quote = org.telegram.ui.rn.b(i10, i11, c10);
        }
        vb0Var.b();
        vb0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        pb0 pb0Var = this.B0;
        if (pb0Var.a == 0 && (c10 = pb0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = pb0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        pb0 pb0Var = this.B0;
        int i10 = pb0Var.a;
        if (i10 != 0 || pb0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = pb0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.da
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.r9, org.telegram.ui.Cells.da
    public final void x() {
        super.x();
        hb0 hb0Var = this.B0.f;
        if (hb0Var != null) {
            hb0Var.invalidate();
        }
    }
}
