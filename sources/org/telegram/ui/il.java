package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class il extends org.telegram.ui.Components.vb0 {
    public final /* synthetic */ bo H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(bo boVar, Context context, bo boVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.rb0 rb0Var, int i11, boolean z10) {
        super(context, boVar2, cVar, messagePreviewParams, user, chat, i10, rb0Var, i11, z10);
        this.H = boVar;
    }

    @Override // org.telegram.ui.Components.vb0
    public final void b() {
        MessageObject messageObject;
        rn rnVar;
        bo boVar = this.H;
        rn rnVar2 = boVar.l5;
        if (rnVar2 == null || (messageObject = rnVar2.a) == null || !((rnVar = boVar.f5.quote) == null || rnVar.a == null || messageObject.getId() == boVar.f5.quote.a.getId())) {
            boVar.l5 = boVar.f5.quote;
        }
    }

    @Override // org.telegram.ui.Components.vb0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        bo boVar = this.H;
        MessagePreviewParams messagePreviewParams = boVar.f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                boVar.m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = boVar.f5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    boVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = boVar.f5.replyMessage) == null || messages.messages.isEmpty() || boVar.f5.quote != null) ? false : true;
            e.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(boVar.f5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != boVar.a() && peerDialogId != boVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e.putLong("reply_to_author", peerDialogId);
                }
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = boVar.f5.forwardMessages;
            e.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e.putBoolean("canSelectTopics", true);
            wy wyVar = new wy(e);
            wyVar.C2 = boVar;
            boVar.presentFragment(wyVar);
        }
    }
}
