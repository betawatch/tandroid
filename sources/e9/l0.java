package e9;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
