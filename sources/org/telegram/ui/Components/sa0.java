package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sa0 extends org.telegram.ui.Cells.k9 {
    public final /* synthetic */ ab0 B0;

    public sa0(ab0 ab0Var) {
        this.B0 = ab0Var;
        this.h0 = ab0Var.V.B;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean A(MessageObject messageObject) {
        ab0 ab0Var = this.B0;
        return ab0Var.a == 0 && !ab0Var.V.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.w9
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.hn hnVar;
        MessageObject messageObject2;
        ab0 ab0Var = this.B0;
        sa0 sa0Var = ab0Var.e;
        int i12 = sa0Var.v - sa0Var.u;
        gb0 gb0Var = ab0Var.V;
        if (i12 > MessagesController.getInstance(gb0Var.w).quoteLengthMax) {
            ab0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = gb0Var.d;
        messagePreviewParams.quoteStart = sa0Var.u;
        messagePreviewParams.quoteEnd = sa0Var.v;
        MessageObject c10 = ab0Var.c(messageObject);
        if (c10 != null && ((hnVar = gb0Var.d.quote) == null || (messageObject2 = hnVar.a) == null || messageObject2.getId() != c10.getId())) {
            gb0Var.d.quote = org.telegram.ui.hn.b(i10, i11, c10);
        }
        gb0Var.b();
        gb0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        ab0 ab0Var = this.B0;
        if (ab0Var.a == 0 && (c10 = ab0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = ab0Var.V.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        ab0 ab0Var = this.B0;
        int i10 = ab0Var.a;
        if (i10 != 0 || ab0Var.V.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = ab0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.w9
    public final org.telegram.ui.ActionBar.c6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.k9, org.telegram.ui.Cells.w9
    public final void x() {
        super.x();
        ta0 ta0Var = this.B0.f;
        if (ta0Var != null) {
            ta0Var.invalidate();
        }
    }
}
