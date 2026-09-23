package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Components.ub0 {
    public final /* synthetic */ xn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(xn xnVar, Context context, xn xnVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.qb0 qb0Var, int i11, boolean z10) {
        super(context, xnVar2, cVar, messagePreviewParams, user, chat, i10, qb0Var, i11, z10);
        this.H = xnVar;
    }

    @Override // org.telegram.ui.Components.ub0
    public final void b() {
        MessageObject messageObject;
        nn nnVar;
        xn xnVar = this.H;
        nn nnVar2 = xnVar.l5;
        if (nnVar2 == null || (messageObject = nnVar2.a) == null || !((nnVar = xnVar.f5.quote) == null || nnVar.a == null || messageObject.getId() == xnVar.f5.quote.a.getId())) {
            xnVar.l5 = xnVar.f5.quote;
        }
    }

    @Override // org.telegram.ui.Components.ub0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        xn xnVar = this.H;
        MessagePreviewParams messagePreviewParams = xnVar.f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                xnVar.m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = xnVar.f5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    xnVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e = org.telegram.messenger.z0.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = xnVar.f5.replyMessage) == null || messages.messages.isEmpty() || xnVar.f5.quote != null) ? false : true;
            e.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(xnVar.f5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != xnVar.a() && peerDialogId != xnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e.putLong("reply_to_author", peerDialogId);
                }
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = xnVar.f5.forwardMessages;
            e.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e.putBoolean("canSelectTopics", true);
            ry ryVar = new ry(e);
            ryVar.C2 = xnVar;
            xnVar.presentFragment(ryVar);
        }
    }
}
