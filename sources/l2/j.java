package l2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        long w9 = d.w(j10);
        if (w9 == 0) {
            return new j(j10, mVar, this.c, this.a, this.f, d10);
        }
        d10.getClass();
        long u10 = d.u();
        long b10 = d.b(u10);
        long j11 = w9 + u10;
        long j12 = j11 - 1;
        long c10 = d.c(j12, j10) + d.b(j12);
        long u11 = d10.u();
        long b11 = d10.b(u11);
        long j13 = this.f;
        if (c10 == b11) {
            o10 = j11 - u11;
        } else {
            if (c10 < b11) {
                throw new u2.b();
            }
            if (b11 < b10) {
                o11 = j13 - (d10.o(b10, j10) - u10);
                return new j(j10, mVar, this.c, this.a, o11, d10);
            }
            o10 = d.o(b11, j10) - u11;
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
        return (iVar.x(j11, j10) + e) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.w(this.e);
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
        return iVar.b(j10 - this.f);
    }

    public final boolean f(long j10, long j11) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.t() || j11 == -9223372036854775807L || d(j10) <= j11;
    }
}
