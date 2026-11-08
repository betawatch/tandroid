package h9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g0 extends a {
    public final i0 c;

    public g0(i0 i0Var, int i7) {
        super(i0Var.size(), i7);
        this.c = i0Var;
    }

    @Override // h9.a
    public final Object a(int i7) {
        return this.c.get(i7);
    }
}
