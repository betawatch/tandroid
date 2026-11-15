package o2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        long L;
        long L2;
        i c10 = this.b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new j(j3, mVar, this.c, this.a, this.f, c10);
        }
        if (!c10.g0()) {
            return new j(j3, mVar, this.c, this.a, this.f, c11);
        }
        long t02 = c10.t0(j3);
        if (t02 == 0) {
            return new j(j3, mVar, this.c, this.a, this.f, c11);
        }
        c11.getClass();
        long k02 = c10.k0();
        long b10 = c10.b(k02);
        long j10 = t02 + k02;
        long j11 = j10 - 1;
        long i7 = c10.i(j11, j3) + c10.b(j11);
        long k03 = c11.k0();
        long b11 = c11.b(k03);
        long j12 = this.f;
        if (i7 == b11) {
            L = j10 - k03;
        } else {
            if (i7 < b11) {
                throw new x2.b();
            }
            if (b11 < b10) {
                L2 = j12 - (c11.L(b10, j3) - k02);
                return new j(j3, mVar, this.c, this.a, L2, c11);
            }
            L = c10.L(b11, j3) - k03;
        }
        L2 = L + j12;
        return new j(j3, mVar, this.c, this.a, L2, c11);
    }

    public final long b(long j3) {
        i iVar = this.d;
        iVar.getClass();
        long j10 = this.e;
        long y10 = iVar.y(j10, j3) + this.f;
        iVar.getClass();
        return (iVar.v0(j10, j3) + y10) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.t0(this.e);
    }

    public final long d(long j3) {
        long e10 = e(j3);
        i iVar = this.d;
        iVar.getClass();
        return iVar.i(j3 - this.f, this.e) + e10;
    }

    public final long e(long j3) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.b(j3 - this.f);
    }

    public final boolean f(long j3, long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.g0() || j10 == -9223372036854775807L || d(j3) <= j10;
    }
}
