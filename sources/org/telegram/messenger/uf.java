package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class uf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ uf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
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
