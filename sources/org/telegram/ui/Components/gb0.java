package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gb0 extends org.telegram.ui.Cells.s9 {
    public final /* synthetic */ ob0 B0;

    public gb0(ob0 ob0Var) {
        this.B0 = ob0Var;
        this.h0 = ob0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean A(MessageObject messageObject) {
        ob0 ob0Var = this.B0;
        return ob0Var.a == 0 && !ob0Var.c0.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.ea
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.nn nnVar;
        MessageObject messageObject2;
        ob0 ob0Var = this.B0;
        gb0 gb0Var = ob0Var.e;
        int i12 = gb0Var.v - gb0Var.u;
        ub0 ub0Var = ob0Var.c0;
        if (i12 > MessagesController.getInstance(ub0Var.w).quoteLengthMax) {
            ob0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = ub0Var.d;
        messagePreviewParams.quoteStart = gb0Var.u;
        messagePreviewParams.quoteEnd = gb0Var.v;
        MessageObject c10 = ob0Var.c(messageObject);
        if (c10 != null && ((nnVar = ub0Var.d.quote) == null || (messageObject2 = nnVar.a) == null || messageObject2.getId() != c10.getId())) {
            ub0Var.d.quote = org.telegram.ui.nn.b(i10, i11, c10);
        }
        ub0Var.b();
        ub0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        ob0 ob0Var = this.B0;
        if (ob0Var.a == 0 && (c10 = ob0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = ob0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        ob0 ob0Var = this.B0;
        int i10 = ob0Var.a;
        if (i10 != 0 || ob0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = ob0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.ea
    public final org.telegram.ui.ActionBar.d6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.s9, org.telegram.ui.Cells.ea
    public final void x() {
        super.x();
        hb0 hb0Var = this.B0.f;
        if (hb0Var != null) {
            hb0Var.invalidate();
        }
    }
}
