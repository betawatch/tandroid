// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class cqb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lqb b;

    public /* synthetic */ cqb(lqb lqbVar, byte b) {
        this.a = b;
        this.b = lqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lqb lqbVar = this.b;
        switch (b) {
            case 0:
                jqb jqbVar = lqbVar.N;
                if (jqbVar != null) {
                    long j = jqbVar.a;
                    if (j > 0) {
                        lqbVar.I = j;
                        break;
                    }
                }
                break;
            case 1:
                fqb fqbVar = lqbVar.a;
                if (fqbVar != null) {
                    fqbVar.V1();
                    break;
                }
                break;
            default:
                fqb fqbVar2 = lqbVar.a;
                if (fqbVar2 != null) {
                    fqbVar2.V();
                    break;
                }
                break;
        }
    }
}
