package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class el extends org.telegram.ui.Components.fc0 {
    public final /* synthetic */ wn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(wn wnVar, Context context, wn wnVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.bc0 bc0Var, int i11, boolean z10) {
        super(context, wnVar2, cVar, messagePreviewParams, user, chat, i10, bc0Var, i11, z10);
        this.H = wnVar;
    }

    @Override // org.telegram.ui.Components.fc0
    public final void b() {
        MessageObject messageObject;
        mn mnVar;
        wn wnVar = this.H;
        mn mnVar2 = wnVar.l5;
        if (mnVar2 == null || (messageObject = mnVar2.a) == null || !((mnVar = wnVar.f5.quote) == null || mnVar.a == null || messageObject.getId() == wnVar.f5.quote.a.getId())) {
            wnVar.l5 = wnVar.f5.quote;
        }
    }

    @Override // org.telegram.ui.Components.fc0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        wn wnVar = this.H;
        MessagePreviewParams messagePreviewParams = wnVar.f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                wnVar.m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = wnVar.f5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    wnVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e = org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = wnVar.f5.replyMessage) == null || messages.messages.isEmpty() || wnVar.f5.quote != null) ? false : true;
            e.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(wnVar.f5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != wnVar.a() && peerDialogId != wnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e.putLong("reply_to_author", peerDialogId);
                }
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = wnVar.f5.forwardMessages;
            e.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e.putBoolean("canSelectTopics", true);
            qy qyVar = new qy(e);
            qyVar.C2 = wnVar;
            wnVar.presentFragment(qyVar);
        }
    }
}
