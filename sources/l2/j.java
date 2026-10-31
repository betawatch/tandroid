package l2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j {
    public final v2.e a;
    public final m2.m b;
    public final m2.b c;
    public final i d;
    public final long e;
    public final long f;

    public j(long j10, m2.m mVar, m2.b bVar, v2.e eVar, long j11, i iVar) {
        this.e = j10;
        this.b = mVar;
        this.c = bVar;
        this.f = j11;
        this.a = eVar;
        this.d = iVar;
    }

    public final j a(long j10, m2.m mVar) {
        long o10;
        long o11;
        i d = this.b.d();
        i d10 = mVar.d();
        if (d == null) {
            return new j(j10, mVar, this.c, this.a, this.f, d);
        }
        if (!d.t()) {
            return new j(j10, mVar, this.c, this.a, this.f, d10);
        }
        long z10 = d.z(j10);
        if (z10 == 0) {
            return new j(j10, mVar, this.c, this.a, this.f, d10);
        }
        d10.getClass();
        long u10 = d.u();
        long a2 = d.a(u10);
        long j11 = z10 + u10;
        long j12 = j11 - 1;
        long c10 = d.c(j12, j10) + d.a(j12);
        long u11 = d10.u();
        long a10 = d10.a(u11);
        long j13 = this.f;
        if (c10 == a10) {
            o10 = j11 - u11;
        } else {
            if (c10 < a10) {
                throw new u2.b();
            }
            if (a10 < a2) {
                o11 = j13 - (d10.o(a2, j10) - u10);
                return new j(j10, mVar, this.c, this.a, o11, d10);
            }
            o10 = d.o(a10, j10) - u11;
        }
        o11 = o10 + j13;
        return new j(j10, mVar, this.c, this.a, o11, d10);
    }

    public final long b(long j10) {
        i iVar = this.d;
        iVar.getClass();
        long j11 = this.e;
        long e = iVar.e(j11, j10) + this.f;
        iVar.getClass();
        return (iVar.A(j11, j10) + e) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.z(this.e);
    }

    public final long d(long j10) {
        long e = e(j10);
        i iVar = this.d;
        iVar.getClass();
        return iVar.c(j10 - this.f, this.e) + e;
    }

    public final long e(long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j10 - this.f);
    }

    public final boolean f(long j10, long j11) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.t() || j11 == -9223372036854775807L || d(j10) <= j11;
    }
}
