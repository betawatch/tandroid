// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
