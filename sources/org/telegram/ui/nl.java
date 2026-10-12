package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nl extends org.telegram.ui.Components.vc0 {
    public final /* synthetic */ fo H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl(fo foVar, Context context, fo foVar2, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.rc0 rc0Var, int i11, boolean z10) {
        super(context, foVar2, bVar, messagePreviewParams, user, chat, i10, rc0Var, i11, z10);
        this.H = foVar;
    }

    @Override // org.telegram.ui.Components.vc0
    public final void b() {
        MessageObject messageObject;
        un unVar;
        fo foVar = this.H;
        un unVar2 = foVar.l5;
        if (unVar2 == null || (messageObject = unVar2.a) == null || !((unVar = foVar.f5.quote) == null || unVar.a == null || messageObject.getId() == foVar.f5.quote.a.getId())) {
            foVar.l5 = foVar.f5.quote;
        }
    }

    @Override // org.telegram.ui.Components.vc0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        fo foVar = this.H;
        MessagePreviewParams messagePreviewParams = foVar.f5;
        if (messagePreviewParams != null) {
            if (!z10) {
                foVar.m5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = foVar.f5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    foVar.W5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle d = org.telegram.messenger.yh.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = foVar.f5.replyMessage) == null || messages.messages.isEmpty() || foVar.f5.quote != null) ? false : true;
            d.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(foVar.f5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != foVar.a() && peerDialogId != foVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    d.putLong("reply_to_author", peerDialogId);
                }
            }
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = foVar.f5.forwardMessages;
            d.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            d.putBoolean("canSelectTopics", true);
            yy yyVar = new yy(d);
            yyVar.C2 = foVar;
            foVar.presentFragment(yyVar);
        }
    }
}
