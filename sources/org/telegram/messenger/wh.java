package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class wh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ TLRPC.EncryptedChat c;

    public /* synthetic */ wh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i9) {
        this.a = i9;
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
