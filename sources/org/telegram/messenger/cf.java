package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class cf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ cf(MessagesStorage messagesStorage, TLRPC.TL_chatFull tL_chatFull, int i9) {
        this.a = i9;
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
