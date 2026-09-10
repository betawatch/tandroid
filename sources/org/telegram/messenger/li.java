package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class li implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ long c;

    public /* synthetic */ li(SecretChatHelper secretChatHelper, long j3, int i10) {
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
