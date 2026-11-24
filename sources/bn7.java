// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bn7 implements cv5 {
    public final cv5 a;
    public final x4a b;

    public bn7(cv5 cv5Var) {
        cv5Var.getClass();
        this.a = cv5Var;
        this.b = new x4a(cv5Var.d());
    }

    @Override // cv5
    public final void b(c30 c30Var, Object obj) {
        if (obj != null) {
            c30Var.j(this.a, obj);
        } else {
            c30Var.g();
        }
    }

    @Override // cv5
    public final Object c(igf igfVar) {
        if (igfVar.i()) {
            return igfVar.l(this.a);
        }
        return null;
    }

    @Override // cv5
    public final w4a d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bn7.class == obj.getClass() && rp5.a(this.a, ((bn7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
