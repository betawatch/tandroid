package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ mf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateChatParticipants$121(this.c);
                break;
            default:
                this.b.lambda$updateChatInfo$139(this.c);
                break;
        }
    }
}
