package f9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g0 extends a {
    public final i0 c;

    public g0(i0 i0Var, int i10) {
        super(i0Var.size(), i10);
        this.c = i0Var;
    }

    @Override // f9.a
    public final Object a(int i10) {
        return this.c.get(i10);
    }
}
