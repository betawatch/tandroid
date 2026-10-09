package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hc0 extends org.telegram.ui.Cells.p9 {
    public final /* synthetic */ pc0 w0;

    public hc0(pc0 pc0Var) {
        this.w0 = pc0Var;
        this.g0 = pc0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.ba
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        pc0 pc0Var = this.w0;
        hc0 hc0Var = pc0Var.e;
        int i12 = hc0Var.v - hc0Var.u;
        vc0 vc0Var = pc0Var.c0;
        if (i12 > MessagesController.getInstance(vc0Var.w).quoteLengthMax) {
            pc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = vc0Var.d;
        messagePreviewParams.quoteStart = hc0Var.u;
        messagePreviewParams.quoteEnd = hc0Var.v;
        MessageObject c10 = pc0Var.c(messageObject);
        if (c10 != null && ((pnVar = vc0Var.d.quote) == null || (messageObject2 = pnVar.a) == null || messageObject2.getId() != c10.getId())) {
            vc0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c10);
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
    public final org.telegram.ui.ActionBar.e6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.p9, org.telegram.ui.Cells.ba
    public final void w() {
        super.w();
        ic0 ic0Var = this.w0.f;
        if (ic0Var != null) {
            ic0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean z(MessageObject messageObject) {
        pc0 pc0Var = this.w0;
        return pc0Var.a == 0 && !pc0Var.c0.d.isSecret && x();
    }
}
