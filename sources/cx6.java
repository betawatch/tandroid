// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class cx6 implements lx6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lx6 b;

    public /* synthetic */ cx6(lx6 lx6Var, byte b) {
        this.a = b;
        this.b = lx6Var;
    }

    @Override // lx6
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        byte b = this.a;
        lx6 lx6Var = this.b;
        switch (b) {
            case 0:
                if (tv6Var != null) {
                    throw new ClassCastException();
                }
                ox6.e(null, su6Var, i, lx6Var, new jh((Object) su6Var, i, (byte) 14));
                throw null;
            default:
                return ox6.e(tv6Var, su6Var, i, lx6Var, new yf((Object) tv6Var, (Object) su6Var, i, (byte) 8));
        }
    }
}
