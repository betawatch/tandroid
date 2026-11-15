package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ uv(bw bwVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.a = i7;
        this.b = bwVar;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        bw bwVar = this.b;
        switch (i7) {
            case 0:
                bwVar.getNotificationCenter().k(35, encryptedChat);
                break;
            case 1:
                bwVar.getNotificationCenter().k(35, encryptedChat);
                bwVar.w(encryptedChat, null);
                break;
            default:
                bwVar.getNotificationCenter().k(35, encryptedChat);
                bwVar.w(encryptedChat, null);
                break;
        }
    }
}
