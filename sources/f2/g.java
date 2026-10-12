package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.c8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class g implements t0 {
    public final long a;
    public final long b;
    public final long c;

    public g(long j10, long j11, long j12) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
    }

    @Override // b2.t0
    public final /* synthetic */ x a() {
        return null;
    }

    @Override // b2.t0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c;
    }

    public final int hashCode() {
        return c8.b(this.c) + ((c8.b(this.b) + ((c8.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // b2.t0
    public final /* synthetic */ void b(r0 r0Var) {
    }
}
