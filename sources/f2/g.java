package f2;

import b2.m0;
import b2.o0;
import v7.y7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g implements o0 {
    public final long a;
    public final long b;
    public final long c;

    public g(long j3, long j10, long j11) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
    }

    @Override // b2.o0
    public final /* synthetic */ b2.s a() {
        return null;
    }

    @Override // b2.o0
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
        return y7.b(this.c) + ((y7.b(this.b) + ((y7.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // b2.o0
    public final /* synthetic */ void b(m0 m0Var) {
    }
}
