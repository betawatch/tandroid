package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia0 b;
    public final /* synthetic */ AccountInstance c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 e;

    public /* synthetic */ ha0(ia0 ia0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.a = i10;
        this.b = ia0Var;
        this.c = accountInstance;
        this.d = j10;
        this.e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ha0(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                AccountInstance accountInstance = this.c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf(groupCall == null || !groupCall.call.rtmp_stream), this.b.g, this.e, accountInstance);
                break;
        }
    }
}
