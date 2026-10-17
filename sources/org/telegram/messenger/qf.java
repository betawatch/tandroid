package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class qf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ qf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateEncryptedChat$174(this.c);
                break;
            case 1:
                this.b.lambda$updateEncryptedChatLayer$173(this.c);
                break;
            default:
                this.b.lambda$updateEncryptedChatTTL$172(this.c);
                break;
        }
    }
}
