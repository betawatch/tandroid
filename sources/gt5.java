// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gt5 extends na1 {
    public final pt5 r;

    public gt5(fw2 fw2Var, pt5 pt5Var) {
        super(1, fw2Var);
        this.r = pt5Var;
    }

    @Override // na1
    public final Throwable p(pt5 pt5Var) {
        Throwable c;
        Object v = this.r.v();
        return (!(v instanceof it5) || (c = ((it5) v).c()) == null) ? v instanceof fp2 ? ((fp2) v).a : pt5Var.getCancellationException() : c;
    }

    @Override // na1
    public final String y() {
        return "AwaitContinuation";
    }
}
