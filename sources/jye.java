// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class jye implements mt8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g1c b;

    public /* synthetic */ jye(g1c g1cVar, byte b) {
        this.a = b;
        this.b = g1cVar;
    }

    @Override // mt8
    public final Object get() {
        byte b = this.a;
        g1c g1cVar = this.b;
        switch (b) {
            case 0:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("json"), ize.y);
            case 1:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("proto"), ie7.x);
            case 2:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("json"), eef.y);
            case 3:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("proto"), i2f.E);
            case 4:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("json"), pd5.E);
            case 5:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("proto"), vi2.E);
            case 6:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("json"), c6e.y);
            default:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("proto"), ie7.E);
        }
    }
}
