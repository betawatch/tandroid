package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Components.ec0 {
    public final /* synthetic */ zn H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(zn znVar, Context context, zn znVar2, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.ac0 ac0Var, int i11, boolean z10) {
        super(context, znVar2, cVar, messagePreviewParams, user, chat, i10, ac0Var, i11, z10);
        this.H = znVar;
    }

    @Override // org.telegram.ui.Components.ec0
    public final void b() {
        MessageObject messageObject;
        pn pnVar;
        zn znVar = this.H;
        pn pnVar2 = znVar.l5;
        if (pnVar2 == null || (messageObject = pnVar2.a) == null || !((pnVar = znVar.f5.quote) == null || pnVar.a == null || messageObject.getId() == znVar.f5.quote.a.getId())) {
            znVar.l5 = znVar.f5.quote;
        }
    }

    @Override // org.telegram.ui.Components.ec0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        zn znVar = this.H;
        MessagePreviewParams messagePreviewParams = znVar.f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                znVar.m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = znVar.f5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    znVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle d = org.telegram.messenger.wh.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = znVar.f5.replyMessage) == null || messages.messages.isEmpty() || znVar.f5.quote != null) ? false : true;
            d.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(znVar.f5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != znVar.a() && peerDialogId != znVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    d.putLong("reply_to_author", peerDialogId);
                }
            }
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = znVar.f5.forwardMessages;
            d.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            d.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(d);
            uyVar.C2 = znVar;
            znVar.presentFragment(uyVar);
        }
    }
}
