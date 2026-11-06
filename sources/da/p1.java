package da;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p1 {
    public final q1 a;
    public final s1 b;
    public final r1 c;

    public p1(q1 q1Var, s1 s1Var, r1 r1Var) {
        this.a = q1Var;
        this.b = s1Var;
        this.c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.a.equals(p1Var.a) && this.b.equals(p1Var.b) && this.c.equals(p1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
