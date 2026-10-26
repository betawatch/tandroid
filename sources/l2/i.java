package l2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i {
    public final v2.e a;
    public final m2.m b;
    public final m2.b c;
    public final h d;
    public final long e;
    public final long f;

    public i(long j10, m2.m mVar, m2.b bVar, v2.e eVar, long j11, h hVar) {
        this.e = j10;
        this.b = mVar;
        this.c = bVar;
        this.f = j11;
        this.a = eVar;
        this.d = hVar;
    }

    public final i a(long j10, m2.m mVar) {
        long t10;
        long t11;
        h c10 = this.b.c();
        h c11 = mVar.c();
        if (c10 == null) {
            return new i(j10, mVar, this.c, this.a, this.f, c10);
        }
        if (!c10.N()) {
            return new i(j10, mVar, this.c, this.a, this.f, c11);
        }
        long V = c10.V(j10);
        if (V == 0) {
            return new i(j10, mVar, this.c, this.a, this.f, c11);
        }
        c11.getClass();
        long R = c10.R();
        long a2 = c10.a(R);
        long j11 = V + R;
        long j12 = j11 - 1;
        long e = c10.e(j12, j10) + c10.a(j12);
        long R2 = c11.R();
        long a10 = c11.a(R2);
        long j13 = this.f;
        if (e == a10) {
            t10 = j11 - R2;
        } else {
            if (e < a10) {
                throw new u2.b();
            }
            if (a10 < a2) {
                t11 = j13 - (c11.t(a2, j10) - R);
                return new i(j10, mVar, this.c, this.a, t11, c11);
            }
            t10 = c10.t(a10, j10) - R2;
        }
        t11 = t10 + j13;
        return new i(j10, mVar, this.c, this.a, t11, c11);
    }

    public final long b(long j10) {
        h hVar = this.d;
        hVar.getClass();
        long j11 = this.e;
        long g7 = hVar.g(j11, j10) + this.f;
        hVar.getClass();
        return (hVar.W(j11, j10) + g7) - 1;
    }

    public final long c() {
        h hVar = this.d;
        hVar.getClass();
        return hVar.V(this.e);
    }

    public final long d(long j10) {
        long e = e(j10);
        h hVar = this.d;
        hVar.getClass();
        return hVar.e(j10 - this.f, this.e) + e;
    }

    public final long e(long j10) {
        h hVar = this.d;
        hVar.getClass();
        return hVar.a(j10 - this.f);
    }

    public final boolean f(long j10, long j11) {
        h hVar = this.d;
        hVar.getClass();
        return hVar.N() || j11 == -9223372036854775807L || d(j10) <= j11;
    }
}
