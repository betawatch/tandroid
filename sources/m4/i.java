package m4;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i {
    public final l4.d a;
    public final n4.m b;
    public final n4.b c;
    public final h d;
    public final long e;
    public final long f;

    public i(long j10, n4.m mVar, n4.b bVar, l4.d dVar, long j11, h hVar) {
        this.e = j10;
        this.b = mVar;
        this.c = bVar;
        this.f = j11;
        this.a = dVar;
        this.d = hVar;
    }

    public final i a(long j10, n4.m mVar) {
        long y10;
        long y11;
        h c10 = this.b.c();
        h c11 = mVar.c();
        if (c10 == null) {
            return new i(j10, mVar, this.c, this.a, this.f, c10);
        }
        if (!c10.B()) {
            return new i(j10, mVar, this.c, this.a, this.f, c11);
        }
        long F = c10.F(j10);
        if (F == 0) {
            return new i(j10, mVar, this.c, this.a, this.f, c11);
        }
        long E = c10.E();
        long a2 = c10.a(E);
        long j11 = F + E;
        long j12 = j11 - 1;
        long l10 = c10.l(j12, j10) + c10.a(j12);
        long E2 = c11.E();
        long a3 = c11.a(E2);
        long j13 = this.f;
        if (l10 == a3) {
            y10 = j11 - E2;
        } else {
            if (l10 < a3) {
                throw new j4.b();
            }
            if (a3 < a2) {
                y11 = j13 - (c11.y(a2, j10) - E);
                return new i(j10, mVar, this.c, this.a, y11, c11);
            }
            y10 = c10.y(a3, j10) - E2;
        }
        y11 = y10 + j13;
        return new i(j10, mVar, this.c, this.a, y11, c11);
    }

    public final long b(long j10) {
        h hVar = this.d;
        long j11 = this.e;
        return (hVar.G(j11, j10) + (hVar.r(j11, j10) + this.f)) - 1;
    }

    public final long c(long j10) {
        return this.d.l(j10 - this.f, this.e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.a(j10 - this.f);
    }
}
