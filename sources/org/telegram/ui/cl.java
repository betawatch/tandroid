package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cl extends org.telegram.ui.Components.nc0 {
    public final /* synthetic */ un H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(un unVar, Context context, un unVar2, ch.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.jc0 jc0Var, int i11, boolean z10) {
        super(context, unVar2, bVar, messagePreviewParams, user, chat, i10, jc0Var, i11, z10);
        this.H = unVar;
    }

    @Override // org.telegram.ui.Components.nc0
    public final void b() {
        MessageObject messageObject;
        kn knVar;
        un unVar = this.H;
        kn knVar2 = unVar.x5;
        if (knVar2 == null || (messageObject = knVar2.a) == null || !((knVar = unVar.r5.quote) == null || knVar.a == null || messageObject.getId() == unVar.r5.quote.a.getId())) {
            unVar.x5 = unVar.r5.quote;
        }
    }

    @Override // org.telegram.ui.Components.nc0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        un unVar = this.H;
        MessagePreviewParams messagePreviewParams = unVar.r5;
        if (messagePreviewParams != null) {
            if (!z10) {
                unVar.y5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = unVar.r5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    unVar.i6[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle c10 = org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true);
            c10.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = unVar.r5.replyMessage) == null || messages.messages.isEmpty() || unVar.r5.quote != null) ? false : true;
            c10.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(unVar.r5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != unVar.a() && peerDialogId != unVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    c10.putLong("reply_to_author", peerDialogId);
                }
            }
            c10.putInt("hasPoll", i10);
            c10.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = unVar.r5.forwardMessages;
            c10.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            c10.putBoolean("canSelectTopics", true);
            cy cyVar = new cy(c10);
            cyVar.C2 = unVar;
            unVar.presentFragment(cyVar);
        }
    }
}
