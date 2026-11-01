package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class kw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pw b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ kw(pw pwVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.a = i10;
        this.b = pwVar;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        pw pwVar = this.b;
        switch (i10) {
            case 0:
                pwVar.getMessagesController().R3(tL_encryptedChatDiscarded, false);
                pwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
            default:
                pwVar.getMessagesController().R3(tL_encryptedChatDiscarded, false);
                pwVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                pwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
        }
    }
}
