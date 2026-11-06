package n5;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n extends y {
    public final l a;

    public n(l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = x.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((n) yVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((x.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.a + ", androidClientInfo=" + this.a + "}";
    }
}
