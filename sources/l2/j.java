package l2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j {
    public final v2.d a;
    public final m2.m b;
    public final m2.b c;
    public final i d;
    public final long e;
    public final long f;

    public j(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, i iVar) {
        this.e = j3;
        this.b = mVar;
        this.c = bVar;
        this.f = j10;
        this.a = dVar;
        this.d = iVar;
    }

    public final j a(long j3, m2.m mVar) {
        long n10;
        long n11;
        i c10 = this.b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.c, this.a, this.f, c10);
        }
        if (!c10.t()) {
            return new j(j3, mVar, this.c, this.a, this.f, c11);
        }
        long w10 = c10.w(j3);
        if (w10 == 0) {
            return new j(j3, mVar, this.c, this.a, this.f, c11);
        }
        e2.d.h(c11);
        long u10 = c10.u();
        long b10 = c10.b(u10);
        long j10 = w10 + u10;
        long j11 = j10 - 1;
        long d = c10.d(j11, j3) + c10.b(j11);
        long u11 = c11.u();
        long b11 = c11.b(u11);
        long j12 = this.f;
        if (d == b11) {
            n10 = j10 - u11;
        } else {
            if (d < b11) {
                throw new u2.b();
            }
            if (b11 < b10) {
                n11 = j12 - (c11.n(b10, j3) - u10);
                return new j(j3, mVar, this.c, this.a, n11, c11);
            }
            n10 = c10.n(b11, j3) - u11;
        }
        n11 = n10 + j12;
        return new j(j3, mVar, this.c, this.a, n11, c11);
    }

    public final long b(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.f(this.e, j3) + this.f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return (iVar.y(this.e, j3) + b10) - 1;
    }

    public final long d() {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.w(this.e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.d(j3 - this.f, this.e) + f7;
    }

    public final long f(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.b(j3 - this.f);
    }

    public final boolean g(long j3, long j10) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.t() || j10 == -9223372036854775807L || e(j3) <= j10;
    }
}
