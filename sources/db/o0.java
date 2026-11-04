package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o0 {
    public final w0 a;
    public final b b;

    public o0(w0 w0Var, b bVar) {
        m mVar = m.b;
        this.a = w0Var;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        m mVar = m.b;
        return this.a.equals(o0Var.a) && this.b.equals(o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (m.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.b + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
