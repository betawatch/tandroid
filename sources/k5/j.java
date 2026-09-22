package k5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
