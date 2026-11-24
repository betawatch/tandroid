// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m96 extends n96 implements b36 {
    public final e36 e;
    public final /* synthetic */ kj7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m96(kj7 kj7Var, e36 e36Var, fq7 fq7Var) {
        super(kj7Var, fq7Var);
        this.f = kj7Var;
        this.e = e36Var;
    }

    @Override // b36
    public final void b(e36 e36Var, u26 u26Var) {
        e36 e36Var2 = this.e;
        v26 v26Var = e36Var2.m().b;
        if (v26Var == v26.a) {
            this.f.h(this.a);
            return;
        }
        v26 v26Var2 = null;
        while (v26Var2 != v26Var) {
            a(e());
            v26Var2 = v26Var;
            v26Var = e36Var2.m().b;
        }
    }

    @Override // n96
    public final void c() {
        this.e.m().b(this);
    }

    @Override // n96
    public final boolean d(e36 e36Var) {
        return this.e == e36Var;
    }

    @Override // n96
    public final boolean e() {
        return this.e.m().b.compareTo(v26.d) >= 0;
    }
}
