package org.telegram.messenger;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class zh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ long c;

    public /* synthetic */ zh(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.a = i10;
        this.b = secretChatHelper;
        this.c = j10;
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
