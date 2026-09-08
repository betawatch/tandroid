package c3;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class k implements b0 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public k(long j3, int i10, int i11, boolean z10, long j10) {
        this.a = j3;
        this.b = j10;
        this.c = i11 == -1 ? 1 : i11;
        this.e = i10;
        this.g = z10;
        if (j3 == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j11 = j3 - j10;
            this.d = j11;
            this.f = (Math.max(0L, j11) * 8000000) / i10;
        }
    }

    @Override // c3.b0
    public final boolean f() {
        return this.d != -1 || this.g;
    }

    @Override // c3.b0
    public final a0 j(long j3) {
        long j10 = this.b;
        long j11 = this.d;
        if (j11 == -1 && !this.g) {
            c0 c0Var = new c0(0L, j10);
            return new a0(c0Var, c0Var);
        }
        int i10 = this.e;
        long j12 = this.c;
        long j13 = (((i10 * j3) / 8000000) / j12) * j12;
        if (j11 != -1) {
            j13 = Math.min(j13, j11 - j12);
        }
        long max = Math.max(j13, 0L) + j10;
        long max2 = (Math.max(0L, max - j10) * 8000000) / i10;
        c0 c0Var2 = new c0(max2, max);
        if (j11 != -1 && max2 < j3) {
            long j14 = max + j12;
            if (j14 < this.a) {
                return new a0(c0Var2, new c0((Math.max(0L, j14 - j10) * 8000000) / i10, j14));
            }
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override // c3.b0
    public final long l() {
        return this.f;
    }
}
