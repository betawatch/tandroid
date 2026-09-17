package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ci implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ long c;

    public /* synthetic */ ci(SecretChatHelper secretChatHelper, long j3, int i10) {
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
