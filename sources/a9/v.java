package a9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v {
    public final int a;
    public final long b;

    public v(int i10, long j3) {
        this.a = i10;
        this.b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.b == vVar.b;
    }

    public final int hashCode() {
        long j3 = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.a);
        sb2.append(", eventTimestamp=");
        return a4.a.r(sb2, this.b, "}");
    }
}
