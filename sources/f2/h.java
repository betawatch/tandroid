package f2;

import b2.r0;
import b2.t0;
import b2.x;
import v7.d8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class h implements t0 {
    public final long a;
    public final long b;
    public final long c;

    public h(long j10, long j11, long j12) {
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c;
    }

    public final int hashCode() {
        return d8.b(this.c) + ((d8.b(this.b) + ((d8.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // b2.t0
    public final /* synthetic */ void b(r0 r0Var) {
    }
}
