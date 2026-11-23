package o2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class j {
    public final y2.e a;
    public final p2.m b;
    public final p2.b c;
    public final i d;
    public final long e;
    public final long f;

    public j(long j3, p2.m mVar, p2.b bVar, y2.e eVar, long j10, i iVar) {
        this.e = j3;
        this.b = mVar;
        this.c = bVar;
        this.f = j10;
        this.a = eVar;
        this.d = iVar;
    }

    public final j a(long j3, p2.m mVar) {
        long n10;
        long n11;
        i d = this.b.d();
        i d2 = mVar.d();
        if (d == null) {
            return new j(j3, mVar, this.c, this.a, this.f, d);
        }
        if (!d.r()) {
            return new j(j3, mVar, this.c, this.a, this.f, d2);
        }
        long x10 = d.x(j3);
        if (x10 == 0) {
            return new j(j3, mVar, this.c, this.a, this.f, d2);
        }
        d2.getClass();
        long s5 = d.s();
        long a10 = d.a(s5);
        long j10 = x10 + s5;
        long j11 = j10 - 1;
        long c10 = d.c(j11, j3) + d.a(j11);
        long s9 = d2.s();
        long a11 = d2.a(s9);
        long j12 = this.f;
        if (c10 == a11) {
            n10 = j10 - s9;
        } else {
            if (c10 < a11) {
                throw new x2.b();
            }
            if (a11 < a10) {
                n11 = j12 - (d2.n(a10, j3) - s5);
                return new j(j3, mVar, this.c, this.a, n11, d2);
            }
            n10 = d.n(a11, j3) - s9;
        }
        n11 = n10 + j12;
        return new j(j3, mVar, this.c, this.a, n11, d2);
    }

    public final long b(long j3) {
        i iVar = this.d;
        iVar.getClass();
        long j10 = this.e;
        long e10 = iVar.e(j10, j3) + this.f;
        iVar.getClass();
        return (iVar.z(j10, j3) + e10) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.x(this.e);
    }

    public final long d(long j3) {
        long e10 = e(j3);
        i iVar = this.d;
        iVar.getClass();
        return iVar.c(j3 - this.f, this.e) + e10;
    }

    public final long e(long j3) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j3 - this.f);
    }

    public final boolean f(long j3, long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.r() || j10 == -9223372036854775807L || d(j3) <= j10;
    }
}
