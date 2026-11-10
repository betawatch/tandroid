package i2;

import c8.f1;
import e2.n0;
import e2.p0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f implements p0 {
    public final long a;
    public final long b;
    public final long c;

    public f(long j3, long j10, long j11) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
    }

    @Override // e2.p0
    public final /* synthetic */ e2.u a() {
        return null;
    }

    @Override // e2.p0
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
        return f1.b(this.c) + ((f1.b(this.b) + ((f1.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // e2.p0
    public final /* synthetic */ void b(n0 n0Var) {
    }
}
