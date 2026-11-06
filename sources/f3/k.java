package f3;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class k implements c0 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;

    public k(long j3, long j10, int i7, int i10, boolean z9, boolean z10) {
        this.a = j3;
        this.b = j10;
        this.c = i10 == -1 ? 1 : i10;
        this.e = i7;
        this.g = z9;
        this.h = z10;
        if (j3 == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j11 = j3 - j10;
            this.d = j11;
            this.f = (Math.max(0L, j11) * 8000000) / i7;
        }
    }

    @Override // f3.c0
    public final boolean d() {
        return this.d != -1 || this.g;
    }

    @Override // f3.c0
    public final boolean e() {
        return this.h;
    }

    @Override // f3.c0
    public final b0 f(long j3) {
        long j10 = this.d;
        long j11 = this.b;
        if (j10 == -1 && !this.g) {
            d0 d0Var = new d0(0L, j11);
            return new b0(d0Var, d0Var);
        }
        int i7 = this.e;
        long j12 = this.c;
        long j13 = (((i7 * j3) / 8000000) / j12) * j12;
        if (j10 != -1) {
            j13 = Math.min(j13, j10 - j12);
        }
        long max = Math.max(j13, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i7;
        d0 d0Var2 = new d0(max2, max);
        if (j10 != -1 && max2 < j3) {
            long j14 = max + j12;
            if (j14 < this.a) {
                return new b0(d0Var2, new d0((Math.max(0L, j14 - j11) * 8000000) / i7, j14));
            }
        }
        return new b0(d0Var2, d0Var2);
    }

    @Override // f3.c0
    public final long h() {
        return this.f;
    }
}
