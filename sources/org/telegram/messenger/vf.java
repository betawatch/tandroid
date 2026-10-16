package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ vf(MessagesStorage messagesStorage, TLRPC.EncryptedChat encryptedChat, int i10) {
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
