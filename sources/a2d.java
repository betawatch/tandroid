// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a2d {
    public final byte a;
    public final long b;

    /* JADX WARN: Multi-variable type inference failed */
    public a2d(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a2d)) {
            return false;
        }
        a2d a2dVar = (a2d) obj;
        return this.a == a2dVar.a && this.b == a2dVar.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append((int) this.a);
        sb.append(", eventTimestamp=");
        return kt6.q(sb, this.b, "}");
    }
}
