// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class c6a {
    public final i6a a;
    public final sr b;

    public c6a(i6a i6aVar, sr srVar) {
        this.a = i6aVar;
        this.b = srVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6a)) {
            return false;
        }
        c6a c6aVar = (c6a) obj;
        return this.a.equals(c6aVar.a) && this.b.equals(c6aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (n44.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n44.b + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
