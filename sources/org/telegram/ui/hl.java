package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hl extends org.telegram.ui.Components.xb0 {
    public final /* synthetic */ zn E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(zn znVar, Context context, zn znVar2, ng.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.tb0 tb0Var, int i11, boolean z4) {
        super(context, znVar2, aVar, messagePreviewParams, user, chat, i10, tb0Var, i11, z4);
        this.E = znVar;
    }

    @Override // org.telegram.ui.Components.xb0
    public final void b() {
        MessageObject messageObject;
        pn pnVar;
        zn znVar = this.E;
        pn pnVar2 = znVar.i5;
        if (pnVar2 == null || (messageObject = pnVar2.a) == null || !((pnVar = znVar.c5.quote) == null || pnVar.a == null || messageObject.getId() == znVar.c5.quote.a.getId())) {
            znVar.i5 = znVar.c5.quote;
        }
    }

    @Override // org.telegram.ui.Components.xb0
    public final void c(boolean z4) {
        int i10;
        boolean z10;
        MessagePreviewParams.Messages messages;
        a(false);
        zn znVar = this.E;
        MessagePreviewParams messagePreviewParams = znVar.c5;
        if (messagePreviewParams != null) {
            if (!z4) {
                znVar.j5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = znVar.c5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z10 = true;
                    }
                    znVar.T5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z10 = false;
            }
            Bundle e = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z4);
            boolean z11 = (z4 || (messages = znVar.c5.replyMessage) == null || messages.messages.isEmpty() || znVar.c5.quote != null) ? false : true;
            e.putBoolean("reply_to", z11);
            if (z11) {
                long peerDialogId = DialogObject.getPeerDialogId(znVar.c5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != znVar.a() && peerDialogId != znVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e.putLong("reply_to_author", peerDialogId);
                }
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z10);
            MessagePreviewParams.Messages messages3 = znVar.c5.forwardMessages;
            e.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e.putBoolean("canSelectTopics", true);
            qy qyVar = new qy(e);
            qyVar.z2 = znVar;
            znVar.presentFragment(qyVar);
        }
    }
}
