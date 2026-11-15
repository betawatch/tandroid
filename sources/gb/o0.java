package gb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class o0 {
    public final v0 a;
    public final b b;

    public o0(v0 v0Var, b bVar) {
        m mVar = m.b;
        this.a = v0Var;
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
