package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
