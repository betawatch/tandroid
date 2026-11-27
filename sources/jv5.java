// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jv5 extends va1 {
    public final sv5 r;

    public jv5(zw2 zw2Var, sv5 sv5Var) {
        super(1, zw2Var);
        this.r = sv5Var;
    }

    @Override // va1
    public final Throwable p(sv5 sv5Var) {
        Throwable c;
        Object v = this.r.v();
        return (!(v instanceof lv5) || (c = ((lv5) v).c()) == null) ? v instanceof yp2 ? ((yp2) v).a : sv5Var.getCancellationException() : c;
    }

    @Override // va1
    public final String y() {
        return "AwaitContinuation";
    }
}
