package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class gf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ gf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i10) {
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
