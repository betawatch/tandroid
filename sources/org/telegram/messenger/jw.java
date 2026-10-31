package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ow b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ jw(ow owVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.a = i10;
        this.b = owVar;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        ow owVar = this.b;
        switch (i10) {
            case 0:
                owVar.getMessagesController().R3(tL_encryptedChatDiscarded, false);
                owVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
            default:
                owVar.getMessagesController().R3(tL_encryptedChatDiscarded, false);
                owVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                owVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
        }
    }
}
