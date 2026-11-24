// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
