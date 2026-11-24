// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class drb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ krb b;

    public /* synthetic */ drb(krb krbVar, byte b) {
        this.a = b;
        this.b = krbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        krb krbVar = this.b;
        switch (b) {
            case 0:
                krbVar.b(false);
                break;
            case 1:
                krbVar.c();
                break;
            default:
                krbVar.b(false);
                break;
        }
    }
}
