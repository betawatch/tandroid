package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gc0 extends org.telegram.ui.Cells.p9 {
    public final /* synthetic */ pc0 w0;

    public gc0(pc0 pc0Var) {
        this.w0 = pc0Var;
        this.g0 = pc0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.ba
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.un unVar;
        MessageObject messageObject2;
        pc0 pc0Var = this.w0;
        gc0 gc0Var = pc0Var.e;
        int i12 = gc0Var.v - gc0Var.u;
        vc0 vc0Var = pc0Var.c0;
        if (i12 > MessagesController.getInstance(vc0Var.w).quoteLengthMax) {
            pc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        messagePreviewParams.quoteStart = gc0Var.u;
        messagePreviewParams.quoteEnd = gc0Var.v;
        MessageObject c10 = pc0Var.c(messageObject);
        if (c10 != null && ((unVar = vc0Var.d.quote) == null || (messageObject2 = unVar.a) == null || messageObject2.getId() != c10.getId())) {
            vc0Var.d.quote = org.telegram.ui.un.b(i10, i11, c10);
        }
        vc0Var.b();
        vc0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        pc0 pc0Var = this.w0;
        if (pc0Var.a == 0 && (c10 = pc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = pc0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        pc0 pc0Var = this.w0;
        int i10 = pc0Var.a;
        if (i10 != 0 || pc0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = pc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final org.telegram.ui.ActionBar.c6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.p9, org.telegram.ui.Cells.ba
    public final void w() {
        super.w();
        hc0 hc0Var = this.w0.f;
        if (hc0Var != null) {
            hc0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean z(MessageObject messageObject) {
        pc0 pc0Var = this.w0;
        return pc0Var.a == 0 && !pc0Var.c0.d.isSecret && x();
    }
}
