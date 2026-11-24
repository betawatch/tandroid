// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ n8b(v9b v9bVar, boolean z, byte b) {
        this.a = b;
        this.b = v9bVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.c(z);
                break;
            case 1:
                if (!z) {
                    v9bVar.K0.b(false, false);
                    break;
                }
                break;
            default:
                v9bVar.S = null;
                v9bVar.e = false;
                v9bVar.o(z);
                break;
        }
    }
}
