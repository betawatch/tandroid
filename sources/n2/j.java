package n2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j {
    public final x2.e a;
    public final o2.m b;
    public final o2.b c;
    public final i d;
    public final long e;
    public final long f;

    public j(long j10, o2.m mVar, o2.b bVar, x2.e eVar, long j11, i iVar) {
        this.e = j10;
        this.b = mVar;
        this.c = bVar;
        this.f = j11;
        this.a = eVar;
        this.d = iVar;
    }

    public final j a(long j10, o2.m mVar) {
        long s6;
        long s10;
        i c2 = this.b.c();
        i c10 = mVar.c();
        if (c2 == null) {
            return new j(j10, mVar, this.c, this.a, this.f, c2);
        }
        if (!c2.A()) {
            return new j(j10, mVar, this.c, this.a, this.f, c10);
        }
        long H = c2.H(j10);
        if (H == 0) {
            return new j(j10, mVar, this.c, this.a, this.f, c10);
        }
        c10.getClass();
        long C = c2.C();
        long b10 = c2.b(C);
        long j11 = H + C;
        long j12 = j11 - 1;
        long i3 = c2.i(j12, j10) + c2.b(j12);
        long C2 = c10.C();
        long b11 = c10.b(C2);
        long j13 = this.f;
        if (i3 == b11) {
            s6 = j11 - C2;
        } else {
            if (i3 < b11) {
                throw new w2.b();
            }
            if (b11 < b10) {
                s10 = j13 - (c10.s(b10, j10) - C);
                return new j(j10, mVar, this.c, this.a, s10, c10);
            }
            s6 = c2.s(b11, j10) - C2;
        }
        s10 = s6 + j13;
        return new j(j10, mVar, this.c, this.a, s10, c10);
    }

    public final long b(long j10) {
        i iVar = this.d;
        iVar.getClass();
        long j11 = this.e;
        long j12 = iVar.j(j11, j10) + this.f;
        iVar.getClass();
        return (iVar.K(j11, j10) + j12) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.H(this.e);
    }

    public final long d(long j10) {
        long e10 = e(j10);
        i iVar = this.d;
        iVar.getClass();
        return iVar.i(j10 - this.f, this.e) + e10;
    }

    public final long e(long j10) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.b(j10 - this.f);
    }

    public final boolean f(long j10, long j11) {
        i iVar = this.d;
        iVar.getClass();
        return iVar.A() || j11 == -9223372036854775807L || d(j10) <= j11;
    }
}
