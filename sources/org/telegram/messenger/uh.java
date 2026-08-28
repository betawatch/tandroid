package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class uh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ long c;

    public /* synthetic */ uh(SecretChatHelper secretChatHelper, long j10, int i9) {
        this.a = i9;
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
