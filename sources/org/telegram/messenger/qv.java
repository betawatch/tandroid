package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class qv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ qv(xv xvVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.a = i7;
        this.b = xvVar;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        xv xvVar = this.b;
        switch (i7) {
            case 0:
                xvVar.getNotificationCenter().k(35, encryptedChat);
                break;
            case 1:
                xvVar.getNotificationCenter().k(35, encryptedChat);
                xvVar.w(encryptedChat, null);
                break;
            default:
                xvVar.getNotificationCenter().k(35, encryptedChat);
                xvVar.w(encryptedChat, null);
                break;
        }
    }
}
