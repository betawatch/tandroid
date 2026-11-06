package gb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class p0 {
    public final x0 a;
    public final b b;

    public p0(x0 x0Var, b bVar) {
        n nVar = n.b;
        this.a = x0Var;
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
        n nVar = n.b;
        return this.a.equals(p0Var.a) && this.b.equals(p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (n.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n.b + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
