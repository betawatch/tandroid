package e9;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
