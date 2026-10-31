package g2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p implements g {
    public d0 b;
    public String c;
    public boolean f;
    public final n4.q a = new n4.q(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override // g2.g
    public final h createDataSource() {
        s sVar = new s(this.c, this.d, this.e, this.f, this.a);
        d0 d0Var = this.b;
        if (d0Var != null) {
            sVar.addTransferListener(d0Var);
        }
        return sVar;
    }
}
