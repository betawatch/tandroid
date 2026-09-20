package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
