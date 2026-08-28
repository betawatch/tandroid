package m3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class g implements t {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public g(long j10, int i9, int i10, boolean z10, long j11) {
        this.a = j10;
        this.b = j11;
        this.c = i10 == -1 ? 1 : i10;
        this.e = i9;
        this.g = z10;
        if (j10 == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.d = j12;
            this.f = (Math.max(0L, j12) * 8000000) / i9;
        }
    }

    @Override // m3.t
    public final boolean e() {
        return this.d != -1 || this.g;
    }

    @Override // m3.t
    public final s h(long j10) {
        long j11 = this.b;
        long j12 = this.d;
        if (j12 == -1 && !this.g) {
            u uVar = new u(0L, j11);
            return new s(uVar, uVar);
        }
        int i9 = this.e;
        long j13 = this.c;
        long j14 = (((i9 * j10) / 8000000) / j13) * j13;
        if (j12 != -1) {
            j14 = Math.min(j14, j12 - j13);
        }
        long max = Math.max(j14, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i9;
        u uVar2 = new u(max2, max);
        if (j12 != -1 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.a) {
                return new s(uVar2, new u((Math.max(0L, j15 - j11) * 8000000) / i9, j15));
            }
        }
        return new s(uVar2, uVar2);
    }

    @Override // m3.t
    public final long i() {
        return this.f;
    }
}
