package l2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        long n10;
        long n11;
        i d = this.b.d();
        i d10 = mVar.d();
        if (d == null) {
            return new j(j10, mVar, this.c, this.a, this.f, d);
        }
        if (!d.s()) {
            return new j(j10, mVar, this.c, this.a, this.f, d10);
        }
        long A = d.A(j10);
        if (A == 0) {
            return new j(j10, mVar, this.c, this.a, this.f, d10);
        }
        d10.getClass();
        long w9 = d.w();
        long b10 = d.b(w9);
        long j11 = A + w9;
        long j12 = j11 - 1;
        long c10 = d.c(j12, j10) + d.b(j12);
        long w10 = d10.w();
        long b11 = d10.b(w10);
        long j13 = this.f;
        if (c10 == b11) {
            n10 = j11 - w10;
        } else {
            if (c10 < b11) {
                throw new u2.b();
            }
            if (b11 < b10) {
                n11 = j13 - (d10.n(b10, j10) - w9);
                return new j(j10, mVar, this.c, this.a, n11, d10);
            }
            n10 = d.n(b11, j10) - w10;
        }
        n11 = n10 + j13;
        return new j(j10, mVar, this.c, this.a, n11, d10);
    }

    public final long b(long j10) {
        i iVar = this.d;
        iVar.getClass();
        long j11 = this.e;
        long e = iVar.e(j11, j10) + this.f;
        iVar.getClass();
        return (iVar.B(j11, j10) + e) - 1;
    }

    public final long c() {
        i iVar = this.d;
        iVar.getClass();
        return iVar.A(this.e);
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
        return iVar.s() || j11 == -9223372036854775807L || d(j10) <= j11;
    }
}
