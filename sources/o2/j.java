package o2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        long o4;
        long o10;
        i c10 = this.b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.c, this.a, this.f, c10);
        }
        if (!c10.t()) {
            return new j(j3, mVar, this.c, this.a, this.f, c11);
        }
        long x10 = c10.x(j3);
        if (x10 == 0) {
            return new j(j3, mVar, this.c, this.a, this.f, c11);
        }
        c11.getClass();
        long u10 = c10.u();
        long a10 = c10.a(u10);
        long j10 = x10 + u10;
        long j11 = j10 - 1;
        long d = c10.d(j11, j3) + c10.a(j11);
        long u11 = c11.u();
        long a11 = c11.a(u11);
        long j12 = this.f;
        if (d == a11) {
            o4 = j10 - u11;
        } else {
            if (d < a11) {
                throw new x2.b();
            }
            if (a11 < a10) {
                o10 = j12 - (c11.o(a10, j3) - u10);
                return new j(j3, mVar, this.c, this.a, o10, c11);
            }
            o4 = c10.o(a11, j3) - u11;
        }
        o10 = o4 + j12;
        return new j(j3, mVar, this.c, this.a, o10, c11);
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
        return iVar.d(j3 - this.f, this.e) + e10;
    }

    public final long e(long j3) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.a(j3 - this.f);
    }

    public final boolean f(long j3, long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.t() || j10 == -9223372036854775807L || d(j3) <= j10;
    }
}
