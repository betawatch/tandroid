// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class gz6 implements pz6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pz6 b;

    public /* synthetic */ gz6(pz6 pz6Var, byte b) {
        this.a = b;
        this.b = pz6Var;
    }

    @Override // pz6
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        byte b = this.a;
        pz6 pz6Var = this.b;
        switch (b) {
            case 0:
                if (yx6Var != null) {
                    throw new ClassCastException();
                }
                sz6.e(null, xw6Var, i, pz6Var, new wg((Object) xw6Var, i, (byte) 14));
                throw null;
            default:
                return sz6.e(yx6Var, xw6Var, i, pz6Var, new bf(yx6Var, xw6Var, i, (byte) 9));
        }
    }
}
