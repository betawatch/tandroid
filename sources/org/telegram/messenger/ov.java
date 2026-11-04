package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ov implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vv b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ ov(vv vvVar, TLRPC.EncryptedChat encryptedChat, int i3) {
        this.a = i3;
        this.b = vvVar;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        vv vvVar = this.b;
        switch (i3) {
            case 0:
                vvVar.getNotificationCenter().k(35, encryptedChat);
                break;
            case 1:
                vvVar.getNotificationCenter().k(35, encryptedChat);
                vvVar.w(encryptedChat, null);
                break;
            default:
                vvVar.getNotificationCenter().k(35, encryptedChat);
                vvVar.w(encryptedChat, null);
                break;
        }
    }
}
