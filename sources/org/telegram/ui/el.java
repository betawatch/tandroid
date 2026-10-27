package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class el extends org.telegram.ui.Components.oc0 {
    public final /* synthetic */ wn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(wn wnVar, Context context, wn wnVar2, ch.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.kc0 kc0Var, int i11, boolean z10) {
        super(context, wnVar2, bVar, messagePreviewParams, user, chat, i10, kc0Var, i11, z10);
        this.H = wnVar;
    }

    @Override // org.telegram.ui.Components.oc0
    public final void b() {
        MessageObject messageObject;
        mn mnVar;
        wn wnVar = this.H;
        mn mnVar2 = wnVar.B5;
        if (mnVar2 == null || (messageObject = mnVar2.a) == null || !((mnVar = wnVar.v5.quote) == null || mnVar.a == null || messageObject.getId() == wnVar.v5.quote.a.getId())) {
            wnVar.B5 = wnVar.v5.quote;
        }
    }

    @Override // org.telegram.ui.Components.oc0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        wn wnVar = this.H;
        MessagePreviewParams messagePreviewParams = wnVar.v5;
        if (messagePreviewParams != null) {
            if (!z10) {
                wnVar.C5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = wnVar.v5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    wnVar.m6[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle c10 = org.telegram.messenger.wh.c(3, "onlySelect", "dialogsType", true);
            c10.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = wnVar.v5.replyMessage) == null || messages.messages.isEmpty() || wnVar.v5.quote != null) ? false : true;
            c10.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(wnVar.v5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != wnVar.a() && peerDialogId != wnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    c10.putLong("reply_to_author", peerDialogId);
                }
            }
            c10.putInt("hasPoll", i10);
            c10.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = wnVar.v5.forwardMessages;
            c10.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            c10.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(c10);
            eyVar.C2 = wnVar;
            wnVar.presentFragment(eyVar);
        }
    }
}
