package c3;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public class k implements e0 {
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

    @Override // c3.e0
    public final boolean d() {
        return this.d != -1 || this.g;
    }

    @Override // c3.e0
    public final boolean e() {
        return this.h;
    }

    @Override // c3.e0
    public final d0 f(long j10) {
        long j11 = this.d;
        long j12 = this.b;
        if (j11 == -1 && !this.g) {
            f0 f0Var = new f0(0L, j12);
            return new d0(f0Var, f0Var);
        }
        int i10 = this.e;
        long j13 = this.c;
        long j14 = (((i10 * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            j14 = Math.min(j14, j11 - j13);
        }
        long max = Math.max(j14, 0L) + j12;
        long max2 = (Math.max(0L, max - j12) * 8000000) / i10;
        f0 f0Var2 = new f0(max2, max);
        if (j11 != -1 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.a) {
                return new d0(f0Var2, new f0((Math.max(0L, j15 - j12) * 8000000) / i10, j15));
            }
        }
        return new d0(f0Var2, f0Var2);
    }

    @Override // c3.e0
    public final long h() {
        return this.f;
    }
}
