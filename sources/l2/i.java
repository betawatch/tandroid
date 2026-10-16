package l2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i {
    public final v2.e a;
    public final m2.m b;
    public final m2.b c;
    public final h d;
    public final long e;
    public final long f;

    public i(long j10, m2.m mVar, m2.b bVar, v2.e eVar, long j11, h hVar) {
        this.e = j10;
        this.b = mVar;
        this.c = bVar;
        this.f = j11;
        this.a = eVar;
        this.d = hVar;
    }

    public final i a(long j10, m2.m mVar) {
        long n10;
        long n11;
        h d = this.b.d();
        h d10 = mVar.d();
        if (d == null) {
            return new i(j10, mVar, this.c, this.a, this.f, d);
        }
        if (!d.s()) {
            return new i(j10, mVar, this.c, this.a, this.f, d10);
        }
        long w9 = d.w(j10);
        if (w9 == 0) {
            return new i(j10, mVar, this.c, this.a, this.f, d10);
        }
        d10.getClass();
        long u10 = d.u();
        long a2 = d.a(u10);
        long j11 = w9 + u10;
        long j12 = j11 - 1;
        long c10 = d.c(j12, j10) + d.a(j12);
        long u11 = d10.u();
        long a10 = d10.a(u11);
        long j13 = this.f;
        if (c10 == a10) {
            n10 = j11 - u11;
        } else {
            if (c10 < a10) {
                throw new u2.b();
            }
            if (a10 < a2) {
                n11 = j13 - (d10.n(a2, j10) - u10);
                return new i(j10, mVar, this.c, this.a, n11, d10);
            }
            n10 = d.n(a10, j10) - u11;
        }
        n11 = n10 + j13;
        return new i(j10, mVar, this.c, this.a, n11, d10);
    }

    public final long b(long j10) {
        h hVar = this.d;
        hVar.getClass();
        long j11 = this.e;
        long e = hVar.e(j11, j10) + this.f;
        hVar.getClass();
        return (hVar.x(j11, j10) + e) - 1;
    }

    public final long c() {
        h hVar = this.d;
        hVar.getClass();
        return hVar.w(this.e);
    }

    public final long d(long j10) {
        long e = e(j10);
        h hVar = this.d;
        hVar.getClass();
        return hVar.c(j10 - this.f, this.e) + e;
    }

    public final long e(long j10) {
        h hVar = this.d;
        hVar.getClass();
        return hVar.a(j10 - this.f);
    }

    public final boolean f(long j10, long j11) {
        h hVar = this.d;
        hVar.getClass();
        return hVar.s() || j11 == -9223372036854775807L || d(j10) <= j11;
    }
}
