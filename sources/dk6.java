// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
