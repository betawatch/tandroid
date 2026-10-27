package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ac0 extends org.telegram.ui.Cells.t9 {
    public final /* synthetic */ ic0 w0;

    public ac0(ic0 ic0Var) {
        this.w0 = ic0Var;
        this.g0 = ic0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.fa
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.mn mnVar;
        MessageObject messageObject2;
        ic0 ic0Var = this.w0;
        ac0 ac0Var = ic0Var.e;
        int i12 = ac0Var.v - ac0Var.u;
        oc0 oc0Var = ic0Var.c0;
        if (i12 > MessagesController.getInstance(oc0Var.w).quoteLengthMax) {
            ic0Var.g();
            return;
        }
        MessagePreviewParams messagePreviewParams = oc0Var.d;
        messagePreviewParams.quoteStart = ac0Var.u;
        messagePreviewParams.quoteEnd = ac0Var.v;
        MessageObject c10 = ic0Var.c(messageObject);
        if (c10 != null && ((mnVar = oc0Var.d.quote) == null || mnVar.m || (messageObject2 = mnVar.a) == null || messageObject2.getId() != c10.getId())) {
            oc0Var.d.quote = org.telegram.ui.mn.c(c10, i10, i11);
        }
        oc0Var.b();
        oc0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        ic0 ic0Var = this.w0;
        if (ic0Var.a == 0 && (c10 = ic0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = ic0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        ic0 ic0Var = this.w0;
        int i10 = ic0Var.a;
        if (i10 != 0 || ic0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = ic0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null || RichQuote.canQuote(ic0Var.c(null));
    }

    @Override // org.telegram.ui.Cells.fa
    public final org.telegram.ui.ActionBar.u6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.t9, org.telegram.ui.Cells.fa
    public final void w() {
        super.w();
        bc0 bc0Var = this.w0.f;
        if (bc0Var != null) {
            bc0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean z(MessageObject messageObject) {
        ic0 ic0Var = this.w0;
        return ic0Var.a == 0 && !ic0Var.c0.d.isSecret && x();
    }
}
