package l2;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class i {
    public final v2.d a;
    public final m2.m b;
    public final m2.b c;
    public final h d;
    public final long e;
    public final long f;

    public i(long j3, m2.m mVar, m2.b bVar, v2.d dVar, long j10, h hVar) {
        this.e = j3;
        this.b = mVar;
        this.c = bVar;
        this.f = j10;
        this.a = dVar;
        this.d = hVar;
    }

    public final i a(long j3, m2.m mVar) {
        long t10;
        long t11;
        h d = this.b.d();
        h d10 = mVar.d();
        if (d == null) {
            return new i(j3, mVar, this.c, this.a, this.f, d);
        }
        if (!d.F()) {
            return new i(j3, mVar, this.c, this.a, this.f, d10);
        }
        long P = d.P(j3);
        if (P == 0) {
            return new i(j3, mVar, this.c, this.a, this.f, d10);
        }
        e2.d.h(d10);
        long M = d.M();
        long b10 = d.b(M);
        long j10 = P + M;
        long j11 = j10 - 1;
        long c10 = d.c(j11, j3) + d.b(j11);
        long M2 = d10.M();
        long b11 = d10.b(M2);
        long j12 = this.f;
        if (c10 == b11) {
            t10 = j10 - M2;
        } else {
            if (c10 < b11) {
                throw new u2.b();
            }
            if (b11 < b10) {
                t11 = j12 - (d10.t(b10, j3) - M);
                return new i(j3, mVar, this.c, this.a, t11, d10);
            }
            t10 = d.t(b11, j3) - M2;
        }
        t11 = t10 + j12;
        return new i(j3, mVar, this.c, this.a, t11, d10);
    }

    public final long b(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.e(this.e, j3) + this.f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return (hVar.Q(this.e, j3) + b10) - 1;
    }

    public final long d() {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.P(this.e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.c(j3 - this.f, this.e) + f7;
    }

    public final long f(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.b(j3 - this.f);
    }

    public final boolean g(long j3, long j10) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.F() || j10 == -9223372036854775807L || e(j3) <= j10;
    }
}
