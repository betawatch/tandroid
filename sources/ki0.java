// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ki0 implements zy9 {
    public final mi0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public ki0(mi0 mi0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = mi0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // zy9
    public final boolean c() {
        return true;
    }

    @Override // zy9
    public final boolean d() {
        return false;
    }

    @Override // zy9
    public final yy9 e(long j) {
        bz9 bz9Var = new bz9(j, li0.a(this.a.c(j), 0L, this.c, this.d, this.e, this.f));
        return new yy9(bz9Var, bz9Var);
    }

    @Override // zy9
    public final long h() {
        return this.b;
    }
}
