package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ob0 extends org.telegram.ui.Cells.s9 {
    public final /* synthetic */ xb0 B0;

    public ob0(xb0 xb0Var) {
        this.B0 = xb0Var;
        this.h0 = xb0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean A(MessageObject messageObject) {
        xb0 xb0Var = this.B0;
        return xb0Var.a == 0 && !xb0Var.c0.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.ea
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        xb0 xb0Var = this.B0;
        ob0 ob0Var = xb0Var.e;
        int i12 = ob0Var.v - ob0Var.u;
        dc0 dc0Var = xb0Var.c0;
        if (i12 > MessagesController.getInstance(dc0Var.w).quoteLengthMax) {
            xb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = dc0Var.d;
        messagePreviewParams.quoteStart = ob0Var.u;
        messagePreviewParams.quoteEnd = ob0Var.v;
        MessageObject c10 = xb0Var.c(messageObject);
        if (c10 != null && ((pnVar = dc0Var.d.quote) == null || (messageObject2 = pnVar.a) == null || messageObject2.getId() != c10.getId())) {
            dc0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c10);
        }
        dc0Var.b();
        dc0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        xb0 xb0Var = this.B0;
        if (xb0Var.a == 0 && (c10 = xb0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = xb0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        xb0 xb0Var = this.B0;
        int i10 = xb0Var.a;
        if (i10 != 0 || xb0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = xb0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.ea
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.s9, org.telegram.ui.Cells.ea
    public final void x() {
        super.x();
        pb0 pb0Var = this.B0.f;
        if (pb0Var != null) {
            pb0Var.invalidate();
        }
    }
}
