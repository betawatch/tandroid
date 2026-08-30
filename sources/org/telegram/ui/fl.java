package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Components.wb0 {
    public final /* synthetic */ xn E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(xn xnVar, Context context, xn xnVar2, ng.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.sb0 sb0Var, int i11, boolean z4) {
        super(context, xnVar2, aVar, messagePreviewParams, user, chat, i10, sb0Var, i11, z4);
        this.E = xnVar;
    }

    @Override // org.telegram.ui.Components.wb0
    public final void b() {
        MessageObject messageObject;
        nn nnVar;
        xn xnVar = this.E;
        nn nnVar2 = xnVar.i5;
        if (nnVar2 == null || (messageObject = nnVar2.a) == null || !((nnVar = xnVar.c5.quote) == null || nnVar.a == null || messageObject.getId() == xnVar.c5.quote.a.getId())) {
            xnVar.i5 = xnVar.c5.quote;
        }
    }

    @Override // org.telegram.ui.Components.wb0
    public final void c(boolean z4) {
        int i10;
        boolean z10;
        MessagePreviewParams.Messages messages;
        a(false);
        xn xnVar = this.E;
        MessagePreviewParams messagePreviewParams = xnVar.c5;
        if (messagePreviewParams != null) {
            if (!z4) {
                xnVar.j5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = xnVar.c5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z10 = true;
                    }
                    xnVar.T5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z10 = false;
            }
            Bundle e = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z4);
            boolean z11 = (z4 || (messages = xnVar.c5.replyMessage) == null || messages.messages.isEmpty() || xnVar.c5.quote != null) ? false : true;
            e.putBoolean("reply_to", z11);
            if (z11) {
                long peerDialogId = DialogObject.getPeerDialogId(xnVar.c5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != xnVar.a() && peerDialogId != xnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e.putLong("reply_to_author", peerDialogId);
                }
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z10);
            MessagePreviewParams.Messages messages3 = xnVar.c5.forwardMessages;
            e.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e.putBoolean("canSelectTopics", true);
            oy oyVar = new oy(e);
            oyVar.z2 = xnVar;
            xnVar.presentFragment(oyVar);
        }
    }
}
