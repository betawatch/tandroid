// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class a3f implements vw8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f5c b;

    public /* synthetic */ a3f(f5c f5cVar, byte b) {
        this.a = b;
        this.b = f5cVar;
    }

    @Override // vw8
    public final Object get() {
        byte b = this.a;
        f5c f5cVar = this.b;
        switch (b) {
            case 0:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("json"), z3f.y);
            case 1:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("proto"), sg7.x);
            case 2:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("json"), uif.y);
            case 3:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("proto"), z6f.E);
            case 4:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("json"), qf5.E);
            case 5:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("proto"), rj2.E);
            case 6:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("json"), sae.y);
            default:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("proto"), sg7.E);
        }
    }
}
