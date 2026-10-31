package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class hw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ow b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ hw(ow owVar, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.a = i10;
        this.b = owVar;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        ow owVar = this.b;
        switch (i10) {
            case 0:
                owVar.getNotificationCenter().k(35, encryptedChat);
                break;
            case 1:
                owVar.getNotificationCenter().k(35, encryptedChat);
                owVar.w(encryptedChat, null);
                break;
            default:
                owVar.getNotificationCenter().k(35, encryptedChat);
                owVar.w(encryptedChat, null);
                break;
        }
    }
}
