// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cwa extends rm4 {
    public final /* synthetic */ fv9 b;
    public final /* synthetic */ hg2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwa(hg2 hg2Var, fv9 fv9Var, fv9 fv9Var2) {
        super(fv9Var);
        this.c = hg2Var;
        this.b = fv9Var2;
    }

    @Override // rm4, fv9
    public final ev9 f(long j) {
        ev9 f = this.b.f(j);
        hv9 hv9Var = f.a;
        long j2 = hv9Var.a;
        long j3 = hv9Var.b;
        long j4 = this.c.b;
        hv9 hv9Var2 = new hv9(j2, j3 + j4);
        hv9 hv9Var3 = f.b;
        return new ev9(hv9Var2, new hv9(hv9Var3.a, hv9Var3.b + j4));
    }
}
