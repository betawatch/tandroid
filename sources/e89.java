// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e89 extends wo5 {
    public static final e89 n;
    public final transient zp7 e;
    public final transient int f;
    public transient vo5 h;

    static {
        zp7 zp7Var = new zp7();
        zp7Var.d(3);
        n = new e89(zp7Var);
    }

    public e89(zp7 zp7Var) {
        this.e = zp7Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = zp7Var.c;
            if (i >= i2) {
                this.f = ine.d(j);
                return;
            } else {
                jte.j(i, i2);
                j += zp7Var.b[i];
                i++;
            }
        }
    }

    @Override // go5
    public final boolean m() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f;
    }
}
