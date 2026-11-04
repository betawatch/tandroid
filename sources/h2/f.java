package h2;

import b8.pd;
import d2.p0;
import d2.r0;
import d2.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements r0 {
    public final long a;
    public final long b;
    public final long c;

    public f(long j10, long j11, long j12) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
    }

    @Override // d2.r0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // d2.r0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c;
    }

    public final int hashCode() {
        return pd.b(this.c) + ((pd.b(this.b) + ((pd.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // d2.r0
    public final /* synthetic */ void a(p0 p0Var) {
    }
}
