package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ la0 b;
    public final /* synthetic */ AccountInstance c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 e;

    public /* synthetic */ ka0(la0 la0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.a = i10;
        this.b = la0Var;
        this.c = accountInstance;
        this.d = j10;
        this.e = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ka0(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                AccountInstance accountInstance = this.c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf(groupCall == null || !groupCall.call.rtmp_stream), this.b.g, this.e, accountInstance);
                break;
        }
    }
}
