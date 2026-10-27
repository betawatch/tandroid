package f9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
