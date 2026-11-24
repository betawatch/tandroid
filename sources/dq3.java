// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dq3 implements sw2 {
    public final /* synthetic */ sw2 a;
    public final Throwable b;

    public dq3(sw2 sw2Var, Throwable th) {
        this.a = sw2Var;
        this.b = th;
    }

    @Override // sw2
    public final Object fold(Object obj, eq4 eq4Var) {
        return this.a.fold(obj, eq4Var);
    }

    @Override // sw2
    public final qw2 get(rw2 rw2Var) {
        return this.a.get(rw2Var);
    }

    @Override // sw2
    public final sw2 minusKey(rw2 rw2Var) {
        return this.a.minusKey(rw2Var);
    }

    @Override // sw2
    public final sw2 plus(sw2 sw2Var) {
        return this.a.plus(sw2Var);
    }
}
