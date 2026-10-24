package f2;

import b2.q0;
import b2.s0;
import v7.c8;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class h implements s0 {
    public final long a;
    public final long b;
    public final long c;

    public h(long j10, long j11, long j12) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
    }

    @Override // b2.s0
    public final /* synthetic */ b2.w a() {
        return null;
    }

    @Override // b2.s0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c;
    }

    public final int hashCode() {
        return c8.b(this.c) + ((c8.b(this.b) + ((c8.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // b2.s0
    public final /* synthetic */ void b(q0 q0Var) {
    }
}
