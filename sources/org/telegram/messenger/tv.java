package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class tv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ tv(yv yvVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.a = i7;
        this.b = yvVar;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        yv yvVar = this.b;
        switch (i7) {
            case 0:
                yvVar.getMessagesController().b4(tL_encryptedChatDiscarded, false);
                yvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
            default:
                yvVar.getMessagesController().b4(tL_encryptedChatDiscarded, false);
                yvVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                yvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
        }
    }
}
