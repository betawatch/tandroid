package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class wv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ wv(dw dwVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.a = i7;
        this.b = dwVar;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        dw dwVar = this.b;
        switch (i7) {
            case 0:
                dwVar.getNotificationCenter().k(35, encryptedChat);
                break;
            case 1:
                dwVar.getNotificationCenter().k(35, encryptedChat);
                dwVar.w(encryptedChat, null);
                break;
            default:
                dwVar.getNotificationCenter().k(35, encryptedChat);
                dwVar.w(encryptedChat, null);
                break;
        }
    }
}
