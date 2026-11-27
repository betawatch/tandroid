// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class jt2 implements zy9 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;

    public jt2(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = ((Math.max(0L, j3) << 3) * 1000000) / i;
        }
    }

    @Override // zy9
    public final boolean c() {
        return this.d != -1 || this.g;
    }

    @Override // zy9
    public final boolean d() {
        return this.h;
    }

    @Override // zy9
    public yy9 e(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            bz9 bz9Var = new bz9(0L, j3);
            return new yy9(bz9Var, bz9Var);
        }
        int i = this.e;
        long j4 = this.c;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = ((Math.max(0L, max - j3) << 3) * 1000000) / i;
        bz9 bz9Var2 = new bz9(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new yy9(bz9Var2, new bz9(((Math.max(0L, j6 - j3) << 3) * 1000000) / i, j6));
            }
        }
        return new yy9(bz9Var2, bz9Var2);
    }

    @Override // zy9
    public long h() {
        return this.f;
    }
}
