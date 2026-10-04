package l2;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        long H;
        long H2;
        i c10 = this.b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.c, this.a, this.f, c10);
        }
        if (!c10.e0()) {
            return new j(j3, mVar, this.c, this.a, this.f, c11);
        }
        long p02 = c10.p0(j3);
        if (p02 == 0) {
            return new j(j3, mVar, this.c, this.a, this.f, c11);
        }
        e2.d.h(c11);
        long j02 = c10.j0();
        long a2 = c10.a(j02);
        long j10 = p02 + j02;
        long j11 = j10 - 1;
        long i10 = c10.i(j11, j3) + c10.a(j11);
        long j03 = c11.j0();
        long a10 = c11.a(j03);
        long j12 = this.f;
        if (i10 == a10) {
            H = j10 - j03;
        } else {
            if (i10 < a10) {
                throw new u2.b();
            }
            if (a10 < a2) {
                H2 = j12 - (c11.H(a2, j3) - j02);
                return new j(j3, mVar, this.c, this.a, H2, c11);
            }
            H = c10.H(a10, j3) - j03;
        }
        H2 = H + j12;
        return new j(j3, mVar, this.c, this.a, H2, c11);
    }

    public final long b(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.n(this.e, j3) + this.f;
    }

    public final long c(long j3) {
        long b10 = b(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return (iVar.q0(this.e, j3) + b10) - 1;
    }

    public final long d() {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.p0(this.e);
    }

    public final long e(long j3) {
        long f7 = f(j3);
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.i(j3 - this.f, this.e) + f7;
    }

    public final long f(long j3) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.a(j3 - this.f);
    }

    public final boolean g(long j3, long j10) {
        i iVar = this.d;
        e2.d.h(iVar);
        return iVar.e0() || j10 == -9223372036854775807L || e(j3) <= j10;
    }
}
