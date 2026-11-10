package d9;

import a8.p0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class t {
    public final int a;
    public final long b;

    public t(int i7, long j3) {
        this.a = i7;
        this.b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b;
    }

    public final int hashCode() {
        long j3 = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.a);
        sb2.append(", eventTimestamp=");
        return p0.r(sb2, this.b, "}");
    }
}
