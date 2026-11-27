// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class n3d implements ez9 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public n3d(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = cue.a(j3 - i, j2);
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // ez9
    public final long a() {
        return this.f;
    }

    @Override // ez9
    public final long b() {
        return this.a + this.b;
    }

    @Override // zy9
    public final boolean c() {
        return this.g != null;
    }

    @Override // zy9
    public final boolean d() {
        return false;
    }

    @Override // zy9
    public final yy9 e(long j) {
        double d;
        double d2;
        boolean c = c();
        int i = this.b;
        long j2 = this.a;
        if (!c) {
            bz9 bz9Var = new bz9(0L, j2 + i);
            return new yy9(bz9Var, bz9Var);
        }
        long j3 = gcc.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.e;
        bz9 bz9Var2 = new bz9(j3, j2 + gcc.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new yy9(bz9Var2, bz9Var2);
    }

    @Override // ez9
    public final long f(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int f = gcc.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (f * j3) / 100;
        long j5 = jArr[f];
        int i = f + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (f == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // ez9
    public final int g() {
        return this.d;
    }

    @Override // zy9
    public final long h() {
        return this.c;
    }
}
