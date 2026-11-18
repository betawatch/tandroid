package j2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class o implements g {
    public c0 b;
    public String c;
    public boolean f;
    public final q4.q a = new q4.q(28);
    public final int d = 8000;
    public final int e = 8000;

    @Override // j2.g
    public final h createDataSource() {
        r rVar = new r(this.c, this.d, this.e, this.f, this.a);
        c0 c0Var = this.b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
