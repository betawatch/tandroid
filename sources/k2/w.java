package k2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements g2.p {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ w(i0 i0Var, int i3) {
        this.a = i3;
        this.b = i0Var;
    }

    @Override // g2.p
    public void invoke(Object obj) {
        d2.c1 c1Var = (d2.c1) obj;
        switch (this.a) {
            case 2:
                c1Var.N(this.b.P);
                break;
            default:
                c1Var.C(this.b.R);
                break;
        }
    }
}
