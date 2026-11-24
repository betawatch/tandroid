// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jda implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lda b;

    public /* synthetic */ jda(lda ldaVar, byte b) {
        this.a = b;
        this.b = ldaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        lda ldaVar = this.b;
        switch (b) {
            case 0:
                ldaVar.post(new jda(ldaVar, b2));
                break;
            default:
                ldaVar.c0.N0 = true;
                ldaVar.I.clear();
                ldaVar.J.clear();
                ldaVar.K.clear();
                ldaVar.invalidate();
                break;
        }
    }
}
