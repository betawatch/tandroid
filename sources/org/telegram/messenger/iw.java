package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class iw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pw b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ iw(pw pwVar, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.a = i10;
        this.b = pwVar;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        pw pwVar = this.b;
        switch (i10) {
            case 0:
                pwVar.getNotificationCenter().k(35, encryptedChat);
                break;
            case 1:
                pwVar.getNotificationCenter().k(35, encryptedChat);
                pwVar.w(encryptedChat, null);
                break;
            default:
                pwVar.getNotificationCenter().k(35, encryptedChat);
                pwVar.w(encryptedChat, null);
                break;
        }
    }
}
