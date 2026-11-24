// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class l0f implements nv8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g3c b;

    public /* synthetic */ l0f(g3c g3cVar, byte b) {
        this.a = b;
        this.b = g3cVar;
    }

    @Override // nv8
    public final Object get() {
        byte b = this.a;
        g3c g3cVar = this.b;
        switch (b) {
            case 0:
                return g3cVar.a("FIREBASE_ML_SDK", new d44("json"), k1f.y);
            case 1:
                return g3cVar.a("FIREBASE_ML_SDK", new d44("proto"), kg7.x);
            case 2:
                return g3cVar.a("FIREBASE_ML_SDK", new d44("json"), fgf.y);
            case 3:
                return g3cVar.a("FIREBASE_ML_SDK", new d44("proto"), k4f.E);
            case 4:
                return g3cVar.a("FIREBASE_ML_SDK", new d44("json"), nf5.E);
            case 5:
                return g3cVar.a("FIREBASE_ML_SDK", new d44("proto"), jk2.E);
            case 6:
                return g3cVar.a("FIREBASE_ML_SDK", new d44("json"), f8e.y);
            default:
                return g3cVar.a("FIREBASE_ML_SDK", new d44("proto"), kg7.E);
        }
    }
}
