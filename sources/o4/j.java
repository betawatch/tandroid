package o4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j {
    public final n4.d a;
    public final p4.m b;
    public final p4.b c;
    public final i d;
    public final long e;
    public final long f;

    public j(long j10, p4.m mVar, p4.b bVar, n4.d dVar, long j11, i iVar) {
        this.e = j10;
        this.b = mVar;
        this.c = bVar;
        this.f = j11;
        this.a = dVar;
        this.d = iVar;
    }

    public final j a(long j10, p4.m mVar) {
        long r6;
        long r9;
        i c3 = this.b.c();
        i c6 = mVar.c();
        if (c3 == null) {
            return new j(j10, mVar, this.c, this.a, this.f, c3);
        }
        if (!c3.y()) {
            return new j(j10, mVar, this.c, this.a, this.f, c6);
        }
        long F = c3.F(j10);
        if (F == 0) {
            return new j(j10, mVar, this.c, this.a, this.f, c6);
        }
        long z10 = c3.z();
        long b10 = c3.b(z10);
        long j11 = F + z10;
        long j12 = j11 - 1;
        long g10 = c3.g(j12, j10) + c3.b(j12);
        long z11 = c6.z();
        long b11 = c6.b(z11);
        long j13 = this.f;
        if (g10 == b11) {
            r6 = j11 - z11;
        } else {
            if (g10 < b11) {
                throw new l4.b();
            }
            if (b11 < b10) {
                r9 = j13 - (c6.r(b10, j10) - z10);
                return new j(j10, mVar, this.c, this.a, r9, c6);
            }
            r6 = c3.r(b11, j10) - z11;
        }
        r9 = r6 + j13;
        return new j(j10, mVar, this.c, this.a, r9, c6);
    }

    public final long b(long j10) {
        i iVar = this.d;
        long j11 = this.e;
        return (iVar.H(j11, j10) + (iVar.n(j11, j10) + this.f)) - 1;
    }

    public final long c(long j10) {
        return this.d.g(j10 - this.f, this.e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.b(j10 - this.f);
    }
}
