package org.telegram.messenger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class di implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ long c;

    public /* synthetic */ di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.a = i10;
        this.b = secretChatHelper;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processDecryptedObject$12(this.c);
                break;
            case 1:
                this.b.lambda$processDecryptedObject$10(this.c);
                break;
            case 2:
                this.b.lambda$processDecryptedObject$11(this.c);
                break;
            default:
                this.b.lambda$processUpdateEncryption$3(this.c);
                break;
        }
    }
}
