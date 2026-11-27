// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bq7 implements hx5 {
    public final hx5 a;
    public final p8a b;

    public bq7(hx5 hx5Var) {
        hx5Var.getClass();
        this.a = hx5Var;
        this.b = new p8a(hx5Var.d());
    }

    @Override // hx5
    public final void b(d30 d30Var, Object obj) {
        if (obj != null) {
            d30Var.j(this.a, obj);
        } else {
            d30Var.g();
        }
    }

    @Override // hx5
    public final Object c(ykf ykfVar) {
        if (ykfVar.i()) {
            return ykfVar.l(this.a);
        }
        return null;
    }

    @Override // hx5
    public final o8a d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bq7.class == obj.getClass() && ur5.a(this.a, ((bq7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
