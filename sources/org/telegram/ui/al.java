package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class al extends org.telegram.ui.Components.oc0 {
    public final /* synthetic */ qn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(qn qnVar, Context context, qn qnVar2, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.kc0 kc0Var, int i11, boolean z10) {
        super(context, qnVar2, bVar, messagePreviewParams, user, chat, i10, kc0Var, i11, z10);
        this.H = qnVar;
    }

    @Override // org.telegram.ui.Components.oc0
    public final void b() {
        MessageObject messageObject;
        gn gnVar;
        qn qnVar = this.H;
        gn gnVar2 = qnVar.l5;
        if (gnVar2 == null || (messageObject = gnVar2.a) == null || !((gnVar = qnVar.f5.quote) == null || gnVar.a == null || messageObject.getId() == qnVar.f5.quote.a.getId())) {
            qnVar.l5 = qnVar.f5.quote;
        }
    }

    @Override // org.telegram.ui.Components.oc0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        qn qnVar = this.H;
        MessagePreviewParams messagePreviewParams = qnVar.f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                qnVar.m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = qnVar.f5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    qnVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle d = org.telegram.messenger.kk.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = qnVar.f5.replyMessage) == null || messages.messages.isEmpty() || qnVar.f5.quote != null) ? false : true;
            d.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(qnVar.f5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != qnVar.a() && peerDialogId != qnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    d.putLong("reply_to_author", peerDialogId);
                }
            }
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = qnVar.f5.forwardMessages;
            d.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            d.putBoolean("canSelectTopics", true);
            cy cyVar = new cy(d);
            cyVar.C2 = qnVar;
            qnVar.presentFragment(cyVar);
        }
    }
}
