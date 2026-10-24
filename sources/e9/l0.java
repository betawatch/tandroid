package e9;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class l0 extends a {
    public final n0 c;

    public l0(n0 n0Var, int i10) {
        super(n0Var.size(), i10);
        this.c = n0Var;
    }

    @Override // e9.a
    public final Object a(int i10) {
        return this.c.get(i10);
    }
}
