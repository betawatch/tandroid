package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rb0 extends org.telegram.ui.Cells.s9 {
    public final /* synthetic */ ac0 B0;

    public rb0(ac0 ac0Var) {
        this.B0 = ac0Var;
        this.h0 = ac0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean A(MessageObject messageObject) {
        ac0 ac0Var = this.B0;
        return ac0Var.a == 0 && !ac0Var.c0.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.ea
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        ac0 ac0Var = this.B0;
        rb0 rb0Var = ac0Var.e;
        int i12 = rb0Var.v - rb0Var.u;
        gc0 gc0Var = ac0Var.c0;
        if (i12 > MessagesController.getInstance(gc0Var.w).quoteLengthMax) {
            ac0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = gc0Var.d;
        messagePreviewParams.quoteStart = rb0Var.u;
        messagePreviewParams.quoteEnd = rb0Var.v;
        MessageObject c10 = ac0Var.c(messageObject);
        if (c10 != null && ((pnVar = gc0Var.d.quote) == null || (messageObject2 = pnVar.a) == null || messageObject2.getId() != c10.getId())) {
            gc0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c10);
        }
        gc0Var.b();
        gc0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        ac0 ac0Var = this.B0;
        if (ac0Var.a == 0 && (c10 = ac0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = ac0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        ac0 ac0Var = this.B0;
        int i10 = ac0Var.a;
        if (i10 != 0 || ac0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = ac0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.ea
    public final org.telegram.ui.ActionBar.f6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.s9, org.telegram.ui.Cells.ea
    public final void x() {
        super.x();
        sb0 sb0Var = this.B0.f;
        if (sb0Var != null) {
            sb0Var.invalidate();
        }
    }
}
