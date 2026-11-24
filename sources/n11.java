// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class n11 implements yr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q11 b;
    public final /* synthetic */ vs2 c;

    public /* synthetic */ n11(vs2 vs2Var, q11 q11Var, byte b) {
        this.a = b;
        this.c = vs2Var;
        this.b = q11Var;
    }

    @Override // yr3
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        q11 q11Var = this.b;
        vs2 vs2Var = this.c;
        switch (b) {
            case 0:
                ((gw) vs2Var).accept(Float.valueOf(q11Var.getTranslationY()));
                break;
            default:
                ((i42) vs2Var).accept(Float.valueOf(q11Var.getTranslationY()));
                break;
        }
    }
}
