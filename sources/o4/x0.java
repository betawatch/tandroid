package o4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ x0(f1 f1Var, int i3) {
        this.a = i3;
        this.b = f1Var;
    }

    @Override // o4.f1
    public final Object i(e0 e0Var, v vVar, int i3) {
        switch (this.a) {
            case 0:
                if (e0Var != null) {
                    throw new ClassCastException();
                }
                h1.K0(null, vVar, i3, this.b, new k2.q(vVar, i3, 3));
                throw null;
            default:
                return h1.K0(e0Var, vVar, i3, this.b, new k2.y(e0Var, vVar, i3, 4));
        }
    }
}
