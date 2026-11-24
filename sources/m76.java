// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m76 extends n76 implements b16 {
    public final e16 e;
    public final /* synthetic */ hh7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m76(hh7 hh7Var, e16 e16Var, co7 co7Var) {
        super(hh7Var, co7Var);
        this.f = hh7Var;
        this.e = e16Var;
    }

    @Override // b16
    public final void b(e16 e16Var, u06 u06Var) {
        e16 e16Var2 = this.e;
        v06 v06Var = e16Var2.m().b;
        if (v06Var == v06.a) {
            this.f.h(this.a);
            return;
        }
        v06 v06Var2 = null;
        while (v06Var2 != v06Var) {
            a(e());
            v06Var2 = v06Var;
            v06Var = e16Var2.m().b;
        }
    }

    @Override // n76
    public final void c() {
        this.e.m().b(this);
    }

    @Override // n76
    public final boolean d(e16 e16Var) {
        return this.e == e16Var;
    }

    @Override // n76
    public final boolean e() {
        return this.e.m().b.compareTo(v06.d) >= 0;
    }
}
