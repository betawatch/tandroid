package g2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class o implements g {
    public c0 b;
    public String c;
    public boolean f;
    public final n4.y a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override // g2.g
    public final h createDataSource() {
        r rVar = new r(this.c, this.d, this.e, this.f, this.a);
        c0 c0Var = this.b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
