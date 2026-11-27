// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class dk6 implements d47 {
    public d47[] a;

    @Override // d47
    public final v29 a(Class cls) {
        for (d47 d47Var : this.a) {
            if (d47Var.b(cls)) {
                return d47Var.a(cls);
            }
        }
        qyc.c("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // d47
    public final boolean b(Class cls) {
        for (d47 d47Var : this.a) {
            if (d47Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
