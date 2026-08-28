package m4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        long q10;
        long q11;
        h c10 = this.b.c();
        h c11 = mVar.c();
        if (c10 == null) {
            return new i(j10, mVar, this.c, this.a, this.f, c10);
        }
        if (!c10.v()) {
            return new i(j10, mVar, this.c, this.a, this.f, c11);
        }
        long z10 = c10.z(j10);
        if (z10 == 0) {
            return new i(j10, mVar, this.c, this.a, this.f, c11);
        }
        long x10 = c10.x();
        long a2 = c10.a(x10);
        long j11 = z10 + x10;
        long j12 = j11 - 1;
        long f10 = c10.f(j12, j10) + c10.a(j12);
        long x11 = c11.x();
        long a3 = c11.a(x11);
        long j13 = this.f;
        if (f10 == a3) {
            q10 = j11 - x11;
        } else {
            if (f10 < a3) {
                throw new j4.b();
            }
            if (a3 < a2) {
                q11 = j13 - (c11.q(a2, j10) - x10);
                return new i(j10, mVar, this.c, this.a, q11, c11);
            }
            q10 = c10.q(a3, j10) - x11;
        }
        q11 = q10 + j13;
        return new i(j10, mVar, this.c, this.a, q11, c11);
    }

    public final long b(long j10) {
        h hVar = this.d;
        long j11 = this.e;
        return (hVar.C(j11, j10) + (hVar.i(j11, j10) + this.f)) - 1;
    }

    public final long c(long j10) {
        return this.d.f(j10 - this.f, this.e) + d(j10);
    }

    public final long d(long j10) {
        return this.d.a(j10 - this.f);
    }
}
