package k5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class j extends q {
    public final h a;

    public j(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((j) qVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.a + ", androidClientInfo=" + this.a + "}";
    }
}
