package gb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class p0 {
    public final w0 a;
    public final b b;

    public p0(w0 w0Var, b bVar) {
        m mVar = m.b;
        this.a = w0Var;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        m mVar = m.b;
        return this.a.equals(p0Var.a) && this.b.equals(p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (m.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.b + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
