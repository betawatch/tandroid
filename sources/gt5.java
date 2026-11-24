// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
