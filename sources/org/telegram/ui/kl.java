package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kl extends org.telegram.ui.Components.ec0 {
    public final /* synthetic */ eo H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(eo eoVar, Context context, eo eoVar2, zg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.ac0 ac0Var, int i11, boolean z10) {
        super(context, eoVar2, aVar, messagePreviewParams, user, chat, i10, ac0Var, i11, z10);
        this.H = eoVar;
    }

    @Override // org.telegram.ui.Components.ec0
    public final void b() {
        MessageObject messageObject;
        tn tnVar;
        eo eoVar = this.H;
        tn tnVar2 = eoVar.l5;
        if (tnVar2 == null || (messageObject = tnVar2.a) == null || !((tnVar = eoVar.f5.quote) == null || tnVar.a == null || messageObject.getId() == eoVar.f5.quote.a.getId())) {
            eoVar.l5 = eoVar.f5.quote;
        }
    }

    @Override // org.telegram.ui.Components.ec0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        eo eoVar = this.H;
        MessagePreviewParams messagePreviewParams = eoVar.f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                eoVar.m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = eoVar.f5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    eoVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e = org.telegram.messenger.a2.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = eoVar.f5.replyMessage) == null || messages.messages.isEmpty() || eoVar.f5.quote != null) ? false : true;
            e.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(eoVar.f5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != eoVar.a() && peerDialogId != eoVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e.putLong("reply_to_author", peerDialogId);
                }
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = eoVar.f5.forwardMessages;
            e.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e.putBoolean("canSelectTopics", true);
            wy wyVar = new wy(e);
            wyVar.C2 = eoVar;
            eoVar.presentFragment(wyVar);
        }
    }
}
