// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class f40 implements x56, us2 {
    public final /* synthetic */ long a;

    public /* synthetic */ f40(long j) {
        this.a = j;
    }

    @Override // us2
    public final void accept(Object obj) {
        ((ad8) obj).f(this.a);
    }

    @Override // x56
    public final void invoke(Object obj) {
        u30 u30Var;
        o93 o93Var = (o93) obj;
        q93 q93Var = o93Var.a;
        if (o93Var != q93Var.j || (u30Var = q93Var.n) == null) {
            return;
        }
        u30Var.o(this.a);
    }
}
