package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jb0 extends org.telegram.ui.Cells.n9 {
    public final /* synthetic */ sb0 B0;

    public jb0(sb0 sb0Var) {
        this.B0 = sb0Var;
        this.h0 = sb0Var.W.C;
    }

    @Override // org.telegram.ui.Cells.z9
    public final boolean A(MessageObject messageObject) {
        sb0 sb0Var = this.B0;
        return sb0Var.a == 0 && !sb0Var.W.d.isSecret && y();
    }

    @Override // org.telegram.ui.Cells.z9
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.nn nnVar;
        MessageObject messageObject2;
        sb0 sb0Var = this.B0;
        jb0 jb0Var = sb0Var.e;
        int i12 = jb0Var.v - jb0Var.u;
        yb0 yb0Var = sb0Var.W;
        if (i12 > MessagesController.getInstance(yb0Var.w).quoteLengthMax) {
            sb0Var.f();
            return;
        }
        MessagePreviewParams messagePreviewParams = yb0Var.d;
        messagePreviewParams.quoteStart = jb0Var.u;
        messagePreviewParams.quoteEnd = jb0Var.v;
        MessageObject c3 = sb0Var.c(messageObject);
        if (c3 != null && ((nnVar = yb0Var.d.quote) == null || (messageObject2 = nnVar.a) == null || messageObject2.getId() != c3.getId())) {
            yb0Var.d.quote = org.telegram.ui.nn.b(i10, i11, c3);
        }
        yb0Var.b();
        yb0Var.a(true);
    }

    @Override // org.telegram.ui.Cells.z9
    public final boolean b() {
        MessageObject c3;
        TLRPC.Message message;
        sb0 sb0Var = this.B0;
        if (sb0Var.a == 0 && (c3 = sb0Var.c(null)) != null && (message = c3.messageOwner) != null && message.rich_message != null) {
            return false;
        }
        MessagePreviewParams messagePreviewParams = sb0Var.W.d;
        return messagePreviewParams == null || !messagePreviewParams.noforwards;
    }

    @Override // org.telegram.ui.Cells.z9
    public final boolean e() {
        MessageObject c3;
        TLRPC.Message message;
        sb0 sb0Var = this.B0;
        int i10 = sb0Var.a;
        if (i10 != 0 || sb0Var.W.d.isSecret) {
            return false;
        }
        return i10 != 0 || (c3 = sb0Var.c(null)) == null || (message = c3.messageOwner) == null || message.rich_message == null;
    }

    @Override // org.telegram.ui.Cells.z9
    public final org.telegram.ui.ActionBar.g6 r() {
        return this.h0;
    }

    @Override // org.telegram.ui.Cells.n9, org.telegram.ui.Cells.z9
    public final void x() {
        super.x();
        kb0 kb0Var = this.B0.f;
        if (kb0Var != null) {
            kb0Var.invalidate();
        }
    }
}
