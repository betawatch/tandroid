package e9;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
