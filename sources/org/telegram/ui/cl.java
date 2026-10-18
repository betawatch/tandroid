package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class cl extends org.telegram.ui.Components.oc0 {
    public final /* synthetic */ sn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(sn snVar, Context context, sn snVar2, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.kc0 kc0Var, int i11, boolean z10) {
        super(context, snVar2, bVar, messagePreviewParams, user, chat, i10, kc0Var, i11, z10);
        this.H = snVar;
    }

    @Override // org.telegram.ui.Components.oc0
    public final void b() {
        MessageObject messageObject;
        in inVar;
        sn snVar = this.H;
        in inVar2 = snVar.l5;
        if (inVar2 == null || (messageObject = inVar2.a) == null || !((inVar = snVar.f5.quote) == null || inVar.a == null || messageObject.getId() == snVar.f5.quote.a.getId())) {
            snVar.l5 = snVar.f5.quote;
        }
    }

    @Override // org.telegram.ui.Components.oc0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        sn snVar = this.H;
        MessagePreviewParams messagePreviewParams = snVar.f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                snVar.m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = snVar.f5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    snVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle d = org.telegram.messenger.kk.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = snVar.f5.replyMessage) == null || messages.messages.isEmpty() || snVar.f5.quote != null) ? false : true;
            d.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(snVar.f5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != snVar.a() && peerDialogId != snVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    d.putLong("reply_to_author", peerDialogId);
                }
            }
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = snVar.f5.forwardMessages;
            d.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            d.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(d);
            eyVar.C2 = snVar;
            snVar.presentFragment(eyVar);
        }
    }
}
