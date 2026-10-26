package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zb0 extends org.telegram.ui.Cells.t9 {
    public final /* synthetic */ hc0 w0;

    public zb0(hc0 hc0Var) {
        this.w0 = hc0Var;
        this.g0 = hc0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.fa
    public final void I(MessageObject messageObject, int i10, int i11) {
        org.telegram.ui.kn knVar;
        MessageObject messageObject2;
        hc0 hc0Var = this.w0;
        zb0 zb0Var = hc0Var.e;
        int i12 = zb0Var.v - zb0Var.u;
        nc0 nc0Var = hc0Var.c0;
        if (i12 > MessagesController.getInstance(nc0Var.w).quoteLengthMax) {
            hc0Var.g();
            return;
        }
        MessagePreviewParams messagePreviewParams = nc0Var.d;
        messagePreviewParams.quoteStart = zb0Var.u;
        messagePreviewParams.quoteEnd = zb0Var.v;
        MessageObject c10 = hc0Var.c(messageObject);
        if (c10 != null && ((knVar = nc0Var.d.quote) == null || knVar.m || (messageObject2 = knVar.a) == null || messageObject2.getId() != c10.getId())) {
            nc0Var.d.quote = org.telegram.ui.kn.c(c10, i10, i11);
        }
        nc0Var.b();
        nc0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        hc0 hc0Var = this.w0;
        if (hc0Var.a == 0 && (c10 = hc0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = hc0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        hc0 hc0Var = this.w0;
        int i10 = hc0Var.a;
        if (i10 != 0 || hc0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = hc0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null || RichQuote.canQuote(hc0Var.c(null));
    }

    @Override // org.telegram.ui.Cells.fa
    public final org.telegram.ui.ActionBar.u6 q() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.t9, org.telegram.ui.Cells.fa
    public final void w() {
        super.w();
        ac0 ac0Var = this.w0.f;
        if (ac0Var != null) {
            ac0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean z(MessageObject messageObject) {
        hc0 hc0Var = this.w0;
        return hc0Var.a == 0 && !hc0Var.c0.d.isSecret && x();
    }
}
