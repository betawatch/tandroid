package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ hf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
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
