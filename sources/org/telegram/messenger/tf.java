package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class tf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ tf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
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
