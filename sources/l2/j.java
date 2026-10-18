package l2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        i c10 = this.b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j10, mVar, this.c, this.a, this.f, c10);
        }
        if (!c10.s()) {
            return new j(j10, mVar, this.c, this.a, this.f, c11);
        }
        long w9 = c10.w(j10);
        if (w9 == 0) {
            return new j(j10, mVar, this.c, this.a, this.f, c11);
        }
        c11.getClass();
        long u10 = c10.u();
        long a2 = c10.a(u10);
        long j11 = w9 + u10;
        long j12 = j11 - 1;
        long d = c10.d(j12, j10) + c10.a(j12);
        long u11 = c11.u();
        long a10 = c11.a(u11);
        long j13 = this.f;
        if (d == a10) {
            o10 = j11 - u11;
        } else {
            if (d < a10) {
                throw new u2.b();
            }
            if (a10 < a2) {
                o11 = j13 - (c11.o(a2, j10) - u10);
                return new j(j10, mVar, this.c, this.a, o11, c11);
            }
            o10 = c10.o(a10, j10) - u11;
        }
        o11 = o10 + j13;
        return new j(j10, mVar, this.c, this.a, o11, c11);
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
        return iVar.d(j10 - this.f, this.e) + e;
    }

    public final long e(long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j10 - this.f);
    }

    public final boolean f(long j10, long j11) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.s() || j11 == -9223372036854775807L || d(j10) <= j11;
    }
}
