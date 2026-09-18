package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class pb0 extends org.telegram.ui.Cells.r9 {
    public final /* synthetic */ yb0 B0;

    public pb0(yb0 yb0Var) {
        this.B0 = yb0Var;
        this.h0 = yb0Var.c0.F;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean A(MessageObject messageObject) {
        yb0 yb0Var = this.B0;
        return yb0Var.a == 0 && !yb0Var.c0.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.da
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.pn pnVar;
        MessageObject messageObject2;
        yb0 yb0Var = this.B0;
        pb0 pb0Var = yb0Var.e;
        int i12 = pb0Var.v - pb0Var.u;
        ec0 ec0Var = yb0Var.c0;
        if (i12 > MessagesController.getInstance(ec0Var.w).quoteLengthMax) {
            yb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = ec0Var.d;
        messagePreviewParams.quoteStart = pb0Var.u;
        messagePreviewParams.quoteEnd = pb0Var.v;
        MessageObject c10 = yb0Var.c(messageObject);
        if (c10 != null && ((pnVar = ec0Var.d.quote) == null || (messageObject2 = pnVar.a) == null || messageObject2.getId() != c10.getId())) {
            ec0Var.d.quote = org.telegram.ui.pn.b(i10, i11, c10);
        }
        ec0Var.b();
        ec0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean b() {
        MessageObject c10;
        TLRPC.Message message;
        yb0 yb0Var = this.B0;
        if (yb0Var.a == 0 && (c10 = yb0Var.c(null)) != null && (message = c10.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = yb0Var.c0.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean e() {
        MessageObject c10;
        TLRPC.Message message;
        yb0 yb0Var = this.B0;
        int i10 = yb0Var.a;
        if (i10 != 0 || yb0Var.c0.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c10 = yb0Var.c(null)) == null || (message = c10.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.da
    public final org.telegram.ui.ActionBar.e6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.r9, org.telegram.ui.Cells.da
    public final void x() {
        super.x();
        qb0 qb0Var = this.B0.f;
        if (qb0Var != null) {
            qb0Var.invalidate();
        }
    }
}
