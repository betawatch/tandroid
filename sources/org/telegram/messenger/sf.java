package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class sf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ sf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
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
