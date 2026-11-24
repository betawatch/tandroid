// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class eb0 {
    public final long a;
    public final rb0 b;
    public final pa0 c;

    public eb0(long j, rb0 rb0Var, pa0 pa0Var) {
        this.a = j;
        this.b = rb0Var;
        this.c = pa0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0Var = (eb0) obj;
        return this.a == eb0Var.a && this.b.equals(eb0Var.b) && this.c.equals(eb0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
