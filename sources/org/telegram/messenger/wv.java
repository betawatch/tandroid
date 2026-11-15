package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class wv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ wv(bw bwVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.a = i7;
        this.b = bwVar;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        bw bwVar = this.b;
        switch (i7) {
            case 0:
                bwVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                bwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
            default:
                bwVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                bwVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                bwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
        }
    }
}
