package aa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d1 {
    public final e1 a;
    public final g1 b;
    public final f1 c;

    public d1(e1 e1Var, g1 g1Var, f1 f1Var) {
        this.a = e1Var;
        this.b = g1Var;
        this.c = f1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d1) {
            d1 d1Var = (d1) obj;
            if (this.a.equals(d1Var.a) && this.b.equals(d1Var.b) && this.c.equals(d1Var.c)) {
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
