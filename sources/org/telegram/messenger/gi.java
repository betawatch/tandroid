package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class gi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ TLRPC.TL_encryptedChatDiscarded c;

    public /* synthetic */ gi(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.a = i10;
        this.b = secretChatHelper;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processAcceptedSecretChat$19(this.c);
                break;
            default:
                this.b.lambda$decryptMessage$17(this.c);
                break;
        }
    }
}
