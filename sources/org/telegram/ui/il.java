package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class il extends org.telegram.ui.Components.wb0 {
    public final /* synthetic */ co H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(co coVar, Context context, co coVar2, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.sb0 sb0Var, int i11, boolean z10) {
        super(context, coVar2, bVar, messagePreviewParams, user, chat, i10, sb0Var, i11, z10);
        this.H = coVar;
    }

    @Override // org.telegram.ui.Components.wb0
    public final void b() {
        MessageObject messageObject;
        sn snVar;
        co coVar = this.H;
        sn snVar2 = coVar.l5;
        if (snVar2 == null || (messageObject = snVar2.a) == null || !((snVar = coVar.f5.quote) == null || snVar.a == null || messageObject.getId() == coVar.f5.quote.a.getId())) {
            coVar.l5 = coVar.f5.quote;
        }
    }

    @Override // org.telegram.ui.Components.wb0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        co coVar = this.H;
        MessagePreviewParams messagePreviewParams = coVar.f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                coVar.m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = coVar.f5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    coVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e7 = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
            e7.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = coVar.f5.replyMessage) == null || messages.messages.isEmpty() || coVar.f5.quote != null) ? false : true;
            e7.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(coVar.f5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != coVar.a() && peerDialogId != coVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e7.putLong("reply_to_author", peerDialogId);
                }
            }
            e7.putInt("hasPoll", i10);
            e7.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = coVar.f5.forwardMessages;
            e7.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e7.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(e7);
            uyVar.C2 = coVar;
            coVar.presentFragment(uyVar);
        }
    }
}
