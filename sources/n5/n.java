package n5;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
