package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class yv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ yv(dw dwVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.a = i7;
        this.b = dwVar;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        dw dwVar = this.b;
        switch (i7) {
            case 0:
                dwVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                dwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
            default:
                dwVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                dwVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                dwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                break;
        }
    }
}
