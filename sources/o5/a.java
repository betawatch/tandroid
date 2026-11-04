package o5;

import o1.g;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final long b;

    public a(int i3, long j10) {
        if (i3 == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i3;
        this.b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        int c2 = (g.c(this.a) ^ 1000003) * 1000003;
        long j10 = this.b;
        return c2 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i3 = this.a;
        sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return a1.g.r(sb2, this.b, "}");
    }
}
