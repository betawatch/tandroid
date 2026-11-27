// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
