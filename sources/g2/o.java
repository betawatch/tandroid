package g2;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
