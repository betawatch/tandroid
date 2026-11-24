// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class dz6 implements lz6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lz6 b;

    public /* synthetic */ dz6(lz6 lz6Var, byte b) {
        this.a = b;
        this.b = lz6Var;
    }

    @Override // lz6
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        byte b = this.a;
        lz6 lz6Var = this.b;
        switch (b) {
            case 0:
                if (tx6Var != null) {
                    throw new ClassCastException();
                }
                oz6.e(null, sw6Var, i, lz6Var, new ji((Object) sw6Var, i, (byte) 14));
                throw null;
            default:
                return oz6.e(tx6Var, sw6Var, i, lz6Var, new yg(tx6Var, sw6Var, i, (byte) 9));
        }
    }
}
