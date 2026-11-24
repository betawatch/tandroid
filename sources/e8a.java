// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e8a {
    public final k8a a;
    public final ss b;

    public e8a(k8a k8aVar, ss ssVar) {
        this.a = k8aVar;
        this.b = ssVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8a)) {
            return false;
        }
        e8a e8aVar = (e8a) obj;
        return this.a.equals(e8aVar.a) && this.b.equals(e8aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (y54.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + y54.b + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
