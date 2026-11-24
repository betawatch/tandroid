// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fp7 implements cx5 {
    public final cx5 a;
    public final z6a b;

    public fp7(cx5 cx5Var) {
        cx5Var.getClass();
        this.a = cx5Var;
        this.b = new z6a(cx5Var.d());
    }

    @Override // cx5
    public final void b(c40 c40Var, Object obj) {
        if (obj != null) {
            c40Var.j(this.a, obj);
        } else {
            c40Var.g();
        }
    }

    @Override // cx5
    public final Object c(jif jifVar) {
        if (jifVar.i()) {
            return jifVar.l(this.a);
        }
        return null;
    }

    @Override // cx5
    public final y6a d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fp7.class == obj.getClass() && rr5.a(this.a, ((fp7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
