package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class bl extends org.telegram.ui.Components.rc0 {
    public final /* synthetic */ sn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(sn snVar, Context context, sn snVar2, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.nc0 nc0Var, int i11, boolean z10) {
        super(context, snVar2, bVar, messagePreviewParams, user, chat, i10, nc0Var, i11, z10);
        this.H = snVar;
    }

    @Override // org.telegram.ui.Components.rc0
    public final void b() {
        MessageObject messageObject;
        in inVar;
        sn snVar = this.H;
        in inVar2 = snVar.x5;
        if (inVar2 == null || (messageObject = inVar2.a) == null || !((inVar = snVar.r5.quote) == null || inVar.a == null || messageObject.getId() == snVar.r5.quote.a.getId())) {
            snVar.x5 = snVar.r5.quote;
        }
    }

    @Override // org.telegram.ui.Components.rc0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        sn snVar = this.H;
        MessagePreviewParams messagePreviewParams = snVar.r5;
        if (messagePreviewParams != null) {
            if (!z10) {
                snVar.y5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = snVar.r5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    snVar.i6[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = snVar.r5.replyMessage) == null || messages.messages.isEmpty() || snVar.r5.quote != null) ? false : true;
            e.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(snVar.r5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != snVar.a() && peerDialogId != snVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e.putLong("reply_to_author", peerDialogId);
                }
            }
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = snVar.r5.forwardMessages;
            e.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(e);
            eyVar.C2 = snVar;
            snVar.presentFragment(eyVar);
        }
    }
}
