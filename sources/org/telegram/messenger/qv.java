package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vv b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ qv(vv vvVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i3) {
        this.a = i3;
        this.b = vvVar;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        vv vvVar = this.b;
        switch (i3) {
            case 0:
                vvVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                vvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
            default:
                vvVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                vvVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                vvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
        }
    }
}
