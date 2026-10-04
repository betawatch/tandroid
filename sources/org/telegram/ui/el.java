package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class el extends org.telegram.ui.Components.ic0 {
    public final /* synthetic */ yn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(yn ynVar, Context context, yn ynVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.ec0 ec0Var, int i11, boolean z10) {
        super(context, ynVar2, cVar, messagePreviewParams, user, chat, i10, ec0Var, i11, z10);
        this.H = ynVar;
    }

    @Override // org.telegram.ui.Components.ic0
    public final void b() {
        MessageObject messageObject;
        on onVar;
        yn ynVar = this.H;
        on onVar2 = ynVar.j5;
        if (onVar2 == null || (messageObject = onVar2.a) == null || !((onVar = ynVar.d5.quote) == null || onVar.a == null || messageObject.getId() == ynVar.d5.quote.a.getId())) {
            ynVar.j5 = ynVar.d5.quote;
        }
    }

    @Override // org.telegram.ui.Components.ic0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        yn ynVar = this.H;
        MessagePreviewParams messagePreviewParams = ynVar.d5;
        if (messagePreviewParams != null) {
            if (!z10) {
                ynVar.k5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = ynVar.d5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    ynVar.U5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e7 = org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true);
            e7.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = ynVar.d5.replyMessage) == null || messages.messages.isEmpty() || ynVar.d5.quote != null) ? false : true;
            e7.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(ynVar.d5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != ynVar.a() && peerDialogId != ynVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e7.putLong("reply_to_author", peerDialogId);
                }
            }
            e7.putInt("hasPoll", i10);
            e7.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = ynVar.d5.forwardMessages;
            e7.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e7.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(e7);
            uyVar.C2 = ynVar;
            ynVar.presentFragment(uyVar);
        }
    }
}
