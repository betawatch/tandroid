package l5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
