package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class fi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ fi(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.a = i10;
        this.b = secretChatHelper;
        this.c = encryptedChat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processAcceptedSecretChat$18(this.c);
                break;
            case 1:
                this.b.lambda$acceptSecretChat$21(this.c);
                break;
            default:
                this.b.lambda$applyPeerLayer$9(this.c);
                break;
        }
    }
}
