// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ne9 extends iv5 {
    public final jv5 e;

    public ne9(jv5 jv5Var) {
        this.e = jv5Var;
    }

    @Override // iv5
    public final boolean k() {
        return false;
    }

    @Override // iv5
    public final void l(Throwable th) {
        Object v = j().v();
        boolean z = v instanceof yp2;
        jv5 jv5Var = this.e;
        if (z) {
            jv5Var.resumeWith(ixe.a(((yp2) v).a));
        } else {
            jv5Var.resumeWith(yed.a(v));
        }
    }
}
