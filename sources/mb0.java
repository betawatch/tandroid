// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mb0 {
    public final nb0 a;
    public final pb0 b;
    public final ob0 c;

    public mb0(nb0 nb0Var, pb0 pb0Var, ob0 ob0Var) {
        this.a = nb0Var;
        this.b = pb0Var;
        this.c = ob0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mb0)) {
            return false;
        }
        mb0 mb0Var = (mb0) obj;
        return this.a.equals(mb0Var.a) && this.b.equals(mb0Var.b) && this.c.equals(mb0Var.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
