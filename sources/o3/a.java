package o3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // o3.t
    public final boolean c() {
        return true;
    }

    @Override // o3.t
    public final s g(long j10) {
        u uVar = new u(j10, b.a(this.a.l(j10), 0L, this.c, this.d, this.e, this.f));
        return new s(uVar, uVar);
    }

    @Override // o3.t
    public final long h() {
        return this.b;
    }
}
