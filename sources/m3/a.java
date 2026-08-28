package m3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements t {
    public final c a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public a(c cVar, long j10, long j11, long j12, long j13, long j14) {
        this.a = cVar;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13;
        this.f = j14;
    }

    @Override // m3.t
    public final boolean e() {
        return true;
    }

    @Override // m3.t
    public final s h(long j10) {
        u uVar = new u(j10, b.a(this.a.c(j10), 0L, this.c, this.d, this.e, this.f));
        return new s(uVar, uVar);
    }

    @Override // m3.t
    public final long i() {
        return this.b;
    }
}
