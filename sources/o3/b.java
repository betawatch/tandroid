package o3;

import c8.f1;
import e2.n0;
import e2.p0;
import e2.u;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b implements p0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13;
    }

    @Override // e2.p0
    public final /* synthetic */ u a() {
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return f1.b(this.e) + ((f1.b(this.d) + ((f1.b(this.c) + ((f1.b(this.b) + ((f1.b(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // e2.p0
    public final /* synthetic */ void b(n0 n0Var) {
    }
}
