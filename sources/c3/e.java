package c3;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e implements b0 {
    public final g a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public e(g gVar, long j3, long j10, long j11, long j12, long j13) {
        this.a = gVar;
        this.b = j3;
        this.c = j10;
        this.d = j11;
        this.e = j12;
        this.f = j13;
    }

    @Override // c3.b0
    public final boolean f() {
        return true;
    }

    @Override // c3.b0
    public final a0 j(long j3) {
        c0 c0Var = new c0(j3, f.a(this.a.l(j3), 0L, this.c, this.d, this.e, this.f));
        return new a0(c0Var, c0Var);
    }

    @Override // c3.b0
    public final long l() {
        return this.b;
    }
}
