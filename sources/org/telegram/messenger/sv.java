package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class sv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ sv(xv xvVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.a = i7;
        this.b = xvVar;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        xv xvVar = this.b;
        switch (i7) {
            case 0:
                xvVar.getMessagesController().b4(tL_encryptedChatDiscarded, false);
                xvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
            default:
                xvVar.getMessagesController().b4(tL_encryptedChatDiscarded, false);
                xvVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                xvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
        }
    }
}
