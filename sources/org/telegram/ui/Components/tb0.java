package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class tb0 extends org.telegram.ui.Cells.r9 {
    public final /* synthetic */ cc0 B0;

    public tb0(cc0 cc0Var) {
        this.B0 = cc0Var;
        this.h0 = cc0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean A(MessageObject messageObject) {
        cc0 cc0Var = this.B0;
        return cc0Var.a == 0 && !cc0Var.c0.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.da
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.on onVar;
        MessageObject messageObject2;
        cc0 cc0Var = this.B0;
        tb0 tb0Var = cc0Var.e;
        int i12 = tb0Var.v - tb0Var.u;
        ic0 ic0Var = cc0Var.c0;
        if (i12 > MessagesController.getInstance(ic0Var.w).quoteLengthMax) {
            cc0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = ic0Var.d;
        messagePreviewParams.quoteStart = tb0Var.u;
        messagePreviewParams.quoteEnd = tb0Var.v;
        MessageObject c10 = cc0Var.c(messageObject);
        if (c10 != null && ((onVar = ic0Var.d.quote) == null || (messageObject2 = onVar.a) == null || messageObject2.getId() != c10.getId())) {
            ic0Var.d.quote = org.telegram.ui.on.b(i10, i11, c10);
        }
        ic0Var.b();
        ic0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        cc0 cc0Var = this.B0;
        if (cc0Var.a == 0 && (c10 = cc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = cc0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        cc0 cc0Var = this.B0;
        int i10 = cc0Var.a;
        if (i10 != 0 || cc0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = cc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.da
    public final org.telegram.ui.ActionBar.d6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.r9, org.telegram.ui.Cells.da
    public final void x() {
        super.x();
        ub0 ub0Var = this.B0.f;
        if (ub0Var != null) {
            ub0Var.invalidate();
        }
    }
}
