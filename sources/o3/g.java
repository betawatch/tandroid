package o3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class g implements t {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public g(long j10, int i10, int i11, boolean z10, long j11) {
        this.a = j10;
        this.b = j11;
        this.c = i11 == -1 ? 1 : i11;
        this.e = i10;
        this.g = z10;
        if (j10 == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.d = j12;
            this.f = (Math.max(0L, j12) * 8000000) / i10;
        }
    }

    @Override // o3.t
    public final boolean c() {
        return this.d != -1 || this.g;
    }

    @Override // o3.t
    public final s g(long j10) {
        long j11 = this.b;
        long j12 = this.d;
        if (j12 == -1 && !this.g) {
            u uVar = new u(0L, j11);
            return new s(uVar, uVar);
        }
        int i10 = this.e;
        long j13 = this.c;
        long j14 = (((i10 * j10) / 8000000) / j13) * j13;
        if (j12 != -1) {
            j14 = Math.min(j14, j12 - j13);
        }
        long max = Math.max(j14, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i10;
        u uVar2 = new u(max2, max);
        if (j12 != -1 && max2 < j10) {
            long j15 = max + j13;
            if (j15 < this.a) {
                return new s(uVar2, new u((Math.max(0L, j15 - j11) * 8000000) / i10, j15));
            }
        }
        return new s(uVar2, uVar2);
    }

    @Override // o3.t
    public final long h() {
        return this.f;
    }
}
