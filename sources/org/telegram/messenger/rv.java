package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ rv(yv yvVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.a = i7;
        this.b = yvVar;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        yv yvVar = this.b;
        switch (i7) {
            case 0:
                yvVar.getNotificationCenter().k(35, encryptedChat);
                break;
            case 1:
                yvVar.getNotificationCenter().k(35, encryptedChat);
                yvVar.w(encryptedChat, null);
                break;
            default:
                yvVar.getNotificationCenter().k(35, encryptedChat);
                yvVar.w(encryptedChat, null);
                break;
        }
    }
}
