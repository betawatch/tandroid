package g9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g0 extends a {
    public final i0 c;

    public g0(i0 i0Var, int i3) {
        super(i0Var.size(), i3);
        this.c = i0Var;
    }

    @Override // g9.a
    public final Object a(int i3) {
        return this.c.get(i3);
    }
}
