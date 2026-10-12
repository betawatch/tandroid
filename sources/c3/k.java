package c3;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class k implements b0 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;

    public k(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        this.a = j10;
        this.b = j11;
        this.c = i11 == -1 ? 1 : i11;
        this.e = i10;
        this.g = z10;
        this.h = z11;
        if (j10 == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.d = j12;
            this.f = (Math.max(0L, j12) * 8000000) / i10;
        }
    }

    @Override // c3.b0
    public final boolean d() {
        return this.d != -1 || this.g;
    }

    @Override // c3.b0
    public final boolean e() {
        return this.h;
    }

    @Override // c3.b0
    public final a0 f(long j10) {
        long j11 = this.d;
        long j12 = this.b;
        if (j11 == -1 && !this.g) {
            c0 c0Var = new c0(0L, j12);
            return new a0(c0Var, c0Var);
        }
        int i10 = this.e;
        long j13 = this.c;
        long j14 = (((i10 * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            j14 = Math.min(j14, j11 - j13);
        }
        long max = Math.max(j14, 0L) + j12;
        long max2 = (Math.max(0L, max - j12) * 8000000) / i10;
        c0 c0Var2 = new c0(max2, max);
        if (j11 != -1 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.a) {
                return new a0(c0Var2, new c0((Math.max(0L, j15 - j12) * 8000000) / i10, j15));
            }
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override // c3.b0
    public final long h() {
        return this.f;
    }
}
