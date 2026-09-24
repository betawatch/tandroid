package l2;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        long s10;
        long s11;
        h d = this.b.d();
        h d10 = mVar.d();
        if (d == null) {
            return new i(j3, mVar, this.c, this.a, this.f, d);
        }
        if (!d.w()) {
            return new i(j3, mVar, this.c, this.a, this.f, d10);
        }
        long z10 = d.z(j3);
        if (z10 == 0) {
            return new i(j3, mVar, this.c, this.a, this.f, d10);
        }
        e2.d.h(d10);
        long y3 = d.y();
        long b10 = d.b(y3);
        long j10 = z10 + y3;
        long j11 = j10 - 1;
        long c10 = d.c(j11, j3) + d.b(j11);
        long y10 = d10.y();
        long b11 = d10.b(y10);
        long j12 = this.f;
        if (c10 == b11) {
            s10 = j10 - y10;
        } else {
            if (c10 < b11) {
                throw new u2.b();
            }
            if (b11 < b10) {
                s11 = j12 - (d10.s(b10, j3) - y3);
                return new i(j3, mVar, this.c, this.a, s11, d10);
            }
            s10 = d.s(b11, j3) - y10;
        }
        s11 = s10 + j12;
        return new i(j3, mVar, this.c, this.a, s11, d10);
    }

    public final long b(long j3) {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.f(this.e, j3) + this.f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        h hVar = this.d;
        e2.d.h(hVar);
        return (hVar.A(this.e, j3) + b10) - 1;
    }

    public final long d() {
        h hVar = this.d;
        e2.d.h(hVar);
        return hVar.z(this.e);
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
        return hVar.w() || j10 == -9223372036854775807L || e(j3) <= j10;
    }
}
