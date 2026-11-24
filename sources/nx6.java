// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nx6 extends aob {
    public final aob e;
    public final cm5 f;
    public final cm5 g;

    public nx6(aob aobVar, cm5 cm5Var, cm5 cm5Var2) {
        this.e = aobVar;
        this.f = cm5Var;
        this.g = cm5Var2;
    }

    @Override // aob
    public final int a(boolean z) {
        return this.e.a(z);
    }

    @Override // aob
    public final int b(Object obj) {
        Object obj2;
        boolean z = obj instanceof String;
        aob aobVar = this.e;
        return (!z || (obj2 = ((v59) this.g).n.get(obj)) == null) ? aobVar.b(obj) : aobVar.b(obj2);
    }

    @Override // aob
    public final int c(boolean z) {
        return this.e.c(z);
    }

    @Override // aob
    public final int e(int i, int i2, boolean z) {
        return this.e.e(i, i2, z);
    }

    @Override // aob
    public final xnb f(int i, xnb xnbVar, boolean z) {
        String str;
        String str2;
        this.e.f(i, xnbVar, z);
        if (z) {
            Object obj = xnbVar.a;
            cm5 cm5Var = this.g;
            if (obj != null && (str2 = (String) cm5Var.get(obj)) != null) {
                xnbVar.a = str2;
            }
            Object obj2 = xnbVar.b;
            if (obj2 != null && (str = (String) cm5Var.get(obj2)) != null) {
                xnbVar.b = str;
            }
        }
        return xnbVar;
    }

    @Override // aob
    public final int h() {
        return this.e.h();
    }

    @Override // aob
    public final int k(int i, int i2, boolean z) {
        return this.e.k(i, i2, z);
    }

    @Override // aob
    public final Object l(int i) {
        Object l = this.e.l(i);
        String str = (String) this.g.get(l);
        return str == null ? l : str;
    }

    @Override // aob
    public final znb m(int i, znb znbVar, long j) {
        String str;
        this.e.m(i, znbVar, j);
        Object obj = znbVar.a;
        if (obj != null && (str = (String) this.f.get(obj)) != null) {
            znbVar.a = str;
        }
        return znbVar;
    }

    @Override // aob
    public final int o() {
        return this.e.o();
    }
}
